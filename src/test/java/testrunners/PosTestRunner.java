package testrunners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Bookit-features"},
				tags = "@Pos",
		glue = {"stepdefinations","appHooks"},
//		plugin = {"pretty",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"timeline:test-output-thread/"
//				
//		}
		
		
	plugin= {"pretty","html:target/cucumber","json:target/CucumberReports/cucumber.json"},
		monochrome = true 
		)






				
	
public class PosTestRunner {

}
