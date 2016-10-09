package com.hipishare.products.domain;

import java.util.List;

/**
 * 购物车请求实体
 * @author sunlei
 * @date 2016年9月26日
 */
public class ShoppingCartReq {
	private String userid;// 用户id
	private List<ShoppingProductReq> productList;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public List<ShoppingProductReq> getProductList() {
		return productList;
	}
	public void setProductList(List<ShoppingProductReq> productList) {
		this.productList = productList;
	}
}
