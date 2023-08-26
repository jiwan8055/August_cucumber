package stepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = {"featurefile"},
		glue = {"stepDefination"},
		plugin = {"pretty",
				"html:target/report/cucumber.html",
		},
		
		dryRun = false
				
	    //tags = "@smoke"
		)
public class TestRunner extends AbstractTestNGCucumberTests  {

}
