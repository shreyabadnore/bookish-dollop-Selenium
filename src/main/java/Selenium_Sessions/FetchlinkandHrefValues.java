package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchlinkandHrefValues {
	
	//Interview Question on printing href value and src value
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		List<WebElement> allimages=driver.findElements(By.tagName("img"));
		for(WebElement e: alllinks) {
			
			String href=e.getDomAttribute("href");
			System.out.println(href);
			
			
			System.out.println("--Img Data----");
			
			for(WebElement k: allimages) {
				
				String srcvalue=k.getDomAttribute("src");
				System.out.println(srcvalue);
				
			}
			
			
			
		}
		
	}

}
