package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		System.out.println(driver.getTitle());
		driver.quit();
	}

}
