package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_shopping_cart[ps_shopping_cart]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_shopping_cartPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 用户id
	 */
	private Integer userid;
	
	/**
	 * 购物车创建时间
	 */
	private Date create_time;
	
	/**
	 * 商品件数
	 */
	private Integer piece_num;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 用户id
	 * 
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}
	
	/**
	 * 购物车创建时间
	 * 
	 * @return create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	
	/**
	 * 商品件数
	 * 
	 * @return piece_num
	 */
	public Integer getPiece_num() {
		return piece_num;
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
	 * 用户id
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	/**
	 * 购物车创建时间
	 * 
	 * @param create_time
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * 商品件数
	 * 
	 * @param piece_num
	 */
	public void setPiece_num(Integer piece_num) {
		this.piece_num = piece_num;
	}
	

}