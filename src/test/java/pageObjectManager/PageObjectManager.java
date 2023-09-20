package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pageObjectFiles.HomePage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homePage;
	
	public PageObjectManager(WebDriver driver)
		{
			this.driver = driver;	
			System.out.println("inside PageObjectManager constructor");
		}
	
	public HomePage getHomePage() {
		return (homePage==null)? homePage = new HomePage(driver) : homePage;
	}
	
	
	
	

}
