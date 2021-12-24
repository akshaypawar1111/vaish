package test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keywords3_timeOut
{

	
	@Test(timeOut = 5000)    //it will wait for 5sec(any) and then it will mark the method as failed if method does not run /passed when method runs and will execute the further methods     
	public void TC1() throws InterruptedException
	{
		Thread.sleep(6000);
		
		Reporter.log("running TC1", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
