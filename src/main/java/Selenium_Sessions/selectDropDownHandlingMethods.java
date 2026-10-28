package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownHandlingMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		//drop down---htmltag=<select>---option
		//select class
		
		By counrty=By.id("Form_getForm_Country");
		
		WebElement countryEle=driver.findElement(counrty);
		
		Select select=new Select(countryEle);
		select.selectByIndex(8);
		select.selectByVisibleText("Australia");//best option to use
		select.selectByValue("Brazil");//attribute value is supposed to be supply
		
	}

}
