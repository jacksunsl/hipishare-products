package com.hipishare.products.dao.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <b>ps_product[ps_product]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:25
 */
public class Ps_productPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 商品名称
	 */
	private String product_name;
	
	/**
	 * 商品描述
	 */
	private String product_brief;
	
	/**
	 * 商品标价，售出商品的实际价格
	 */
	private BigDecimal mark_price;
	
	/**
	 * 商品原价，商品原来的价格
	 */
	private BigDecimal original_price;
	
	/**
	 * 商品成本价
	 */
	private BigDecimal cost_price;
	
	/**
	 * 商品状态(1:未审核 2:审核通过 3:上架 4:下架)
	 */
	private Integer status;
	
	/**
	 * 创建时间
	 */
	private Date create_time;
	
	/**
	 * 修改时间
	 */
	private Date update_time;
	
	/**
	 * userid
	 */
	private Integer userid;
	
	/**
	 * 是否有效(0:删除 1:有效)
	 */
	private Integer enable;
	

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
	 * 商品名称
	 * 
	 * @return product_name
	 */
	public String getProduct_name() {
		return product_name;
	}
	
	/**
	 * 商品描述
	 * 
	 * @return product_brief
	 */
	public String getProduct_brief() {
		return product_brief;
	}
	
	/**
	 * 商品标价，售出商品的实际价格
	 * 
	 * @return mark_price
	 */
	public BigDecimal getMark_price() {
		return mark_price;
	}
	
	/**
	 * 商品原价，商品原来的价格
	 * 
	 * @return original_price
	 */
	public BigDecimal getOriginal_price() {
		return original_price;
	}
	
	/**
	 * 商品成本价
	 * 
	 * @return cost_price
	 */
	public BigDecimal getCost_price() {
		return cost_price;
	}
	
	/**
	 * 商品状态(1:未审核 2:审核通过 3:上架 4:下架)
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	
	/**
	 * 创建时间
	 * 
	 * @return create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	
	/**
	 * 修改时间
	 * 
	 * @return update_time
	 */
	public Date getUpdate_time() {
		return update_time;
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
	 * 是否有效(0:删除 1:有效)
	 * 
	 * @return enable
	 */
	public Integer getEnable() {
		return enable;
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
	 * 商品名称
	 * 
	 * @param product_name
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	/**
	 * 商品描述
	 * 
	 * @param product_brief
	 */
	public void setProduct_brief(String product_brief) {
		this.product_brief = product_brief;
	}
	
	/**
	 * 商品标价，售出商品的实际价格
	 * 
	 * @param mark_price
	 */
	public void setMark_price(BigDecimal mark_price) {
		this.mark_price = mark_price;
	}
	
	/**
	 * 商品原价，商品原来的价格
	 * 
	 * @param original_price
	 */
	public void setOriginal_price(BigDecimal original_price) {
		this.original_price = original_price;
	}
	
	/**
	 * 商品成本价
	 * 
	 * @param cost_price
	 */
	public void setCost_price(BigDecimal cost_price) {
		this.cost_price = cost_price;
	}
	
	/**
	 * 商品状态(1:未审核 2:审核通过 3:上架 4:下架)
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 创建时间
	 * 
	 * @param create_time
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	/**
	 * 修改时间
	 * 
	 * @param update_time
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
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
	 * 是否有效(0:删除 1:有效)
	 * 
	 * @param enable
	 */
	public void setEnable(Integer enable) {
		this.enable = enable;
	}
	

}