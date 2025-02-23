package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class actionsSignature {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
	
		WebElement canvas=driver.findElement(By.id("signature-pad"));
		
		Actions act=new Actions(driver);
		
		Action signatures=act.click(canvas)
		.moveToElement(canvas, 40, 89)
		.clickAndHold(canvas)
		.moveToElement(canvas, -300, -89)
		.moveByOffset(50, -50)
		.moveByOffset(90, 67)
		.moveByOffset(34, 65)
		.build();
		
		signatures.perform();
		
		
	}

}
