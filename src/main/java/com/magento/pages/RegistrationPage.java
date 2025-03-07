package com.magento.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.magento.base.Keyword;

public class RegistrationPage {
	private static By createAnAccountSection = By
			.cssSelector("a[href='https://magento.softwaretestingboard.com/customer/account/create/']");
	private static By firstNameField = By.cssSelector("input#firstname");
	private static By lastNameField = By.cssSelector("input#lastname");
	private static By emailField = By.cssSelector("input#email_address");
	private static By passwordField = By.cssSelector("input#password");
	private static By confirmPasswordField = By.cssSelector("input#password-confirmation");
	private static By errorMessages=By.xpath("//div[@class=\"mage-error\"]");
	public void clickOnCreateAnAccountHyperlink() {
		Keyword.driver.findElement(createAnAccountSection).click();
	}

	public void enterFirstName(String firstName) {
		Keyword.driver.findElement(firstNameField).sendKeys(firstName);
	}
	public void enterFirstNameAsNumber(String firstName) {
		Keyword.driver.findElement(firstNameField).sendKeys(firstName);
	}
	public void enterLastName(String LastName) {
		Keyword.driver.findElement(lastNameField).sendKeys(LastName);
	}
	public void enterLastNameAsNumber(String LastName) {
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
	public void enterMisMatchedConfirmPassword() {
	Keyword.driver.findElement(confirmPasswordField).sendKeys("CDh@123ADF");;
	}

	public void createAnAccount() {
		Keyword.driver.findElement(confirmPasswordField).submit();
	}

	public void succesfullySignedUp() {
		WebElement titleElement = Keyword.driver.findElement(By.xpath("//span[@data-ui-id=\"page-title-wrapper\"]"));
		String pageTitle = titleElement.getText();
		Assert.assertEquals("My Account", pageTitle);
	}
	public void verifyAllTheFieldDisplaysErrorMessage(String expectedError) {
		Keyword key = new Keyword();
		for (String errorMessage : key.getListOfErrorMessages(errorMessages)) {
			Assert.assertTrue(errorMessage.contains(expectedError), "Error massage mistmatch: "+ errorMessage);
		}
	}
	public void enterExistingEmail(String email) {
		Keyword.driver.findElement(emailField).sendKeys(email);
	}
	public void verifyExstingError(String expectedError, String dataBind) {
		WebElement errorElement = Keyword.driver.findElement(By.cssSelector("div[data-bind='"+dataBind+"']"));
		String actualError=errorElement.getText();
		Assert.assertTrue(actualError.contains(expectedError));
	}
	public void verifyError(String expectedError, By actualError) {
		WebElement errorElement = Keyword.driver.findElement(actualError);
		String actualError1=errorElement.getText();
		Assert.assertEquals(actualError1, expectedError);
	}
	
}
