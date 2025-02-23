package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsmovetoelementonNaveenAutomationLabs {
	
	//move to Element

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement dsktp = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));

		Actions act = new Actions(driver);
		act.moveToElement(dsktp).build().perform();

		Thread.sleep(2000);
		mac.click();

	}

}
