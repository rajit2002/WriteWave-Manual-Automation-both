package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	public AccountRegistrationPage(WebDriver driver) {
		
		super (driver);
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement Registerbtn;

//	======action======
	
	public void setFirstName(String username) {
		Username.sendKeys("amit");
	}
	
	public void setPassword(String password) {
		Password.sendKeys("amit@123");
	}

	
	public void ClickRegisterbtn() {
		Registerbtn.click();
	}

	
	
		
	
	
	
	
		
	


}
