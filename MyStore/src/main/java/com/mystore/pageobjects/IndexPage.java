package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

//header
public class IndexPage extends BaseClass {

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	Action action = new Action();

	// Locators

	@FindBy(xpath = "//a[@aria-label='store logo']//img")
	private WebElement logoImg;

	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchTextBox;

	@FindBy(xpath = "//button[@title='Search']")
	private WebElement searchBtn;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement cartBtn;

	@FindBy(xpath = "//span[normalize-space()='Women']")
	private WebElement womenBtn;

	@FindBy(xpath = "//span[normalize-space()='Men']")
	private WebElement menBtn;

	// Methods
	public ProductsPage NavigateToMensPage() {
		action.click(driver, menBtn);
		return new ProductsPage();
	}

	public ProductsPage NavigateToWomensPage() {
		action.click(driver, womenBtn);
		return new ProductsPage();
	}

	public HomePage NavigateToHomePage() {
		action.click(driver, logoImg);
		return new HomePage();
	}

	public ProductsPage SearchProducts(String product) {
		action.type(searchTextBox, product);
		action.click(driver, searchBtn);
		return new ProductsPage();
	}

}
