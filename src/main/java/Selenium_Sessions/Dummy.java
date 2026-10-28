package Selenium_Sessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummy {
	
	static WebDriver driver;
    public static void main(String[] args) {
   
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        // Search for "ber"
        driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("ber");

        // Wait for product results to be visible
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".products-wrapper .product")));

        // Add all items with "ber"
        List<WebElement> addButtons = driver.findElements(By.xpath("//div[@class='product-action']/button"));
        for (WebElement button : addButtons) {
            button.click();
        }

        // Proceed to cart
        driver.findElement(By.cssSelector("a.cart-icon")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        // Apply promo code
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode"))).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        // Wait for promo message
        WebElement promoMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        System.out.println("Promo Message: " + promoMsg.getText());

        // Validate discount
        String totalAmount = driver.findElement(By.cssSelector(".totAmt")).getText();
        String discountedAmount = driver.findElement(By.cssSelector(".discountAmt")).getText();

        if (!totalAmount.equals(discountedAmount)) {
            System.out.println("Discount applied successfully.");
        } else {
            System.out.println("Discount failed.");
        }

        // Place order
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        // Select country and proceed
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("select"))).sendKeys("India");
        driver.findElement(By.cssSelector("input.chkAgree")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();

        // Validate final confirmation message
        WebElement confirmationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".wrapperTwo")));
        if (confirmationMsg.getText().contains("Thank you, your order has been placed successfully")) {
            System.out.println("Order placed and validated successfully.");
        } else {
            System.out.println("Order placement validation failed.");
        }

        driver.quit();
    }
}

