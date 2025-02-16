package StepDifinationCodeStudio;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POMcodeStudio.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SD_LoginPage extends BASE {
	
	public WebDriver driver;
	
	 public LoginPage log;
	
	
	@Before
	public void BrowserSet()
	{
		// OBJECT CREATION FOR "LOGGER" FILE 
		loger = LogManager.getLogger("SD_LoginPage");    // Inside Brackets NEED to KEEP  "CLASSNAME".
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		loger.info("Execute Browser set");
	}
	
	@After  // 'Scenario' Is  a 'Class' So Need Parameterize it 
	public void tearDown(Scenario sc) throws InterruptedException
	{
		
		
		String path ="C:\\Users\\user\\mm\\CucumberFrame\\SCREENSHOT\\shot.png";
		
		if(sc.isFailed()==true)
		{
		     TakesScreenshot shot = (TakesScreenshot)driver;
		    File Source= shot.getScreenshotAs(OutputType.FILE);
		    
		    File Target = new File(path);
		    
		    Source.renameTo(Target);
		}
		
		Thread.sleep(4000);
		driver.quit();
		
		loger.info("TearDown Executed");
	}
	
	
	
	@Given("User launch Browser")
	public void user_launch_browser() {
		
		
		
		log = new LoginPage(driver);  // *** Driver Imp Object for StepDifination
		
		loger.info("driver Executed");
	   
	}

	@When("User open Url {string}")
	public void user_open_url(String urli) {
		
		driver.get(urli);
		
	   
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String Email, String Passwd) throws InterruptedException  {
	    
		log.UserName(Email);
		Thread.sleep(2000);
		log.password(Passwd);
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
	    
		log.loginButton();
	}

	@Then("Navigate to DashBoard and PageTitle Should be {string}")
	public void navigate_to_dash_board_and_page_title_should_be(String ExpectedTitle) {
	   
		String Actual=driver.getTitle();
		System.out.println("Actual==="+Actual);
		
		Assert.assertEquals(Actual,ExpectedTitle);
		
		loger.info("driver Executed");
	}

	//@Then("Close the Brower")
	public void close_the_brower() {
		
		//driver.close();
		loger.info("driver Executed");
	   
	}
	
	
	// Datadriven
	
//	@Given("User launh Browser")
//	public void user_launh_browser() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		log = new LoginPage(driver);  // *** Driver Imp Object for StepDifination
//	   
//	    
//	}

	@When("user open Url {string}")
	public void user_open_uri(String urles) {
	    driver.get(urles);
	}

	@When("user Enter SearchName as {string}")
	public void user_enter_search_name_as(String Text) {
	    
		log.Search(Text);
	}

	@When("User Click On Search button")
	public void user_click_on_search_button() {
	   
		log.ClickT();
		
	}
	
	
	
	
	// 2nd feature file 
	
	@When("User open uri")
	public void user_open_uri() {
		
		driver.get("https://testautomationpractice.blogspot.com/");
	    
	}

	@When("User enter Name")
	public void user_enter_name() {
	    
		log.name1();
	}

	@When("User Email")
	public void user_email() {
		
		log.Email1();
	   	}

	@When("User select Gender")
	public void user_select_gender() {
		log.Gender1();
	}

	@When("User select Day as Sunday")
	public void user_select_day_as_sunday() {
		log.Sunday1();
	}

	@When("User Select Country as Germany")
	public void user_select_country_as_germany() {
		log.DropDown1();
	   
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    
	
		
	}





}
