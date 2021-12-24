package test_NG_suite;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_1_sample3 
{
	@Test 
	public void tc5()
	{
		
		Reporter.log("running tc5", true);
		
		
	}
	
	@Test 
	public void tc6()
	{
		Assert.fail();
		Reporter.log("running tc6", true);
		
		
	}
}
