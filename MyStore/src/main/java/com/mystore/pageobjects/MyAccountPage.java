package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class MyAccountPage extends BaseClass {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	Action action = new Action();

	// Locators

	@FindBy(xpath = "//b[normalize-space()='Account Created!']")
	private WebElement accountCreationText;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement continueBtn;

	// Methods

	public boolean verifyAccountCreation() {
		return false;
	}

	public HomePage ClickOnContinue() {
		boolean res = verifyAccountCreation();

		if (res) {
			action.click(driver, continueBtn);
		} else {
			// TODO
		}

		return new HomePage();
	}

}
