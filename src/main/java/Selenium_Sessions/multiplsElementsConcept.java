package Selenium_Sessions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplsElementsConcept {

	static WebDriver driver;
public static void main(String[] args
	) {

		// totalLinks: <a>
		// printtext of the each link if the text is available (avoid the blank text)

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));// findelements we will never perform any
																			// action on it

		System.out.println("Total Links" + allLinks.size());

		for (int i = 0; i < allLinks.size(); i++) {
			// System.out.println(allLinks.get(i).getText());

			String linkText = allLinks.get(i).getText();
			if (linkText.length() != 0) {
				System.out.println(linkText);
			}

		}

		System.out.println("____________");

		for (WebElement e : allLinks) {
			String textlink = e.getText();
			if (textlink.length() != 0) {
				System.out.println(textlink);
			}
		}

	}
}
