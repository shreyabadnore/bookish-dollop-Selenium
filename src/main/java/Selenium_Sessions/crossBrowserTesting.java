package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossBrowserTesting {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:

			System.out.println("Pls pass the valid browser name");
			throw new RuntimeException("=====Invalid Browser======");

		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("This is the page Title" + title);
		if (title.equals("Account Login")) {
			System.out.println("Title is correct--pass");
		}

		else {

			System.out.println("Title is not correct");
		}

		String pageurl = driver.getCurrentUrl();
		if (pageurl.contains("route=account/login")) {
			System.out.println("this is right login url");
		} else {
			System.out.println("Invalid login url");
		}

		driver.quit();

	}

}
