package com.hipishare.products.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.restexpress.Request;
import org.restexpress.Response;

import com.hipishare.products.controller.helper.ProductCommentHelper;
import com.hipishare.products.controller.helper.ProductServerHelper;
import com.hipishare.products.domain.request.ProductCommentReq;
import com.hipishare.products.domain.request.RequestObject;
import com.hipishare.products.domain.response.ProductCommentRsp;
import com.hipishare.products.domain.response.ResponseObject;
import com.hipishare.products.exception.ProductSystemException;
import com.hipishare.products.service.ProductCommentService;
import com.hipishare.products.utils.SpringContextUtil;

/**
 * 商品评价控制器
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentController extends ProductServerHelper {

	private static final Logger LOGGER = Logger.getLogger(ProductCommentController.class);

	private static ProductCommentService productCommentService = null;

	static{
		try {
			productCommentService = (ProductCommentService)SpringContextUtil.getBean("productCommentService");
		} catch (Exception e) {
			LOGGER.error("[ProductCommentController] 注入service失败");
			e.printStackTrace();
		}
	}
	
	/**
	 * 把商品放入购物车
	 * @param request
	 * @param response
	 * @return
	 */
	public Object queryProductComment(Request request, Response response) {
		LOGGER.info("[ProductCommentController.queryProductComment][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ProductCommentController.queryProductComment][data]"+requestObject.getData());
			ProductCommentReq productCommentReq = gson.fromJson(requestObject.getData(), ProductCommentReq.class);
			
			// 验证请求参数
			ProductCommentHelper.validQueryProductComment(productCommentReq);
			
			// 业务处理
			List<ProductCommentRsp> productCommentList = productCommentService.queryProductComment(productCommentReq.getProductNo());
			
			responseObject.setCode("00");
			responseObject.setMsg("查询成功！");
			responseObject.setResult(gson.toJson(productCommentList));
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("查询失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
	
}
