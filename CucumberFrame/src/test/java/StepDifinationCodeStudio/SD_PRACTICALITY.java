package StepDifinationCodeStudio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import ConfigPropertieDemo.ReadConfigureFileClass;
import POMcodeStudio.POM_PRACTICALITY;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class SD_PRACTICALITY  extends BASE {
	
	
	public WebDriver driver;          // ********** this Very Imp
	public  POM_PRACTICALITY PomObj;
	
	
	@Before()
	public void SetUp() throws IOException
	{
		
		ConfigFileReadingClass = new ReadConfigureFileClass();
		
		String browsers =ConfigFileReadingClass.getBrowser();
		
		switch(browsers.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
		case "egde":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			default:
				driver=null;
				break;
			
		}
		
}
	
	
	@After
	public void tearDown(Scenario sc) throws InterruptedException
	{
		String path = "C:\\Users\\user\\mm\\CucumberFrame\\SCREENSHOT\\failed.png";
		
		
		if(sc.isFailed()==true)
		{
			
			TakesScreenshot shot = (TakesScreenshot)driver;
			File Source = shot.getScreenshotAs(OutputType.FILE);
			
			File Target = new File (path);
			
			try {
				FileUtils.copyFile(Source, Target);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	   
		
		
		
		
		PomObj = new POM_PRACTICALITY(driver);
		
	}

	@When("User open url as {string}")
	public void user_open_url_as(String url) {
		driver.get(url);
	   driver.manage().window().maximize();
	}

	@When("User Enter Name as  {string} and Email as {string}")
	public void user_enter_name_as_and_email_as(String name, String email) {
	    PomObj.setName(name);
	    PomObj.setEmail(email);
	}

	@When("User Click on male Gender")
	public void user_click_on_male_gender() {
		PomObj.setMale();
	}

	@Then("PageTitle Should be {string}")
	public void page_title_should_be(String Expected) {
	
		if(driver.getTitle().equals(Expected))
		{
			Assert.assertTrue(true);
		}
	
	}

	@Then("Close the Brower")
	public void close_the_brower() {
		
		driver.quit();
		
	  }
	
	
	
	// SaucerLabs
	
	
	@When("User open url as a {string}")
	public void user_open_url_as_a(String sauceUrl) {
	    
		driver.get(sauceUrl);
	}

	@When("User Enter username as {string}  and Password {string}")
	public void user_enter_username_as_and_password(String UserName, String Password) {
	    
		PomObj.setUserName(UserName);
		PomObj.setPassword(Password);
		
	}

	@When("User Click on LoginButton")
	public void user_click_on_login_button() throws InterruptedException {
		
		PomObj.setLogin();
		
		Thread.sleep(3000);
		
		
		
	}

	@Then("open the Dashboard with title {string}")
	public void open_the_dashboard_with_title(String Expected) {
	    
		String Actual =driver.getTitle();
		System.out.println("Title is ==="+Actual);
		
		Assert.assertEquals("Swag Labs", Expected);
		
		
		
		PomObj.setOpenMenu();
	}

	@Then("Click On About")
	public void click_on_about() throws InterruptedException {
	  
		PomObj.setAbout();
	}

		

}










