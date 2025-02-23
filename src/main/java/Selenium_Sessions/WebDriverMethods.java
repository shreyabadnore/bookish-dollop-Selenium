package Selenium_Sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//for entering the url we use driver.get method
		//it will rtn void
		driver.getTitle();//it will give the title of the page and will return string
		driver.getCurrentUrl();//it will give whatever the current url is going on
		String pageSource=driver.getPageSource(); //rtn type will be string
		System.out.println(pageSource);
		
		if(pageSource.contains("Account Login")) {
			System.out.println("pass");
		}
		}

	}


