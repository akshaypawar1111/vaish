package testNG_assert;

import org.junit.Assert;
import org.testng.annotations.Test;

public class sample9_1_assertNull 
{

	
	
	@Test
	public void method1()                         //assertNull
	{
		
		String a1= null;
		
		Assert.assertNull(a1);
		
		
	}
	
	
	
	@Test
	public void method2()                         //assertNotNull
	{
		
		String a2= "akshay";
		
		Assert.assertNotNull(a2);
		
		
	}
	
	
	
	
	
	
	
	
}
