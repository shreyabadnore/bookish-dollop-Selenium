package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "firefox";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:

			System.out.println("Pls pass the roght browser name");
			throw new RuntimeException("-----Invalid Browser Name");

		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String title = driver.getTitle();
		System.out.println("Page Title" + title);

		if (title.equals("Account Login")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Titile is incorrect");
		}

		String pageurl = driver.getCurrentUrl();
		if (pageurl.contains("route=account/login")) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test Fail");
		}
		driver.quit();
	}

}
