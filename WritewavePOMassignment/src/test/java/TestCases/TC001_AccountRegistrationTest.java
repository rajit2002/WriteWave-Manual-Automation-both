package TestCases;


import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBase.BaseClass;



public class TC001_AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_account_registration() {
       
            // Navigate to Home Page
            HomePage hp = new HomePage(driver);
            hp.clickRegisterbtn();  
            
            
    AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
            
            regPage.setFirstName("aamit");
            regPage.setPassword("amit@123");
            regPage.ClickRegisterbtn();

           
}
}