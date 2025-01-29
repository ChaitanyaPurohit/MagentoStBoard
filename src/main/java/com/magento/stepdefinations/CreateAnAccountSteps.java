package com.magento.stepdefinations;

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
		rp.clickOnCreateAnAccount();
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

}
