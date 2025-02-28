package com.magento.stepdefinations;




import com.magento.pages.MenuPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {
	
	@Given("User is on the {string} page from {string} category")
	public void userIsOnThePage(String Menu, String category) {
		MenuPage mp=new MenuPage();
		mp.HoverOnCategory(category);
		mp.clickOnMenu(category, Menu);
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
	@When("user remove the applied price filter")
	public void user_remove_the_applied_price_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should see all product without price filtering")
	public void user_should_see_all_product_without_price_filtering() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("user select the product by {string}")
	public void user_select_the_product_by(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should see product sorted in ascending order of price")
	public void user_should_see_product_sorted_in_ascending_order_of_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	

	
	@When("user refresh the page")
	public void user_refresh_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user should see the applied filter {string} remain selected")
	public void user_should_see_the_applied_filter_remain_selected(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	@Then("user should see product sorted in descending order of price")
	public void user_should_see_product_sorted_in_descending_order_of_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("user select the price range {string}")
	public void user_select_the_price_range(String priceRange) {
		MenuPage mp=new MenuPage();
		mp.selectPriceRange(priceRange);
		
	}
	@Then("user should see only products within {string} - {string}")
	public void user_should_see_only_products_within(String minPrice,String maxPrice) {
		MenuPage mp=new MenuPage();
		mp.verifyFilterPrices(minPrice, maxPrice);
	}
	



}
