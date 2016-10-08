package com.hipishare.products.domain;

import java.util.List;

/**
 * 商品请求实体
 * @author sunlei
 * @date 2016年9月26日
 */
public class ProductReq {
	private String productNo;// 商品编号
	private String productName;// 商品名称
	private String productBrief;// 商品描述
	private String markPrice;// 商品标价
	private String originalPrice;// 商品原价
	private String costPrice;// 商品成本价
	private String userid;// 用户id
	private List<ProductDetailReq> productDetailList;
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrief() {
		return productBrief;
	}
	public void setProductBrief(String productBrief) {
		this.productBrief = productBrief;
	}
	public String getMarkPrice() {
		return markPrice;
	}
	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public List<ProductDetailReq> getProductDetailList() {
		return productDetailList;
	}
	public void setProductDetailList(List<ProductDetailReq> productDetailList) {
		this.productDetailList = productDetailList;
	}
}
