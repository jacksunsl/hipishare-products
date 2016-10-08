package com.hipishare.products.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hipishare.products.dao.mapper.Ps_productMapper;
import com.hipishare.products.dao.po.Ps_productPO;
import com.hipishare.products.exception.ProductSystemException;

@Service("productService")
public class ProductService {

	private static Logger LOG = LogManager.getLogger(ProductService.class.getName());
	
	@Autowired
	private Ps_productMapper productMapper;
	
	public int addProduct() throws ProductSystemException {
		LOG.info("保存商品信息...");
		Ps_productPO ps_productPO = new Ps_productPO();
		ps_productPO.setProduct_name("test product");
		productMapper.insert(ps_productPO);
		return 0;
	}
	
}
