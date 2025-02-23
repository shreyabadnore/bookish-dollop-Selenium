package Selenium_Sessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_Basics {

	public static void main(String[] args) {
		// 1.Open browser(chrome,ff,safari,edge,id)
		// 2.enter url
		// 3.get title
		// 4.verify the actual title is as per expected title
		// 6.close the browser

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		// https protocol is imp while entering the url always take : to //
		// if https is not entered it will give the invalid argument exception either
		// enter http or https
		String title = driver.getTitle();

		System.out.println("The page title:" + title);

		// Validation testing//checkpoint:- Automation
		// Testing+Validation(checkpoint/assertion) Testing=Automation Testing

		if (title.equals("Google")) {
			System.out.println("Test is Pass");
		} else {
			System.err.println("Fail");// print in red
		}

		driver.quit();

	}

}
