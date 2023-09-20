package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverManager;
import pageObjectManager.PageObjectManager;


public class AbstractDefinition extends DriverManager{
	

	static WebDriver driver;
	//static PageObjectManager pageObjectManager;
	
	static {
		try {
			driver = DriverManager.getDriver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	static void  getDriverValue() throws IOException {
//		driver = LaunchBrowser.testBrowser();;
//	}

	
	AbstractDefinition() {
		//super(driver);
		System.out.println("inside AbstractDefinition contrctor");
	}

	
	 PageObjectManager pageObjectManager = new PageObjectManager(driver);
	
}
