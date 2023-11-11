package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SignUpPage extends BaseClass {
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	Action action = new Action(); 
	
	//Locators
	@FindBy(xpath="//b[normalize-space()='Enter Account Information']")
	private WebElement validateSignupText;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	private WebElement maleRadioBtn;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement dayDD;
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement monthDD;
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement yearDD;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstNameAdd;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastNameAdd;
	
	@FindBy(xpath="//input[@id='company']")
	private WebElement companyNameAdd;
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement addressOne;
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement addressTwo;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement stateTextBox;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement cityTextBox;
	
	@FindBy(xpath="//input[@id='zipcode']")
	private WebElement zipCodeTextBox;
	
	@FindBy(xpath="//input[@id='mobile_number']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	private WebElement createAccountBtn;
	
	
	//Methods
	
	public void EnterAccountInfo(String passWord) {
		action.click(driver, maleRadioBtn);
		action.selectByIndex(dayDD, 5);
		action.selectByIndex(monthDD, 5);
		action.selectByIndex(yearDD, 5);
	}
	
	public void EnterAddressInfo(String firstName, String lastName, String company, String add1, String add2, String state, String city, String zipCode, String mobile) {
		action.type(firstNameAdd, firstName);
		action.type(lastNameAdd, lastName);
		action.type(companyNameAdd, company);
		action.type(addressOne, add1);
		action.type(addressTwo, add2);
		action.selectByIndex(companyNameAdd, 0);
		action.type(stateTextBox, state);
		action.type(cityTextBox, city);
		action.type(zipCodeTextBox, zipCode);
		action.type(mobileNumber, mobile);
		action.click(driver, createAccountBtn);
		
	}
	
	public AccountCreationPage createAccount() {
		EnterAccountInfo(null);
		EnterAddressInfo(null, null, null, null, null, null, null, null, null);
		return new AccountCreationPage();
	}

}
