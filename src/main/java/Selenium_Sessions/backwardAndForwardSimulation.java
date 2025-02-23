package Selenium_Sessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class backwardAndForwardSimulation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());//google
		
		//driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to(new URL("https://www.amazon.com/"));
		
		//driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());//amazon
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());//amazon
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//google
		
		driver.navigate().refresh();
		
		//bad practise to use the refresh
		
		//what are the various navigation commands available and how will you simulate the back and forward?/
		//we have two simulation methods .back and .forward
		
		//back and forward will only work when we will use driver.navigateto
		//there is no difference between .get and .to method both are doing same thing
		
		//get-inp is string url
		//to-inp string url
		
		//calling navigate .to is calling get method
		
		//what is the difference between navigate.to and get
		
		//only diff is both are same
		//to is calling get method internally
		// to is overloaded to string url and to url url
		//get(String url)
	}

}
