package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords1_invocationCount 
{

	
	
	@Test(invocationCount = 5)             //invocationCount is used to run the same test case multiple times
	public void TC1()
	{
		Reporter.log("running TC1", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
