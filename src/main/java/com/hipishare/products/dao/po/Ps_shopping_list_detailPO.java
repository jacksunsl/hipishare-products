package com.hipishare.products.dao.po;

import java.math.BigDecimal;

/**
 * <b>ps_shopping_list_detail[ps_shopping_list_detail]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_shopping_list_detailPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 清单编号
	 */
	private String list_no;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 商品下单价格
	 */
	private BigDecimal price;
	
	/**
	 * 商品数量
	 */
	private Integer num;
	

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
	 * 商品编号
	 * 
	 * @return product_no
	 */
	public String getProduct_no() {
		return product_no;
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
	 * 商品数量
	 * 
	 * @return num
	 */
	public Integer getNum() {
		return num;
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
	 * 商品编号
	 * 
	 * @param product_no
	 */
	public void setProduct_no(String product_no) {
		this.product_no = product_no;
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
	 * 商品数量
	 * 
	 * @param num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	

}