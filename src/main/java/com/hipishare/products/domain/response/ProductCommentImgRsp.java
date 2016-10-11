package com.hipishare.products.domain.response;

import java.util.Date;

/**
 * 商品评价图片返回实体
 * @author sunlei
 * @date 2016年10月11日
 */
public class ProductCommentImgRsp {
	private String commentId;// 评论id
	private String imgCode;// 评论图片code
	private Date uploadTime;// 图片上传时间
	private int sort;// 图片排序
	private int status;// 状态:1.正常 2.屏蔽
	private int enable;// 是否有效(0:删除 1:有效)
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
	public Date getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
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
