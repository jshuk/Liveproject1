package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;

public class AddCustTest extends TestBase{
	@Test(dataProvider="getData")
	public void addcustomer(String firstname,String lastname,String postcode) throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstname"))).sendKeys(firstname);
		driver.findElement(By.cssSelector(OR.getProperty("lastname"))).sendKeys(lastname);
		driver.findElement(By.cssSelector(OR.getProperty("postcode"))).sendKeys(postcode);
		driver.findElement(By.cssSelector(OR.getProperty("addbtn"))).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Reporter.log("second test pass");
		
		
	}
	@DataProvider
	public Object[][] getData(){
		String sheetName="AddCustTest";
		int rows = excel.getRowCount(sheetName);
		int cols =excel.getColumnCount(sheetName);
		Object[][] data=new Object[rows-1][cols];
		for(int rowNum=2;rowNum<=rows;rowNum++) {
			for(int colNum=0;colNum<cols;colNum++) {
				data[rowNum-2][colNum]=excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
		
	}

}
