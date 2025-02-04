package com.magento.stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.magento.base.Keyword;
import com.magento.pages.GearsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GearSectionSteps {

	@Given("user is on the Gear page")
	public void onGearPage() {
		GearsPage gp = new GearsPage();
		gp.clickOnGearSection();
	}

	@Then("user should see the categories {string}, {string}, and {string}")
	public void verifyCategories(String category1, String category2, String category3) {
		GearsPage gp = new GearsPage();
		List<WebElement> categories = gp.getCategoriesList();
		String categoriesText = categories.stream().map(WebElement::getText).reduce("", (a, b) -> a + " " + b);
		assertTrue(categoriesText.contains(category1) && categoriesText.contains(category2)
				&& categoriesText.contains(category3), "One More Category missing!");
	}

	@When("user selects the {string} category")
	public void userSelectsCategory(String category) {
		GearsPage gp = new GearsPage();
		gp.clickOnCategory(category);
	}

	@Then("user should see the list of bags")
	public void userShouldSeeListOfBags() {
		GearsPage gp = new GearsPage();
		List<WebElement> bagItems = gp.getBagsSearchList();
		assertFalse(bagItems.isEmpty());
	}

	@Then("the page should display {string} bags available")
	public void verifyBagCount(String expectedCount) {
		WebElement countElement = Keyword.driver.findElement(By.xpath("(//span[contains(text(),'14')])[1]"));
		assertEquals(expectedCount, countElement.getText());
	}

	@When("user selects a product {string}")
	public void userSelectsProduct(String productName) {
		WebElement product = Keyword.driver.findElement(By.partialLinkText(productName));
		product.click();
	}

	@Then("the product should be added to the cart")
	public void verifyProductAddedToCart() {
		//Thread.sleep(5000);
		Shutterbug.shootPage(Keyword.driver).save();
		Keyword.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement successMessage = Keyword.driver
				.findElement(By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
		//WaitFor.elementToBeVisible(successMessage);
		String SuccMags = successMessage.getText();
		assertTrue(SuccMags.contains("added"));
	}

	@When("user searches for {string}")
	public void userSearchesForProduct(String searchQuery) {
		WebElement searchBox = Keyword.driver.findElement(By.id("search"));
		searchBox.sendKeys(searchQuery);
		searchBox.submit();
	}

	@Then("user should see search results related to {string}")
	public void verifySearchResults(String expectedQuery) {
		GearsPage gp = new GearsPage();
		List<WebElement> results = gp.getSearchList();
		assertFalse(results.isEmpty());
		assertTrue(results.stream().anyMatch(el -> el.getText().toLowerCase().contains(expectedQuery.toLowerCase())));
	}
	
	@When("user clicks on Home Page link on gear page")
	public void clickOnHomePageLink() {
		GearsPage gp = new GearsPage();
		gp.clickOnGearPageLink();
	}
}
