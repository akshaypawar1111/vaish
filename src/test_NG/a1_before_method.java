package test_NG;

import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a1_before_method 
{

	
	
	
	@BeforeMethod         //beforeMethod will execute before executing the Test method/tc
	public void login()
	{
		
		Reporter.log("login the application", true);
	}
	
	
	
	
	
	
	@Test
	public void tc1()
	{
		
		
		Reporter.log("running TC1", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
