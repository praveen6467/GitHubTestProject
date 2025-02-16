package POM;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

public class LoginTestWithoutPageFactory {

	
	
	// ***** Need To Create "WebDriver" driver 'variable' for All classes
   WebDriver driver;   // it is must
   
   
   
   @BeforeClass
   void setUp ()
   {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   
   }
	
	
   @Test
 public  void testLogin() throws InterruptedException
  {   
	 //*** here we need to create 'OBJECT' for POC ,
	   //Once we created 'Constructor' it will invoke by 'Object'
	   // ** We can also execute with "xml" file
	   
	/*1)Here  WithoutPageFactory And WithPageFactory are the CLASSES .so,For This Classes We Are Creating OBJECT .
	 * 2) By Using OBJECT we Can INVOKE All Methods From ClASSES   
	 */
	   
          
	   //   WithoutPageFactory lp = new WithoutPageFactory (driver);  // *** if you i have DOUBT about Driver than see video at 1:01:30 
	   WithPageFactory lp = new WithPageFactory(driver);    // ****Driver is vvip       
	  lp.setUserName("Admin"); 
	  lp.password("admin123");
	  Thread.sleep(7000);
	  lp.clicklogin();
	  
	
	  
	
	  
	}
   
	
  @AfterClass
 public  void tearDown()
  {
	  driver.quit();
  }
  
}
