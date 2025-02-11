package com.magento.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.magento.base.Keyword;

public class WomenSectionNavigationPage {

	static By categoryList = By.cssSelector(
			"body > div:nth-child(5) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > ul:nth-child(2)");
	static By topsSubmenuList = By
			.cssSelector("level1 submenu ui-menu ui-widget ui-widget-content ui-corner-all expanded");
	static By BottomsMenu = By.cssSelector("a[id='ui-id-10'] span:nth-child(1)");
	static By BottomsSubmenuList = By
			.cssSelector("li[class='level1 nav-2-2 category-item active last parent ui-menu-item'] ul[role='menu']");

	public void hovenOnCategory(String categoryName) {
		Keyword.mouseHoverOn(Keyword.driver.findElement(By.xpath("//span[contains(text(), '" + categoryName + "')]")));

	}

	public List<WebElement> getWomenMenuList() {
		List<WebElement> list = Keyword.getListOfWebElements(categoryList);
		return list;
	}

	public void hoverOnMenu(String menuName, String category) {
		if (category.contains("Wo")) {
			if (menuName.contains("op"))
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[1]")));
			else
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[2]")));
		} else if (menuName.contains("op"))
			Keyword.mouseHoverOn(
					Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[3]")));
		else
			Keyword.mouseHoverOn(
					Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[4]")));
	}

	// span[contains(text(), 'Jackets')]
	public void clickOnSubMenu(String subMenuName, String menuName) {
		if (menuName.contains("Wo")) {
			if (subMenuName.contains("Jack"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[1]"));
			else if (subMenuName.contains("Hoodi"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[2]"));
			else
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[3]"));
		} else {
			if (subMenuName.contains("Jack"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[5]"));
			else if (subMenuName.contains("Hoodi"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[6]"));
			else
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[7]"));
		}
	}

	public List<WebElement> getTopsSubmenuList() {
		List<WebElement> list = Keyword.getListOfWebElements(topsSubmenuList);
		return list;
	}

	public void hoverOnBottomSubmenu() {
		Keyword.mouseHoverOn(Keyword.driver.findElement(BottomsMenu));

	}

	public List<WebElement> getBottomSubmenuList() {
		List<WebElement> list = Keyword.getListOfWebElements(BottomsSubmenuList);
		return list;
	}

}
