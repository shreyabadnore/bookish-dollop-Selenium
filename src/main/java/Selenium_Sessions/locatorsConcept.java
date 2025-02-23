package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsConcept {
	
	static WebDriver driver;
	//there are total 8 locaters in selenium

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. id:attribute
		driver.findElement(By.id("input-firstname")).sendKeys("shreya");
		
		//2. Name:attribute can be duplicate
		driver.findElement(By.name("lastname")).sendKeys("testing");
		
		//3. Class name: class attribute can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("shreya@gmail.com");
		//it will check from the top the moment it finds the specific element where the class is exactly equal to the whatever we have given if the element is available it will perform the action
		//in selenium it will not give the error
		
		//4. xpath:is not an attribute it is the address of an element inside the DOM
			driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("123456789");
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("shreya@gmail.com");
	
			//if id is available we will always go with the id
			
			//for x path it depends from use case to use case
			
			//always go with id if id and xpath both are available
		
			//5. Css selector it is an locator not an attribute approach to intract with an element
			
			driver.findElement(By.cssSelector("#input-password")).sendKeys("shreya@1234");
			driver.findElement(By.cssSelector("#input-confirm")).sendKeys("shreya@1234");
			
			//6. LinkedText: only for links:all the links are having "a" tag
				//htmltag=<a>
			
			driver.findElement(By.linkText("Login")).click();
			//driver.findElement(By.linkText("Register")).click();
	
			//partial LinkText: only for links htmltag=
			driver.findElement(By.partialLinkText("Forgotten")).click();
			//when the long para text is available use partial link text
			
			//8. Tag name
			
			String forgotpasswdheader=driver.findElement(By.tagName("h1")).getText();
			System.out.println(forgotpasswdheader);
	
	
	
	
	
	
	
	}

}
