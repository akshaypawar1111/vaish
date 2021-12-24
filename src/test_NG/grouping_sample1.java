package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class grouping_sample1       //grouping of tc   --testNG groups is used to group all the tc/test methods 
{                                 


	@Test(groups="login")
	public void m1()
	{
		
		Reporter.log("running m1", true);
		
	}
	
	
	
	@Test(groups = "login")
	public void m2()
	{
		
		Reporter.log("running m2", true);
		
	}
	
	
	
	@Test(groups = "home page")
	public void m3()
	{
		
		Reporter.log("running m3", true);
		
	}
	
	
	@Test(groups = "home page")
	public void m4()
	{
		
		Reporter.log("running m4", true);
		
	}
	
	
	
	@Test(groups = "home page")
	public void m5()
	{
		
		Reporter.log("running m5", true);
		
	}
	
	
	@Test(groups = "logout")
	public void m6()
	{
		
		Reporter.log("running m6", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
