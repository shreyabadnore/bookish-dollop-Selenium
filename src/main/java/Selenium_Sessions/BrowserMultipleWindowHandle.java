package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='facebook logo']"));
		driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
		driver.findElement(By.xpath("//img[@alt='youtube logo']"));
		
		Set<String> handles = driver.getWindowHandles();		

		Iterator<String> it = handles.iterator();
		
		Thread.sleep(1500);


	}

}
