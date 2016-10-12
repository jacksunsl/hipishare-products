package com.hipishare.products.controller.helper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.hipishare.products.domain.request.ProductCommentReq;
import com.hipishare.products.exception.ProductSystemException;

public class ProductCommentHelper {

	private static Logger LOG = LogManager.getLogger(ProductCommentHelper.class.getName());
	/**
	 * 验证商品放入购物车
	 * @param shoppingCartReq
	 * @throws ProductSystemException
	 */
	public static void validQueryProductComment(ProductCommentReq productCommentReq) throws ProductSystemException {
		LOG.info("[ProductCommentHelper.validQueryProductComment][begin]商品评论查询校验...");
		if (StringUtils.isEmpty(productCommentReq.getProductNo())) {
			ProductSystemException.raise("3011");
		}
		LOG.info("[ProductCommentHelper.validQueryProductComment][end]商品评论查询校验...");
	}
	
}
