package com.magento.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.magento.base.Keyword;

public class SignInPage {
	static By signInSection = By.cssSelector("li[data-label='or']>a");
	static By emailField = By.cssSelector("input#email");
	static By passwordField = By.cssSelector("input[title='Password']");

	static By successMessage1 = By.cssSelector("span[data-ui-id='page-title-wrapper']");

	public void clickOnSignIn() {
		Keyword.driver.findElement(signInSection).click();

	}

	public void enterEmail(String email) {
		Keyword.driver.findElement(emailField).sendKeys(email);
	}
	public void enterInvalidEmail(String email) {
		Keyword.driver.findElement(emailField).sendKeys(email);
	}


	public void enterPassword(String password) {
		Keyword.driver.findElement(passwordField).sendKeys(password);
	}

	public void succesfullySignedIn() {
		WebElement successMessage = Keyword.driver.findElement(successMessage1);
		Assert.assertTrue(successMessage.isDisplayed(), "Successfully Signed Up");
	}

}
