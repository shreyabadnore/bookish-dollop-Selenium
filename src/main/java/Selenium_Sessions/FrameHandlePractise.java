package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlePractise {
	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame("frame2");
		
		String id=driver.findElement(By.id("frame1Wrapper")).getText();
		System.out.println(id);
		
		
		
	}

}
