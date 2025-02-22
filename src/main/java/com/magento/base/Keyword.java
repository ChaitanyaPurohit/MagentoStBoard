package com.magento.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
		String currentPageTitle = driver.getTitle();
		return currentPageTitle;

	}

	public static void verifyNavigation(String expectedTitle) {
		String actualTitle = Keyword.getTitleForCurrentPage();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public static void clickOnButton(String buttonName) {
		
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
	
	
	
	
}
