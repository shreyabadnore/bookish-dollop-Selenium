package Selenium_Sessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webTableHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");

		List<String> joeDetails = getUserDetailsList("Joe.Root");
		System.out.println(joeDetails);

		List<String> johnDetails = getUserDetailsList("John.Smith");
		System.out.println(johnDetails);

		if (johnDetails.contains("Admin")) {
			System.out.println("john is admin -- pass");
		}

	}

	public static void selectUser(String userName) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']")
	    ));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
	    checkbox.click();
	}

	public static List<String> getUserDetailsList(String userName) {
		// a[text()='Joe.Root']/parent::td/following-sibling::td
		List<WebElement> colList = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));

		List<String> colValueList = new ArrayList<String>();// []

		for (WebElement e : colList) {
			String text = e.getText();
			colValueList.add(text);
		}

		return colValueList;
	}

}
