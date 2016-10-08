package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_product_comment_img[ps_product_comment_img]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:25
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
	

}