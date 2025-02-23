package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownHandlingWithFaceBook {
	
	static WebDriver driver;
	

	public static void main(String[] args) {

		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
			
		
		By day=By.id("day");
		By month=By.id("month");
		By year=By.id("year");
		
//		WebElement dayEle= driver.findElement(day);
//		WebElement monthEle= driver.findElement(month);
//		WebElement yearEle= driver.findElement(year);
//		
//		Select selectday =new Select(dayEle);
//		selectday.selectByVisibleText("12");
//		
//		Select selectmonth=new Select(monthEle);
//		selectmonth.selectByVisibleText("Jul");//since the value 3 is added hence mearch is selected
//		selectmonth.selectByValue("3");
//		
//		Select selectyear=new Select(yearEle);
//		selectyear.selectByVisibleText("2010");
//		
		//doSelectDropDownByIndex(day, 5);
		doSelectDropDownByVisibleText(day, "5");
		doSelectDropDownByVisibleText(month, "Oct");
		doSelectDropDownByVisibleText(year, "1995");
		printDropDownOptionsText(day);
		printDropDownOptionsText(month);
		printDropDownOptionsText(year);
		
		
		
		
	}
	//drop down uitility
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);	
	}
public static void doSelectDropDownByVisibleText(By locator, String VisibleText ) {
	Select select=new Select(getElement(locator));
	select.selectByVisibleText(VisibleText);
}

public static void doSelectDropDownByValue(By locator, String value ) {
	Select select=new Select(getElement(locator));
	select.selectByValue(value);
}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void printDropDownOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
	
	
	

}
