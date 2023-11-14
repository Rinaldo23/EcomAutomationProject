package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.ProductDetailsPage;
import com.mystore.pageobjects.ProductsPage;

public class DemoRun {

	public static void main(String[] args) throws InterruptedException {

		BaseClass obj = new BaseClass();
		obj.launchApp();

//		String email = obj.prop.getProperty("email");
//		String pwd = obj.prop.getProperty("password");
//		LoginPage page = new LoginPage();
//		IndexPage ip=page.Login("rinaldo@admin.com", "123456");
//		ProductsPage pp = ip.NavigateToProductsPage();
//		ProductDetailsPage pdp = pp.viewProduct();

		// pdp.close();
//		page.Login(email, pwd);

	}

}
