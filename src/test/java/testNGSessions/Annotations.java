package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeClass
	public static void beforeSuite() {
		System.out.println("Hi i am in beforeclass");
	}
	
	@Test
	public static void testt1() {
		System.out.println("Hi you are in test t1");
	}

	@Test
	public static void testt2() {
		System.out.println("Hi you are in test t2");
	}
	
	@Test(dependsOnMethods="testt1")
	public static void testt3() {
		System.out.println("Ho you are in test t3");
	}
	
	@AfterClass
	public static void afterSuite() {
		System.out.println("Hi you are in afterclass");
	}

}
