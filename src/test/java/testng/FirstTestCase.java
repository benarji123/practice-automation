package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority = 1)
	void setup() {
		System.out.println("this is setup test");
	}
	@Test(priority = 2)
    public void loginTest() {
		System.out.println("login test");
		Assert.assertEquals("benarji", "benarji");
    	
    }
	@Test(priority = 3,enabled = false)
	public void tearup() {
		System.out.println("close the browser");
		
	}
}
