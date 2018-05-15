package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;
@Guice
public class AddCustTest extends TestBase{
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void AddCustTest1(String firstname,String lastname,String postcode) throws InterruptedException {
		click("addCustBtn");
		type("firstname",firstname);
		type("lastname",lastname);
		type("postcode",postcode);
		type("firstname",firstname);
		click("addbtn");
		 
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Reporter.log("second test pass");
		
		
	}
	

}
