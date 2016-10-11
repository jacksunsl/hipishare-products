package com.hipishare.products.domain.response;

import java.util.Date;
import java.util.List;

/**
 * 商品评价返回实体
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentRsp {
	private String productNo;// 商品编号
	private String orderNo;// 订单编号
	private String content;// 评价内容
	private String userid;// 评价用户
	private Date commentTime;// 评价时间
	private int score;// 评价分数
	private int status;// 评论状态：1.正常 2.屏蔽
	private int enable;// 是否有效(0:删除 1:有效)
	private List<ProductCommentImgRsp> commentImgList;// 评论图片数组
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
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<ProductCommentImgRsp> getCommentImgList() {
		return commentImgList;
	}
	public void setCommentImgList(List<ProductCommentImgRsp> commentImgList) {
		this.commentImgList = commentImgList;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	
}
