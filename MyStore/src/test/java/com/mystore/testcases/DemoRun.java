package com.mystore.testcases;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;

public class DemoRun {

	public static void main(String[] args) throws InterruptedException {
		
		BaseClass obj = new BaseClass();
		obj.launchApp();
		
//		String email = obj.prop.getProperty("email");
//		String pwd = obj.prop.getProperty("password");
		LoginPage page = new LoginPage();
		page.Login("rinaldo@admin.com", "123456");
//		page.Login(email, pwd);
		
		

	}

}
