package com.hipishare.products.controller;

import org.apache.log4j.Logger;
import org.restexpress.Request;
import org.restexpress.Response;

import com.hipishare.products.controller.helper.ProductHelper;
import com.hipishare.products.controller.helper.ProductServerHelper;
import com.hipishare.products.domain.request.ProductReq;
import com.hipishare.products.domain.request.RequestObject;
import com.hipishare.products.domain.response.ResponseObject;
import com.hipishare.products.exception.ProductSystemException;
import com.hipishare.products.service.ProductService;
import com.hipishare.products.utils.SpringContextUtil;

/**
 * 商品
 * @author sunlei
 * @date 2016年9月26日
 */
public class ProductController extends ProductServerHelper {

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
		LOGGER.info("[ProductController.addProduct][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ProductController.addProduct][data]"+requestObject.getData());
			ProductReq productReq = gson.fromJson(requestObject.getData(), ProductReq.class);
			
			// 验证请求参数
			ProductHelper.validAddProduct(productReq);
			
			// 业务处理
			productService.addProduct(productReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("新增商品成功！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("新增商品失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
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
