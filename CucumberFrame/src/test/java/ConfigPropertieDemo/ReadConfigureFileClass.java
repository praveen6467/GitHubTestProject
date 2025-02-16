package ConfigPropertieDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/* What is Properties?
		 * A) Properties file in Selenium is a Plain Notepad File that are used to Store & HardCoded Values (eg.Browser,URL, UserId,Password).
		 * Properties File Store in Key_Value  i,e. Browser = chrome.
		 * For Comments :-- ! or # .
		 * 
		 */


public class ReadConfigureFileClass {
	
	Properties properties;   // **** To Read Propertie File in Java , We Have One Class Called "Properties"
    // **** By Creating Object for Propertie Class we can Read Propertie File.
	
 String  ConfigFilePath =	"C:\\Users\\user\\mm\\CucumberFrame\\src\\test\\java\\ConfigPropertieDemo\\Configure.properties";
 
 
      //**** Constructor based on class name
 public ReadConfigureFileClass() throws IOException
 {
	 properties = new Properties();
	 
	 try {
		FileInputStream file =  new FileInputStream(ConfigFilePath); // To Open 'Configure File' in Input and Load the File
		
		properties.load(file);  // To Load File We Use Load method.
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 
 }

 
//***** To READ Each "KEY" Value Need To Create One 'ReturnTypeMethod' .
	//  ***** Return Type Method to get Values from Config file
 
    public String getBrowser()
 {
	 String url =properties.getProperty("browser");   // ***** "Key" Should be in Double Quotations
   if(url!=null)
	   return url;
   else
	   throw new RuntimeException("Browser is not present in ConfigureFile");
	 
 }
 
 
}











