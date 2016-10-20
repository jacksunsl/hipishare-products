package com.hipishare.products.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.hipishare.products.dao.mapper.Ps_cart_productMapper;
import com.hipishare.products.dao.mapper.Ps_shopping_cartMapper;
import com.hipishare.products.dao.po.Ps_cart_productPO;
import com.hipishare.products.dao.po.Ps_shopping_cartPO;
import com.hipishare.products.domain.request.ShoppingCartReq;
import com.hipishare.products.domain.request.ShoppingProductReq;
import com.hipishare.products.exception.ProductSystemException;
import com.hipishare.products.utils.DateUtil;
import com.hipishare.products.utils.RandomCode;

@Service("shoppingCartService")
public class ShoppingCartService {

	private static Logger LOG = LogManager.getLogger(ShoppingCartService.class.getName());
	
	@Autowired
	private Ps_shopping_cartMapper shoppingCartMapper;

	@Autowired
	private Ps_cart_productMapper cartProductMapper;
	
	/**
	 * 把商品放入购物车
	 * @param productReq
	 * @return
	 * @throws ProductSystemException
	 */
	@Transactional
	public int putProductToCart(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartService.putProductToCart][begin]");
		// 根据用户id查询购物车
		Ps_shopping_cartPO shoppingCart = shoppingCartMapper.findByUserid(Integer.parseInt(shoppingCartReq.getUserid()));
		
		String cartNo = "";
		if (null == shoppingCart) {
			// 获取购物车编号
			cartNo = DateUtil.getDate() + RandomCode.getCharAndNumr(6, true);
			// 新增购物车
			shoppingCart = new Ps_shopping_cartPO();
			shoppingCart.setCart_no(cartNo);
			shoppingCart.setCreate_time(new Date());
			shoppingCart.setPiece_num(0);
			shoppingCart.setUserid(Integer.parseInt(shoppingCartReq.getUserid()));
			shoppingCartMapper.insert(shoppingCart);
		} else {
			cartNo = shoppingCart.getCart_no();
		}
		
		// 购物车商品
//		List<Ps_cart_productPO> cartProductList = new ArrayList<Ps_cart_productPO>();
		if (!StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			List<ShoppingProductReq> productReqList = shoppingCartReq.getProductList();
			for (int i=0;i < productReqList.size();i++) {
				Ps_cart_productPO product = new Ps_cart_productPO();
				// 根据商品编号查询商品是否在购物车中，如果在，直接修改数量
				Ps_cart_productPO cartProduct = cartProductMapper.findByProductNo(cartNo, productReqList.get(i).getProductNo());
				if (null != cartProduct) {// 如果购物车中已经有该商品，直接增加数量即可
					cartProduct.setNum(Integer.parseInt(productReqList.get(i).getNum()) + cartProduct.getNum());
					cartProduct.setPush_time(new Date());
					cartProductMapper.updateByKey(cartProduct);
				} else {
					product.setProduct_no(productReqList.get(i).getProductNo());
					product.setNum(Integer.parseInt(productReqList.get(i).getNum()));
					product.setPush_price(new BigDecimal(productReqList.get(i).getMarkPrice()));
					product.setPush_time(new Date());
					product.setCart_no(cartNo);
					cartProductMapper.insert(product);
				}
			}
		}
		LOG.info("[ShoppingCartService.putProductToCart][end]");
		return 1;
	}

	/**
	 * 清空购物车
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	@Transactional
	public void emptyCart(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		cartProductMapper.deleteAllProductFromCart(shoppingCartReq.getCartNo());
	}
	
	/**
	 * 把商品移出购物车
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	@Transactional
	public void removeFromCart(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		if (null != shoppingCartReq.getProductList()) {
			for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
				cartProductMapper.deleteProductFromCart(shoppingCartReq.getCartNo(), 
						shoppingCartReq.getProductList().get(i).getProductNo());
			}
		}
	}

	/**
	 * 增加购物车商品数量
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	@Transactional
	public void plusProductNum(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		if (null != shoppingCartReq.getProductList()) {
			for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
				Ps_cart_productPO cartProduct = cartProductMapper.findByProductNo(shoppingCartReq.getCartNo(), 
						shoppingCartReq.getProductList().get(i).getProductNo());
				if (null == cartProduct) {
					ProductSystemException.raise("3009");
				}
				cartProduct.setNum(cartProduct.getNum() + 
						Integer.parseInt(shoppingCartReq.getProductList().get(i).getNum()));
				cartProduct.setPush_time(new Date());
				cartProductMapper.updateByKey(cartProduct);
			}
		}
	}

	/**
	 * 减少购物车商品数量
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	@Transactional
	public void subProductNum(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		if (null != shoppingCartReq.getProductList()) {
			for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
				Ps_cart_productPO cartProduct = cartProductMapper.findByProductNo(shoppingCartReq.getCartNo(), 
						shoppingCartReq.getProductList().get(i).getProductNo());
				if (null == cartProduct) {
					ProductSystemException.raise("3009");
				}
				int num = cartProduct.getNum() - Integer.parseInt(shoppingCartReq.getProductList().get(i).getNum());
				if (num < 1) {// 删减数量不能小于1
					cartProduct.setNum(1);
				} else {
					cartProduct.setNum(num);
				}
				cartProduct.setPush_time(new Date());
				cartProductMapper.updateByKey(cartProduct);
			}
		}
	}
}
