package com.hipishare.products.dao.po;

import java.math.BigDecimal;

/**
 * <b>ps_product_prop[ps_product_prop]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_product_propPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 商品重量,单位kg
	 */
	private BigDecimal weight;
	
	/**
	 * 商品体积，长宽高
	 */
	private String volume;
	
	/**
	 * 保质期，单位：月
	 */
	private Integer shelf_life;
	

	/**
	 * id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
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
	 * 商品重量,单位kg
	 * 
	 * @return weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}
	
	/**
	 * 商品体积，长宽高
	 * 
	 * @return volume
	 */
	public String getVolume() {
		return volume;
	}
	
	/**
	 * 保质期，单位：月
	 * 
	 * @return shelf_life
	 */
	public Integer getShelf_life() {
		return shelf_life;
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
	 * 商品编号
	 * 
	 * @param product_no
	 */
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	
	/**
	 * 商品重量,单位kg
	 * 
	 * @param weight
	 */
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	/**
	 * 商品体积，长宽高
	 * 
	 * @param volume
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	/**
	 * 保质期，单位：月
	 * 
	 * @param shelf_life
	 */
	public void setShelf_life(Integer shelf_life) {
		this.shelf_life = shelf_life;
	}
	

}