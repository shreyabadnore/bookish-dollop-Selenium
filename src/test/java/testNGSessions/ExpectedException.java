package testNGSessions;

import org.testng.annotations.Test;

public class ExpectedException {
	
	String name;
	
	@Test(expectedExceptions= {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
		ExpectedException obj=null;
		obj.name="tom";//NPE
	}

}
