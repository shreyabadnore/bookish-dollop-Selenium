package Selenium_Sessions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsScrolling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions act = new Actions(driver);

		// partialScrolling
//	act.sendKeys(Keys.PAGE_DOWN).perform();
//	
//	Thread.sleep(3000);
//	act.sendKeys(Keys.PAGE_UP).perform();
////	
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(3000);
//
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();

	
		//scroll to the specific page
		act.scrollToElement(driver.findElement(By.linkText("OpenCart")))
		.pause(200)
		.click(driver.findElement(By.linkText("OpenCart")))
		.build().perform();
	
	
	
	
	
	
	}

}
