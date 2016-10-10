package com.hipishare.products.controller.helper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.hipishare.products.domain.ShoppingCartReq;
import com.hipishare.products.exception.ProductSystemException;

public class ShoppingCartHelper {

	private static Logger LOG = LogManager.getLogger(ShoppingCartHelper.class.getName());
	/**
	 * 验证商品放入购物车
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validPutProduct(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartHelper.validAddProduct][begin]商品放入购物车校验...");
		if (StringUtils.isEmpty(shoppingCartReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			ProductSystemException.raise("3008");
		}
		LOG.info("[ShoppingCartHelper.validAddProduct][end]商品放入购物车校验...");
	}
	
	/**
	 * 验证清空购物车请求参数
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validEmptyCart(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartHelper.validEmptyCart][begin]清空购物车校验...");
		if (StringUtils.isEmpty(shoppingCartReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getCartNo())) {
			ProductSystemException.raise("3010");
		}
		LOG.info("[ShoppingCartHelper.validEmptyCart][end]清空购物车校验...");
	}

	/**
	 * 验证购物车内商品移出
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validRemoveProduct(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartHelper.validRemoveProduct][begin]购物车内商品移出校验...");
		if (StringUtils.isEmpty(shoppingCartReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getCartNo())) {
			ProductSystemException.raise("3010");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			ProductSystemException.raise("3008");
		}
		for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
			if (StringUtils.isEmpty(shoppingCartReq.getProductList().get(i).getProductNo())) {
				ProductSystemException.raise("3011");
			}
		}
		LOG.info("[ShoppingCartHelper.validRemoveProduct][end]购物车内商品移出校验...");
	}
	
	/**
	 * 减少购物车内商品数量
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validSubProductNum(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartHelper.validSubProductNum][begin]减少购物车内商品校验...");
		if (StringUtils.isEmpty(shoppingCartReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getCartNo())) {
			ProductSystemException.raise("3010");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			ProductSystemException.raise("3008");
		}
		for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
			if (StringUtils.isEmpty(shoppingCartReq.getProductList().get(i).getProductNo())) {
				ProductSystemException.raise("3011");
			}
			if (StringUtils.isEmpty(shoppingCartReq.getProductList().get(i).getNum())) {
				ProductSystemException.raise("3012");
			}
		}
		LOG.info("[ShoppingCartHelper.validSubProductNum][end]减少购物车内商品校验...");
	}
	
	/**
	 * 增加购物车内商品数量
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validPlusProductNum(ShoppingCartReq shoppingCartReq) throws ProductSystemException {
		LOG.info("[ShoppingCartHelper.validPlusProductNum][begin]增加购物车内商品校验...");
		if (StringUtils.isEmpty(shoppingCartReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getCartNo())) {
			ProductSystemException.raise("3010");
		}
		if (StringUtils.isEmpty(shoppingCartReq.getProductList())) {
			ProductSystemException.raise("3008");
		}
		for (int i=0;i<shoppingCartReq.getProductList().size();i++) {
			if (StringUtils.isEmpty(shoppingCartReq.getProductList().get(i).getProductNo())) {
				ProductSystemException.raise("3011");
			}
			if (StringUtils.isEmpty(shoppingCartReq.getProductList().get(i).getNum())) {
				ProductSystemException.raise("3012");
			}
		}
		LOG.info("[ShoppingCartHelper.validPlusProductNum][end]增加购物车内商品校验...");
	}
	
}
