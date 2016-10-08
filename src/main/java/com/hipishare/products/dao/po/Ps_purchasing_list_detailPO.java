package com.hipishare.products.dao.po;

import java.math.BigDecimal;

/**
 * <b>ps_purchasing_list_detail[ps_purchasing_list_detail]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_purchasing_list_detailPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * purchasing_no
	 */
	private String purchasing_no;
	
	/**
	 * 清单编号
	 */
	private String shopping_list_no;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 商品数量
	 */
	private Integer num;
	
	/**
	 * 商品下单价格
	 */
	private BigDecimal price;
	
	/**
	 * status
	 */
	private Integer status;
	

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
	 * 清单编号
	 * 
	 * @return shopping_list_no
	 */
	public String getShopping_list_no() {
		return shopping_list_no;
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
	 * 商品下单价格
	 * 
	 * @return price
	 */
	public BigDecimal getPrice() {
		return price;
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
	 * 清单编号
	 * 
	 * @param shopping_list_no
	 */
	public void setShopping_list_no(String shopping_list_no) {
		this.shopping_list_no = shopping_list_no;
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
	 * 商品下单价格
	 * 
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * status
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	

}