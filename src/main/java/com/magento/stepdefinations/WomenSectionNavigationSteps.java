package com.magento.stepdefinations;

import com.magento.pages.WomenSectionNavigationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomenSectionNavigationSteps {
	//DataTable dt;
	
	@Given("User is on the Home page")
	public void userIsOnTheHomePage() {
	    
	}	
	@When("User hover on {string} category")
	public void userHoverOnMenu(String categoryName) {
		WomenSectionNavigationPage wp=new WomenSectionNavigationPage();
		wp.hovenOnCategory(categoryName);
	}
	
//	@Then("User should able to see the following categories:")
//	public void categoriesUnderWomen(DataTable dt) {
//		WomenSectionNavigationPage wp=new WomenSectionNavigationPage();
//		wp.getWomenMenuList();
//	}
	
	
	
	@When("User hover on a {string} of {string} category")
	public void userHoverOnSubcategory(String menuName, String categoryName) {
		WomenSectionNavigationPage wp=new WomenSectionNavigationPage();
		wp.hoverOnMenu(menuName, categoryName);
	   
	}
	
	
	@Then("User should able to see the following categories under the {string}:")
	public void categoriesUnderTops(String string, io.cucumber.datatable.DataTable dataTable) {
		WomenSectionNavigationPage wp=new WomenSectionNavigationPage();
		
	}
	
	@When("User click on the {string} submenu {string}")
	public void userClickOnSubcategory(String subMenuName, String menuName) {
		WomenSectionNavigationPage wp=new WomenSectionNavigationPage();
		wp.clickOnSubMenu(subMenuName, menuName);
	}
	@Then("User should able to navigate to the {string} page")
	public void navigateToPage(String string) {
	    
	}
	@Then("the page title should be {string}")
	public void pageTitle(String string) {
	    
	}
	
	
	




}
