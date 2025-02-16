package POM;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class first {

	
	@BeforeClass
	void logout()
	{
		
	}
	
	
	
	@Test
	void testing()
	{
		System.out.println("one");
	}  
	
	@Test
	void test()
	{
		System.out.println("two");
		
		System.out.println("three");
	}
	
}
