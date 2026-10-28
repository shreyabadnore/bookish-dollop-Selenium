package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jstestingacademy.co.in/qa-demo/alerts/windows.html?utm_source=chatgpt.com");// parent window

		driver.manage().window().maximize();
		Thread.sleep(3000);

		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.id("tab-button")).click();
		driver.findElement(By.id("tab-button")).click();
		driver.findElement(By.id("tab-button")).click();

		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(2000);

		/*
		 * Iterator<String> it = handles.iterator();//method from set interface iterator
		 * 
		 * while (it.hasNext()) { String windowId = it.next();
		 * driver.switchTo().window(windowId); System.out.println("window url: " +
		 * driver.getCurrentUrl());
		 * 
		 * Thread.sleep(1500);
		 * 
		 * if (!windowId.equals(parentWindowId)) { driver.close(); }
		 */

		for (String windowId : handles) {

			driver.switchTo().window(windowId);

			System.out.println("Window URL: " + driver.getCurrentUrl());

			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowId);

		System.out.println("Parent window title: " + driver.getTitle());

		// Step 7: Close the remaining browser window
		driver.quit();

	}

	/*
	 * driver.switchTo().window(parentWindowId);
	 * System.out.println("parent window title: "+ driver.getTitle());
	 */

}
