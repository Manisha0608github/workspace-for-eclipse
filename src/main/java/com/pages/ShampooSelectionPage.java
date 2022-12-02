package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShampooSelectionPage {
	
	public WebDriver driver;
	
	public ShampooSelectionPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By shampooLink = By.xpath("//a[@href='/retailer/booking/configuration/shampoo-selections']");
	By searchTab = By.xpath("//input[@placeholder='Search here']");
	By submit = By.xpath("//button[text()='Submit']");
	By delete = By.xpath("//button[text()='Delete']");
	By clickYes = By.xpath("//button[text()='Yes']");
	By reset = By.xpath("//button[text()='Reset filters']");
	By closeAlert = By.xpath("//span[text()='×']");
	By newButton = By.xpath("//button[text()='Add new shampoo']");
	By addNew = By.xpath("//input[@placeholder='Enter shampoo name']");
	By addIndex = By.xpath("//input[@placeholder='Enter shampoo index value']");
	By addButton = By.xpath("//button[text()='Add']");
	By toggle=By.xpath("//div[@class='react-switch-bg']");
	By saveButton = By.xpath("//button[text()='Save']");
	By pop_up_handle = By.xpath("//div[@class='Toastify__toast-body']");
	By handle_active_inactive =By.xpath("//div[@class='active-area mb-3']");
	
	public WebElement clickShampoo() {
		return driver.findElement(shampooLink);
	}
	
	public WebElement searchShampoo() {
		return driver.findElement(searchTab);
	}
	
	public WebElement clickSubmit() {
		return driver.findElement(submit);
	}
	
	public WebElement clickDelete() {
		return driver.findElement(delete);
	}
	
	public WebElement selectYes() {
		return driver.findElement(clickYes);
	}
	
	public WebElement clickReset() {
		return driver.findElement(reset);
	}
	
	public WebElement closeAlert() {
		return driver.findElement(closeAlert);
	}
	
	public WebElement clickNewButton() {
		return driver.findElement(newButton);
	}
	
	public WebElement enterShampooName() {
		return driver.findElement(addNew);
	}
	
	public WebElement enterIndex() {
		return driver.findElement(addIndex);
	}
	
	public WebElement clickAddButton() {
		return driver.findElement(addButton);
	}
	
	public WebElement clickToggle() {
		return driver.findElement(toggle);
	}
	
	public WebElement clickSave() {
		return driver.findElement(saveButton);  
	}
	public WebElement pop_up_handle() {
		return driver.findElement(pop_up_handle);  
	}
	public WebElement handle_active_inactive() {
		return driver.findElement(handle_active_inactive);  
	}
}
