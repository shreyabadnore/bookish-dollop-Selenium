package Selenium_Sessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://jstestingacademy.co.in/qa-demo/alerts/windows.html");

        Thread.sleep(3000);

        // Store the parent window ID
        String parentWindowId = driver.getWindowHandle();

        // Open three child windows
        driver.findElement(By.id("tab-button")).click();
        driver.findElement(By.id("tab-button")).click();
        driver.findElement(By.id("tab-button")).click();

        // Get all window IDs
        Set<String> handles = driver.getWindowHandles();

        Thread.sleep(2000);

        Iterator<String> it = handles.iterator();

        while (it.hasNext()) {

            String windowId = it.next();

            // Switch to the current window
            driver.switchTo().window(windowId);

            System.out.println("Window URL: " + driver.getCurrentUrl());

            if (!windowId.equals(parentWindowId)) {

                driver.close();

            }
        }

        // Switch back to the parent window
        driver.switchTo().window(parentWindowId);

        System.out.println("Parent window URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}
	

	



