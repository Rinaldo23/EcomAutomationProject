package com.mystore.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.ProductDetailsPage;
import com.mystore.pageobjects.ProductsPage;
import com.mystore.pageobjects.SignUpPage;

//Test Case 1: Login User with correct email and password
//1. Launch browser
//2. Navigate to url 'https://magento.softwaretestingboard.com/'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter correct email address and password
//7. Click 'login' button
//8. Verify that 'Logged in as username' is visible


//Test Case 2: Login User with incorrect email and password
//1. Launch browser
//2. Navigate to url 'https://magento.softwaretestingboard.com/'
//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
//5. Verify 'Login to your account' is visible
//6. Enter incorrect email address and password
//7. Click 'login' button
//8. Verify error 'Your email or password is incorrect!' is visible

public class LoginTest extends BaseClass {

	private IndexPage indexPage;
	private LoginPage loginPage;
	private SignUpPage signupPage;

	Action action = new Action();

	@BeforeMethod
	public void launchAppTest() {
		launchApp();
	}

	@Test
	public void loginTestWithValidCreds() throws IOException {
		action.implicitWait(driver, 5);
		Assert.assertEquals(action.getHttpResponseCode("https://magento.softwaretestingboard.com/"), 200);
		indexPage = new IndexPage();
		loginPage = indexPage.NavigateToSignInPage();
		loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
		Assert.assertEquals(indexPage.VerifyLogin(), true);
	}
	
	@Test
	public void loginTestWithInValidCreds() throws IOException {
		action.implicitWait(driver, 5);
		Assert.assertEquals(action.getHttpResponseCode("https://magento.softwaretestingboard.com/"), 200);
		indexPage = new IndexPage();
		loginPage = indexPage.NavigateToSignInPage();
		loginPage.Login(prop.getProperty("email"), prop.getProperty("password")+"s");
		Assert.assertEquals(loginPage.verifyInvalidLogin(), true);
	}
	
	

}
