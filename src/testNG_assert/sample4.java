package testNG_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample4
{

	
	
	

	@Test
	public void method2()
	{
		String act = "HELLO";
		String exp= "hello";
		
		
		Assert.assertNotEquals(act, exp);
		
		
		
	}
	
	
	
	
	
	
}
