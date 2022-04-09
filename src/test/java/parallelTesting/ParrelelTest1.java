package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class ParrelelTest1 {
	WebDriver driver=null;
	@Test(priority = 1)
	void logoTest1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		
		
	} 
	@Test(dependsOnMethods = {"logoTest1"})
	 void login() {
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
	}
	
	@Test(dependsOnMethods = {"login"})
	void tearUp() {
		driver.quit();
	}
	
	
	
	
	


}
