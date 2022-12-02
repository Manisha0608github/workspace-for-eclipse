package stepdefinations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.HomePage;
import com.pages.LoginPage;

import com.pages.ShampooSelectionPage;

import cucumberAutomation.Base;
import cucumberAutomation.TestContextSetup;
//import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;

public class Bki_Aut_3_ShampooStepDef extends Base{
	
	LoginPage loginPage;
	HomePage homePage;
	ShampooSelectionPage shampooselectionPage;
	TestContextSetup testContextSetup;

	 public Bki_Aut_3_ShampooStepDef(TestContextSetup testContextSetup)
		{
			this.testContextSetup=testContextSetup;
			this.shampooselectionPage =testContextSetup.pageObjectManager.getShampooSelectionPage();
		}
	
 
	@Then("^user clicks on shampoo selection$")
	public void user_clicks_on_shampoo_selection() throws Throwable {
		
		System.out.println("User clicks on the link Shampoo Selection");
		shampooselectionPage.clickShampoo().click();
		Thread.sleep(3000);
		
	}
	
	@Then("^verify user can create new shampoo$")
	public void verify_user_can_create_new_shampoo() throws Throwable {
		
		shampooselectionPage.clickNewButton().click();
		Thread.sleep(3000);
		shampooselectionPage.enterShampooName().sendKeys("Fluffy Tails AUT_3");
		shampooselectionPage.enterIndex().sendKeys("1");
		Thread.sleep(3000);
		shampooselectionPage.clickAddButton().click();
		Thread.sleep(3000);
		if((shampooselectionPage.pop_up_handle()).getText().equalsIgnoreCase("shampoo added successfully")){
			System.out.println("Shampoo added successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo already exist with name Fluffy Tails AUT_3");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
	}
	


	@Then("^verify user can create shampoo with existing name$")
	public void verify_user_can_create_shampoo_with_existing_name() throws Throwable {
		
		System.out.println("Verify whether user can create Shampoo with existing name");
		String name="Fluffy Tails AUT_3";
		shampooselectionPage.clickNewButton().click();
		Thread.sleep(3000);
		shampooselectionPage.enterShampooName().sendKeys("Fluffy Tails AUT_3");
		shampooselectionPage.enterIndex().sendKeys("1");
		Thread.sleep(3000);
		shampooselectionPage.clickAddButton().click();
		Thread.sleep(3000);
		
		if((shampooselectionPage.pop_up_handle()).getText().equalsIgnoreCase("Shampoo already exist with name "+name)){
			System.out.println("Shampoo already exist with name "+name);
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo added successfully");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
	}
	
	@Then("^verify user can inactive from shampoo listing page$")
	public void verify_user_can_inactive_from_shampoo_listing_page() throws Throwable {
		
		System.out.println("Verify whether user is able to inactive from the Shampoo listing page");
		String msg ="Shampoo updated successfully";
		shampooselectionPage.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		shampooselectionPage.clickSubmit().click();
		Thread.sleep(3000);
		if((shampooselectionPage.handle_active_inactive()).getText().equalsIgnoreCase("Active")) {
			shampooselectionPage.clickToggle().click();
			shampooselectionPage.clickSave().click();
		}
		else {
			System.out.println("Failed!");
		}
	
		Thread.sleep(3000);
	}
	
	@Then("^verify user can active from shampoo listing page$")
	public void verify_user_can_active_from_shampoo_listing_page() throws Throwable {
		
		System.out.println("Verify whether user is able to active from the Shampoo listing page");
		String msg ="Shampoo updated successfully";
		
		
		shampooselectionPage.clickShampoo().click();
		Thread.sleep(3000);
		shampooselectionPage.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		shampooselectionPage.clickSubmit().click();
		Thread.sleep(3000);
		if((shampooselectionPage.handle_active_inactive()).getText().equalsIgnoreCase("Active")) {
			shampooselectionPage.clickToggle().click();
			shampooselectionPage.clickSave().click();
		}
		else {
			System.out.println("Failed!");
		}
	
		Thread.sleep(3000);
	}
	
	
	@Then("^verify user can delete shampoo$")
	public void verify_user_can_delete_shampoo() throws Throwable {
		System.out.println("Verify whether user can delete Shampoo");
		shampooselectionPage.clickShampoo().click();
		shampooselectionPage.searchShampoo().sendKeys("Fluffy Tails AUT_3");
		shampooselectionPage.clickSubmit().click();
		Thread.sleep(3000);
		shampooselectionPage.clickDelete().click();
		shampooselectionPage.selectYes().click();
		Thread.sleep(3000);
		if((shampooselectionPage.pop_up_handle()).getText().equalsIgnoreCase("Shampoo removed successfully")){
			System.out.println("Shampoo removed successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo is used in an appointment");
			System.out.println("Failed!");
		}	
		Thread.sleep(1000);
		shampooselectionPage.clickReset().click();
		
		Thread.sleep(3000);
	}
	
	@Then("^verify user can delete a shampoo with appointment$")
	public void verify_user_can_delete_a_shampoo_with_appointment() throws Throwable {
		
		System.out.println("Verify whether user can delete a Shampoo with appointment");
		shampooselectionPage.searchShampoo().sendKeys("DSFGDFGD");
		shampooselectionPage.clickSubmit().click();
		Thread.sleep(3000);
		shampooselectionPage.clickDelete().click();
		Thread.sleep(3000);
		shampooselectionPage.selectYes().click();
		Thread.sleep(3000);
		if((shampooselectionPage.pop_up_handle()).getText().equalsIgnoreCase("Shampoo is used in an appointment")){
			System.out.println("Shampoo is used in an appointment");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Shampoo removed successfully");
			System.out.println("Failed!");
		}
	
		Thread.sleep(3000);
		shampooselectionPage.closeAlert().click();
		shampooselectionPage.clickReset().click();
		Thread.sleep(3000);
	}
	
	
}
