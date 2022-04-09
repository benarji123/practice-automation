package ExtentsReport;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import PageObject.LoginPageObject;
import Tc1.Datap;
import io.opentelemetry.api.internal.Utils;

public class ExtentRepo {
	public WebDriver driver ;
	public ExtentSparkReporter htmlrepo;
	public ExtentReports extent;
	public ExtentTest test ;
	@BeforeTest
	public  void setExtent() {
		htmlrepo=new ExtentSparkReporter(System.getProperty("user.dir")+"/extentReport/myreport.html");
		htmlrepo.config().setDocumentTitle("Automation Report");//title of the report
		htmlrepo.config().setReportName("Functional Report");//name of the report
		htmlrepo.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(htmlrepo);
		extent.setSystemInfo("Hostname","LocalHost");
		extent.setSystemInfo("Os","windows7");
		extent.setSystemInfo("Browser","Chrome");
		
	}
	@AfterTest
	public void endRoport() {
		extent.flush();
		
	}
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		driver.manage().window().maximize();
		
		
	}
	@Test(dataProvider ="alekh",dataProviderClass =Datap.class)
	public void login(String username,String password) {
		test=extent.createTest("login");
		LoginPageObject p=new LoginPageObject(driver);
		p.enterUserName(username);
		test.pass("Entered username");
	
		
		p.enterPassword(password);
		test.pass("Entered password");
		p.clickAction();
		if(validate()==true) {
			
			Assert.assertTrue(false);
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
			
			
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
	public void logoVerification() {
		test=extent.createTest("logoVerification");
		boolean status=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@AfterMethod
	public void rearDown(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "TEST CASE FAILED IS"+result.getName());//to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS"+result.getThrowable());// to add error /exception
			String screenshotpath=ExtentRepo.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotpath); //add screenshots			
			
		}else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "TEST CASE SKIPPED IS"+result.getName());
			
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "TEST CASE SUCCESSED IS"+result.getName());
		}
		driver.close();
		
	}
	public static String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException {
		String dateName=new SimpleDateFormat("yyyyMMdd hhmmss").format(new Date());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"/Screenshots/"+ScreenshotName + dateName + ".png";
		File finaldestination = new File(destination);
		FileUtils.copyFile(source, finaldestination);
		return destination;
		
		
		
	}
	
	
	
	
	
   
}
