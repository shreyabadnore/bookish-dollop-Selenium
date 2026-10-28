package TestngPractise;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg {
	
	@BeforeSuite
	public static void testt1() {
		System.out.println("I am in t1");
	}
	
	@Test
	
	public static void testt2() {
		System.out.println("I am in t2");
	}
	

}
