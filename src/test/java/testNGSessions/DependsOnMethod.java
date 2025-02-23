package testNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void loginTest() {
		System.out.println("login Test");
		
	

	}
	
	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("home Test");
		
		

	}
	
	@Test(dependsOnMethods="homeTest")
	public void cartTest() {
		System.out.println("cart Test");

	}

}
