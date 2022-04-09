package Tc1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirtstClass {
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
void tc1() {
	System.out.println("this is test1");
}
@Test
void tc2() {
	System.out.println("this is test2p-");
	
}
@AfterMethod
void afteraMethod() {
	System.out.println("this will execute after every method");
	
}
@BeforeTest
void beforTest() {
	System.out.println("this is before test");
	
}
@AfterTest
void afterTest() {
	System.out.println("this is after test");
}
}
