package Selenium_Sessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yash.com/");
		
		
		driver.findElement(By.xpath("//li[@id='menu-item-16627']")).click();
		Thread.sleep(3000);
		Set<String> handle=driver.getWindowHandles();
		System.out.println(handle);
		
		driver.quit();
		


	}

}
