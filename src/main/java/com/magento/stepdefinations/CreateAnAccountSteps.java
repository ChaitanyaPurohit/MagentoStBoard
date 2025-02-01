package com.magento.stepdefinations;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.magento.base.Info;
import com.magento.base.Keyword;
import com.magento.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAnAccountSteps {

	@When("clicks on Create an Account hyperlink")
	public void clicks_on_hyperlink() {
		RegistrationPage rp = new RegistrationPage();
		rp.clickOnCreateAnAccountHyperlink();
	}

	@Then("the user should navigate to {string} page")
	public void the_user_should_navigate_to_page(String expectedPageTitle) {
		Keyword.verifyNavigation(expectedPageTitle);
		Keyword.driver.quit();

	}

	@Given("the user is on create an account page")
	public void openCreateAnAccountPage() {
		CreateAnAccountSteps cap = new CreateAnAccountSteps();
		cap.clicks_on_hyperlink();

	}

	@When("enters all the required fields with valid parameters")
	public void enters_all_the_required_fields_with_valid_parameters() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterFirstName(Info.randomFirstName);
		rp.enterLastName("Purohit");
		rp.enterEmail(Info.randomEmail);
		rp.enterPassword(Info.randomPassword);
		rp.enterConfirmPassword(Info.randomPassword);

	}
	
	@When("user keeps all the fields as empty")
	public void user_keeps_all_the_fields_as_empty() {
	}
	
	@When("clicks on {string} button")
	public void clicks_on_the_button(String buttonText) {
		Keyword key=new Keyword();
		key.clickOnButton(buttonText);
	}
	@Then("user should get error message {string} bellow eaach field")
	public void user_should_get_error_message_bellow_eaach_field(String expectedError) {
		RegistrationPage rp = new RegistrationPage();
		rp.verifyAllTheFieldDisplaysErrorMessage(expectedError);
	}
	@When("user enters existing email while creation of an new account")
	public void user_enters_existing_email() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterFirstName(Info.randomFirstName);
		rp.enterLastName("Purohit");
		rp.enterExistingEmail("purohit.chaitanyas@gmail.com");
		rp.enterPassword(Info.randomPassword);
		rp.enterConfirmPassword(Info.randomPassword);
	}
	@Then("user should get error message followed by {string} in bind {string}")
	public void verifyErrorMessage(String expectedError, String dataBind) {
		RegistrationPage rp = new RegistrationPage();
		rp.verifyExstingError(expectedError, dataBind);
	}
	@When("user enters invalid email format while creation of an new account")
	public void user_enters_invalid_email_format_while_creation_of_an_new_account() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterFirstName(Info.randomFirstName);
		rp.enterLastName("Purohit");
		rp.enterExistingEmail("purohit.chaitanyas@.com");
		rp.enterPassword(Info.randomPassword);
		rp.enterConfirmPassword(Info.randomPassword);
	}
	@Then("user should get error message as {string} in element {string}")
	public void user_should_get_error_message_as(String expectedError, String id) {
		RegistrationPage rp = new RegistrationPage();
		By actId= By.id(id);
		rp.verifyError(expectedError, actId);
	}
	@When("user enters different password is both Password")
	public void user_enters_different_password_is_both_password() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterFirstName(Info.randomFirstName);
		rp.enterLastName("Purohit");
		rp.enterExistingEmail("purohit.chaitanyas@.com");
	}
	@When("confirm password field while account creation")
	public void different_password_field_while_account_creation() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterPassword(Info.randomPassword);
		rp.enterMisMatchedConfirmPassword();
		rp.createAnAccount();
	}
	@When("user enters numbers in firstName")
	public void user_enters_numbers_in_first_name() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterFirstNameAsNumber("12345");
		rp.enterLastNameAsNumber("6789");
	}
	@When("lastname field while account creation")
	public void lastname_field_while_account_creation() {
		RegistrationPage rp = new RegistrationPage();
		rp.enterLastNameAsNumber("6789");
		rp.enterEmail(Info.randomEmail);
		rp.enterPassword(Info.randomPassword);
		rp.enterConfirmPassword(Info.randomPassword);
		rp.createAnAccount();
		
	}
	@Then("the user should not navigate to {string} page")
	public void the_user_should_not_navigate_to_page(String unExpectedTitle) {
		String actualTitle=Keyword.getTitleForCurrentPage();
		if (unExpectedTitle.equals(actualTitle)) {
			Assert.fail("User is still able to create and account");
		}
	}

}
