package com.magento.stepdefinations;

import com.magento.base.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setUp() throws Exception {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://magento.softwaretestingboard.com/");
	}

	@After
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}
}
