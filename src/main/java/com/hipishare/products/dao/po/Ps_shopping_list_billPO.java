package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_shopping_list_bill[ps_shopping_list_bill]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_shopping_list_billPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 清单编号
	 */
	private String list_no;
	
	/**
	 * 图片标识
	 */
	private String img_code;
	
	/**
	 * 图片备注
	 */
	private String img_remark;
	
	/**
	 * 上传时间
	 */
	private Date upload_time;
	
	/**
	 * 上传用户
	 */
	private Integer userid;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 清单编号
	 * 
	 * @return list_no
	 */
	public String getList_no() {
		return list_no;
	}
	
	/**
	 * 图片标识
	 * 
	 * @return img_code
	 */
	public String getImg_code() {
		return img_code;
	}
	
	/**
	 * 图片备注
	 * 
	 * @return img_remark
	 */
	public String getImg_remark() {
		return img_remark;
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
	 * 上传用户
	 * 
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
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
	 * 清单编号
	 * 
	 * @param list_no
	 */
	public void setList_no(String list_no) {
		this.list_no = list_no;
	}
	
	/**
	 * 图片标识
	 * 
	 * @param img_code
	 */
	public void setImg_code(String img_code) {
		this.img_code = img_code;
	}
	
	/**
	 * 图片备注
	 * 
	 * @param img_remark
	 */
	public void setImg_remark(String img_remark) {
		this.img_remark = img_remark;
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
	 * 上传用户
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	

}