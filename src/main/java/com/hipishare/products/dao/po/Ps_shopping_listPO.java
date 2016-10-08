package com.hipishare.products.dao.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <b>ps_shopping_list[ps_shopping_list]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_shopping_listPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 清单编号
	 */
	private String list_no;
	
	/**
	 * 清单名称
	 */
	private String list_name;
	
	/**
	 * 清单总价格
	 */
	private BigDecimal total_price;
	
	/**
	 * 清单商品总件数
	 */
	private Integer piece_num;
	
	/**
	 * 清单创建时间，即出单时间
	 */
	private Date create_time;
	
	/**
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 */
	private Integer status;
	
	/**
	 * 清单创建用户
	 */
	private Integer userid;
	
	/**
	 * 清单备注
	 */
	private String remark;
	

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
	 * 清单名称
	 * 
	 * @return list_name
	 */
	public String getList_name() {
		return list_name;
	}
	
	/**
	 * 清单总价格
	 * 
	 * @return total_price
	 */
	public BigDecimal getTotal_price() {
		return total_price;
	}
	
	/**
	 * 清单商品总件数
	 * 
	 * @return piece_num
	 */
	public Integer getPiece_num() {
		return piece_num;
	}
	
	/**
	 * 清单创建时间，即出单时间
	 * 
	 * @return create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	
	/**
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 清单创建用户
	 * 
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}
	
	/**
	 * 清单备注
	 * 
	 * @return remark
	 */
	public String getRemark() {
		return remark;
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
	 * 清单名称
	 * 
	 * @param list_name
	 */
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	
	/**
	 * 清单总价格
	 * 
	 * @param total_price
	 */
	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}
	
	/**
	 * 清单商品总件数
	 * 
	 * @param piece_num
	 */
	public void setPiece_num(Integer piece_num) {
		this.piece_num = piece_num;
	}
	
	/**
	 * 清单创建时间，即出单时间
	 * 
	 * @param create_time
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * 购物清单状态，1:出单 2:接单 3:采购中 4:中断 5:完成 6:丢弃
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 清单创建用户
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	/**
	 * 清单备注
	 * 
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}