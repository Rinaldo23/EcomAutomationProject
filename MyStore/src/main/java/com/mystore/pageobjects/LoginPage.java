package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	Action action = new Action();
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	private WebElement loginEmail;
	
	@FindBy(css="input[placeholder='Password']")
	private WebElement loginPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	private WebElement loginTextValidation;
	
	@FindBy(css="input[placeholder='Name']")
	private WebElement signupUserName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	private WebElement signupEmail;
	
	@FindBy(css="button[data-qa='signup-button']")
	private WebElement signupBtn;
	
	
	public HomePage Login(String email, String password) throws InterruptedException {
		action.scrollByVisibilityOfElement(driver, loginEmail);
		Thread.sleep(3000);
		action.type(loginEmail, email);
		action.type(loginPassword, password);
		action.click(driver, loginBtn);
		HomePage homePage = new HomePage();
		return homePage;
	}
	
	public void RegisterUser(String name, String email) throws InterruptedException {
		action.scrollByVisibilityOfElement(driver, signupEmail);
		Thread.sleep(3000);
		action.type(signupUserName, name);
		action.type(signupEmail, email);
		action.click(driver, signupBtn);
	}
}
