package testNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=0)
	public void aTest() {
		System.out.println("a Test");

	}

	@Test(priority=0)
	public void ATest() {
		System.out.println("A Test");

	}

	@Test(priority=0)
	public void cTest() {
		System.out.println("c Test");

	}

	@Test(priority=0)
	public void dTest() {
		System.out.println("d Test");

	}

	@Test(priority=0)
	public void eTest() {
		System.out.println("e Test");

	}

}
