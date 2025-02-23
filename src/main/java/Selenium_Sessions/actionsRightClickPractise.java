package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsRightClickPractise {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		
		WebElement rightClick=driver.findElement(By.xpath("//div[@id='div-context']"));
		
		Actions act=new Actions(driver);//dont have the no args constructor
		act.contextClick(rightClick).build().perform();
		
		List<WebElement> rightClickOptions = driver.findElements(By.xpath("//ul[@id='menu']//li"));
		System.out.println(rightClickOptions.size());
		
		for(WebElement e: rightClickOptions) {
			String text=e.getText();
			System.out.println(text);{
				if(text.equals("C")){
					e.click();
					break;
					
				}
			}
		}
		
		
	
	}

}
