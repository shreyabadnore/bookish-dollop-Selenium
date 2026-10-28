package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create the web element+perform an action on it(click, sendkeys, gettext,
		// isdisplayed..)
		// to create the web element use find element = click,sendkeys, gettext
		// By is a class in java (always use B capital) methods are static in nature

		// 1.
		// driver.findElement(By.id("input-email")).sendKeys("shreya@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("shreya@123");

		// 2.

		// WebElement emailID_ele=driver.findElement(By.id("input-email"));

		// WebElement password_ele=driver.findElement(By.id("input-password"));

		// emailID_ele.sendKeys("shreya@gmail.com");
		// password_ele.sendKeys("shreya@213");

		// emailID_ele.sendKeys("abc@gmail.com");
		// password_ele.sendKeys("abc@213");

		// 3. By Locator: object repository

//		By email=By.id("input-email");
//		By password=By.id("input-password");
//		
//		WebElement mailId=driver.findElement(email);
//		WebElement passwor=driver.findElement(password);
//		mailId.sendKeys("shreya@gmail.com");
//		passwor.sendKeys("abc@123");

		// 4.By locator+ generic function for WebElement
//
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(email).sendKeys("shreya@gmail.com");
//		getElement(password).sendKeys("abc@123");

//		// 5. By locator +generic function for webelement + generic function for Sendkeys
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(email, "shreya@gmail.com");
//		doSendKeys(password, "shreya@123");
		
		//6. By locator+generic function for Webelement+ generic function for action sendkeys in element util class
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		elementUtil eu=new elementUtil(driver);
		eu.doSendKeys(password, "shreya@123");
		eu.doSendKeys(email, "shreya@gmail");
		
		
	}

//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//
//	}
//
//	// call by reference
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//
//	}

}
