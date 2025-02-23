package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBrowserUseCases {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver=new FirefoxDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//it will enter the url in firefix
		
		driver=new ChromeDriver();
		driver.quit();// last browser will be closed

	}

}
