package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords2_priorityzz
{

	@Test(priority = 1)           //DUPLICATE priority then it will run alphabatically/sereally
	public void TC1()
	{
		Reporter.log("running TC1", true);
		
	}
	
	@Test(priority = 1)          
	public void TC2()
	{
		Reporter.log("running TC2", true);
		
	}
	
	
	@Test                       
	public void TC3()
	{
		Reporter.log("running TC3", true);
		
		

		
	}
}
