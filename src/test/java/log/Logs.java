package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logs {
	Logger log;
	@BeforeMethod
	public void startLog() {
		 log = Logger.getLogger("Log");
		PropertyConfigurator.configure("./resources/log4j.properties");
		// DOMConfigurator.configure("./resources/log4j2.properties");
	}
	@Test(priority = 1)
   public void test() {
	   log.info("this is actuall test ");
   }
	@Test(priority = 2)
	   public void test1() {
		   log.info("this is actuall test1 ");
	   }
	@Test(priority = 3)
	   public void closeTest() {
		   log.info("this is closeTest ");
	   }
		
}
