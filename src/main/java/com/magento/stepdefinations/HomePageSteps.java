package com.magento.stepdefinations;


import java.util.Arrays;
import java.util.List;

import com.magento.pages.HomePage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	@Given("User is on the Home page")
	public void userIsOnTheHomePage() {

	}

	@When("User hover on {string} category")
	public void userHoverOnMenu(String categoryName) {
		HomePage hp = new HomePage();
		hp.hovenOnCategory(categoryName);

	}

	@When("User hover on a {string} of {string} category")
	public void userHoverOnSubcategory(String menuName, String categoryName) {
		HomePage hp = new HomePage();
		hp.hoverOnMenu(menuName, categoryName);

	}

	@Then("User should able to see the following menus:")
	public void userShouldAbleToSeetTheFollowingCategories(List<String> menus) {
		HomePage hp = new HomePage();
		List<String> expectedCategories = Arrays.asList();
		hp.verifyDisplayCategories(expectedCategories);
	}

	@When("User click on {string} subcategory")
	public void userClickOnSubcategory(String subcategory) {
		HomePage hp = new HomePage();
		hp.clickOnMenu(subcategory);
	}

	@When("User click on the {string} submenu {string}")
	public void userClickOnSubcategory(String subMenuName, String menuName) {
		HomePage hp = new HomePage();
		hp.clickOnSubMenu(subMenuName, menuName);
	}

	@Then("User should able to navigate to the {string} page")
	public void navigateToPage(String page) {
		HomePage hp = new HomePage();
		hp.NavigateToPage(page);
	}

	@Then("the page title should be {string}")
	public void pageTitle(String page) {
		HomePage hp = new HomePage();
		hp.NavigateToPage(page);
	}
	
	@Then("User should able to see the following submenus:")
	public void userShouldAbleToSeeTheFollowingSubmenus(List<String> Submenu) {
		HomePage hp = new HomePage();
		List<String> expectedSubmenu = Arrays.asList();
		hp.verifyDisplaySubmenu(expectedSubmenu);
	}

	
	

}
