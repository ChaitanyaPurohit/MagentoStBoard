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

	@When("clicks on Create an Account button")
	public void clicks_on_button() {
		RegistrationPage rp = new RegistrationPage();
		rp.createAnAccount();
	}

}
