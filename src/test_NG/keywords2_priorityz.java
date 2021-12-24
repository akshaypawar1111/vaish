package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords2_priorityz 
{



	@Test(priority = 1)          //priority 
	public void TC1()
	{
		Reporter.log("running TC1", true);
		
	}
	
	@Test(priority = -1)           //priority -1  ..this will run first
	public void TC2()
	{
		Reporter.log("running TC2", true);
		
	}
	
	
	@Test                          //if we dont give priority to method then this will be considered as by default zero
	public void TC3()
	{
		Reporter.log("running TC3", true);
		
	}
}
