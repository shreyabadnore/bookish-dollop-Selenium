package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownWithoutSelectTag {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			driver.get("https://www.cardekho.com");
			
			Thread.sleep(4000);
			
			driver.findElement(By.id("vehicleTypeName")).sendKeys("MUV");
			driver.findElement(By.xpath("//li[contains(text(),'SUV')]")).click();
	}

}
