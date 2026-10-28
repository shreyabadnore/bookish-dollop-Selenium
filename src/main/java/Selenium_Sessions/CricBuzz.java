package Selenium_Sessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzz {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/170103/afg-vs-ind-1st-t20i-afghanistan-vs-india-in-india-2026");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> listOfRuns = driver.findElements(By.xpath("(//div[contains(@class,'scorecard-bat-grid')]/div[2])[position() > 1 and position() <= 11]"));
		listOfRuns.size();
		System.out.println("Total matches are: " + listOfRuns.size());

		List<WebElement> listOfPlayers = driver.findElements(By.xpath("(//div[contains(@class,'scorecard-bat-grid')]/div[1]//span[contains(@class,'hover:underline')])[position() <= 10]"));
		int maxRuns = 0;
		String playerName = "";

		for (int i = 0; i < listOfRuns.size(); i++) {

			int currentRuns = Integer.parseInt(listOfRuns.get(i).getText());

			if (currentRuns > maxRuns) {

				maxRuns = currentRuns;
				playerName = listOfPlayers.get(i).getText();
			}
		}

		System.out.println("Highest Runs: " + maxRuns);
		System.out.println("Player: " + playerName);

	}

}
