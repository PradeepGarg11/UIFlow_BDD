import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBasicBrowserUI {
	
	
	void explictwait(WebDriver driver, WebElement ele) {		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOf(ele));		
	}
	
	
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
	
	void testBrowser() throws IOException {
		WebDriver driver = null;
		if(TestBasicBrowserUI.setBrowserType().equals("chrome"))
		{
			  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe"); 			
				 driver = new ChromeDriver();
		}

		
		driver.get("https://practice.expandtesting.com/");
		driver.manage().window().maximize();
		
		String s = driver.findElement(By.xpath("//a[@href='/inputs']")).getAttribute("class");
		System.out.println(s);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(50000));
		
		driver.getWindowHandles();
		
		driver.close();
	}
	
	


	public static void main(String[] args) throws IOException {
		
		TestBasicBrowserUI t1 = new TestBasicBrowserUI();
		//t1.setBrowserType();
		t1.testBrowser();

	}

}
