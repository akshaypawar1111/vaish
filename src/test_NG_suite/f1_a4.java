package test_NG_suite;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class f1_a4 
{
	@Test
	public void method7()
	{
		
		Reporter.log("running method m7", true);
		
	}
	
	@Test
	public void method8()
	{
		Assert.fail();
		Reporter.log("running method m8", true);
		
	}
	
	@Test
	public void method9()
	{
		
		Reporter.log("running method m9", true);
		
	}
	@Test
	public void method10()
	{
		Assert.fail();
		Reporter.log("running method m10", true);
		
	}
	
}
