package pageObjectFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core_utilities.ReusableMethods;

public class HomePage extends ReusableMethods{
	
	//WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
	}
	
	String homePageTitle = "//h1[text()='Automation Testing Practice Website for UI and API']";
	
	String loginError = "//*[contains(text(),'Your username is invalid!')]";
	String loginFormLink = "//a[@href='/login']";
	String loginCard = "//a[@href='/login']/parent::h3/parent::div";
	String loginButton = "//button[@type='submit']";
	
	String formValidationLink = "//a[@href='/form-validation']";
	
	
	public void openHomePage()
	{
		getDriver().get("https://practice.expandtesting.com/");
		getDriver().manage().window().maximize();
		
		String s = getDriver().findElement(By.xpath("//a[@href='/inputs']")).getAttribute("class");
		System.out.println(s);
		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		getDriver().getWindowHandles();
	}
	
	public void verifyHomePageTitle() {
		getWebElement(homePageTitle).isDisplayed();
	}
	
	public void clickLoginForm() throws InterruptedException {
		scrollToElement(loginCard);
		Thread.sleep(3000);
		click(loginFormLink);
	}
	
	public void clickloginButton() {
		click(loginButton);
	}
	
	public void verifyLoginError() {
		boolean msg = isDiaplyed(loginError);
		System.out.println(msg);
	}
}
