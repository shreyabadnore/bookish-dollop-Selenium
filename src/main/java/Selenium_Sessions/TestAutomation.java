package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Shreya");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Shreya@1234");
		
		WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("5437632435");
		
		WebElement address=driver.findElement(By.xpath("//textarea[@id='textarea']"));
		address.sendKeys("5437632435");
		
		//gender
		
		WebElement male=driver.findElement(By.xpath(""));
;
		

		
		
		
		
		
		
	
		
		
		
	
	}
}
