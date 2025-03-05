package com.magento.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.magento.base.Keyword;

public class SearchProductPage {
	
	static By SearchBox=By.xpath("//input[@id='search']");
	static By searchButton = By.xpath("//button[@title='Search']");
	static By searchResults = By.cssSelector(".product-item");
	static By noResultsMessage = By.xpath("//div[@class='message notice']");
	static By firstProductName = By.cssSelector(".product-item:first-child .product-item-name a");
	static By autoSuggestion = By.xpath("//div[@class='search-autocomplete']/ul/li");
	
	
    public void enterSearchTerm(String productName) {
    	Keyword.driver.findElement(SearchBox).clear();
    	Keyword.driver.findElement(SearchBox).sendKeys(productName);
    }
    
    public void clear() {
    	Keyword.driver.findElement(SearchBox).clear();
    }
    
    public void clickSearchButton() {
    	Keyword.driver.findElement(searchButton).click();
    }
    
    public boolean isProductDisplayed() {
        return Keyword.driver.findElements(searchResults).size() > 0;
    }
    
    public String getNoResultsMessage() {
    	System.out.println(Keyword.driver.findElement(noResultsMessage).getText());
        return Keyword.driver.findElement(noResultsMessage).getText();
    }
    
    public String getFirstProductName() {
    	return Keyword.driver.findElements(searchResults).size() > 0 ? 
    			Keyword.driver.findElement(firstProductName).getText() : "";   
    	}
    
    public boolean verifyRelatedProduct(String searchTerm) {
        List<WebElement> products = Keyword.getListOfWebElements(searchResults);
        for (WebElement product : products) {
            if (product.getText().toLowerCase().contains(searchTerm.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    
    public void productdisplayed(String ExcpectedText) {
    	List<WebElement> products = Keyword.getListOfWebElements(searchResults);
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

    public boolean isAutoSuggestionDisplayed() {
        return Keyword.driver.findElements(autoSuggestion).size() > 0;
    }

    public void clickOnSuggestedProduct(String productName) {
    	Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> suggestions = Keyword.getListOfWebElements(autoSuggestion);
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(productName)) {
                suggestion.click();
                break;
            }
        }
    }

    public String getProductTitle() {
    	Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return Keyword.driver.findElement(By.cssSelector(".page-title span")).getText();
    }
    
    public List<String> getSerarchResult(){
    	List<WebElement> results = Keyword.getListOfWebElements(searchResults);
    	List<String> productNames=new ArrayList<>();
    	for (WebElement result : results) {
    		productNames.add(result.getText());
		}
		return productNames;
    	
    }
    
    public void searchButtonDisabled() {
    	WebElement SearchButton=Keyword.driver.findElement(searchButton);
        Assert.assertEquals(false,SearchButton.isEnabled());
	}

    
    

}
