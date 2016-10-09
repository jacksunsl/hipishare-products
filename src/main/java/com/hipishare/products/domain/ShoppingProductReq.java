package com.hipishare.products.domain;

/**
 * 购物车商品请求实体
 * @author sunlei
 * @date 2016年9月26日
 */
public class ShoppingProductReq {
	private String productNo;// 商品编号
	private String num;// 商品数量
	private String markPrice;// 商品标价
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMarkPrice() {
		return markPrice;
	}
	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
	}
}
