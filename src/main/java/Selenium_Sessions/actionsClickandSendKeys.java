package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClickandSendKeys {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement firstNameEle=driver.findElement(By.id("input-firstname"));
//		WebElement agreeCheckBox=driver.findElement(By.name("agree"));

//		
//		act.sendKeys(firstNameEle, "Testing").build().perform();
//		
//	act.click(agreeCheckBox).build().perform();

		By fn = By.id("input-firstname");
		By agree = By.name("agree");
		doActionsSendKeys(fn, "shreya");
		doActions(agree);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, CharSequence... value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();

	}

	public static void doActions(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}
