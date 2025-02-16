package POMcodeStudio;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POM_PRACTICALITY {
	
	public WebDriver ldriver;
	
	// Constructor
	public POM_PRACTICALITY (WebDriver rdriver )
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	//Locators
	@FindBy(xpath="//input[@id=\"name\"]") WebElement Name;
	@FindBy(xpath="//input[@id='email']") WebElement Email;
	@FindBy(xpath="//input[@id='male']") WebElement Male;
	

	
	//ActionsMethods // FOR AUTOMATION
	
	public void setName(String name)
	{
		Name.sendKeys(name);
	}
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setMale()
	{
		Male.click();
	}
	
	// ActionsMethods For SaucerLabs
	
	@FindBy(xpath="//input[@id='user-name']") WebElement Username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//input[@id='login-button']") WebElement login;
	@FindBy(xpath="//button[normalize-space()='Open Menu']") WebElement openMenu;
	@FindBy(xpath="//a[@id='about_sidebar_link']") WebElement About;
	
	public void setUserName(String username)
	{
		Username.sendKeys(username);
	}
	
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void setLogin()
	{
		login.click();
	}
	
	public void setOpenMenu() 
	{
		openMenu.click();
	}
	
	public void setAbout() throws InterruptedException
	{
		Thread.sleep(2000);
		
//		try {
//			About.click();
//		} catch (Exception e)
//		{
//			
//		}
//		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click()", About);
		
	}
	
}








