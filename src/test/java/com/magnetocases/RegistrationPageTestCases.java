package com.magnetocases;

import org.testng.annotations.Test;

import com.magento.base.Info;
import com.magento.base.TestBase;
import com.magento.pages.RegistrationPage;
import com.magento.stepdefinations.CreateAnAccountSteps;

public class RegistrationPageTestCases extends TestBase {

	@Test
	public static void createAccountForNewUserWithValidData() {
		RegistrationPage registrationPage = new RegistrationPage();

		registrationPage.clickOnCreateAnAccountHyperlink();
		registrationPage.enterFirstName(Info.randomFirstName);
		registrationPage.enterLastName("Purohit");
		registrationPage.enterEmail(Info.randomEmail);
		registrationPage.enterPassword(Info.randomPassword);
		registrationPage.enterConfirmPassword(Info.randomPassword);
		registrationPage.createAnAccount();
		

	}
	@Test
	public static void ableToClick() {
		RegistrationPage rp = new RegistrationPage();
		rp.clickOnCreateAnAccountHyperlink();
		CreateAnAccountSteps c=new CreateAnAccountSteps();
		c.the_user_should_navigate_to_page("Create New Customer Account");
	}

}
