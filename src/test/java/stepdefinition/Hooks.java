package stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends AbstractDefinition {
	
	//WebDriver
	
	@After() // Cucumber After Hook with order 1
	public void takeScreenShotOnFailedScenario(Scenario scenario) {

		System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
		if ((scenario.isFailed())) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

}
