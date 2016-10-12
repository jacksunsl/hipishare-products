package com.hipishare.products.routes;

import io.netty.handler.codec.http.HttpMethod;

import org.restexpress.RestExpress;

import com.hipishare.products.controller.ProductCommentController;

/**
 * 商品评价路由表
 * @author sunlei
 * @date 2016年10月12日
 */
public class ProductCommentRoute {
	
	public static void define(RestExpress server) {
		// 查询卡信息路由
		server.uri("/productServer/productComment/queryProductComment", new ProductCommentController()).action(
				"queryProductComment", HttpMethod.POST);
	}
}
