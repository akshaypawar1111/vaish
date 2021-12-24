package test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a2_after_method
{

	
	@BeforeMethod        //beforemethod - it will execute before the execution of test method
	public void login()
	{
		Reporter.log("login the application", true);
		
	}
	
	
	@Test
	public void TC1()
	{
		Reporter.log("running TC1", true);
		
	}
	
	
   @Test
	public void TC2()
	{
		Reporter.log("running TC2", true);
		
	}
	
	@AfterMethod       //beforemethod - it will execute after the execution of test method

	public void logout()
	{
		Reporter.log("logout the application", true);
		
	}
	
	@BeforeClass               //beforeClass  - it will execute before execution of test class
	public void ssssssssss()
	{
		Reporter.log("ssssssssssssssss", true);
		
	}
	
	
	
	
	
}
