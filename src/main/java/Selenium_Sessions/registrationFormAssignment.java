package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationFormAssignment {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initializeDriver("chrome");
		br.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		System.out.println(br.getPageTitle());
		System.out.println(br.getPageURL());

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm = By.id("input-confirm");

		elementUtil er = new elementUtil(driver);
		er.doSendKeys(firstname, "shreya");
		er.doSendKeys(lastname, "meghal");
		er.doSendKeys(email, "shreya@gmail.com");
		er.doSendKeys(telephone, "12345");
		er.doSendKeys(password, "shreya@123");
		er.doSendKeys(confirm, "shreya@123");

	}

}
