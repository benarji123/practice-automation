package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver ldriver;
	public LoginPageObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(name="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="btnsubmit")
	WebElement loginButton;
	
	public void enterUserName(String username) {
		txtusername.clear();
		txtusername.sendKeys(username);
		
		
	}
	public void enterPassword(String password) {
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}
	public void clickAction() {
		loginButton.click();
	}
	
	
	

}
