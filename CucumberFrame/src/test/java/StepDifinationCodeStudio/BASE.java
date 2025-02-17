package StepDifinationCodeStudio;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import ConfigPropertieDemo.ReadConfigureFileClass;
import POMcodeStudio.POM_PRACTICALITY;

public class BASE {  // This ParentClass

	
	public WebDriver driver;
    public	POM_PRACTICALITY pagelog;
    
    
	public ReadConfigureFileClass  ConfigFileReadingClass;  // Object Creation For CLASS Which read 'ConfigureFile'
    
    
    
    
//	Logger log = LogManager.getLogger("ClassName");  This Is 'LOGGER' Class Object .
    public static   Logger loger ;
	
    public String generateEmaiRandom()     // Here We use 'String' Because it is a 'RETURNTYPE'
    {
    	return(RandomStringUtils.randomAlphabetic(6));
    }
    
    
}









