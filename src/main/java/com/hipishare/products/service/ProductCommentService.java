package com.hipishare.products.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hipishare.products.dao.mapper.Ps_product_commentMapper;
import com.hipishare.products.dao.mapper.Ps_product_comment_imgMapper;
import com.hipishare.products.dao.po.Ps_product_commentPO;
import com.hipishare.products.dao.po.Ps_product_comment_imgPO;
import com.hipishare.products.domain.request.ProductCommentReq;
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

	/**
	 * 新增商品评价
	 * @param productCommentReq
	 * @return
	 * @throws ProductSystemException
	 */
	@Transactional
	public int writeProductComment(ProductCommentReq productCommentReq) throws ProductSystemException {
		Ps_product_commentPO productComment = new Ps_product_commentPO();
		productComment.setComment_time(new Date());
		productComment.setContent(productCommentReq.getContent());
		productComment.setEnable(1);
		productComment.setOrder_no(productCommentReq.getOrderNo());
		productComment.setProduct_no(productCommentReq.getProductNo());
		productComment.setScore(productCommentReq.getScore());
		productComment.setStatus(1);
		productComment.setUserid(Integer.parseInt(productCommentReq.getUserid()));
		productCommentMapper.insert(productComment);
		
		if (null != productCommentReq.getCommentImgList()) {
			for (int i=0;i<productCommentReq.getCommentImgList().size();i++) {
				Ps_product_comment_imgPO productCommentImg = new Ps_product_comment_imgPO();
				productCommentImg.setComment_id(productComment.getId());
				productCommentImg.setEnable(1);
				productCommentImg.setImg_code(productCommentReq.getCommentImgList().get(i).getImgCode());
				productCommentImg.setSort(productCommentReq.getCommentImgList().get(i).getSort());
				productCommentImg.setStatus(1);
				productCommentImg.setUpload_time(new Date());
				productCommentImgMapper.insert(productCommentImg);
			}
		}
		return 1;
	}
	
}
