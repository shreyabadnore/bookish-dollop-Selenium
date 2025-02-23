package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BS Connect with DB
//BT Create User
//BC launchBrowser

	 
	//BM LoginToApp
	//Title Test
	//AM Logout

//BM LoginToApp
//url Test
//AM Logout

	//AC closeBrowser
	//AT closeBrowser

public class TestingAnnotations {

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS Connect with DB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT Create User");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println(" BC launchBrowser");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM LoginToApp");
	}

	@Test

	public void titleTest() {
		System.out.println("Title Test");
	}

	@Test
	public void urlTest() {
		System.out.println("url Test");
	}

	@Test
	public void SearchTest() {
		System.out.println("search Test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM Logout");

	}

	@AfterClass
	public void closeBrowesr() {
		System.out.println("AC closeBrowser");

	}

	@AfterTest
	public void deleteUser() {
		System.out.println(" AT closeBrowser");

	}

	@AfterSuite

	public void disconnectDB() {
		System.out.println("AS disconnectDB");
	}

}
