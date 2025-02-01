package com.magento.stepdefinations;



import org.openqa.selenium.By;

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

	@When("click on {string} button")
	public void click_on_sign_in_button(String buttonName) {
		Keyword key=new Keyword();
		key.clickOnButton(buttonName);
	}
	@When("user enteres un-registered email id while signing in")
	public void user_enteres_invalid_email_id_while_signing_in( ) {
		SignInPage sip=new SignInPage();
		sip.enterInvalidEmail("chaitanya@gmail.com");
		sip.enterPassword("B@laji7799");
		
	}
	@When("user enteres incorrect password while signing in")
	public void user_enteres_incorrect_password_while_signing_in() {
		SignInPage sip=new SignInPage();
		sip.enterInvalidEmail("purohit.chaitanyas@gmail.com");
		sip.enterPassword("B@laji79");
	}
	@When("user clicks on Forgot Your Password? hyperlink")
	public void clickOnForgetPasswordLink() {
		Keyword.driver.findElement(By.cssSelector("a.action.remind>span")).click();;
	}
}
