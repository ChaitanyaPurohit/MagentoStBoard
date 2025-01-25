package com.magento.stepdefinations;

import org.testng.Assert;

import com.magento.base.Keyword;
import com.magento.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	@When("clicks on Sign In hyperlink")
	public void clicks_on_hyperlink() {
		SignInPage sip = new SignInPage();
		sip.clickOnSignIn();
	}

	@Then("the user should navigate to {string} page")
	private void verifyuserIsNavigate(String expectedPageTitle) {
		Keyword.verifyNavigation(expectedPageTitle);
		Keyword.driver.quit();
	}

	@Given("user is on Sign In page")
	public void clicks_on_sign_in_hyperlink() {
		CreateAnAccountSteps cap = new CreateAnAccountSteps();
		cap.the_user_opens_browser_and_enters_valid_url();
		SignInSteps sgn = new SignInSteps();
		sgn.clicks_on_hyperlink();
	}

	@When("enters valid email id and password")
	public void enter_valid_email_id_and_password() {
		SignInPage sip = new SignInPage();
		sip.enterEmail("purohit.chaitanyas@gmail.com");
		sip.enterPassword("#pYM4CNELieYGrx");

	}

	@When("click on sign in button")
	public void click_on_sign_in_button() {
		SignInPage sip = new SignInPage();
		sip.signIn();
	}

	
}
