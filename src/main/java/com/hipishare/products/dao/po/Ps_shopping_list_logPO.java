package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_shopping_list_log[ps_shopping_list_log]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_shopping_list_logPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 清单编号
	 */
	private String list_no;
	
	/**
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 */
	private Integer list_status;
	
	/**
	 * 变更时间
	 */
	private Date change_time;
	
	/**
	 * 变更备注
	 */
	private String remark;
	
	/**
	 * 操作人id
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
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 * 
	 * @return list_status
	 */
	public Integer getList_status() {
		return list_status;
	}
	
	/**
	 * 变更时间
	 * 
	 * @return change_time
	 */
	public Date getChange_time() {
		return change_time;
	}
	
	/**
	 * 变更备注
	 * 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
	}
	
	/**
	 * 操作人id
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
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 * 
	 * @param list_status
	 */
	public void setList_status(Integer list_status) {
		this.list_status = list_status;
	}
	
	/**
	 * 变更时间
	 * 
	 * @param change_time
	 */
	public void setChange_time(Date change_time) {
		this.change_time = change_time;
	}
	
	/**
	 * 变更备注
	 * 
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * 操作人id
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	

}