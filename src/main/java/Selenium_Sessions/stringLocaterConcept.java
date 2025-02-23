package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stringLocaterConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String email_id = "input-email";
		String password_id = "input-password";
		String login_button_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		
//		doSendKeys(getLocator("ID", email_id), "abc@gmail.com");
//		doSendKeys(getLocator("ID", password_id), "abc@123");
//		doClick(getLocator("XPATH", login_button_xpath));
		
		doSendKeys("ID", email_id, "shreya@gmail.com");
		doSendKeys("ID", password_id, "shreya@123");
		doClick("XPATH", login_button_xpath);

	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}
	
	public static void doClick(String lcoatorType, String locatorvalue) {
		
		getElement(getLocator(lcoatorType, locatorvalue)).click();

	}
	
	

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}
	
	public static void doSendKeys(String locatorType, String locatorvalue, String value) {
		getElement(getLocator(locatorType, locatorvalue)).sendKeys(value);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static By getLocator(String locatorType, String locatorValue) {
		
		By locator = null;

		switch (locatorType.toUpperCase().trim()) {
		case "ID":
			locator=By.id(locatorValue);
			break;
			
		case "NAME":
			locator=By.name(locatorValue);
			break;

		case "CLASSNAME":
			locator=By.className(locatorValue);
			break;

		case "LINKTEXT":
			locator=By.linkText(locatorValue);
			break;

		case "PartialLinkText":
			locator=By.partialLinkText(locatorValue);
			break;

		case "Xpath":
			locator=By.xpath(locatorValue);
			break;

		case "CSS Selector":
			locator=By.cssSelector(locatorValue);
			break;
 
		case "TagName":
			locator=By.tagName(locatorValue);
			break;

		default:

			System.out.println("invalid locator, pls use right locator");
			break;
		}
		return locator;

	}

}
