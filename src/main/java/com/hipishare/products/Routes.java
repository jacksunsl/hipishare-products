package com.hipishare.products;

import org.restexpress.RestExpress;
import com.hipishare.products.routes.ProductRoute;

public abstract class Routes {
	public static void define(RestExpress server) {
		
		// 添加商品路由
		ProductRoute.define(server);
					
	}
}
