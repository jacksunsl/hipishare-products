package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_product_comment[ps_product_comment]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:25
 */
public class Ps_product_commentPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * order_no
	 */
	private String order_no;
	
	/**
	 * content
	 */
	private String content;
	
	/**
	 * userid
	 */
	private Integer userid;
	
	/**
	 * comment_time
	 */
	private Date comment_time;
	
	/**
	 * 评价分数,五颗星满分
	 */
	private Integer score;
	

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
	 * order_no
	 * 
	 * @return order_no
	 */
	public String getOrder_no() {
		return order_no;
	}
	
	/**
	 * content
	 * 
	 * @return content
	 */
	public String getContent() {
		return content;
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
	 * comment_time
	 * 
	 * @return comment_time
	 */
	public Date getComment_time() {
		return comment_time;
	}
	
	/**
	 * 评价分数,五颗星满分
	 * 
	 * @return score
	 */
	public Integer getScore() {
		return score;
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
	 * order_no
	 * 
	 * @param order_no
	 */
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	
	/**
	 * content
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
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
	 * comment_time
	 * 
	 * @param comment_time
	 */
	public void setComment_time(Date comment_time) {
		this.comment_time = comment_time;
	}
	
	/**
	 * 评价分数,五颗星满分
	 * 
	 * @param score
	 */
	public void setScore(Integer score) {
		this.score = score;
	}
	

}