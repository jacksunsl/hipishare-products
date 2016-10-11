package com.hipishare.products.controller;

import org.apache.log4j.Logger;
import org.restexpress.Request;
import org.restexpress.Response;

import com.hipishare.products.controller.helper.ProductServerHelper;
import com.hipishare.products.controller.helper.ShoppingCartHelper;
import com.hipishare.products.domain.request.RequestObject;
import com.hipishare.products.domain.request.ShoppingCartReq;
import com.hipishare.products.domain.response.ResponseObject;
import com.hipishare.products.exception.ProductSystemException;
import com.hipishare.products.service.ShoppingCartService;
import com.hipishare.products.utils.SpringContextUtil;

/**
 * 商品评价控制器
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentController extends ProductServerHelper {

	private static final Logger LOGGER = Logger.getLogger(ProductCommentController.class);

	private static ShoppingCartService shoppingCartService = null;

	static{
		try {
			shoppingCartService = (ShoppingCartService)SpringContextUtil.getBean("shoppingCartService");
		} catch (Exception e) {
			LOGGER.error("[ShoppingCartController] 注入service失败");
			e.printStackTrace();
		}
	}
	
	/**
	 * 把商品放入购物车
	 * @param request
	 * @param response
	 * @return
	 */
	public Object putProductToCart(Request request, Response response) {
		LOGGER.info("[ShoppingCartController.putProductToCart][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ShoppingCartController.putProductToCart][data]"+requestObject.getData());
			ShoppingCartReq shoppingCartReq = gson.fromJson(requestObject.getData(), ShoppingCartReq.class);
			
			// 验证请求参数
			ShoppingCartHelper.validPutProduct(shoppingCartReq);
			
			// 业务处理
			shoppingCartService.putProductToCart(shoppingCartReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("已加入购物车！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("加入购物车失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
	
	/**
	 * 清空购物车
	 * @param request
	 * @param response
	 * @return
	 */
	public Object emptyCart(Request request, Response response) {
		LOGGER.info("[ShoppingCartController.emptyCart][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ShoppingCartController.emptyCart][data]"+requestObject.getData());
			ShoppingCartReq shoppingCartReq = gson.fromJson(requestObject.getData(), ShoppingCartReq.class);
			
			// 验证请求参数
			ShoppingCartHelper.validEmptyCart(shoppingCartReq);
			
			// 业务处理
			shoppingCartService.emptyCart(shoppingCartReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("购物车已经清空！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("清空购物车失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
	
	/**
	 * 删除购物车商品
	 * @param request
	 * @param response
	 * @return
	 */
	public Object removeProduct(Request request, Response response) {
		LOGGER.info("[ShoppingCartController.removeProduct][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ShoppingCartController.removeProduct][data]"+requestObject.getData());
			ShoppingCartReq shoppingCartReq = gson.fromJson(requestObject.getData(), ShoppingCartReq.class);
			
			// 验证请求参数
			ShoppingCartHelper.validRemoveProduct(shoppingCartReq);
			
			// 业务处理
			shoppingCartService.removeFromCart(shoppingCartReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("商品已经移出购物车！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("商品移出购物车失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
	
	/**
	 * 减少购物车商品数量
	 * @param request
	 * @param response
	 * @return
	 */
	public Object subProductNum(Request request, Response response) {
		LOGGER.info("[ShoppingCartController.subProductNum][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ShoppingCartController.subProductNum][data]"+requestObject.getData());
			ShoppingCartReq shoppingCartReq = gson.fromJson(requestObject.getData(), ShoppingCartReq.class);
			
			// 验证请求参数
			ShoppingCartHelper.validSubProductNum(shoppingCartReq);
			
			// 业务处理
			shoppingCartService.subProductNum(shoppingCartReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("商品数量修改成功！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("商品数量修改失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
	
	/**
	 * 增加购物车商品数量
	 * @param request
	 * @param response
	 * @return
	 */
	public Object plusProductNum(Request request, Response response) {
		LOGGER.info("[ShoppingCartController.plusProductNum][begin]");
		ResponseObject responseObject = new ResponseObject();
		try {
			// 业务预处理
			RequestObject requestObject = preDobusiness(request);
			
			// 解析业务请求数据
			LOGGER.info("[ShoppingCartController.plusProductNum][data]"+requestObject.getData());
			ShoppingCartReq shoppingCartReq = gson.fromJson(requestObject.getData(), ShoppingCartReq.class);
			
			// 验证请求参数
			ShoppingCartHelper.validPlusProductNum(shoppingCartReq);
			
			// 业务处理
			shoppingCartService.plusProductNum(shoppingCartReq);
			
			responseObject.setCode("00");
			responseObject.setMsg("商品数量修改成功！");
		} catch(ProductSystemException e) {
			responseObject.setCode(e.getCode());
			responseObject.setMsg(e.getMessage());
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		} catch(Exception e) {
			responseObject.setCode("99");
			responseObject.setMsg("商品数量修改失败，请稍后再试。");
			e.printStackTrace();
			LOGGER.error("商品服务系统异常，请稍后再试。");
		}
		return responseObject;
	}
}
