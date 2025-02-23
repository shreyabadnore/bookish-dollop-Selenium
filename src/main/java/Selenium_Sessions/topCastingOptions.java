package Selenium_Sessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class topCastingOptions {

	public static void main(String[] args) {
		
		//valid but it is only for the specific browser
		
		ChromeDriver driver6=new ChromeDriver();
		driver6.getTitle();
		driver6.findElement(null);
		driver6.findElements(null);
		
		

		// 1. Valid and recommended

		WebDriver driver = new ChromeDriver();
		driver.get(null);
		driver.getCurrentUrl();
		driver.getTitle();
		driver=new EdgeDriver();
		driver=new FirefoxDriver();
		
		

		// 2SD=new CD
		//only 2 menthods are accessible
		//valid but not recommended

		SearchContext driver1 = new ChromeDriver();
		driver1.findElement(null);
		driver1.findElements(null);
		
		//3. remote wd
		//valid and recommemded
		
		RemoteWebDriver driver2=new ChromeDriver();
		driver2.get(null);
		driver2.close();
		driver.findElement(null);
		driver2.findElements(null);
		
		//4. WD and RWD
		
		//only to run tc on remote machine- grid, server,docker,container
		//used only for remote machine
		//WebDriver driver3=new RemoteWebDriver();
		//driver3.get(null);
		//driver3.get(null);
		//driver3.getTitle();
		
		//5//searchcontext=nRWD
		
		//SearchContext driver4=new RemoteWebDriver();
		//driver4.findElement(null);
		//driver4.findElements(null);
		
		
		//6.
		
		ChromiumDriver driver5=new ChromeDriver();
		driver5.close();
		driver5.findElements(null);
		

		
		
		
		
		
		

	}

}
