package com.hipishare.products.routes;

import io.netty.handler.codec.http.HttpMethod;

import org.restexpress.RestExpress;

import com.hipishare.products.controller.ProductController;

/**
 * 商品路由表
 * @author sunlei
 * @date 2016年9月26日
 */
public class ProductRoute {
	
	public static void define(RestExpress server) {
		// 查询卡信息路由
		server.uri("/productServer/addProduct", new ProductController()).action(
				"addProduct", HttpMethod.GET);
	}
}
