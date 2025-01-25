package com.magento.stepdefinations;



import com.magento.base.Keyword;
import com.magento.pages.SignInPage;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInSteps {
	@When("user clicks on Sign In hyperlink")
	public void clicks_on_hyperlink() {
		SignInPage sip = new SignInPage();
		sip.clickOnSignIn();
	}

	@Then("the user should navigate to {string} page")
	private void verifyuserIsNavigate(String expectedPageTitle) {
		Keyword.verifyNavigation(expectedPageTitle);
		Keyword.driver.quit();
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
