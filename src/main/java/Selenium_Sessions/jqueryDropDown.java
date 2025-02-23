package Selenium_Sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette\"");
		By choiceDropDown = By.id("justAnInputBox");
		By choices = By.xpath(
				"//h3[text()='Multi Selection']/following-sibling::div//span[contains(@class,'comboTreeItemTitle')]");

		// tc1 for Sing;e Choice
		// selectchoice(choiceDropDown, choices, "choice 3");

		// t2 multiple choice

		// selectchoice(choiceDropDown, choices, "choice 2 2", "choice 2", "choice 7");

		// t3 select all choices
		selectchoice(choiceDropDown, choices, "all");

	}

	/**
	 * this method is handling single/multipls and all choices selection pls pass
	 * all to select all the choices
	 * 
	 * @param choiceDropDown
	 * @param choices
	 * @param choiceValue
	 * @throws InterruptedException
	 */

	public static void selectchoice(By choiceDropDown, By choices, String... choiceValue) throws InterruptedException {

		driver.findElement(choiceDropDown).click();

		Thread.sleep(3000);
		List<WebElement> choicesList = driver.findElements(choices);
		System.out.println(choicesList.size());

		if (choiceValue[0].equalsIgnoreCase("all")) {
			for (WebElement e : choicesList) {
				e.click();

			}

		} else {

			for (WebElement e : choicesList) {
				String text = e.getText();
				System.out.println(text);

				for (String ch : choiceValue) {
					if (text.equals(ch)) {
						e.click();
					}

				}

			}

		}

	}
}
