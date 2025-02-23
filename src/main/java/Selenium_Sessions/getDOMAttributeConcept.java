package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getDOMAttributeConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		WebElement email=driver.findElement(By.id("input-email"));
//		
////		String placeholderValue=email.getAttribute("placeholder");
////		System.out.println(placeholderValue);
//		
//		String placeholder=email.getDomAttribute("placeholder");
//		System.out.println(placeholder);
//		
//		String outerhtmlvalue=email.getDomProperty("outerHTML");
//		System.out.println(outerhtmlvalue);
//		
//		System.out.println("-----");
//		email.sendKeys("shreya@gmail.com");
//		//get text method wont work for the text fields
//		
//		String text=email.getDomProperty("value");
//		
//		System.out.println(text);}
		
		
		//dom=value
		//property=value
		
		//whatever we have entered in the text field i want to fetch it use getdomproperty method
		
		
		By emailId=By.id("input-email");
		
		System.out.println(doGetDomAttribute(emailId,"placeholder"));
		
		getElement(emailId).sendKeys("shreya@gmail.com");
		System.out.println(doGetDomProperty(emailId, "value"));
		
		
		
	}
		
		
		public static String doGetDomAttribute(By locator, String attrName) {
			return getElement(locator).getDomAttribute(attrName);
		}
		
		
		
		public static String doGetDomProperty(By locator, String propName) {
			return getElement(locator).getDomProperty(propName);
		}
		
		
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		

}
