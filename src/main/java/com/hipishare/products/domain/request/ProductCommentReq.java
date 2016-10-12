package com.hipishare.products.domain.request;

import java.util.List;

/**
 * 商品评论请求实体类
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentReq {
	private String userid;// 用户id
	private String productNo;// 商品编号
	private String orderNo;// 订单编号
	private String content;// 评价内容
	private int score;// 评价分数
	List<ProductCommentImgReq> commentImgList;// 评论图片
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<ProductCommentImgReq> getCommentImgList() {
		return commentImgList;
	}
	public void setCommentImgList(List<ProductCommentImgReq> commentImgList) {
		this.commentImgList = commentImgList;
	}
}
