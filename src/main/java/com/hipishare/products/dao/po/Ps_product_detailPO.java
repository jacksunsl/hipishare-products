package com.hipishare.products.dao.po;

/**
 * <b>ps_product_detail[ps_product_detail]数据持久化对象</b>
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改。
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-08 11:54:26
 */
public class Ps_product_detailPO {

	/**
	 * id
	 */
	private Integer id;
	
	/**
	 * 商品编号
	 */
	private String product_no;
	
	/**
	 * 详情类型(1:文字 2:图片 3:视频 4:音频)
	 */
	private Integer detail_type;
	
	/**
	 * 详情内容
	 */
	private String detail_content;
	
	/**
	 * 详情排序，由小到大排序
	 */
	private Integer sort;
	
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
	 * 详情类型(1:文字 2:图片 3:视频 4:音频)
	 * 
	 * @return detail_type
	 */
	public Integer getDetail_type() {
		return detail_type;
	}
	
	/**
	 * 详情内容
	 * 
	 * @return detail_content
	 */
	public String getDetail_content() {
		return detail_content;
	}
	
	/**
	 * 详情排序，由小到大排序
	 * 
	 * @return sort
	 */
	public Integer getSort() {
		return sort;
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
	 * 详情类型(1:文字 2:图片 3:视频 4:音频)
	 * 
	 * @param detail_type
	 */
	public void setDetail_type(Integer detail_type) {
		this.detail_type = detail_type;
	}
	
	/**
	 * 详情内容
	 * 
	 * @param detail_content
	 */
	public void setDetail_content(String detail_content) {
		this.detail_content = detail_content;
	}
	
	/**
	 * 详情排序，由小到大排序
	 * 
	 * @param sort
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
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