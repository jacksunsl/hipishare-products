package com.hipishare.products.domain.request;

/**
 * 商品详情请求实体
 * @author sunlei
 * @date 2016年9月26日
 */
public class ProductDetailReq {
	private String detailType;// 详情类型(1:文字 2:图片 3:视频 4:音频)
	private String detailContent;// 详情内容
	private int sort;// 排序
	public String getDetailType() {
		return detailType;
	}
	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}
	public String getDetailContent() {
		return detailContent;
	}
	public void setDetailContent(String detailContent) {
		this.detailContent = detailContent;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
}
