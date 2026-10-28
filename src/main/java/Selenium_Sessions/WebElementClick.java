package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementClick {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");

		By fullName = By.id("Form_getForm_Name");
		By emailId = By.id("Form_getForm_Email");
		By phone = By.id("Form_getForm_Contact");
		By getYourFreeTrial = By.id("Form_getForm_action_submitForm");
		By header = By.className("form-title");
//		
//		driver.findElement(fullName).sendKeys("shreya");
//		driver.findElement(emailId).sendKeys("shreya@gmail.com");
//		driver.findElement(phone).sendKeys("1234");
//		driver.findElement(getYourFreeTrial).click();

		// String head=driver.findElement(header).getText();
		// System.out.println(head);

		doSendKeys(fullName, "shreya");
		doSendKeys(emailId, "shreya@gmail.com");
		doSendKeys(phone, "9898765432");
		doClick(getYourFreeTrial);

		String headerText = dogetText(header);
		System.out.println(headerText);

	}

	public static String dogetText(By locator) {

		return getElement(locator).getText();

	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
