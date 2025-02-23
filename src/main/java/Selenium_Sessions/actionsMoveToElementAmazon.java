package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsMoveToElementAmazon {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		WebElement all=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		//WebElement bestSellers=driver.findElement(By.xpath("//a[@class='hmenu-item']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(all).build().perform();
		all.click();
		Thread.sleep(2000);
		//bestSellers.click();
	
		
		
		
		
		

	}

}
