package test_NG_suite;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a1_s1
{

	
	
	@BeforeMethod
	 public void login()
	 {
		Reporter.log("logging in", true);
		
	 }
	
	
	
	
	
	@Test
	public void tc1()
	{
		
		Reporter.log("running tc1 from s1", true);
		
	}
	
	
	

	@Test
	public void tc2()
	{
		
		Reporter.log("running tc2 from s1", true);
		
	}
	
	
	@AfterMethod
	public void logout()
	 {
		Reporter.log("logging out", true);
		
	 }
	
	
	
	
	
	
	
}
