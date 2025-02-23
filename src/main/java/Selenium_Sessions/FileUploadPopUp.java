package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://practice.expandtesting.com/upload");
	
	//type = file
	driver.findElement(By.id("fileInput")).sendKeys("/Users/naveenautomationlabs/Documents/userresponse.json");
	
	
	//Robot class: only for windows
	//Sikuli lib: based on image processing
	//AutoIT: only for windows
	
	
	
	
}

}


