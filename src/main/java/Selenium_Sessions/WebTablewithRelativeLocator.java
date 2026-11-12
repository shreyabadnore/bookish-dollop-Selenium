package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebTablewithRelativeLocator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/#content");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement ele=driver.findElement(By.linkText("Joe.Root"));
		driver.findElement(RelativeLocator.with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(ele)).click();

		String aboveuser=driver.findElement(RelativeLocator.with(By.tagName("a")).above(ele)).getText();
		System.out.println(aboveuser);
		
		String belowuser=driver.findElement(RelativeLocator.with(By.tagName("a")).below(ele)).getText();
		System.out.println(belowuser);
		
		driver.close();
		
		
		
	}

}
