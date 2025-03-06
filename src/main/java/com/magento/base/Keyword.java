package com.magento.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.magento.stepdefinations.Hooks;

public class Keyword {
	public static RemoteWebDriver driver;
	private static final Logger LOG = LogManager.getLogger(Hooks.class);

	public static void openBrowser(String browserName) throws MalformedURLException {
		boolean isOnGrid=true;
//		if(isOnGrid) {
//			String hubUrl="http://192.168.1.6:4444";
//			ChromeOptions option=new ChromeOptions();
//			option.addArguments("--start-maximized");
//			driver=new RemoteWebDriver(new URL(hubUrl),option);
//
//		}else{
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			LOG.info("Invalid Browser Name");
		}
		LOG.info("Launched: " + browserName + " Browser");
//}
	}

	public static void launchUrl(String url) {
		driver.get(url);
		LOG.info("Launched URL");
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String getTitleForCurrentPage() {
		String currentPageTitle = driver.getTitle();
		return currentPageTitle;

	}

	public static void verifyNavigation(String expectedTitle) {
		String actualTitle = Keyword.getTitleForCurrentPage();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void clickOnButton(String buttonName) {
		
		WebElement button=driver.findElement(By.xpath("//span[text()= '" + buttonName + "']"));
		WaitFor.elementToBeClickable(button);
		button.click();

	}
	public List<String> getListOfErrorMessages(By path) {
		List<WebElement> errorMessages= driver.findElements(path);
		List<String> fieldErrors=new ArrayList<String>();
		for(WebElement errorMessage : errorMessages) {
			String text=null;
			try {
				text=errorMessage.getText();
				System.out.println("Error Messages: " + text);
			} catch (StaleElementReferenceException e) {
				WaitFor.stalenessRemoval(errorMessage);
				text=errorMessage.getText();
			}fieldErrors.add(text);
		}
		return fieldErrors;
	}
	
	public static List<WebElement> getListOfWebElements(By selector) {
		List<WebElement> list= driver.findElements(selector);
		return list;
	}
	
	public static void mouseHoverOn(WebElement element) {
		Actions mouse = new Actions(driver);
		mouse.moveToElement(element).perform();

	}
	
      public static void clickOn(WebElement element) {
    	  element.click();
	}
      public static void refreshPage() {
    	  driver.navigate().refresh();
      }
}
