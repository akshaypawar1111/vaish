package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disable_TC_2_using_include           //disable tc using test suite
{
	@Test
	public void m1()
	{
		
		Reporter.log("running m1", true);
		
	}
	
	
	
	@Test
	public void m2()
	{
		
		Reporter.log("running m2", true);
		
	}
	
	
	
	@Test
	public void m3()
	{
		
		Reporter.log("running m3", true);
		
	}
	
	
	@Test
	public void m4()
	{
		
		Reporter.log("running m4", true);
		
	}
	
}
