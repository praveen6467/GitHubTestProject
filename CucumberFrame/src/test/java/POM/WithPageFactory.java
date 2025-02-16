package POM;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * * Two ways to create PageClass  1) Without pagefactory 2) With PageFactory
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
 */

public class WithPageFactory {
	
	WebDriver driver ;
	
	
	//1)Constructor
	WithPageFactory (WebDriver driver) //***** Constructor name Start with ClassNAME only.
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);    // *** PageFactory is predifinedclass which is provided by 'selenium webdriver' and it contains 'init' METHODS
	                                             // 'initElement' is a method which will iniciate all the elements using 'driver' . it will act as DRIVER.
	
	}

	
	// 2)Locator  // locator of withoutPageFactory
	//By text_UserName  =  By.xpath("//input[@placeholder='Username']");  // we can also write " By.id("password"); 

	//2) Locator // locator of PageFactory
	
	
	@FindBy(xpath="//input[@name='username']")  WebElement txt_usename;  
	
	@FindBy(xpath="//input[@placeholder='Password']")       // ** Here finding element and Storing in 'WebElement Variable'
	WebElement txt_password;                                   
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement txt_login;
	
	
	// ** for Group of WebElements we need to write like this
	@FindBy(tagName="a") List<WebElement> Links;
	

/* we can also write for id,name tagnames
 * //@FindBy(id="//input[@name='username']")  WebElement txt_usename; 
	//@FindBy(name="//input[@name='username']")  WebElement txt_usename; 	
 */
	
	
	//Action Methods
	
//	 public void setUserName (String user)
//	 {
//		 driver.findElement(text_UserName).sendKeys(user);
//	 }
	
	 public void setUserName (String user)
	 {
		 txt_usename.sendKeys(user);
	 }
	 
	
	 public void password (String pwd)
	 {
		 txt_password .sendKeys(pwd);
	 }
	 
	 
	 public void clicklogin()
	 {
		 
		 txt_login.click();
	
	 }
	
}









