package POMcodeStudio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;


public class LoginPage {
	
	public WebDriver  ldriver;  
	
	
	//1)Constructor Should be "public"
	public LoginPage(WebDriver rdriver) // parameterister CONSTRUCTOR
	{
		ldriver = rdriver;     // Assigning RemoteWebdDrive OBJECT i.e rdriver to LocalWebDriver i.e ldriver
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	//2)Locator
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement user;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement Pass;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login;
	
	
	
	
	//3) ActionMethods
	
	public void UserName(String useri)
	{
		user.sendKeys(useri);
		
	}
	
	public void password (String pd)
	{
		Pass.sendKeys(pd);
	}
	
	public void loginButton()
	{
		login.click();
	}
	
	
	// Datadriven
	
	@FindBy(xpath="//input[@placeholder='Search']") WebElement SearchTab;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") WebElement ClickButton;
	
	
	public void Search (String Searchtab)
	{
		SearchTab.sendKeys(Searchtab);	
		}
	
	public void ClickT()
	{
		ClickButton.click();
	}
	
	
	//  Elements And Methods for " https://testautomationpractice.blogspot.com/"
	

	
	@FindBy(xpath="//input[@id='name']") WebElement Name;
	@FindBy(xpath="//input[@id='email']") WebElement Email;
	@FindBy(xpath="//input[@id='female']") WebElement Gender;
	@FindBy(xpath="//input[@id='sunday']") WebElement Sunday;
	@FindBy(xpath="//select[@id='country']") WebElement Dropdown;
	
	public  void name1()
	{
		Name.sendKeys("Praveen");
	}
	
	public  void Email1()
	{
		Email.sendKeys("padigamPraveen@Gmail.com");
		
	}
	public  void Gender1()
	{
		Gender.click();
	}
	public  void Sunday1()
	{
		Sunday.click();
	}
	public  void DropDown1()
	{
		
		Select sel = new Select (Dropdown);
		sel.selectByVisibleText("Germany");
		
}
	
	
	
}













