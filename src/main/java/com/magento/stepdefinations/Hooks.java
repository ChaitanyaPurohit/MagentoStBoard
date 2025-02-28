package com.magento.stepdefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.magento.base.Keyword;
import com.magento.utils.Magento;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	private static final Logger LOG = LogManager.getLogger(Hooks.class);
	@Before
	public void setUp() throws Exception {
		Keyword.openBrowser("Chrome");
		String env = "qa";
		Keyword.launchUrl(Magento.getUrl(env));
		Keyword.driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
		LOG.info("close Browser");
	}
}
