package com.hipishare.products.controller.helper;

import java.math.BigDecimal;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.hipishare.products.domain.request.ProductReq;
import com.hipishare.products.exception.ProductSystemException;

public class ProductHelper {

	private static Logger LOG = LogManager.getLogger(ProductHelper.class.getName());
	/**
	 * 验证新增商品参数
	 * @param productReq
	 * @throws ProductSystemException
	 */
	public static void validAddProduct(ProductReq productReq) throws ProductSystemException {
		if (StringUtils.isEmpty(productReq.getUserid())) {
			ProductSystemException.raise("3001");
		}
		if (StringUtils.isEmpty(productReq.getProductName())) {
			ProductSystemException.raise("3002");
		}
		if (productReq.getProductName().length() > 60) {
			ProductSystemException.raise("3003");
		}
		if (StringUtils.isEmpty(productReq.getMarkPrice())) {
			ProductSystemException.raise("3004");
		}
		try {
			new BigDecimal(productReq.getMarkPrice());
		} catch (NumberFormatException e) {
			LOG.error("商品标价格式错误："+productReq.getMarkPrice());
			ProductSystemException.raise("3005");
		}
		if (!StringUtils.isEmpty(productReq.getOriginalPrice())) {
			try {
				new BigDecimal(productReq.getOriginalPrice());
			} catch (NumberFormatException e) {
				LOG.error("商品原价格式错误："+productReq.getOriginalPrice());
				ProductSystemException.raise("3006");
			}
		}
		if (!StringUtils.isEmpty(productReq.getCostPrice())) {
			try {
				new BigDecimal(productReq.getCostPrice());
			} catch (NumberFormatException e) {
				LOG.error("商品成本价格式错误："+productReq.getCostPrice());
				ProductSystemException.raise("3007");
			}
		}
	}
}
