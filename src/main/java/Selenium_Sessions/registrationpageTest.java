package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationpageTest {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		By firstname=By.id("input-firstname");
		By lastname=By.name("lastname");
		By search=By.className("form-control");
		By email=By.xpath("//*[@id=\"input-email\"]");
		By telephone=By.cssSelector("#input-telephone");
		By password=By.xpath("//*[@id=\"input-password\"]");
		By confirmpassword=By.cssSelector("#input-confirm");
		By policyCheck=By.name("agree");
		By continueu=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
			
	By successmsg=By.tagName("h1");
	
	By myaccountlink=By.linkText("My Account");
	
	elementUtil eu=new elementUtil(driver);
	eu.doSendKeys(firstname, "shreya");
	eu.doSendKeys(lastname, "meghal");
	eu.doSendKeys(search, "macbook");
	eu.doSendKeys(email, "mk@gmail.com");
	eu.doSendKeys(password, "shreya@123");
	eu.doSendKeys(confirmpassword, "shreya@123");
	eu.doSendKeys(telephone, "12234");
	eu.doClick(policyCheck);
	
	Thread.sleep(5000);
	eu.doClick(continueu);

	
	String succes=eu.doElementGetText(successmsg);
	System.out.println(succes);
	
	if(succes.contains("your account has been created")) {
		System.out.println("user is created");
	}
	else {
		System.out.println("use reg is failed");
	}
	
	eu.doClick(myaccountlink);
	

	}

}
