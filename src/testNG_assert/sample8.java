package testNG_assert;

import org.junit.Assert;
import org.testng.annotations.Test;

public class sample8
{

	@Test
	public void tc()
	{
		
		boolean act = true;
		
		Assert.assertFalse(act);
		
		
	}
	
}
