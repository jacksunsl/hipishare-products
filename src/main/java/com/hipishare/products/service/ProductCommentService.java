package com.hipishare.products.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipishare.products.dao.mapper.Ps_product_commentMapper;
import com.hipishare.products.dao.mapper.Ps_product_comment_imgMapper;
import com.hipishare.products.domain.response.ProductCommentRsp;
import com.hipishare.products.exception.ProductSystemException;

@Service("productCommentService")
public class ProductCommentService {

	private static Logger LOG = LogManager.getLogger(ProductCommentService.class.getName());
	
	@Autowired
	private Ps_product_commentMapper productCommentMapper;

	@Autowired
	private Ps_product_comment_imgMapper productCommentImgMapper;
	
	/**
	 * 根据商品编号查询商品评价
	 * @param productNo 商品编号
	 * @return
	 * @throws ProductSystemException
	 */
	@Transactional(readOnly = true)
	public List<ProductCommentRsp> queryProductComment(String productNo) throws ProductSystemException {
		return productCommentMapper.queryProductComment(productNo);
	}
}
