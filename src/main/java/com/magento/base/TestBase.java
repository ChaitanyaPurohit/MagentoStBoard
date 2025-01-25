package com.magento.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	@BeforeMethod
	public void setUp() throws Exception {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://magento.softwaretestingboard.com/");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}
}
