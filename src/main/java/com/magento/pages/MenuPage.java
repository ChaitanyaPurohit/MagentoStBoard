package com.magento.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.magento.base.Keyword;
import com.magento.base.WaitFor;

public class MenuPage {

	// static By womenLink = By.xpath("//span[contains(text(), 'Women')]");
	// static By TopsLink = By.xpath("(//span[contains(text(),'Tops')])[1]");
	static By categoryList = By.cssSelector(".filter-options-content ol");
	static By categoryOption = By.xpath("//div[normalize-space()='Category']");
	static By sizeOption=By.xpath("//div[normalize-space()='Size']");
	static By productName=By.cssSelector(".product-item-name a");
	static By categoryCount=By.xpath("(//span[@class='toolbar-number'])[1]");
	static By productCount =By.cssSelector(".products-grid .product-item");
	static By productList=By.xpath("//div[@class='product details product-item-details']");
	static By clearButton=By.xpath("//a[@class='action remove']");
	static By colorOption= By.xpath("//div[normalize-space()='Color']");
	static By selectedFilterColor=By.xpath("//div[@class='swatch-option color selected']");
	static By productPrices=By.xpath("//span[@class='price']");
	static By priceList=By.cssSelector(".filter-options-content .price");
    static By sortList=By.xpath("//a[contains(@class,'action sorter-action sort-asc')]");
	static By filterOption=By.xpath("(//select[contains(@class,'sorter-options')])[1]");
	static By priceText=By.cssSelector(".price-wrapper span");
    static By refreshPageElement=By.tagName("body");
    static By appliedFilter=By.cssSelector(".filter-value");
    
	

	public void HoverOnCategory(String categoryName) {
		Keyword.mouseHoverOn(Keyword.driver.findElement(By.xpath("//span[contains(text(), '" + categoryName + "')]")));
	}

	public void clickOnMenu(String categoryName, String menuName) {
		if (categoryName.equalsIgnoreCase("women")) {
			WebElement menu = Keyword.driver.findElement(By.xpath("(//span[contains(text(),'" + menuName + "')])[1]"));
			WaitFor.elementToBeClickable(menu);
			menu.click();
		} else {
			WebElement menu = Keyword.driver.findElement(By.xpath("(//span[contains(text(),'" + menuName + "')])[2]"));
			WaitFor.elementToBeClickable(menu);
			menu.click();
		}
	}

	public void clickOnClearSizeFilter() {
		Keyword.driver.findElement(clearButton).click();
	}
	
    public void clickOnSortByFilter() {
    	Keyword.driver.findElement(filterOption).click();
    }
    
    public void refreshPage() {
    	Keyword.driver.findElement(refreshPageElement);
    }
    
	public void clickOnCategory(String shoppingOption) {
		if (shoppingOption.contains("Cat")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Sty")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Siz")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Cli")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Colo")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Eco")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Eri")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Mate")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Ne")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Patt")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Perf")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else if (shoppingOption.contains("Pri")) {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		} else {
			Keyword.driver.findElement(By.xpath("//div[normalize-space()='" + shoppingOption + "']")).click();
		}

	}

	public void selectCategory(String categoryType) {
		if (categoryType.contains("Ja")) {
			Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(text(),'" + categoryType + "')]"))
					.click();
		} else if (categoryType.contains("Hoo")) {
			Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(text(),'" + categoryType + "')]"))
					.click();

		} else if (categoryType.contains("Tee")) {
			Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(text(),'" + categoryType + "')]"))
					.click();

		} else {
			Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(text(),'" + categoryType + "')]"))
					.click();

		}
	}

	public void selectSize(String sizeType) {
		if (sizeType.contains("XS")) {
			Keyword.driver.findElement(By.xpath("//div[@class='swatch-option text ' and text()='" + sizeType + "']"))
					.click();
		} else if (sizeType.contains("S")) {
			Keyword.driver.findElement(By.xpath("//div[@class='swatch-option text ' and text()='" + sizeType + "']"))
					.click();

		} else if (sizeType.contains("M")) {
			Keyword.driver.findElement(By.xpath("//div[@class='swatch-option text ' and text()='" + sizeType + "']"))
					.click();
		} else if (sizeType.contains("L")) {
			Keyword.driver.findElement(By.xpath("//div[@class='swatch-option text ' and text()='" + sizeType + "']"))
					.click();

		} else {
			Keyword.driver.findElement(By.xpath("//div[@class='swatch-option text ' and text()='" + sizeType + "']"))
					.click();

		}
	}

	public void selectColor(String colorType) {
		if (colorType.contains("Blu")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();
		} else if (colorType.contains("Bro")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else if (colorType.contains("Gra")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();
		} else if (colorType.contains("Gree")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else if (colorType.contains("Or")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else if (colorType.contains("Purp")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else if (colorType.contains("Re")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else if (colorType.contains("Whi")) {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		} else {
			Keyword.driver.findElement(By.xpath(
					"//div[contains(@class,'swatch-option color ') and contains(@option-label,'" + colorType + "')]"))
					.click();

		}
	}

	public void selectPriceRange(String priceRange) {
		Shutterbug.shootPage(Keyword.driver).save();
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(priceRange.contains("20")) {
		WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
		element.click();
		}else if(priceRange.contains("30")){
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();
		}else if(priceRange.contains("40")){
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();
		}else if(priceRange.contains("50")){
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();
		}else if(priceRange.contains("60")){
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();		
		}else if(priceRange.contains("70")){
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();		
		}else {
			WebElement element=	Keyword.driver.findElement(By.xpath("//ol[@class='items']/li/a[contains(@href,'price="+priceRange+"')]"));
			element.click();		
			}

	}
	
	
	public void sortByOptionFilter(String filterOptions) {
		if(filterOptions.contains("Posi")) {
			Keyword.driver.findElement(By.xpath("(//select[contains(@class,'sorter-options')])[1]/option[contains(text(),'"+filterOptions+"')]")).click();
		}else if(filterOptions.contains("Pric")){
			Keyword.driver.findElement(By.xpath("(//select[contains(@class,'sorter-options')])[1]/option[contains(text(),'"+filterOptions+"')]")).click()
		}else if(filterOptions.contains("Produc")){
			Keyword.driver.findElement(By.xpath("(//select[contains(@class,'sorter-options')])[1]/option[contains(text(),'"+filterOptions+"')]")).click();
		}else {
			System.out.println("categoty not found");
		}
	}

	public void displayProductNames(String ExcpectedText) {
		List<WebElement> products = Keyword.getListOfWebElements(productName);
		List<String> productnames = new ArrayList<String>();
		for (WebElement product : products) {
			if (productnames.contains(ExcpectedText)) {
				productnames.add(product.getText());
			}
		}
		for (String name : productnames) {
			Assert.assertEquals(name, ExcpectedText, "Product does not contain expected text" + name);
		}

	}

	public int getCategoryCount(String CategoryName) {

		WebElement element = Keyword.driver.findElement(categoryCount);
		String CountText = element.getText().trim();
		return Integer.parseInt(CountText);

	}

	public void getDipslayedProductCount(String SelectedCategory) {
		MenuPage mp = new MenuPage();
		List<WebElement> products = Keyword.getListOfWebElements(productCount);
		int actualcount = products.size();
		System.out.println(actualcount);
		int expectedcount = mp.getCategoryCount(SelectedCategory);
		System.out.println("expected category count: " + expectedcount);
		System.out.println("actual category count: " + actualcount);
		Assert.assertEquals(actualcount, expectedcount, "Product count does not match category count");

	}

	public boolean verifySelectedSize(String size) {
		List<WebElement> products = Keyword.getListOfWebElements(productList);
		for (WebElement product : products) {
			if (!product.getText().contains(size)) {
				return false;
			}
		}
		return true;

	}

	public void verifyProductdisplayed(String size) {
		MenuPage mp = new MenuPage();
		Assert.assertTrue(mp.verifySelectedSize(size), "not all displayed product have size " + size);

	}

	public void verifyAllProductDisplayed() {
		Assert.assertTrue(Keyword.driver.findElements(productList).size() > 0,
				"Not all products are displayed after clearing the filter");
		;

	}

	public void isColorFilterApplied(String color) {
		List<WebElement> filters = Keyword.getListOfWebElements(selectedFilterColor);
		for (WebElement filter : filters) {
			if (filter.getText().equalsIgnoreCase(color)) {
				Assert.assertEquals(filter.getText(), color);
			}
		}
		Assert.assertTrue(MenuPage.getFilteredProductCount() > 0, "no product display after filtering");

	}

	public static int getFilteredProductCount() {
		List<WebElement> products = Keyword.getListOfWebElements(productList);
		return products.size();
	}

	public void verifyFilterPrices(String minPrice, String maxPrice) {
		List<WebElement> prices = Keyword.getListOfWebElements(priceList);
		for (WebElement price : prices) {
			String productPrice = price.getText().replace("$", "");
			System.out.println(productPrice);
			if (productPrice.equalsIgnoreCase(maxPrice.replace("$", ""))
					|| productPrice.equalsIgnoreCase(minPrice.replace("$", ""))) {
				Assert.assertEquals(productPrice, maxPrice);
				Assert.assertEquals(productPrice, minPrice);
			}

		}

	}
	public void setByOrder(String orderName) {
		WebElement sortButton=Keyword.driver.findElement(By.xpath("(//a[contains(@class,'action sorter-action')])[1]"));
		if(orderName.contains("asc")) {
			System.out.println("click on ascending");
			sortButton.click();
		}else if(orderName.contains("desc")) {
			System.out.println("click on descnding");
			sortButton.click();
		}else {
			System.out.println("set order option not found");
		}
		
		
	}
	
	public List<Double> getProductPrices() {
		
		List<WebElement> priceList=Keyword.getListOfWebElements(priceText);
		List<Double> prices=new ArrayList<>();
		for (WebElement priceElement : priceList) {
			String priceText=priceElement.getText().replace("$","");
			prices.add(Double.parseDouble(priceText));
		}
		return prices;
	}
	
	public List<Double> getSortedAscending() {
		List<Double> sortedprices=new ArrayList<>(getProductPrices());
		Collections.sort(sortedprices);
		return sortedprices;
		
	}
	public List<Double> getSortedDescending() {
		List<Double> sortedprices=new ArrayList<>(getProductPrices());
		sortedprices.sort(Collections.reverseOrder());
		return sortedprices;
		
	}
	
	public String getAppliedFilterText() {
		return Keyword.driver.findElement(appliedFilter).getText();
	}

}
