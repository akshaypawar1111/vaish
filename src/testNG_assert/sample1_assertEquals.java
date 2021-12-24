package testNG_assert;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import org.testng.annotations.Test;

public class sample1_assertEquals           //assertEquals()
{

	
	
	@Test
	
	public void tc1()
	{
		
		
		String a1="AKSHAY";
		
		String a2="AKSHAY";
		
		Assert.assertEquals(a1, a2);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
