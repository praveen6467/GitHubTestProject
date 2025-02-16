package RunnerClassForCS;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;                  // This is testNg
import io.cucumber.testng.AbstractTestNGCucumberTests;      // This is testNg

//import io.cucumber.junit.Cucumber;               // *** This are JUNIT 
//import io.cucumber.junit.CucumberOptions;      // *** This are JUNIT 

/*
 *1) tags ="@Sanity"  ---> It will Rin Scenario Which is tagged with 'Sanity',Does not matter if it has Other Tag's as well.
 * 2)tags ="@Sanity or @regression"        -----> will run scenario with tagged with Sanity or regression
 * 3)tags ="@Sanity and @regression"        -----> will run scenario with tagged with Sanity as well as regression
 * 4)tags ="@Sanity and not @regression"    -----> will run scenario with tagged with Sanity but not regression
 */

//@RunWith(Cucumber.class)                 // *** This are JUNIT 
@CucumberOptions(
		

// 1)** If you want to execute all  'featureFiles ' then fallow this step	
//        	features = ".//FeaturesCodeStudio/",    Only Folder name enough
		
// 2)** If you want Execute Selected featurefile than fallow this Step	 [ CURL BRACKET For Multiple Features Files]	
  features = {".//FeaturesCodeStudio/2OHRM_Admin.feature" ,".//FeaturesCodeStudio/1OHRMlogin.feature"}, 		
		
//		       features = ".//FeaturesCodeStudio/2OHRM_Admin.feature" ,        
				glue = "StepDifinationCodeStudio",       // cammas imp
				dryRun = false,
				monochrome = true,
				tags ="@Sanity  and not @regression",
				plugin = {"pretty","html:target/Cucumber-reports/report1.html"}
		
		)

//plugin = {"pretty","html:target/Cucumber-reports/report1.html"}
//plugin = {"pretty","json:target/Cucumber-reports/report_json.json"}
// plugin = {"pretty","junit:target/Cucumber-reports/report_xml.xml"}  // it open with 'xml editor'

public class RFOHRMlogin extends  AbstractTestNGCucumberTests {

	// This CLASS Should be Empty . We need  write in CUCUMBER OPTIONS only
	
}










