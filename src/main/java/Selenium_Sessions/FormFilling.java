package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {	
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Kartik");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jain");
		
		driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/input")).sendKeys("kartik123@gmail.com");
		 
		driver.findElement(By.cssSelector("label.custom-control-label")).click();
	
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("Maths");
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/child::div[@class='col-md-9 col-sm-12']//child::input[@id='hobbies-checkbox-3']"));
		driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
	
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
	}

}
