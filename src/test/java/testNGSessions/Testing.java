package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void testMethod() {

		System.out.println("test method");
		int a = 10;
		int b = 20;
		int sum = a + b;

		Assert.assertEquals(sum, 30, "both are not equal");
	}

	public void divMethod() {

		System.out.println("test method");
		int a = 10;
		int b = 20;
		int div = b / a;

		Assert.assertEquals(div, 2, "both are not equal");

	}
	
	

}
