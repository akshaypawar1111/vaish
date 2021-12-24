package test_NG_suite;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failed_1_sample1 
{

	
	@Test 
	public void tc1()
	{
		
		Reporter.log("running tc1", true);
		
		
	}
	
	@Test 
	public void tc2()
	{
		Assert.fail();
		
		Reporter.log("running tc2", true);
		
		
	}
	
	
	
	
	
	
	
}
