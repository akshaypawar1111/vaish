package test_NG;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords4_dependsOn_method2 
{
	
	@Test()
	public void login() throws InterruptedException
	{

		Assert.fail();             //assert is a class which contains static method fail which is used to forcefully fail the tc/method
		
		Reporter.log("login successful", true);
	}
	
	
	
	
	@Test(dependsOnMethods = {"login"})
	public void logout()
	{
		
		Reporter.log("logout successful", true);
	}
}
