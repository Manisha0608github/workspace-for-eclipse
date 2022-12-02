
package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pages.Add_on_service;
import com.pages.CologneSelectionpage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.ProductStore;
import com.pages.ProductlistPage;
import com.pages.SignupPage;

import appHooks.ApplicationHooks;
import cucumberAutomation.Base;
import cucumberAutomation.TestContextSetup;
import io.cucumber.java.en.And;

//import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Bki_Aut_48_CologenStepDef extends Base {
	
	HomePage homePage;
	LoginPage loginPage;
	CologneSelectionpage cologneSelectionpage;
	TestContextSetup testContextSetup;
	
	public Bki_Aut_48_CologenStepDef(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.cologneSelectionpage =testContextSetup.pageObjectManager.getCologneSelectionpage();
	}
	
	
	@Then("^user clicks on cologne selection$")
	public void user_clicks_on_cologne_selection() throws Throwable {
		
		System.out.println("User clicks on the link Cologne Selection");
		Thread.sleep(5000);
		cologneSelectionpage.selectCologne().click();
		Thread.sleep(3000);
		
	}
		

	@Then("^verify user can create new cologne selection$")
	public void verify_user_can_create_new_cologne_selection() throws Throwable {
		
		System.out.println("Verify whether user can create a new cologne selection");
		cologneSelectionpage.createNew().click();
		Thread.sleep(1000);
		cologneSelectionpage.enterCologneName().sendKeys("PetLogix AUT48");
		Thread.sleep(3000);
		cologneSelectionpage.enterIndex().sendKeys("5");
		Thread.sleep(3000);
		cologneSelectionpage.addCologne().click();
		Thread.sleep(3000);
		if(cologneSelectionpage.popupMessage().getText().equalsIgnoreCase("Cologne added successfully")) {
			System.out.println("Cologne added successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Cologne already exist with name PetLogix AUT48");
			System.out.println("Failed!");
		}
		
		Thread.sleep(3000);
	}
	

	@Then("^verify user can create cologne selection with existing name$")
	public void verify_user_can_create_cologne_selection_with_existing_name() throws Throwable {
		
		
		System.out.println("Verify whether user can create cologne selection with existing name");
		String name="PetLogix AUT48";
		String msg="Cologne already exist with name "+name;
		cologneSelectionpage.createNew().click();
		Thread.sleep(1000);
		cologneSelectionpage.enterCologneName().sendKeys(name);
		Thread.sleep(1000);
		cologneSelectionpage.enterIndex().sendKeys("5");
		Thread.sleep(3000);
		cologneSelectionpage.addCologne().click();
		Thread.sleep(3000);
		if(cologneSelectionpage.popupMessage().getText().equalsIgnoreCase("Cologne already exist with name "+name)){
			System.out.println("Cologne already exist with name "+name);
			System.out.println("Passed!");
		}
		else {
			System.out.println("Cologne added successfully");
			System.out.println("Failed!");
		}
		Thread.sleep(3000);
	
	}
	
	
	@Then("^verify user can inactive from cologne selection$")
	public void verify_user_can_inactive_from_cologne_selection() throws Throwable {
		
		System.out.println("Verify whether user is able to inactive from the cologne selections listing page");
		String msg ="Cologne updated successfully";
		Thread.sleep(1000);
			cologneSelectionpage.clickToggle().click();
			cologneSelectionpage.clickSave().click();
			Thread.sleep(3000);
			if(cologneSelectionpage.popupMessage().getText().equalsIgnoreCase("Cologne updated successfully")){
				System.out.println("Cologne updated successfully");
				System.out.println("Passed!");
			}
			else {
				System.out.println("Cologne added successfully");
				System.out.println("Failed!");
			}
		    	
	}
	
	@Then("^verify user can active from cologne selection$")
	public void verify_user_can_active_from_cologne_selection() throws Throwable {
		
		System.out.println("Verify whether user is able to active from the cologne selections listing page");
		String msg ="Cologne updated successfully";
		
		cologneSelectionpage.selectCologne().click();
		cologneSelectionpage.searchCologne().sendKeys("testtDogss");
		cologneSelectionpage.enterSubmit().click();
		Thread.sleep(1000);
		if(cologneSelectionpage.popupMessage().getText().equalsIgnoreCase("Cologne updated successfully")){
			System.out.println("Cologne updated successfully");
			System.out.println("Passed!");
		}
		else {
			System.out.println("Cologne added successfully");
			System.out.println("Failed!");
		}
		
	}
	
	@Then("^verify user can delete a cologne selection$")
	public void verify_user_can_delete_a_cologne_selection() throws Throwable {
		
		System.out.println("Verify whether user can delete a cologne selection");
		String msg ="Cologne removed successfully";
		
		cologneSelectionpage.searchCologne().sendKeys("PetLogix AUT48");
		cologneSelectionpage.enterSubmit().click();
		Thread.sleep(3000);
		cologneSelectionpage.user_click_on_delete().click();
		Thread.sleep(1000);
		cologneSelectionpage.user_click_on_yes().click();
		
		
		cologneSelectionpage.resetFilters().click();
		Thread.sleep(3000);
		
	}
	
	
	@Then("^verify user can delete a cologne selection with appointment$")
	public void verify_user_can_delete_a_cologne_selection_with_appointment() throws Throwable {
		
		System.out.println("Verify whether user can delete a cologne selection with appointment");
		String msg ="Cologne is used in an appointment";
		
		cologneSelectionpage.searchCologne().sendKeys("NEW COLGNE");
		cologneSelectionpage.enterSubmit().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
	
		Thread.sleep(1000);
		cologneSelectionpage.closeAlert().click();
		cologneSelectionpage.resetFilters().click();
		Thread.sleep(3000);
	}
	

	
	
	
}
