package com.hipishare.products.dao.mapper;

import org.apache.ibatis.annotations.Param;

import com.hipishare.products.dao.po.Ps_cart_productPO;

/**
 * <b>ps_cart_product[ps_cart_product]数据访问接口</b>
 * 
 * <p>
 * 注意:此文件由AOS平台自动生成-禁止手工修改
 * </p>
 * 
 * @author sunlei
 * @date 2016-10-10 15:55:12
 */
public interface Ps_cart_productMapper {

	/**
	 * 插入一个数据持久化对象(插入字段为传入PO实体的非空属性)
	 * <p> 防止DB字段缺省值需要程序中再次赋值
	 *
	 * @param ps_cart_productPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insert(Ps_cart_productPO ps_cart_productPO);
	
	/**
	 * 插入一个数据持久化对象(含所有字段)
	 * 
	 * @param ps_cart_productPO
	 *            要插入的数据持久化对象
	 * @return 返回影响行数
	 */
	int insertAll(Ps_cart_productPO ps_cart_productPO);

	/**
	 * 根据主键修改数据持久化对象
	 * 
	 * @param ps_cart_productPO
	 *            要修改的数据持久化对象
	 * @return int 返回影响行数
	 */
	int updateByKey(Ps_cart_productPO ps_cart_productPO);

	/**
	 * 根据主键查询并返回数据持久化对象
	 * 
	 * @return Ps_cart_productPO
	 */
	Ps_cart_productPO selectByKey(@Param(value = "id") Integer id);


	/**
	 * 根据主键删除数据持久化对象
	 *
	 * @return 影响行数
	 */
	int deleteByKey(@Param(value = "id") Integer id);
	
	/**
	 * 根据商品编号查找购物车内的商品
	 * @return
	 */
	Ps_cart_productPO findByProductNo(@Param(value = "cartNo") String cartNo, @Param(value = "productNo") String productNo);

	/**
	 * 清空购物车中的商品
	 * @param cartNo
	 * @return
	 */
	int deleteAllProductFromCart(@Param(value = "cartNo") String cartNo);
	
	/**
	 * 删除购物车内的商品
	 * @param cartNo
	 * @param productNo
	 * @return
	 */
	int deleteProductFromCart(@Param(value = "cartNo") String cartNo, @Param(value = "productNo") String productNo);
	
	int updateCartProductNum(Ps_cart_productPO ps_cart_productPO);
}
