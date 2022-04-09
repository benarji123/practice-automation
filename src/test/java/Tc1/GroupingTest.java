package Tc1;

import org.testng.annotations.Test;

public class GroupingTest {
	@Test(groups = {"registration"})
	void test1() {
		System.out.println("test1..");
	}
	@Test(groups = {"registration"})
	void test2() {
		System.out.println("test2..");
	}
	@Test(groups = {"smoke"})
	void test3() {
		System.out.println("test3..");
	}
	@Test(groups = {"smoke"})
	void test4() {
		System.out.println("test4..");
	}
	@Test(groups = {"sanity"})
	void test5() {
		System.out.println("test5..");
	}
	@Test(groups = {"sanity","smoke"})
	void test6(){
		System.out.println("test6..");
	

}
}
