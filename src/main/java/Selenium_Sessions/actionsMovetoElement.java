package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMovetoElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");

		//WebElement addons = driver.findElement(By.xpath("//div[text()='Add-ons']"));

		//WebElement visaServices = driver.findElement(By.xpath("//div[text()='Visa Services']"));

//		
//		Actions act=new Actions(driver);
//		
//		act.moveToElement(addons).perform();
//		
//		Thread.sleep(2000);
//		visaServices.click();

		By addLoc = By.xpath("//div[text()='Add-ons']");
		By visaServicesLoc = By.xpath("//div[text()='Visa Services']");
		handleTwoLevelSubMenuHandling(addLoc, visaServicesLoc);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void handleTwoLevelSubMenuHandling(By parentMenuLocator, By childMenuLocator) {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		getElement(childMenuLocator).click();

	}

}
