package TestCases;


import org.testng.annotations.Test;


import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseClass;




public class TC002_LoginTest extends BaseClass {

    @Test
    public void verify_account_Login() {
       
            // Navigate to Home Page
            HomePage hp = new HomePage(driver);
            hp.clickLoginbtn();  
            
            // login 
      LoginPage logPage = new LoginPage (driver);
      
      logPage.EnterUsername("aamit");
      logPage.EnterPassword("amit@123");
      logPage.ClickLoginbtn();
      
            
         
           
}
}