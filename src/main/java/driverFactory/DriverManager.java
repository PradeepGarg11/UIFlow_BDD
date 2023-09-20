package driverFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	static public WebDriver driver;
	
	static String setBrowserType() throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\utilities\\data.properties";
		FileInputStream fis =  new FileInputStream(path);
		System.out.println(path);
		prop.load(fis);
		String browserType = prop.getProperty("browser");
		System.out.println(browserType);
				return browserType;
	}
	
	 static public WebDriver setDriver() throws IOException {
		//WebDriver driver = null;
		if(DriverManager.setBrowserType().equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe"); 
		System.out.println("------------++++++++");
				 driver = new ChromeDriver();
		}
		
//		driver.get("https://practice.expandtesting.com/");
//		driver.manage().window().maximize();
//		
//		String s = driver.findElement(By.xpath("//a[@href='/inputs']")).getAttribute("class");
//		System.out.println(s);
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
//		
//		driver.getWindowHandles();
		
		return driver;
		
		
	}
	 
	static public WebDriver getDriver() throws IOException {
		return driver = DriverManager.setDriver();
	 }
	
	void closeBrowser() {
		driver.close();
	}
	
	

}
