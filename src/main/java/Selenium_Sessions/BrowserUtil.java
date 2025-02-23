package Selenium_Sessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;// default value is null

	public WebDriver initializeDriver(String browserName) {
		System.out.println("browser name is:" + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		default:
			throw new RuntimeException("Pls pass the right browser");

		}
		return driver;

	}

	public void launchurl(String url) {
		// if we are using contains there is no gurante the https will be at the start
		// of the url hence indexof is used instead of contains
		if (url == null) {
			throw new RuntimeException("==url can not be null");
		}

		if (url.length() == 0) {
			throw new RuntimeException("url can not be blank or empty");
		}

		if (url.indexOf("https") == 0) {
			driver.get(url);
		} else {

			throw new RuntimeException("==Invalid browser: either https/http is missing in the url==");

		}

	}
	
	
		public void launchurl(URL url) {
			if(url==null) {
				throw new RuntimeException("url can not be null");
			}
		if(String.valueOf(url).indexOf("https")==0) {
			driver.navigate().to(url);
		
		}
		else {
			throw new RuntimeException("invalid url http/s is missing");
			
			
		}
		}
		
	
	
	
	
	

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("your page title is:" + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("your page url is:" + url);
		return url;
	}

	public void closeBrowser() {
		System.out.println("Bowser is closed");
		driver.close();
	}

	public void quitBrowser() {
		System.out.println("Bowser is quit");
		driver.quit();
	}
	
	

}
