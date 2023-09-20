package stepdefinition;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import pageObjectManager.PageObjectManager;
import io.cucumber.java.en.When;

public class HomePageStepDefinition extends AbstractDefinition{
	
	//AbstractDefinition abs = new AbstractDefinition();
	
	
//	public homePageStepDefinition() throws IOException {
//		super();
//		// TODO Auto-generated constructor stub
//	}


	@Given("Browser launched succesully")
	public void launchBrowser()
	{
		System.out.println("Browser launched succesully");
		pageObjectManager.getHomePage().openHomePage();
	}
	
	
	@Given("Home page is displayed")
	public void verifyHomePage()
	{
		pageObjectManager.getHomePage().verifyHomePageTitle();
		System.out.println("Home page is displayed");
	}
	
	@When("Click on login form")
	public void click_on_login_form() throws InterruptedException {
		pageObjectManager.getHomePage().clickLoginForm();
	}
	@When("Click on login button")
	public void click_on_login_button() {
		pageObjectManager.getHomePage().clickloginButton();
	}
	@Then("Error message is displayed")
	public void error_message_is_displayed() {
		pageObjectManager.getHomePage().verifyLoginError();
	}

}
