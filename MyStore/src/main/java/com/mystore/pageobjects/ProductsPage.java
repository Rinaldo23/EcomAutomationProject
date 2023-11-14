package com.mystore.pageobjects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ProductsPage extends BaseClass {

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}

	Action action = new Action();

	// Locators
	@FindBy(xpath = "//a[contains(text(),'Tops')]")
	private WebElement topsBtn;

	@FindBy(xpath = "//a[contains(text(),'Bottoms')]")
	private WebElement bottomBtn;

	// Methods
	public void NavigateToTopSection() {
		action.click(driver, topsBtn);
	}

	public void NavigateToBottomSection() {
		action.click(driver, bottomBtn);
	}

	public ProductDetailsPage viewProduct() {
		NavigateToTopSection();
		List<WebElement> products = action.findElements(driver, ".product-item-info .name");
		int randomNumber = generateRandomNumber(1, products.size()); //
		while (action.getCurrentURL(driver).contains("product_details")) {
			for (int i = 0; i <= products.size(); i++) {
				if (i == randomNumber) {
					action.scrollByVisibilityOfElement(driver, products.get(i));
					action.click(driver, products.get(i));
				}
			}
		}
		return new ProductDetailsPage();
	}

	public int generateRandomNumber(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Max must be greater than Min");
		}

		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

}
