package com.hipishare.products.controller;

import org.apache.log4j.Logger;

import com.hipishare.products.service.ShoppingCartService;
import com.hipishare.products.utils.SpringContextUtil;

/**
 * 购物车
 * @author sunlei
 * @date 2016年9月26日
 */
public class ShoppingCartController {

	private static final Logger LOGGER = Logger.getLogger(ShoppingCartController.class);

	private static ShoppingCartService shoppingCartService = null;

	static{
		try {
			shoppingCartService = (ShoppingCartService)SpringContextUtil.getBean("shoppingCartService");
		} catch (Exception e) {
			LOGGER.error("[ShoppingCartController] 注入service失败");
			e.printStackTrace();
		}
	}
}
