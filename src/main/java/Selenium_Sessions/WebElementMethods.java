package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://sauce-demo.myshopify.com/account/login");

            WebElement email = driver.findElement(By.id("customer_email"));
            WebElement password = driver.findElement(By.id("customer_password"));

            email.sendKeys("standard_user");
            password.sendKeys("secret_sauce");

            WebElement signIn = driver.findElement(
                By.xpath("//input[@value='Sign In']")
            );

            System.out.println("Displayed: " + signIn.isDisplayed());
            System.out.println("Enabled: " + signIn.isEnabled());

            if (signIn.isDisplayed() && signIn.isEnabled()) {
                signIn.click();
            }

        } finally {
            driver.quit();
        }
    }
}

