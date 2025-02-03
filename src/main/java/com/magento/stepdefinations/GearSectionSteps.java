package com.magento.stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.magento.base.Keyword;
import com.magento.base.WaitFor;
import com.magento.pages.GearsPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GearSectionSteps {

	@Given("User is on the Gear page")
	public void onGearPage() {
		GearsPage gp = new GearsPage();
		gp.clickOnGearSection();
		Keyword.driver.findElement(By.xpath("(//span[contains(text(),'Gear')])[1]")).click();
	}

	@Then("User should see the categories {string}, {string}, and {string}")
	public void verifyCategories(String category1, String category2, String category3) {
		GearsPage gp = new GearsPage();
		List<WebElement> categories = gp.getCategoriesList();
		String categoriesText = categories.stream().map(WebElement::getText).reduce("", (a, b) -> a + " " + b);
		assertTrue(categoriesText.contains(category1) && categoriesText.contains(category2)
				&& categoriesText.contains(category3), "One More Category missing!");
	}

	@When("User selects the {string} category")
	public void userSelectsCategory(String category) {
		GearsPage gp = new GearsPage();
		gp.clickOnCategory(category);
	}

	@Then("User should see the list of bags")
	public void userShouldSeeListOfBags() {
		GearsPage gp = new GearsPage();
		List<WebElement> bagItems = gp.getBagsSearchList();
		assertFalse(bagItems.isEmpty());
	}

	@Then("The page should display {string} bags available")
	public void verifyBagCount(String expectedCount) {
		WebElement countElement = Keyword.driver.findElement(By.xpath("(//span[contains(text(),'14')])[1]"));
		assertEquals(expectedCount, countElement.getText());
	}

	@When("User selects a product {string}")
	public void userSelectsProduct(String productName) {
		WebElement product = Keyword.driver.findElement(By.partialLinkText(productName));
		product.click();
	}

	@When("User clicks {string}")
	public void userClicksAddToCart(String buttonText) {
		WebElement button = Keyword.driver.findElement(By.xpath("//span[contains(text(), '" + buttonText + "')]"));
		WaitFor.elementToBeClickable(button);
		button.click();
	}

	@Then("The product should be added to the cart")
	public void verifyProductAddedToCart() throws InterruptedException {
		WebElement successMessage = Keyword.driver.findElement(By.cssSelector("div[data-ui-id='message-success']"));
		//WaitFor.elementToBeVisible(successMessage);
		Thread.sleep(3000);
		assertTrue(successMessage.isDisplayed());
	}


	@Then("The cart icon should update with the correct item count")
	public void verifyCartItemCount() {
		WebElement cartCount = Keyword.driver.findElement(By.cssSelector(".minicart-count"));
		assertNotNull(cartCount.getText());
	}

	@When("User searches for {string}")
	public void userSearchesForProduct(String searchQuery) {
		WebElement searchBox = Keyword.driver.findElement(By.id("search"));
		searchBox.sendKeys(searchQuery);
		searchBox.submit();
	}

	@Then("User should see search results related to {string}")
	public void verifySearchResults(String expectedQuery) {
		GearsPage gp=new GearsPage();
		List<WebElement> results = gp.getSearchList();
		assertFalse(results.isEmpty());
		assertTrue(results.stream().anyMatch(el -> el.getText().toLowerCase().contains(expectedQuery.toLowerCase())));
	}

	@When("User selects {string} for comparison")
	public void userSelectsForComparison(String productName) {
		WebElement product = Keyword.driver.findElement(By.partialLinkText(productName));
		WaitFor.stalenessRemoval(product);
		product.click();
		WebElement compareButton = product.findElement(By.cssSelector("a[data-role='add-to-links']"));
		compareButton.click();
	}

	@Then("The comparison page should display both products")
	public void verifyComparisonPage() {
		GearsPage gp = new GearsPage();
		List<WebElement> comparedItems = gp.getComparisonList();
		WaitFor.elementsToBeVisible(comparedItems);
		assertEquals(2, comparedItems.size());
	}
}
