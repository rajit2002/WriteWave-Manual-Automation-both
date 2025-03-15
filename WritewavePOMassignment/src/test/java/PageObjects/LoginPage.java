package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	
	public LoginPage(WebDriver driver) {
		
		super (driver);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbtn;

//	======action======
	
	public void EnterUsername(String username) {
		Username.sendKeys("amit");
	}
	
	public void EnterPassword(String password) {
		Password.sendKeys("amit@123");
	}

	
	public void ClickLoginbtn() {
		Loginbtn.click();
	}

	
	
		
	
	
	
	
		
	


}
