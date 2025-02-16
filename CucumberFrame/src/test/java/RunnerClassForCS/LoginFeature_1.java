   package RunnerClassForCS;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  // *** All CucumberOptions Should be in "SMALL LETERS" ONLY.
		
		 // **** "fearures" Should be First in CucumberOptions. Other ERROR WILL
      features = {".//FeaturesCodeStudio/1LoginFeatures.feature", ".//FeaturesCodeStudio/2LoginFeature.feature"},  // //*** dot with two forwardslashes indicate project names
		glue = "StepDifinationCodeStudio",       // cammas imp
		dryRun = false ,  // 'dryRun' with 'True' will check whether all FeatureFile Step's are matching with StepDifination Step's or not . 'dryRun' with ' false' will Execute it.
		tags = "@Sanity",               
		monochrome = true,      // monochrome  with 'true' is used output with readable.
		plugin = {"pretty","html:target/Cucumber-reports/reports2.html"}       // for Reports Generation purpose.
		
		
		
		)

public class LoginFeature_1 {

// This CLASS Should be Empty . We need  write in CUCUMBER OPTIONS only
	
}





