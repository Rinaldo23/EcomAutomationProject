package com.mystore.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.ProductDetailsPage;
import com.mystore.pageobjects.ProductsPage;
import com.mystore.pageobjects.SignUpPage;

public class DemoRunTest4 extends BaseClass{
	
	private IndexPage indexPage;
	private LoginPage loginPage;
	private SignUpPage signupPage;
	
	@BeforeMethod
	public void launchAppTest() {
		launchApp();
	}
	
	@Test
	public void loginTest() {
		indexPage = new IndexPage();
		loginPage=indexPage.NavigateToSignInPage();
		loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	

//	public static void main(String[] args) throws InterruptedException {
//
//		BaseClass obj = new BaseClass();
//		obj.launchApp();
//
////		String email = obj.prop.getProperty("email");
////		String pwd = obj.prop.getProperty("password");
////		LoginPage page = new LoginPage();
////		IndexPage ip=page.Login("rinaldo@admin.com", "123456");
////		ProductsPage pp = ip.NavigateToProductsPage();
////		ProductDetailsPage pdp = pp.viewProduct();
//
//		// pdp.close();
////		page.Login(email, pwd);
//
//	}

}
