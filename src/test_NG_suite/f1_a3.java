package test_NG_suite;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class f1_a3 
{
	@Test
	public void method5()
	{
		Assert.fail();
		Reporter.log("running method m5", true);
		
	}
	
	@Test
	public void method6()
	{
		
		Reporter.log("running method m6", true);
		
	}
	
	
}
