package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords4_dependsOn_method 
{

	@Test//(timeOut = 2000)
	public void login() throws InterruptedException
	{
	//	Thread.sleep(5000);
		Reporter.log("login successful", true);
	}
	
	
	
	
	@Test(dependsOnMethods = {"login"})      //that logout depends on login// if login fails then it will not execute logout becau.... 
	public void logout()
	{
		
		Reporter.log("logout successful", true);
	}
	
	
	
	
	
	
	
	
	
	
	
}
