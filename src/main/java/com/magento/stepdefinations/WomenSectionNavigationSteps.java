package com.magento.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenSectionNavigationSteps {
	
	@Given("User is on the Home page")
	public void userIsOnTheHomePage() {
	    
	}
	
	@When("User hover on {string} menu")
	public void userHoverOnMenu(String string) {
	   
	}
	
	@Then("User should able to see the following categories:")
	public void categoriesUnderWomen(io.cucumber.datatable.DataTable dataTable) {
	   
	}
	
	
	
	@When("User hover on {string} subcategory")
	public void userHoverOnSubcategory(String string) {
	   
	}
	@Then("User should able to see the following categories under the {string}:")
	public void categoriesUnderTops(String string, io.cucumber.datatable.DataTable dataTable) {
	   
	}
	
	
	
	@When("User click on {string} subcategory")
	public void userClickOnSubcategory(String string) {
	    
	}
	@Then("User should able to navigate to the {string} page")
	public void navigateToPage(String string) {
	    
	}
	@Then("the page title should be {string}")
	public void pageTitle(String string) {
	    
	}
	
	
	




}
