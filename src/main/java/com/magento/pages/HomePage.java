package com.magento.pages;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.magento.base.Keyword;
import com.magento.base.WaitFor;

public class HomePage {
	
	static By categoryList = By.xpath("//li[a/span[text()='Women']]/ul/li[a/span[text()='Tops'] or text()='bottoms']");
	static By Tops=By.xpath("//span[contains(text(), 'Tops')]");
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
	
	public void clickOnMenu(String category) {
		WebElement element=Keyword.driver.findElement(By.linkText(category));
		WaitFor.elementToBeClickable(element);
		element.click();
	}
	
	public void NavigateToPage(String pageTitle) {
		System.out.println(pageTitle);
		Keyword.verifyNavigation(pageTitle);
		
	}
	
	public void hoverOnMenu(String Menu) {
		Keyword.mouseHoverOn(Keyword.driver.findElement(Tops));

	}
	
	
	public void hoverOnMenu(String menuName, String category) {
		if (category.contains("Wo")) {
			if (menuName.contains("op"))
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[1]")));
			else
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[1]")));
		} else {
			if (menuName.contains("op"))
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[2]")));
			else
				Keyword.mouseHoverOn(
						Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + menuName + "')])[2]")));
		}
	}

	// span[contains(text(), 'Jackets')]
	public void clickOnSubMenu(String subMenuName, String menuName) {
		if (menuName.contains("Wo")) {
			if (subMenuName.contains("Jack"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[1]"));
			else if (subMenuName.contains("Hoodi"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[1]"));
			else if(subMenuName.contains("Tee"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[1]"));
			else
				Keyword.driver.findElement(By.xpath("//span[contains(text(), '" + subMenuName + "')]"));
		} else {
			if (subMenuName.contains("Jack"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[2]"));
			else if (subMenuName.contains("Hoodi"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[2]"));
			else if(subMenuName.contains("Tee"))
				Keyword.driver.findElement(By.xpath("(//span[contains(text(), '" + subMenuName + "')])[2]"));
			else
				Keyword.driver.findElement(By.xpath("//span[contains(text(), '" + subMenuName + "')]"));
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
	
	public void verifyDisplayCategories(List<String> expectedCategories) {
		List<WebElement>actualListWe=Keyword.getListOfWebElements(By.xpath("li[contains(@class, 'level1')]/a"));        
		List<String> actualList=new ArrayList<String>();
		for (WebElement element : actualListWe) {
			String Text=element.getText().trim();
			System.out.println(Text);
			actualList.add(Text);
		}
		
		Assert.assertEquals(expectedCategories,actualList);
		
	}
	
	public void verifyDisplaySubmenu(List<String> expectedSubmenu) {
		List<WebElement>actualListmenu=Keyword.getListOfWebElements(By.xpath("//li[contains(@class, 'level2')]/a"));        
		List<String> actualListsubmenu=new ArrayList<String>();
		for (WebElement element : actualListmenu) {
			String Text=element.getText().trim();
			System.out.println(Text);
			actualListsubmenu.add(Text);
		}
		
		Assert.assertTrue(actualListsubmenu.containsAll(expectedSubmenu));
		
	}

}
