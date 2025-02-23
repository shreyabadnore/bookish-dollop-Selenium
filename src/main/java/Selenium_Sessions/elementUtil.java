package Selenium_Sessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class elementUtil {
	

	private WebDriver driver;

	public elementUtil(WebDriver driver) {
		this.driver = driver;
	}

	private void nullCheck(CharSequence... value) {
		if (value == null) {
			throw new RuntimeException("===value/prop/attribute can not be null====");
		}
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClick(String locatorType, String locatorValue) {
		getElement(getLocator(locatorType, locatorValue)).click();
	}

	public void doSendKeys(By locator, CharSequence... value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, CharSequence... value) {
		nullCheck(value);
		getElement(getLocator(locatorType, locatorValue)).sendKeys(value);
	}

	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doElementGetText(String locatorType, String locatorValue) {
		return getElement(getLocator(locatorType, locatorValue)).getText();
	}

	public String doGetDomAttribute(By locator, String attrName) {
		nullCheck(attrName);
		return getElement(locator).getDomAttribute(attrName);
	}

	public String doGetDomProperty(By locator, String propName) {
		nullCheck(propName);
		return getElement(locator).getDomProperty(propName);
	}

	public boolean doIsElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("element is not displayed");
			return false;
		}
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public boolean isElementDisplayed(By locator) {
		if (getElements(locator).size() == 1) {
			System.out.println("element is available on the page one time");
			return true;
		} else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public boolean isElementDisplayed(By locator, int elementCount) {
		if (getElements(locator).size() == elementCount) {
			System.out.println("element is available on the page " + elementCount + " times");
			return true;
		} else {
			System.out.println("element is not available on the page");
			return false;
		}
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public By getLocator(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toUpperCase().trim()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.name(locatorValue);
			break;
		case "CLASSNAME":
			locator = By.className(locatorValue);
			break;
		case "XPATH":
			locator = By.xpath(locatorValue);
			break;
		case "CSS":
			locator = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TAGNAME":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("invalid locator, please use the right locator...");
			break;
		}

		return locator;

	}

	// *****************Select tag drop down utils***************//

	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public void doSelectDropDownByContainsText(By locator, String partialText) {
		Select select = new Select(getElement(locator));
		select.selectByContainsVisibleText(partialText);
	}

	public void printDropDownOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("options size: " + optionsList.size());

		List<String> optionsValueList = new ArrayList<String>();// []
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOptionsList = select.getOptions();
		System.out.println("options size: " + countryOptionsList.size());
		return countryOptionsList.size();
	}

	public void selectValueFromDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		boolean flag = false;

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(value + " is available and selected");
		} else {
			System.out.println(value + " is not available");
		}
	}

	/**
	 * 
	 * @param searchField
	 * @param suggestions
	 * @param searchKey
	 * @param actualValue
	 * @throws InterruptedException
	 */
	public void doSearch(By searchField, By suggestions, String searchKey, String actualValue)
			throws InterruptedException {

		doSendKeys(searchField, searchKey);
		Thread.sleep(2000);

		List<WebElement> suggList = getElements(suggestions);
		System.out.println(suggList.size());
		boolean flag = false;

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(actualValue)) {
				e.click();
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(actualValue + " is available and clicked");
		} else {
			System.out.println(actualValue + " is not available");
		}

	}

	/**
	 * this method is handling single/multiple and all choices selection. Please
	 * pass "all" to select all the choices. selectChoice(choiceDropDown, choices,
	 * "All");
	 * 
	 * @param choiceDropDown
	 * @param choices
	 * @param choiceValue
	 * @throws InterruptedException
	 */
	public void selectChoice(By choiceDropDown, By choices, String... choiceValue) throws InterruptedException {
		doClick(choiceDropDown);
		Thread.sleep(3000);
		List<WebElement> choicesList = getElements(choices);

		System.out.println(choicesList.size());

		if (choiceValue[0].equalsIgnoreCase("all")) {
			// select all the choice one by one:
			for (WebElement e : choicesList) {
				e.click();
			}
		}

		else {
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

	// **************************Actions utils***************//

	public void doActionsSendKeys(By locator, CharSequence... value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

	public void handleTwoLevelMenuSubMenuHandling(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenuLocator)).build().perform();
		Thread.sleep(2000);
		getElement(childMenuLocator).click();
	}

	public void handleFourLevelMenuSubMenuHandling(By level1Menu, By level2Menu, By level3Menu, By level4Menu)
			throws InterruptedException {
		Actions act = new Actions(driver);
		driver.findElement(level1Menu).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level2Menu)).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level3Menu)).build().perform();
		Thread.sleep(2000);
		driver.findElement(level4Menu).click();

	}
	
	
	public void doSendKeysWithPause(By locator, String value, long pauseTime) {		
		Actions act = new Actions(driver);
		char val[] = value.toCharArray();		
		for(char ch : val) {
			act.sendKeys(getElement(locator), String.valueOf(ch))
					.pause(pauseTime).perform();
		}		
	}
	
	
	

}
