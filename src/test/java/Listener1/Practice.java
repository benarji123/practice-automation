package Listener1;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Practice {
	WebDriver driver;
	org.apache.logging.log4j.Logger logger = LogManager.getLogger(Practice.class);
	@Test(priority = 1)
	//@Parameters({"browser"})
	void setup() {
		
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver =new ChromeDriver();
			logger.info("opened browser ");
			
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/V4/");
			logger.info("opened url ");
			logger.warn("this is warning");
			logger.fatal("this is fatel");
			logger.error("this is error");
			
			logger.trace("this is trace");
			
			
			
		}
		

	@Test(enabled = false)
   void validation() {
	  boolean r= driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed();
	  logger.fatal("fail");
	  Assert.assertEquals(r, "guru");
	  
   }
   @Test(priority = 3)
   void tearUp() {
	   driver.quit();
   }
}
