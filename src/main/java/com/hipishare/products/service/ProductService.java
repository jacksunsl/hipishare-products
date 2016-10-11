package com.hipishare.products.service;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipishare.products.dao.mapper.Ps_productMapper;
import com.hipishare.products.dao.po.Ps_productPO;
import com.hipishare.products.domain.request.ProductReq;
import com.hipishare.products.exception.ProductSystemException;

@Service("productService")
public class ProductService {

	private static Logger LOG = LogManager.getLogger(ProductService.class.getName());
	
	@Autowired
	private Ps_productMapper productMapper;
	
	/**
	 * 新增商品
	 * @param productReq
	 * @return
	 * @throws ProductSystemException
	 */
	@Transactional
	public int addProduct(ProductReq productReq) throws ProductSystemException {
		LOG.info("保存商品信息...");
		
		// 获取商品编码
		String productNo = "";// 从资源系统中获取商品编码
		
		// 新增商品基本信息
		Ps_productPO ps_productPO = new Ps_productPO();
		ps_productPO.setProduct_no(productNo);
		ps_productPO.setMark_price(new BigDecimal(productReq.getMarkPrice()));
		ps_productPO.setOriginal_price(new BigDecimal(productReq.getOriginalPrice()));
		ps_productPO.setCost_price(new BigDecimal(productReq.getCostPrice()));
		ps_productPO.setProduct_brief(productReq.getProductBrief());
		ps_productPO.setProduct_name(productReq.getProductName());
		ps_productPO.setCreate_time(new Date());
		ps_productPO.setStatus(1);
		ps_productPO.setEnable(1);
		productMapper.insert(ps_productPO);
		
		// 新增商品图片信息
		
		// 新增商品附属信息
		
		
		return 1;
	}
	
}
