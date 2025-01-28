package com.magento.base;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitFor {

	private static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(Keyword.driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.ignoring(NoSuchElementException.class);
	}

	public static void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	public static void stalenessRemoval(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));

	}
	
	public static void elementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
