package Tc1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEX {
	@Test(dataProvider = "login",dataProviderClass =DataPr.class)
	public void loginR(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	
	

}
