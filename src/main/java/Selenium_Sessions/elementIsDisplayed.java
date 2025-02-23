package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//boolean flag=driver.findElement(By.id("input-email")).isDisplayed();
		
		By email=By.id("input-email11");
		if(doElementIsDisplayed(email)) {
			getElement(email).sendKeys("sheya@gmail.com");
			
		}
		else {
			System.out.println("ele is not found");
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	

}
