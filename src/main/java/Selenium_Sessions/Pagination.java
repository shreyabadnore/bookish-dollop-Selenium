package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@id='HTML8']")).click();

		for (int i = 1; i <= 4; i++) {

			WebElement page = driver.findElement(By.xpath("//a[text()='" + i + "']"));
			page.click();

			System.out.println("Clicked on the page" + i);

			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));

			for (WebElement row : rows) {
				String priceText = row.findElement(By.xpath("./td[3]")).getText();

				double price = Double.parseDouble(priceText.replace("$", ""));

				if (price > 10) {
					row.findElement(By.xpath("./td[4]/input")).click();
					
				}
			}
		}

	}

}
