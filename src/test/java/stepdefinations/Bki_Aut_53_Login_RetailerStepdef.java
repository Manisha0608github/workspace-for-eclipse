package stepdefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.pages.Add_on_service;
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



public class Bki_Aut_53_Login_RetailerStepdef extends Base {
 
	
	HomePage homePage;
	LoginPage loginPage;
	SignupPage s;
	TestContextSetup testContextSetup;


	
	public Bki_Aut_53_Login_RetailerStepdef(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage =testContextSetup.pageObjectManager.getLoginPagePage();
		this.homePage =testContextSetup.pageObjectManager.getHomePage();
	}
	@Given("^user is in landing page$")
	public void user_is_in_landing_page() throws Throwable
	{
		Assert.assertTrue(loginPage.getTitleLoginPage().contains("Login | Sandy's Pet Depot"));
		
	Thread.sleep(3000);
	
	}  
	   
	   @When("^user enters valid username$")
	  
	    public void user_enters_valid_Username() throws Throwable {
	        
	    	loginPage.enter_username().sendKeys("jibutest3@getnada.com"
	    			+ "");
	    	System.out.println("user enters valid username");	  
	    	Thread.sleep(3000);
	    	
	    }
	   
	   @When("^user enters valid  password$")
		  
	    public void user_enters_valid_password() throws Throwable {
	        
	    	loginPage.enterpassword().sendKeys("etail_1202");
	    	System.out.println("user enters valid username");
 
 	Thread.sleep(5000);
	    	
	    }
	   
	   @And("^clicks on Sign-in button$")
		  
	    public void known_user_clicks_signin() throws Throwable {
	        
           loginPage.clicksignIn().click();
           System.out.println("user clicks on Sign-in button");

	    	Thread.sleep(10000);
	    	
	    }
	   
		@Then("^user select Bookit from dashboard$")
		public void user_select_Bookit_from_dashboard() throws Throwable
		{
			System.out.println("user login successfull");
			
			WebElement Source = homePage.user_Select_dashboard();
			Select dd1=new Select(Source);
			  dd1.selectByValue("bookit_only");
			 System.out.println("Passed!");
			 Thread.sleep(5000);
		}
		 @Then("^user click on booking tab$")
		    public void user_clicks_bookingtab() throws Throwable {
		        
	     homePage.user_select_booking().click();	 
	     System.out.println("Passed!");
		    	Thread.sleep(3000);
		    	
		    }
		
		 @Then("^user click on Configuration$")
		    public void  user_click_on_Configuration() throws Throwable {
		        
	     homePage.user_click_configuration().click();	
	     System.out.println("Passed!");
		    	Thread.sleep(3000);
		    	
		    }
	

			   
}
