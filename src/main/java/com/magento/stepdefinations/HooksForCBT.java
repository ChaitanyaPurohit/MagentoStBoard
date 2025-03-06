package com.magento.stepdefinations;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.magento.base.Keyword;
import com.magento.utils.Magento;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksForCBT {

/*	static ThreadLocal<String> browser = new ThreadLocal<String>();

	@Parameters("browser-name")
	@BeforeTest
	public void setBrowser(String browserName) throws IOException {
		if (browserName != null && !browserName.isEmpty()) {
			System.out.println("Launching: " + browserName + " browser from TestNG XML");
			browser.set(browserName);
		} else {
			// If not provided in TestNG XML, fetch from properties file
			System.out.println("No browser specified in TestNG XML, looking for browser in properties file...");
			String browserFromProperties = Magento.getBrowserName();
			System.out.println("Launching: " + browserFromProperties + " browser from properties file");
			browser.set(browserFromProperties);
		}

	}

	@Before
	public void setUp() throws Exception {

		Keyword.openBrowser(browser.get());
		System.out.println("launching from CBTHooks");
		Keyword.launchUrl(Magento.getUrl("qa"));
		Keyword.maximizeBrowser();
	}

	@After
	public void tearDown() {
		Keyword.closeBrowser();
		System.out.println("close browser");

	}*/

}
