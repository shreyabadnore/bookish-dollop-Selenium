package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionsMethodChainingAssignmentAmazon {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_5l00737rji_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=15");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act=new Actions(driver);
		
		Action action=act.sendKeys(Keys.TAB)
				.pause(500)
				.sendKeys(Keys.TAB)
				.pause(500)	
				.sendKeys(Keys.TAB)
				.pause(500)	
				.sendKeys(Keys.TAB)
				.pause(500)	
				.sendKeys(Keys.TAB)
				.pause(500)	
				.sendKeys(search, "macbook")
				.pause(500)
				.sendKeys(Keys.ENTER)
				
				.build();
				action.perform();
		
	}

}
