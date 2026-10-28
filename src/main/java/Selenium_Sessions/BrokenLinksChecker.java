package Selenium_Sessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksChecker {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/"); 
        
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            // Skip if URL is null or empty
            if (url == null || url.isEmpty()) {
                System.out.println("URL is empty or null");
                continue;
            }

            // Skip links that are not http or https
            if (!url.startsWith("http")) {
                System.out.println("Skipping non-http URL: " + url);
                continue;
            }

            try {
            	URL urlObj = new URL(url);
            	
                // Open connection and get response code
                HttpURLConnection connection =  (HttpURLConnection) urlObj.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken link: " + url + " -> HTTP response code: " + responseCode);
                } else {
                    System.out.println("✅ Valid link: " + url + " -> HTTP response code: " + responseCode);
                }

            } catch (Exception e) {
                System.out.println("⚠️ Exception for URL: " + url + " -> " + e.getMessage());
            }
        }

        driver.quit();
    }
}
