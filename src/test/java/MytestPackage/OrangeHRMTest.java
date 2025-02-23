package MytestPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class OrangeHRMTest extends BaseTest{
	@Test
	public void titleTest() {
		String actTitle = driver.getTitle();
		System.out.println("title==>" + actTitle);
		Assert.assertEquals(actTitle, "30-Day Advanced Free Trial | OrangeHRM");
	}
	
	
	@Test
	public void whyOrangeHRMExistTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Why OrangeHRM")).isDisplayed());
	}

}
