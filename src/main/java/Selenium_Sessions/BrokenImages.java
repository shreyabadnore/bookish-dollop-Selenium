package Selenium_Sessions;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/broken_images");
        driver.manage().window().maximize();

        List<WebElement> images = driver.findElements(By.tagName("img"));

        System.out.println("Total Images: " + images.size());

        for (WebElement image : images) {

            String imageUrl = image.getAttribute("src");

            try {

                @SuppressWarnings("deprecation")
				URL url = new URL(imageUrl);

                HttpURLConnection connection =
                        (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("HEAD");

                connection.connect();

                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("Broken Image: " + imageUrl);
                    System.out.println("Response Code: " + responseCode);
                } else {
                    System.out.println("Valid Image: " + imageUrl);
                    System.out.println("Response Code: " + responseCode);
                }

                connection.disconnect();

            } catch (Exception e) {

                System.out.println("Unable to check: " + imageUrl);
                System.out.println(e.getMessage());
            }
        }

        driver.quit();
    }
}
