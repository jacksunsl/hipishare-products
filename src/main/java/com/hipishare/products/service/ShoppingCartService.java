package com.hipishare.products.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.hipishare.products.dao.mapper.Ps_shopping_cartMapper;
import com.hipishare.products.dao.po.Ps_cart_productPO;
import com.hipishare.products.dao.po.Ps_shopping_cartPO;
import com.hipishare.products.domain.ShoppingCartReq;
import com.hipishare.products.domain.ShoppingProductReq;
import com.hipishare.products.exception.ProductSystemException;

@Service("shoppingCartService")
public class ShoppingCartService {

	private static Logger LOG = LogManager.getLogger(ShoppingCartService.class.getName());
	
	@Autowired
	private Ps_shopping_cartMapper shoppingCartMapper;
	
	/**
	 * 把商品放入购物车
	 * @param productReq
	 * @return
	 * @throws ProductSystemException
	 */
	@Transactional
	public int putProductToCart(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		// 根据用户id查询购物车
		Ps_shopping_cartPO shoppingCart = shoppingCartMapper.findByUserid(Integer.parseInt(shoppingCartReq.getUserid()));
		if (null == shoppingCart) {
			// 新增购物车
			shoppingCart = new Ps_shopping_cartPO();
			shoppingCart.setCreate_time(new Date());
			shoppingCart.setPiece_num(0);
			shoppingCart.setUserid(Integer.parseInt(shoppingCartReq.getUserid()));
			shoppingCartMapper.insert(shoppingCart);
		}
		
		// 购物车商品
		List<Ps_cart_productPO> cartProductList = new ArrayList<Ps_cart_productPO>();
		if (!StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			List<ShoppingProductReq> productReqList = shoppingCartReq.getProductList();
			for (int i=0;i < productReqList.size();i++) {
				Ps_cart_productPO product = new Ps_cart_productPO();
				product.setProduct_no(productReqList.get(i).getProductNo());
				// 根据商品编号查询商品是否在购物车中，如果在，直接修改数量
				product.setNum(Integer.parseInt(productReqList.get(i).getNum()));
				product.setPush_price(new BigDecimal(productReqList.get(i).getMarkPrice()));
				product.setPush_time(new Date());
				product.setShopping_cart_id(shoppingCart.getId());
				cartProductList.add(product);
			}
		}
		
		return 1;
	}
	
}
