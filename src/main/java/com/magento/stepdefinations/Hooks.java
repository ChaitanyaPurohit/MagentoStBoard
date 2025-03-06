package com.magento.stepdefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;

import com.magento.base.Keyword;
import com.magento.utils.Magento;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	private static final Logger LOG = LogManager.getLogger(Hooks.class);

	@Before
	public void setUp() throws Exception {
		Keyword.openBrowser(Magento.getBrowserName());
		LOG.info("Launched browser from proeprties file.");
		Keyword.launchUrl(Magento.getUrl("qa"));
		Keyword.maximizeBrowser();
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			/*to save screenshot in project folder
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			File fileLocation = new File(System.getProperty("user.dir") + "/target/screenshots/" + scenario.getName().replace(" ", "_") +".png");
			com.google.common.io.Files.copy(screenshotFile, fileLocation);*/
			
			//to attach screenshot to allure report
			String screenshotName=scenario.getName().replace(" ", "_");
			byte[] screenshotFile = Keyword.driver.getScreenshotAs(OutputType.BYTES);		
			scenario.attach(screenshotFile, "image/png", screenshotName);
		}
		Keyword.closeBrowser();
		LOG.info("Browser Closed.");
	}
}