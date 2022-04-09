package testng;

import org.testng.annotations.Test;

public class SecondTestCase {
	@Test(priority = 1)
	void setup() {
		System.out.println("this is setup test");
	}
	@Test(priority = 2)
    public void enterUsername() {
		System.out.println("Entered username");
    	
    }
	@Test(priority = 3)
	public void tearup() {
		System.out.println("close the browser");
		
	}
}
