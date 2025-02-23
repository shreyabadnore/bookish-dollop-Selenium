package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isElementDisplayedDisabledchecked {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement pwd=driver.findElement(By.id("pass"));
		WebElement firstname=driver.findElement(By.id("fname"));
		
		boolean isdisplayed=pwd.isDisplayed();
		System.out.println(isdisplayed);//true
		
		boolean isenabled=firstname.isEnabled();
		System.out.println(firstname.isEnabled());
		System.out.println(isenabled);
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement poilcyCheckbox=driver.findElement(By.name("agree"));
		poilcyCheckbox.click();
		System.out.println(poilcyCheckbox.isSelected());//it applies to the input element only
		
	
		
	}

}
