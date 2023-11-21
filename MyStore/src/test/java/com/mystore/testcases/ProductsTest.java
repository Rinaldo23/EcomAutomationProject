package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;


//Test Case 1: Search Product
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click on 'Products' button
//5. Verify user is navigated to ALL PRODUCTS page successfully
//6. Enter product name in search input and click search button
//7. Verify 'SEARCHED PRODUCTS' is visible
//8. Verify all the products related to search are visible

public class ProductsTest extends BaseClass{
	
	private IndexPage indexPage;
	Action action = new Action();
	
	@BeforeMethod
	public void launchAppTest() {
		launchApp();
	}
	
	@Test
	public void RegisterNewUser() throws IOException {
		action.implicitWait(driver, 5);
		Assert.assertEquals(action.getHttpResponseCode(prop.getProperty("url")), 200);
		indexPage = new IndexPage();
	}
}
