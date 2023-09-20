package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "src/test/resources",
		glue = {"stepdefinition"},
				dryRun=false,
				monochrome = true,
				//stepNotifications = true,
				//strict =true,
				tags = "not @test1",
		plugin= {"pretty", 
				//"json:target/cucumber-reports/cucumber.json",
				//"html:target/cucumber-reports/cucumberreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

	
	
	
}
