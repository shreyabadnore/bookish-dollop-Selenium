package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(3000);
				
		//driver.switchTo().frame(2); //by index
		//driver.switchTo().frame("main"); //name or Id
		driver.switchTo().frame(driver.findElement(By.name("main"))); //by WebElement
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		//frame: multiple frames can be put inside the frameset tag
		//iframe: w3c
		
	
		
		
		
		
	}






	}


