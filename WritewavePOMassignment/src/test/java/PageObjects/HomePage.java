package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	
		
		public HomePage(WebDriver driver) {
			super(driver);
		}
		
		
		
		@FindBy(xpath="//a[normalize-space()='Register']")
		WebElement ragisterbtn;
		
		@FindBy(xpath="//a[normalize-space()='Login']")
		WebElement Loginbtn;
		

		public void clickRegisterbtn() {
			ragisterbtn.click(); 
		}
		
		public void clickLoginbtn() {
			Loginbtn.click(); 
		}
		




}
