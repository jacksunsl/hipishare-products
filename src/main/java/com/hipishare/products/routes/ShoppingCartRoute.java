package com.hipishare.products.routes;

import io.netty.handler.codec.http.HttpMethod;

import org.restexpress.RestExpress;

import com.hipishare.products.controller.ShoppingCartController;

/**
 * 购物车路由表
 * @author sunlei
 * @date 2016年9月26日
 */
public class ShoppingCartRoute {
	
	public static void define(RestExpress server) {
		// 查询卡信息路由
		server.uri("/productServer/putProductToCart", new ShoppingCartController()).action(
				"putProductToCart", HttpMethod.POST);
	}
}
