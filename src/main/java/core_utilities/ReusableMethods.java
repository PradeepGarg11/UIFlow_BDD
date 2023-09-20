package core_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
	
	WebDriver driver;
	
	public ReusableMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebElement getWebElement(String ele) {
		return driver.findElement(By.xpath(ele));
	}
	
	
	public void click(String ele) {
		getWebElement(ele).click();
	}
	
	public boolean isDiaplyed(String ele) {
		return getWebElement(ele).isDisplayed();
	}
	
	public void scrollToElement(String ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", getWebElement(ele));
	}

}
