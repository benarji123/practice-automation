package Tc1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionsTestng {
	WebDriver driver=null;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup( String br,String app) {
		if(br.equalsIgnoreCase("chrome")) {

			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver=new ChromeDriver();
			
	    }else if(br.equalsIgnoreCase("firefox")) {
		     System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.get(app);
		 
	
	}
	@Test(priority = 1)
	void logoTest() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}

	@Test(dependsOnMethods = {"logoTest"})
	void validate() {
		String s=driver.getTitle();
		Assert.assertEquals(s, "OrangeHRM","both titles are not matched");
	}
	@AfterClass
	void tearup() {
		driver.quit();
	}

}
