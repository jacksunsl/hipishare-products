package com.hipishare.products.dao.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <b>ps_purchasing_list[ps_purchasing_list]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_purchasing_listPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * purchasing_no
	 */
	private String purchasing_no;
	
	/**
	 * total_amount
	 */
	private BigDecimal total_amount;
	
	/**
	 * total_num
	 */
	private Integer total_num;
	
	/**
	 * status
	 */
	private Integer status;
	
	/**
	 * userid
	 */
	private Integer userid;
	
	/**
	 * create_time
	 */
	private Date create_time;
	
	/**
	 * fee
	 */
	private BigDecimal fee;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * purchasing_no
	 * 
	 * @return purchasing_no
	 */
	public String getPurchasing_no() {
		return purchasing_no;
	}
	
	/**
	 * total_amount
	 * 
	 * @return total_amount
	 */
	public BigDecimal getTotal_amount() {
		return total_amount;
	}
	
	/**
	 * total_num
	 * 
	 * @return total_num
	 */
	public Integer getTotal_num() {
		return total_num;
	}
	
	/**
	 * status
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * userid
	 * 
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}
	
	/**
	 * create_time
	 * 
	 * @return create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	
	/**
	 * fee
	 * 
	 * @return fee
	 */
	public BigDecimal getFee() {
		return fee;
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
	 * purchasing_no
	 * 
	 * @param purchasing_no
	 */
	public void setPurchasing_no(String purchasing_no) {
		this.purchasing_no = purchasing_no;
	}
	
	/**
	 * total_amount
	 * 
	 * @param total_amount
	 */
	public void setTotal_amount(BigDecimal total_amount) {
		this.total_amount = total_amount;
	}
	
	/**
	 * total_num
	 * 
	 * @param total_num
	 */
	public void setTotal_num(Integer total_num) {
		this.total_num = total_num;
	}
	
	/**
	 * status
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * userid
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	/**
	 * create_time
	 * 
	 * @param create_time
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * fee
	 * 
	 * @param fee
	 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	

}