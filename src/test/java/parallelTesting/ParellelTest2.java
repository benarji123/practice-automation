package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParellelTest2 {
	WebDriver driver;
	@Test(priority = 1)
	void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@Test(priority = 2)
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
