package Tc1;

import org.testng.annotations.DataProvider;

public class DataPr {
	@DataProvider(name="login")
	public Object[][] getData(){
		
		Object[][] data= {{"abc@gmail.cm","abc"},{"xyz@gmail.com","xyz"}};
		
		return data;
		
	}
}
