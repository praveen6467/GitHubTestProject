  package RunnerClassForCS;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//FeaturesCodeStudio/PRATICALITY.feature",
		glue = "StepDifinationCodeStudio",
		dryRun = false,
		monochrome = true,
		tags = "@Regression and @Sanity",
		plugin = {"pretty","html:target/Cucumber-reports/Report1.html" }
				
		)





public class RF_Practical {
	

}
