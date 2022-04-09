package Tc1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObject.LoginPageObject;


public class LoginTest {
	
	WebDriver driver;

	
	

	
	

	
	@Test(dataProvider ="alekh",dataProviderClass = Datap.class)
	 public void loginAccount(String username,String password) {
	   
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		
		LoginPageObject p=new LoginPageObject(driver);
		p.enterUserName(username);
		
		p.enterPassword(password);
		
		p.clickAction();
		
		if(validate()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
			Assert.assertTrue(false);
			
		}else{
			
			Assert.assertTrue(true);
			
			driver.findElement(By.xpath("//*[@id=\"mi_logout\"]/a")).click();
			driver.switchTo().defaultContent();
		}
		 
	}
	public boolean validate() {
		try {
	      driver.switchTo().alert();
	      
	     
	      return true ;
			
		} catch (Exception e) {
		
			return false;
		}
		
		
		
		
		
	
		
	}
	
	
	@AfterMethod
   public void tearUp() {
	   driver.quit();
	
	   
   }@AfterClass
	public void logflush() {
		

	}
   public String getDate() {
	   Date date = new Date();
	   DateFormat f= new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
	 return  f.format(date);
   }
}

