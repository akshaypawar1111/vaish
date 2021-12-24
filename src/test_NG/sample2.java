package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2
{

	
	@Test
	public void addition()
	{
		Reporter.log("running methos 1111", true);  //if we pass true , it will show result in console and emailable report
		
	}
	
	
	@Test
	public void subtraction()
	{
		Reporter.log("running methos 2222", false);  //if false/black then it will not show in console
		
	}
	
	
	
	
	
	
	
}
