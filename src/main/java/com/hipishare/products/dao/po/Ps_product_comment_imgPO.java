package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_product_comment_img[ps_product_comment_img]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-11 17:03:51
 */
public class Ps_product_comment_imgPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 评价id
	 */
	private Integer comment_id;
	
	/**
	 * 评价图片code
	 */
	private String img_code;
	
	/**
	 * 上传时间
	 */
	private Date upload_time;
	
	/**
	 * 图片排序
	 */
	private Integer sort;
	
	/**
	 * 状态:1.正常 2.屏蔽
	 */
	private Integer status;
	
	/**
	 * 是否有效(0:删除 1:有效)
	 */
	private Integer enable;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 评价id
	 * 
	 * @return comment_id
	 */
	public Integer getComment_id() {
		return comment_id;
	}
	
	/**
	 * 评价图片code
	 * 
	 * @return img_code
	 */
	public String getImg_code() {
		return img_code;
	}
	
	/**
	 * 上传时间
	 * 
	 * @return upload_time
	 */
	public Date getUpload_time() {
		return upload_time;
	}
	
	/**
	 * 图片排序
	 * 
	 * @return sort
	 */
	public Integer getSort() {
		return sort;
	}
	
	/**
	 * 状态:1.正常 2.屏蔽
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 是否有效(0:删除 1:有效)
	 * 
	 * @return enable
	 */
	public Integer getEnable() {
		return enable;
	}
	

	/**
	 * id
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * 评价id
	 * 
	 * @param comment_id
	 */
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	
	/**
	 * 评价图片code
	 * 
	 * @param img_code
	 */
	public void setImg_code(String img_code) {
		this.img_code = img_code;
	}
	
	/**
	 * 上传时间
	 * 
	 * @param upload_time
	 */
	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}
	
	/**
	 * 图片排序
	 * 
	 * @param sort
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	
	/**
	 * 状态:1.正常 2.屏蔽
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 是否有效(0:删除 1:有效)
	 * 
	 * @param enable
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	

}