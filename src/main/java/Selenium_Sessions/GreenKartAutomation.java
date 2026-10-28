package Selenium_Sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartAutomation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("ber");

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='product']"));

		String productName = "";

		for (WebElement product : list) {
			product.findElement(By.tagName("h4")).getText();
			if (productName.toLowerCase().contains("ber")) {
				product.findElement(By.xpath("//div[@class='product-action']/button")).click();

			}
		}

	}

}
