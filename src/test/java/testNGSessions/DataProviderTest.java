package testNGSessions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] getTestbData() {
		
		return new Object[] [] {
			{4, 5,  9},
			{3, 4, 7},
			{-4, -4, -8},
			{0, 3, 3}
		};
		
	}
	
	
	@Test(dataProvider="getTestData")
	public void addTest(int num1, int num2, int expSum) {
		int actsum=add(num1, num2);
		Assert.assertEquals(actsum, expSum);
	}

	
	public int add(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}

}
