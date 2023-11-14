package com.mystore.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class ShoppingCartPage extends BaseClass {
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
}
