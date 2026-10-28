package Selenium_Sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mmt {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();

		Thread.sleep(300);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");

		String currentDate = "19Aug26";
		System.out.println("Current date: " + currentDate);
		Thread.sleep(400);
		String uiDate = driver.findElement(By.xpath("//span[@class='selectedDateField appendBottom8']")).getText();
		System.out.println(uiDate);

		List<WebElement> dates = driver.findElements(By.xpath(
				"//div[@class='DayPicker-Month'][.//div[contains(text(),'August 2026')]]//div[contains(@class,'DayPicker-Day') and @aria-disabled='false']"));
		System.out.println(dates.size() + "Dates");

		int minPrice = Integer.MAX_VALUE;
		String cheapestDate = "";
		WebElement cheapestDateElement = null;

		for (WebElement date : dates) {
			String ui = date.getAttribute("aria-label");

			System.out.println(date.getAttribute("outerHTML"));

			String price = date.findElement(By.xpath(".//p[contains(@class,' todayPrice')]")).getText();

			int pric = Integer.parseInt(price.replace(",", ""));

			if (pric < minPrice) {
				minPrice = pric;
				cheapestDate = ui;
				cheapestDateElement = date;

			}
		}

		System.out.println("Cheapest date: " + cheapestDate);
		System.out.println("Cheapest price: " + minPrice);
		
		if (cheapestDateElement != null) {
		    cheapestDateElement.click();
		}

	}

}
