package com.magento.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Keyword {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser Name");
		}

		System.out.println("Launched: " + browserName + " Browser");
		

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void closeBrowser() {
		driver.quit();

	}
	
	public static String getTitleForCurrentPage() {
		String currentPageTitle=Keyword.driver.getTitle();
		return currentPageTitle;

	}
	
	public static void verifyNavigation(String expectedTitle) {
		String actualTitle=Keyword.getTitleForCurrentPage();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
