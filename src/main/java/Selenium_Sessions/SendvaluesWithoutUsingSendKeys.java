package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendvaluesWithoutUsingSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.google.co.in/");

		WebElement search = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

		js.executeScript("arguments[0].value='Shreya'", search);

	}

}
