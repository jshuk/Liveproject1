package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase{
@Test
	public void loginasBanker() throws InterruptedException {
		click("bmlBtn");
		Assert.assertTrue(IsElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))));
		Thread.sleep(1000);
		Reporter.log("fist test pass");
		
		
		
	}
}
