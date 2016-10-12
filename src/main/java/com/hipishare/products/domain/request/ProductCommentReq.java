package com.hipishare.products.domain.request;

/**
 * 商品评论请求实体类
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentReq {
	private String userid;// 用户id
	private String productNo;// 商品编号
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
}
