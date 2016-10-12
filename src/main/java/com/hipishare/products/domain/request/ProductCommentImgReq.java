package com.hipishare.products.domain.request;

/**
 * 商品评论图片请求实体类
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentImgReq {
	private String imgCode;// 评论图片code
	private int sort;// 图片排序
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
}
