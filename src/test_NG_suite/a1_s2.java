package test_NG_suite;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a1_s2 
{

	

	@Test
	public void tc3()
	{
		
		Reporter.log("running tc3 from s2", true);
		
	}
	
	
	
	

	@BeforeMethod
	public void demo()
	{
		
		Reporter.log("running demo", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
