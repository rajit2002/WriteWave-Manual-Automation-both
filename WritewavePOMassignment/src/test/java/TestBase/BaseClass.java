package TestBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseClass {

    public static WebDriver driver;
   
    @BeforeClass
    public void setup() {
       
        // Initialize Chrome WebDriver
        driver = new ChromeDriver();
       
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://write-wave-gamma.vercel.app/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
       
            driver.quit();
           
    }

   
    
    
  
  
    
}
