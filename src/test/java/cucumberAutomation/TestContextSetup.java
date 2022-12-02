package cucumberAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.PageObjectManager;



public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public Base base;
	public GenericUtils genericUtils;

	
	public TestContextSetup() throws IOException
	{
		base = new Base();
		pageObjectManager = new PageObjectManager(base.WebDriverManager());
		genericUtils = new GenericUtils(base.WebDriverManager());
		
		
		

	}
	
}
