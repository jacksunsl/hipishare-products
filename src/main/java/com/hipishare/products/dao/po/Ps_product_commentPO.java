package com.hipishare.products.dao.po;

import java.util.Date;

/**
 * <b>ps_product_comment[ps_product_comment]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-11 16:49:29
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
	 * 订单编号
	 */
	private String order_no;
	
	/**
	 * 评价内容
	 */
	private String content;
	
	/**
	 * 评价用户
	 */
	private Integer userid;
	
	/**
	 * 评价时间
	 */
	private Date comment_time;
	
	/**
	 * 评价分数,五颗星满分
	 */
	private Integer score;
	
	/**
	 * 评论状态：1.正常 2.屏蔽
	 */
	private Integer status;
	
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
	 * 订单编号
	 * 
	 * @return order_no
	 */
	public String getOrder_no() {
		return order_no;
	}
	
	/**
	 * 评价内容
	 * 
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * 评价用户
	 * 
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}
	
	/**
	 * 评价时间
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
	 * 评论状态：1.正常 2.屏蔽
	 * 
	 * @return status
	 */
	public Integer getStatus() {
		return status;
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
	 * 订单编号
	 * 
	 * @param order_no
	 */
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	
	/**
	 * 评价内容
	 * 
	 * @param content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * 评价用户
	 * 
	 * @param userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	/**
	 * 评价时间
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
	
	/**
	 * 评论状态：1.正常 2.屏蔽
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
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