package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("automation");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("google");
		
		driver.switchTo().parentFrame();// go to immediate parent
		driver.findElement(By.id("jex")).sendKeys(".framework");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys(".scenarios");

		driver.switchTo().defaultContent();
		String header=driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
	}

}
