package Selenium_Sessions;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = waitForTitleContains("Register", 5);
		System.out.println(title);

		title = waitForTitleIs("Register Account", 10);
		System.out.println(title);
	}

	public static String waitForTitleContains(String fractionTitle, long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		if (wait.until(ExpectedConditions.titleContains(fractionTitle))) {
			return driver.getTitle();
		}

		return null;

	}

	public static String waitForTitleIs(String title, long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		

		return null;

	}

}






