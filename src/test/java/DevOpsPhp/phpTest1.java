package DevOpsPhp;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class phpTest1 {
	
	public WebDriver driver;
	
  @Test
  public static void runFromDevOpsPhp() {
	  
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.out.println("Hi This is a Selenium Test Case for Php Website ");
				
		//FirefoxOptions firefoxOptions = new FirefoxOptions();
		//firefoxOptions.setHeadless(true);
		WebDriver driver = new FirefoxDriver();
		//driver = new FirefoxDriver();
		driver.get("http://192.168.1.20:8080");
		driver.findElement(By.id("About Us")).click();
	    
		if (driver.getPageSource().contains("Aldus PageMaker including versions of Lorem Ipsum"))
		{
			  System.out.println("Text Present Test Case Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
  }
}
