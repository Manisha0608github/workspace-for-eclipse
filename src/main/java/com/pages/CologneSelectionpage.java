package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CologneSelectionpage {
	
	public WebDriver driver;
	public CologneSelectionpage(WebDriver driver) {
		this.driver=driver;
		}
	
	By cologne = By.xpath("//strong[text()='Cologne Selection']");
	By createNew = By.xpath("//button[text()='Add new cologne']");
	By enterName = By.xpath("//input[@placeholder='Enter cologne name']");
	By indexTab = By.xpath("//input[@placeholder='Enter cologne index value']");
	By addName = By.xpath("//button[text()='Add']");
	By searchBar = By.xpath("//input[@placeholder='Search here']");
	By submit = By.xpath("//button[text()='Submit']");
	By toggle = By.xpath("//div[@class='react-switch-bg']");
	By save = By.xpath("//button[text()='Save']");
	By close = By.xpath("//span[text()='×']");
	By reset = By.xpath("//button[text()='Reset filters']");
	By click_on_delete = By.xpath("//button[text()='Delete']");
	By click_on_yes = By.xpath("//button[text()='Yes']");
	By popup = By.xpath("//div[@class='Toastify__toast-body']");
	
	public WebElement selectCologne() {
		return driver.findElement(cologne);
	}
	
	
	public WebElement createNew() {
		return driver.findElement(createNew);
	}

	public WebElement enterCologneName() {
		return driver.findElement(enterName);
	}
	
	public WebElement enterIndex() {
		return driver.findElement(indexTab);
	}
	
	public WebElement addCologne() {
		return driver.findElement(addName);
	}
	
	public WebElement searchCologne() {
		return driver.findElement(searchBar);
	}
	
	public WebElement enterSubmit() {
		return driver.findElement(submit);
	}
	
	public WebElement clickToggle() {
		return driver.findElement(toggle);
	}
	
	public WebElement clickSave() {
		return driver.findElement(save);
	}
	
	public WebElement closeAlert() {
		return driver.findElement(close);
	}
	
	public WebElement resetFilters() {
		return driver.findElement(reset);
	}
	
	public WebElement popupMessage() {
		return driver.findElement(popup);
	}
	public WebElement user_click_on_delete() {
		return driver.findElement(click_on_delete);
	}
	public WebElement user_click_on_yes() {
		return driver.findElement(click_on_yes);
	}
}
