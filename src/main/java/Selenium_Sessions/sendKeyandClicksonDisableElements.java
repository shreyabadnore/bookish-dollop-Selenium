package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeyandClicksonDisableElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement pwd=driver.findElement(By.id("pass"));//disabled key
		//pwd.sendKeys("test@123");//exception element not interactable exception
		
		
		pwd.click();//no exception nothing will happen
		
		//to check element is really disabled or not
		
		String isElementDisabled=pwd.getDomAttribute("disabled");
		
		System.out.println(isElementDisabled);//true
		
		
		

	}

}
