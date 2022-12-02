package com.pages;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {
	
	public LoginPage loginPage ;
	public HomePage homePage;
	public ShampooSelectionPage shampooselectionPage;
	CologneSelectionpage cologneSelectionpage;
	public WebDriver driver;
	//public CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public LoginPage getLoginPagePage()
	{
	
	 loginPage= new LoginPage(driver);
	 return loginPage;
	}
	
	public HomePage getHomePage()
	{
		homePage = new HomePage(driver);
		return homePage;
	}
	
	public ShampooSelectionPage getShampooSelectionPage()
	{
		shampooselectionPage = new ShampooSelectionPage(driver);
		return shampooselectionPage;
	}
	public CologneSelectionpage getCologneSelectionpage()
	{
		cologneSelectionpage = new CologneSelectionpage(driver);
		return cologneSelectionpage;
	}
}
