package log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	    
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
		WebElement ele = driver.findElement(By.xpath("/html/body/form/input[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		Runtime.getRuntime().exec("D:\\New folder\\record.exe");*/
		
	    String[]obj={"alekh","benarji","alekh","narad"};
	    
		HashMap<String,Integer>o=new HashMap<String,Integer>();
		for(int i=0;i<obj.length;i++) {
			if(o.containsKey(obj[i])) {
				Integer nu = o.get(obj[i]);
				int c;
				o.put(obj[i],nu=nu+1);
			}else {
				o.put(obj[i],1);
			}
		}
		System.out.println(o);
		
	}

}
