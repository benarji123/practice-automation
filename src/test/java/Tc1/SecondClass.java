package Tc1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondClass {
	@BeforeClass
	void beforClass() {
		System.out.println("before the class");
	}
		
		
	@BeforeMethod
	void beforeMethod() {
		System.out.println("this will execute bfore every method");
		
	}
	@AfterClass
	void afterClass() {
		System.out.println("after class");
	}
		
	@Test	
	void tc3() {
		System.out.println("this is test3");
	}
	@Test
	void tc4() {
		System.out.println("this is test4");
		
	}
	@AfterMethod
	void afteraMethod() {
		System.out.println("this will execute after every method");
	}
	@BeforeSuite
	void beforesuit() {
		System.out.println("before suit");
	}
	@AfterSuite
	void aftersuit() {
		System.out.println("after suit");
	}


}
