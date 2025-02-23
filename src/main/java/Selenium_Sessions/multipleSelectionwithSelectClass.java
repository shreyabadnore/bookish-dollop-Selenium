package Selenium_Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelectionwithSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement dropdownEle = driver.findElement(By.xpath("//select[@multiple]"));
		Select select = new Select(dropdownEle);

		System.out.println(select.isMultiple());// it will tell if the options is multiple or not

		if (select.isMultiple() == true) {
			System.out.println("Multiple select is possible");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Lesser flamingo");		
		}
		select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();

	}

}
