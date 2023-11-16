package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SuccessPage extends BaseClass{
	
	public SuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	Action action = new Action();
	
	//Locators 
	
	@FindBy(xpath="//span[@class='base']")
	private WebElement successMessage;
	
	@FindBy(xpath="//strong[normalize-space()='000031529']")
	private WebElement orderNumber;
	
	@FindBy(xpath="//span[normalize-space()='Continue Shopping']")
	private WebElement continueShopping;
	
	
	//Methods
	
	public void VerifyPurchaseMessage() {
		String actualMsg = "Thank you for your purchase!";
		
		if(successMessage.getText().contains(actualMsg)){
			String orderNum = orderNumber.getText();
			action.click(driver, continueShopping);
		};
	}
	
}
