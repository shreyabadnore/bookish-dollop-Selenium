package Selenium_Sessions;

public class xPathAxes {

	public static void main(String[] args) {

		//parent to child:
		
		//1. direct child: / -- only direct child elements
		//2. indirect child: // --> direct+indirect child elements
		
		//form//input[@id] -- 2
		//form//input[@id and @placeholder]
		
		//select[@id='Form_getForm_Country']/option -- direct -- 233
		//select[@id='Form_getForm_Country']//option -- direct+indirect -- 233
		
		//form[@id='hs-login']//input -- 3
		//form[@id='hs-login']/input -- 0
		
		//div[@class='private-form__input-wrapper']/input[@id='username'] --- 1
		//div[@class='private-form__input-wrapper']/child::input[@id='username'] --- 1
		
		//form[@id='hs-login']//input[@id='username']
		//form[@id='hs-login']//child::input[@id='username']
		
		//parent to child:
		//form[@class='form-horizontal']//child::input[@placeholder] --- 6
		//form[@class='form-horizontal']//input[@placeholder] --- 6
		
		//backward traversing in DOM:
		//child to direct parent:
		//input[@id='input-firstname']/../../../../../../../../..
		//input[@id='input-firstname']/parent::div/parent::div/parent::fieldset/parent::form
		
		//child to ancestor:
		//input[@id='input-firstname']/ancestor::form
		
		//sibling:
		//label[text()='E-Mail Address']/following-sibling::input[@id='input-email']
		//label[text()='Password']/following-sibling::input[@id='input-password']
		
		//input[@id='input-email']/preceding-sibling::label[@for='input-email']
				
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		

	}

}
