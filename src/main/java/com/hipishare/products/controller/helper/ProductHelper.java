package com.hipishare.products.controller.helper;

import org.springframework.util.StringUtils;

import com.hipishare.products.domain.ProductReq;
import com.hipishare.products.exception.ProductSystemException;

public class ProductHelper {
	
	/**
	 * 验证新增商品参数
	 * @param productReq
	 * @throws ProductSystemException
	 */
	public static void validAddProduct(ProductReq productReq) throws ProductSystemException {
		if (StringUtils.isEmpty(productReq.getProductName())) {
			ProductSystemException.raise("3001");
		}
	}
}
