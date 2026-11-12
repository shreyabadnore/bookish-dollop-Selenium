package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		WebElement privacyPolicy=driver.findElement(By.cssSelector("a.agree"));
		
		driver.findElement(RelativeLocator.with(By.name("agree")).toRightOf(privacyPolicy)).click();
		driver.close();
		
		
	}

}
