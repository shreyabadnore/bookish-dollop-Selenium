package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquerydropdownpractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette\\\"");

		driver.findElement(By.id("justAnInputBox1")).click();

		Thread.sleep(3000);

		List<WebElement> choices = driver
				.findElements(By.xpath("//div[@id='comboTree196395DropDownContainer']/ul/li//input[@type='checkbox']"));
		
		WebElement test = driver.findElement(By.xpath("//div[@id='comboTree196395DropDownContainer']/ul/li//input[@type='checkbox']"));
		
		System.out.println(choices.size());

	}

}
