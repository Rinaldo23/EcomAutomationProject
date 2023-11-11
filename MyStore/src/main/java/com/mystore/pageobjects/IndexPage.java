package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	public IndexPage(){
		PageFactory.initElements(driver, this);
	}
	
	Action action = new Action();
	
	// Locators
	@FindBy(xpath="//a[normalize-space()='Home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//a[@href='/products']")
	private WebElement productsBtn;
	
	@FindBy(xpath="//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
	private WebElement cartBtn;
	
	@FindBy(css="//a[normalize-space()='Signup / Login']")
	private WebElement signupBtn;
	
	
	//Methods
	public LoginPage NavigateToLoginPage() {
		action.click(driver, signupBtn);
		return new LoginPage();
	}
	
	public CartPage NavigateToCartPage() {
		action.click(driver, cartBtn);
		return new CartPage();
	}
	
	public ProductsPage NavigateToProductsPage() {
		action.click(driver, productsBtn);
		return new ProductsPage();
	}
	
	public IndexPage NavigateToHomePage() {
		action.click(driver, homeBtn);
		return new IndexPage();
	}
}
