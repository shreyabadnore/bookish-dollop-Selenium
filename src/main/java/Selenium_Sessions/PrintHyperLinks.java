package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHyperLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());

		for (WebElement e : list) {
			String href = e.getDomAttribute("href");
			System.out.println(href);
		}

	}

}
