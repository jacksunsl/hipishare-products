package com.hipishare.products;

import org.restexpress.RestExpress;

import com.hipishare.products.routes.ProductCommentRoute;
import com.hipishare.products.routes.ProductRoute;
import com.hipishare.products.routes.ShoppingCartRoute;

/**
 * 路由
 * @author sunlei
 * @date 2016年10月10日
 */
public abstract class Routes {
	public static void define(RestExpress server) {
		
		// 添加商品路由
		ProductRoute.define(server);
		
		// 购物车路由
		ShoppingCartRoute.define(server);
		
		// 商品评价路由
		ProductCommentRoute.define(server);
	}
}
