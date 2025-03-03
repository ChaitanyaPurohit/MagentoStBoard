package com.magento.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.magento.base.Keyword;

public class CategoryPage {
	static By gearSection = By.xpath("(//span[contains(text(),'Gear')])[1]");
	static By categoriesList=By.cssSelector(".sidebar .categories-menu");
	static By searchBagsList=By.cssSelector(".product-item");
	static By searchResult=By.cssSelector(".product-item");
	static By comparisonList=By.cssSelector(".comparison-product");
	static By homePageLink=By.cssSelector("a[title='Go to Home Page']");
	
	public void clickOnGearSection() {
		Keyword.driver.findElement(gearSection).click();
	}
	public void clickOnCategory(String category) {
		Keyword.driver.findElement(By.linkText(category)).click();
	}
	
	public List<WebElement> getCategoriesList() {
		List<WebElement> list=Keyword.getListOfWebElements(categoriesList);
		return list;
	}
	public List<WebElement> getBagsSearchList() {
		List<WebElement> list=Keyword.getListOfWebElements(searchBagsList);
		return list;
	}
	public List<WebElement> getSearchList(){
		List<WebElement> list=Keyword.driver.findElements(searchResult);
		return list;
	}
	public List<WebElement> getComparisonList() {
		List<WebElement> list=Keyword.driver.findElements(comparisonList);
		return list;
	}
	public void clickOnGearPageLink() {
		Keyword.driver.findElement(homePageLink).click();
	}
}
