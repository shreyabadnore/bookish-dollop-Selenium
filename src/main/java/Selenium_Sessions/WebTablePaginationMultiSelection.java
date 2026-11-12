package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationMultiSelection {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		while (true) {

			// element on the first page
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {

				selectMultipleCountries("India");

			}

			// pagination logic click on the next button

			WebElement next = driver.findElement(By.cssSelector("button.next"));
			System.out.println("Clicking on the next");

			if (next.getDomAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over ...country is not found...");
				break;
			}
			next.click();
			Thread.sleep(1000);

		}

	}

	public static void selectCountry(String countryName) {

		driver.findElement(By.xpath("//tr[td[normalize-space()='" + countryName + "']]//input[@type='checkbox']"))
				.click();
	}

	public static void selectMultipleCountries(String countryName) {
		driver.findElements(
				By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']")).stream()
				.forEach(e -> e.click());

	}

}
