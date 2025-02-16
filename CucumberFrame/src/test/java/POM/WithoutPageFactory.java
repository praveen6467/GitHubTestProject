package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* 
 * PageFactory is basically a Class which provided by SeleniumDriver itself
 * 
 * 
 * Two ways to create PageClass  1) Without pagefactory 2) With PageFactory
 * 1) Without pagefactory  we have to fallow :-- 
 *  a) By().method       b)findelement
 * 2) With PageFactory     we have to fallow :-- 
 *  a) @FindBy  annotation  b)PageFactory.initElement (). This initElements Method will create all webElements
 * 
 * 
 * Every POC Has 3 Parts
 * 1)Constructor  :- It will Inciate the driver //***** Constructor name Start with Class name only
 * 2)Locators     :-  Where we put all all Xpath ,id, names ,tagname etc.
 * 3) Action methods  :- By using locators we can perform Actions.
 * 
 * 
 * 
 * 
 * 
 */

public class WithoutPageFactory {
	
	
	WebDriver driver ;
	
	//1) Constructor
	public WithoutPageFactory (WebDriver driver)        //***** Constructor name Start with ClassName only
	{
		this.driver = driver;               // this keyword indicate that driver is a Class driver 
	}
	
	
	
	/*
	 *  driver.findElement(By.xpath("WithoutPageFactory"));
	 *  Here  --> "findElement" is a 'METHOD'  and 'driver' is a Class
	 *  ---------> (By.xpath("WithoutPageFactory"))  is a 'locator' 
	 */
	
	//2) Locator :-- For Every 'locator' we need to CREATE 'ACTION METHOD'
	// Here we need to Store 'locator' in "By"  Variable
	 By text_UserName  =  By.xpath("//input[@placeholder='Username']");  // we can also write " By.id("password");

	 By text_password  =By.xpath("//input[@placeholder='Password']");       // we can also write " By.name("password");
	 By text_login  =By.xpath("//button[normalize-space()='Login']");
	          
	
	
	 // 3) Action Method : -  It Should be 'PUBLIC' so we can Access from anywhere  from Application
	 
	 
	 public void setUserName (String user)
	 {
		 driver.findElement(text_UserName).sendKeys(user);
	 }
	 
	
	 public void password (String pwd)
	 {
		 driver.findElement(text_password).sendKeys(pwd);
	 }
	 
	 
	 public void clicklogin()
	 {
		 
		driver.findElement(text_login).click();
	 }
	 
	 
	 
	 
	 
	
}









