package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");// parent window
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM")).click();//child window
		
		//1.fetch the window id
		
		Set<String> handles=driver.getWindowHandles();//it will give the window handles every window has a unique id it is called window Id
		
		//how to fetch the value from the set?? 
		
		Iterator<String> it=handles.iterator();
		
		String parentWindow=it.next();//it will go the next value
		System.out.println(parentWindow);
		
		String childWindowID=it.next();
		System.out.println(childWindowID);
		
		//2.switching work
		
	driver.switchTo().window(childWindowID);
	
	System.out.println(driver.getTitle());
	driver.close();
	
	driver.switchTo().window(parentWindow);
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	driver.quit();
	

	}

}
