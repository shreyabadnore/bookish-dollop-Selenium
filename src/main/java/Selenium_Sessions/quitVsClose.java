package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitVsClose {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//enter url

		driver.get("https://www.google.com");
		
		//get page title

		String title = driver.getTitle();
		System.out.println("page title" + title);

		if (title.equals("Google")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		String url = driver.getCurrentUrl();
		{
			System.out.println("page url" + url);
		}

		driver.quit();// close the browser

		System.out.println(driver.getTitle());

	}

}
