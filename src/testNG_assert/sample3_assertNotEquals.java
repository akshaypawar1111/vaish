package testNG_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample3_assertNotEquals              //assertNotEquals()
{

	@Test
	public void method1()
	{
		String act = "HELLO";
		String exp= "HELLO";
		
		
		Assert.assertNotEquals(act, exp);   //if both strings are equal then it will give output fail
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
