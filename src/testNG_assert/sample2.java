package testNG_assert;

import org.testng.Assert;
import org.testng.annotations.Test;



public class sample2
{

	
	@Test
	public void tc2()
	{
		String act = "AKSHAY";
		String exp= "akshay";
		
		
		
		Assert.assertEquals(act, exp);
		
		
	}
	
	
	
	
	
}
