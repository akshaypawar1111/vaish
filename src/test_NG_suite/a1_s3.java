package test_NG_suite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class a1_s3 
{

	@Test
	public void tc5()
	{
		
		Reporter.log("running tc5 from s3", true);
		
	}

	
	
	
	
	@Test(priority = -1)
	public void tc6()
	{
		
		Reporter.log("running tc6 from s3", true);
		
	}
	
}
