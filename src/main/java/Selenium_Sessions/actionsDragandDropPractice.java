package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDragandDropPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://bestvpn.org/html5demos/drag/");

		WebElement sourceEle = driver.findElement(By.xpath("//a[@id='one']"));
		
		WebElement targetEle = driver.findElement(By.xpath("//div[@id='bin']"));

		Actions act = new Actions(driver);
//		act.clickAndHold(sourceEle).moveToElement(targetEle)
//
//				.release().build().perform();
		act.dragAndDrop(sourceEle, targetEle).build().perform();

	}

}
