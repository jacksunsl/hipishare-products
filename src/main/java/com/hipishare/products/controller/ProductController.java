package com.hipishare.products.controller;

import org.apache.log4j.Logger;
import org.restexpress.Request;
import org.restexpress.Response;

import com.hipishare.products.service.ProductService;
import com.hipishare.products.utils.SpringContextUtil;

/**
 * 商品
 * @author sunlei
 * @date 2016年9月26日
 */
public class ProductController {

	private static final Logger LOGGER = Logger.getLogger(ProductController.class);
	
	private static ProductService productService = null;
	
	static{
		try {
			productService = (ProductService)SpringContextUtil.getBean("productService");
		} catch (Exception e) {
			LOGGER.error("[ProductController] 注入service失败");
			e.printStackTrace();
		}
	}
	
	/**
	 * 新增商品
	 * @param request
	 * @param response
	 * @return
	 */
	public Object addProduct(Request request, Response response) {
		productService.addProduct();
		return null;
	}
	
	/**
	 * 查询商品简介
	 * @param request
	 * @param response
	 * @return
	 */
	public Object queryProductBrief(Request request, Response response) {
		return null;
	}
}
