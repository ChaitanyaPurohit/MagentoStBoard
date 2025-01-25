package com.magnetocases;

import org.testng.annotations.Test;

import com.magento.base.TestBase;
import com.magento.pages.SignInPage;

public class SignInTestCases extends TestBase {
	
	@Test
	public static void signInUsingValidData() {
		SignInPage signInPage=new SignInPage();
		
		signInPage.clickOnSignIn();
		signInPage.enterEmail("pchaitanya40@gmail.com");
		signInPage.enterPassword("B@laji7799");
		signInPage.succesfullySignedIn();
		
	}
}
