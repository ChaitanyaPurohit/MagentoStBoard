package com.magento.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.magento.base.Keyword;

public class RegistrationPage {
	static By createAnAccountSection = By
			.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
	static By firstNameField = By.cssSelector("input#firstname");
	static By lastNameField = By.cssSelector("input#lastname");
	static By emailField = By.cssSelector("input#email_address");
	static By passwordField = By.cssSelector("input#password");
	static By confirmPasswordField = By.cssSelector("input#password-confirmation");
	static By errorMessages=By.xpath("//div[@class=\"mage-error\"]");

	public void clickOnCreateAnAccount() {
		Keyword.driver.findElement(createAnAccountSection).click();
	}

	public void enterFirstName(String firstName) {
		Keyword.driver.findElement(firstNameField).sendKeys(firstName);
	}

	public void enterLastName(String LastName) {
		Keyword.driver.findElement(lastNameField).sendKeys(LastName);
	}

	public void enterEmail(String email) {
		Keyword.driver.findElement(emailField).sendKeys(email);
	}

	public void enterPassword(String Password) {
		Keyword.driver.findElement(passwordField).sendKeys(Password);
	}

	public void enterConfirmPassword(String ConfirmPassword) {
		Keyword.driver.findElement(confirmPasswordField).sendKeys(ConfirmPassword);
	}

	public void createAnAccount() {
		Keyword.driver.findElement(confirmPasswordField).submit();
	}

	public void succesfullySignedUp() {
		WebElement titleElement = Keyword.driver.findElement(By.xpath("//span[@data-ui-id=\"page-title-wrapper\"]"));
		String pageTitle = titleElement.getText();
		Assert.assertEquals("My Account", pageTitle);
	}
//	public List<String> getListOfErrors() {
//		Keyword key = new Keyword();
//		List<String> errors=key.getListOfErrorMessages(errorMessages);
//		return errors;
//	}
	public void verifyAllTheFieldDisplaysErrorMessage(String expectedError) {
		Keyword key = new Keyword();
		SoftAssert softly=new SoftAssert();
		for (String errorMessage : key.getListOfErrorMessages(errorMessages)) {
			softly.assertTrue(errorMessage.contains(expectedError), "Error massage mistmatch: "+ errorMessage);
		}
		softly.assertAll();
	}
	
}
