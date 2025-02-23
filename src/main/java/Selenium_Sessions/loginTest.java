package Selenium_Sessions;

public class loginTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initializeDriver("chrome");
		brUtil.launchurl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		if (title.equals("Account Login")) {
			System.out.println("title -- passed");
		} else {
			System.out.println("title --fail");
		}

		String url = brUtil.getPageURL();
		{
			if (url.contains("route=account/login")) {
				System.out.println("login url is correct");
			}
			brUtil.closeBrowser();
		}

	}

}
