package cucumberAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.LoginPage;

public class Base {

	public WebDriver driver;
	String path = System.getProperty("user.dir");
	public WebDriver WebDriverManager() throws IOException
	{
		
		FileInputStream fis=new FileInputStream (path+"//src//test//java//cucumberAutomation//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
			//for local server 
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\eclipse-workspace\\Test-Automation\\Dependencies\\chromedriver\\chromedriver.exe");
			// for a server
//			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
//			driver = new ChromeDriver(options);

              

		System.out.println("driverintialize");
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","//Users//Downloads//geckodriver 5");
				driver = new FirefoxDriver();
			}
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}
		
		return driver;
		
	}
	
	
	
}

