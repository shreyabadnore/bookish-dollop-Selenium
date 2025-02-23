package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsRightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();

		List<WebElement> rightClickOptions = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightClickOptions.size());

		for (WebElement e : rightClickOptions) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}

	}

}
