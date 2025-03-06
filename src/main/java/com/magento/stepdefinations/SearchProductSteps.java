package com.magento.stepdefinations;

import java.util.List;

import org.testng.Assert;

import com.magento.pages.SearchProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductSteps {

	@Given("User is on Home page")
	public void userIsOnTheHomePage() {

	}

	@When("User enters a partial product name {string} in the search box")
	public void userEntersApartialProductNameInTheSearchBox(String partialProduct) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(partialProduct);
		

	}

	@When("User clicks on the search button")
	public void userClicksOnTheSearchButton() {
		SearchProductPage sp = new SearchProductPage();
		sp.clickSearchButton();
	}

	@Then("User should see products related to {string}")
	public void userShouldSeeProductsRelatedTo(String partialProduct) {
		SearchProductPage sp = new SearchProductPage();
		List<String> actualresults=sp.getSerarchResult();
		for (String product : actualresults) {
			Assert.assertEquals(true,product.toLowerCase().contains(partialProduct.toLowerCase()));
		}

	}


	@When("User enters {string} in lowercase in the search box")
	public void userEntersInLowercaseInTheSearch_box(String searchText) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(searchText);
	}

	@Then("User should see the same results as {string}")
	public void userShouldSeeTheSameResultsAs(String productName) {
		SearchProductPage sp = new SearchProductPage();
		sp.productdisplayed(productName);
	}

	@When("User starts typing {string} in the search box")
	public void userStartsTypingInTheSearchBox(String searchTerm) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(searchTerm);
	}

	@Then("User should see an auto-suggestion list with relevant products")
	public void userShouldSeeAnAutoSuggestionListWithRelevantProducts() {
		SearchProductPage sp = new SearchProductPage();
		 boolean isSuggestionDisplayed = sp.isAutoSuggestionDisplayed();
	        Assert.assertEquals(false, isSuggestionDisplayed);
	}

	@When("User clicks on a suggested product {string}")
	public void userClicksOnASuggestedProduct(String productName) {
		SearchProductPage sp = new SearchProductPage();
		sp.clickOnSuggestedProduct(productName);
	}

	@Then("User should be navigated to the product details page of {string}")
	public void userShouldBeNavigatedToTheProductDetailsPageOf(String productName) {
		SearchProductPage sp = new SearchProductPage();
		String actualProductTitle = sp.getProductTitle();
        Assert.assertEquals(productName, actualProductTitle);
	}

	@When("User enters special characters {string} in the search box")
	public void userEntersSpecialCharactersInTheSearchBox(String specialchar) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(specialchar);
	}

	@Then("User should see a message {string}")
	public void userShouldSeeAMessage(String expectedMessage) {
		SearchProductPage sp = new SearchProductPage();
		String actualMessage = sp.getNoResultsMessage();
		System.out.println(actualMessage);
		Assert.assertEquals("Your search returned no results.", expectedMessage, actualMessage);
	}

	@When("User does not enter any Text in SearchBox")
	public void userDoesnotEnterAnyTextInSearchBox() {
		SearchProductPage sp = new SearchProductPage();
		sp.clear();
	}

	@Then("The search button should be disabled")
	public void theSearchButtonShouldBeDisabled() {
		SearchProductPage sp = new SearchProductPage();
		sp.searchButtonDisabled();
	}

	@When("User enters a numeric value {string} in the search box")
	public void userEntersANumericValueInTheSearchBox(String numericValue) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(numericValue);
	}

	@When("User enters a valid product name {string} in the search box")
	public void user_enters_a_valid_product_name_in_the_search_box(String productName) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(productName);
	}

	@Then("User should see the product {string} in the search results")
	public void userShouldSeeTheProductInTheSearchResults(String productName) {
		SearchProductPage sp = new SearchProductPage();
		sp.productdisplayed(productName);

	}

	@When("User enters an invalid product name {string} in the search box")
	public void userEntersAnInvalidProductNameInTheSearchBox(String productName) {
		SearchProductPage sp = new SearchProductPage();
		sp.enterSearchTerm(productName);
	}

}
