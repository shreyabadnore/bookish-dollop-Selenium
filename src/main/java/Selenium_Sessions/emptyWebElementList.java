package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class emptyWebElementList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		List<WebElement> myList=driver.findElements(By.className("shreya"));
		
		System.out.println(myList.size());//0
		
		System.out.println(myList);//empty list
		
		//find elements wont throw any exception
		
		driver.findElement(By.className("shreya")).click();
		
		//what is the difference between find element and find elements
		
		//FE is used to find the single element but FES is used to find multiple elements
		//rtn type of FE is single WEbelement FES will rtn list of webelements
		//if the element is not available fe will rtn no such element exception but FES will empty list
	}

}
