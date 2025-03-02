package com.magento.stepdefinations;

import java.time.Duration;
import java.util.List;

import org.testng.Assert;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.magento.base.Keyword;
import com.magento.pages.MenuPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {
	
	@Given("User is on the {string} page")
	public void userIsOnThePage(String Womens) {
		MenuPage mp=new MenuPage();
		mp.HoverOnCategory();
		mp.clickOnMenu();
	}
	

	
	@When("user select the {string} category from the sidebar")
	public void userSelectTheCategoryFromTheSidebar(String category) {
		MenuPage mp=new MenuPage();
		mp.selectCategory(category);
	}
	
	@Then("user should see only products containing {string} in Title")
	public void userShouldSeeOnlyProductsContainingInTitle(String expectedText) {
		MenuPage mp=new MenuPage();
		mp.displayProductNames(expectedText);
		
	}
	
	
	@Then("User should see the  product count matching the selected {string} category count")
	public void userShouldSeeTheProductCountMatchingTheSelectedCategoryCount(String categoryname)   {
		MenuPage mp=new MenuPage();
		mp.getDipslayedProductCount(categoryname);
	}
	

	@When("user select the size {string}")
	public void userSelectTheSize(String sizetype) {
		MenuPage mp=new MenuPage();
		mp.selectSize(sizetype);
	}
	@Then("user should see only product with size {string} should be displayed")
	public void userShouldSeeOnlyProductWithSizeShouldBeDSisplayed(String size) {
		MenuPage mp=new MenuPage();
		mp. verifyProductdisplayed(size);
	}

	@When("user click on clear size filter button")
	public void userClickOnClearSizeFilterButton() {
		MenuPage mp=new MenuPage();
		mp.clickOnClearSizeFilter();
		
		
	}

	@Then("user should see all products displayed again on page")
	public void userShouldSeeAllProductsDisplayedAgainOnPage() {
		MenuPage mp=new MenuPage();
		mp.verifyAllProductDisplayed();
	}
	
	@When("user click on {string} option from the sidebar")
	public void userClickOnOptionFromTheSidebar(String optionMenu) {
		MenuPage mp=new MenuPage();
		mp.clickOnCategory(optionMenu);
	}
	
	@When("user select the {string} color filter")
	public void userSelectTheColorFilter(String color) {
		MenuPage mp=new MenuPage();
		mp.selectColor(color);
	}
	
	@Then("user should see only products with {string} color")
	public void userShouldSeeOnlyProductsWithColor(String color) {
		MenuPage mp=new MenuPage();
		mp.isColorFilterApplied(color);
	}
	
	
	@When("user applies the price filter {string}")
	public void user_applies_the_price_filter(String price) {
		MenuPage mp=new MenuPage();
		mp.clickOnCategory(price);
	    
	}
	
	@When("user select the product by Price {string}")
	public void userSelectTheProductBy(String priceFilter) {
		MenuPage mp=new MenuPage();
		String setorder;
		if(priceFilter=="Low to High") {
			setorder="sort-asc";
			mp.setByOrder(setorder);
		}else {
			setorder="sort-desc";
			mp.setByOrder(setorder);
		}
		
	}
	
	
	@When("user click on sort By filter")
	public void userClickOnSortByFilter() {
		MenuPage mp=new MenuPage();
		mp.clickOnSortByFilter();
		
	}
	
	@When("user select {string} option from filter")
	public void userSelectOptionFromFilter(String priceoption) {
		MenuPage mp=new MenuPage();
		mp.sortByOptionFilter(priceoption);
	}
	
	
	@Then("user should see product sorted in ascending order of price")
	public void userShouldSeeProductSortedInAscendingOrderOfPrice() {
		MenuPage mp=new MenuPage();
		List<Double> actualPrices=mp.getProductPrices();
		List<Double> expectedPrices=mp.getSortedAscending();
		Assert.assertEquals(actualPrices, expectedPrices,"products are not sorted in ascending order");
		
		
	}
	
	
	@When("user refresh the page")
	public void userRefreshThePage() {
		MenuPage mp=new MenuPage();
		mp.refreshPage();
		
		
	}
	
	@Then("user should see the applied filter {string} remain selected")
	public void userShouldSeeTheAppliedFilterRemainSelected(String expectedFilter) {
		MenuPage mp=new MenuPage();
		String actualFilter=mp.getAppliedFilterText();
		Assert.assertEquals(actualFilter, expectedFilter,"price filter did not persist after page load");
		
	}


	
	@Then("user should see product sorted in descending order of price")
	public void userShouldSeeProductSortedInDescendingOrderOfPrice() {
		MenuPage mp=new MenuPage();
		mp.clickOnSortByFilter();
		List<Double> actualPrices=mp.getProductPrices();
		List<Double> expectedPrices=mp.getSortedDescending();
		Assert.assertEquals(actualPrices, expectedPrices,"products are not sorted in descending order");
		
	}
	
	
	
	@When("user select the price range {string}")
	public void userSelectThePriceRange(String priceRange) {
		MenuPage mp=new MenuPage();
		mp.selectPriceRange(priceRange);
		
	}
	@Then("user should see only products within {string} - {string}")
	public void userShouldSeeOnlyProductsWithin(String minPrice,String maxPrice) {
		MenuPage mp=new MenuPage();
		mp.verifyFilterPrices(minPrice, maxPrice);
	}
	



}
