package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> footerlist = driver.findElements(By.xpath("//footer//a"));

		System.out.println(footerlist.size());
		for (WebElement e : footerlist) {

			System.out.println(e.getText());
		}

		// get the footer links and print the text of each link on the console

	}

}
