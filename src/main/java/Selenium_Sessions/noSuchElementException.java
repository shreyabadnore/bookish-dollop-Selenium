package Selenium_Sessions;


import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class noSuchElementException {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		try {
		driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");
		}
		catch(NoSuchElementException e) {
			
			//wait element
			
		}
		
		//it will give the exception it wont give true or false
			
	}

}
