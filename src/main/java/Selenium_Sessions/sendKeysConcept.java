package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysConcept {

		static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			WebElement firstNameEle = driver.findElement(By.id("input-firstname"));
			WebElement lastNameEle = driver.findElement(By.id("input-lastname"));

			
			String name = "Shreya";
			StringBuilder sb = new StringBuilder("Automation");
			StringBuffer sf = new StringBuffer("In Progress");
			String space = " ";
			
			
			String name1="Meghal";
			
			StringBuilder sb1= new StringBuilder("Kartik");
			
			
			firstNameEle.sendKeys(name, space, sb, space, sf, space, "selenium");
			lastNameEle.sendKeys(name1, space, sb1);
			//lastNameEle.sendKeys(null);
			
			//character sequence is a parent interface of string string buffer and string builder
			//null is not allowed in the sendkeys#####

	}

}
