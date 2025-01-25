package com.magnetocases;

import org.testng.annotations.Test;

import com.magento.base.Info;
import com.magento.base.TestBase;
import com.magento.pages.RegistrationPage;

public class RegistrationPageTestCases extends TestBase {

	@Test
	public static void createAccountForNewUserWithValidData() {
		RegistrationPage registrationPage = new RegistrationPage();

		registrationPage.clickOnCreateAnAccount();
		registrationPage.enterFirstName(Info.randomFirstName);
		registrationPage.enterLastName("Purohit");
		registrationPage.enterEmail(Info.randomEmail);
		registrationPage.enterPassword(Info.randomPassword);
		registrationPage.enterConfirmPassword(Info.randomPassword);
		registrationPage.createAnAccount();
		

	}

}
