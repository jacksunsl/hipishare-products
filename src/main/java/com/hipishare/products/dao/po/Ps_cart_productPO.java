package com.hipishare.products.dao.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <b>ps_cart_product[ps_cart_product]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-10 15:55:11
 */
public class Ps_cart_productPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 购物车编号
	 */
	private String cart_no;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 商品数量
	 */
	private Integer num;
	
	/**
	 * 放入购物车时间
	 */
	private Date push_time;
	
	/**
	 * 放入时商品价格
	 */
	private BigDecimal push_price;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 购物车编号
	 * 
	 * @return cart_no
	 */
	public String getCart_no() {
		return cart_no;
	}
	
	/**
	 * 商品编号
	 * 
	 * @return product_no
	 */
	public String getProduct_no() {
		return product_no;
	}
	
	/**
	 * 商品数量
	 * 
	 * @return num
	 */
	public Integer getNum() {
		return num;
	}
	
	/**
	 * 放入购物车时间
	 * 
	 * @return push_time
	 */
	public Date getPush_time() {
		return push_time;
	}
	
	/**
	 * 放入时商品价格
	 * 
	 * @return push_price
	 */
	public BigDecimal getPush_price() {
		return push_price;
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
	 * 购物车编号
	 * 
	 * @param cart_no
	 */
	public void setCart_no(String cart_no) {
		this.cart_no = cart_no;
	}
	
	/**
	 * 商品编号
	 * 
	 * @param product_no
	 */
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	
	/**
	 * 商品数量
	 * 
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	
	/**
	 * 放入购物车时间
	 * 
	 * @param push_time
	 */
	public void setPush_time(Date push_time) {
		this.push_time = push_time;
	}
	
	/**
	 * 放入时商品价格
	 * 
	 * @param push_price
	 */
	public void setPush_price(BigDecimal push_price) {
		this.push_price = push_price;
	}
	

}