package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPageTest {

	public static void main(String[] args) {
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initializeDriver("chrome");
		br.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(br.getPageTitle());
		System.out.println(br.getPageURL());
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		
		elementUtil er= new elementUtil(driver);
		er.doSendKeys(email, "shreya@gmail.com");
		er.doSendKeys(password, "shreya@123");
		
		//br.quitBrowser();
		
	
		

	}

}
