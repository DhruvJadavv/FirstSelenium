package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ReadExcelData;
import base.BaseTest;

public class MyFirstTest extends BaseTest {
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="exceldata1")
	public void myfirst(String firstname, String lastname , String email , String mobile) throws InterruptedException {
		
		driver.manage().window().maximize();
		
		WebElement firstname_field=driver.findElement(By.xpath(loc.getProperty("firstname_field")));
		
		WebElement lastname_field=driver.findElement(By.xpath(loc.getProperty("lastname_field")));
		
		WebElement email_field=driver.findElement(By.xpath(loc.getProperty("email_field")));
		
		WebElement mobile_field=driver.findElement(By.xpath(loc.getProperty("mobile_field")));
		
		//WebElement state_field=driver.findElement(By.xpath(loc.getProperty("state_field")));
		
		
		
		firstname_field.sendKeys(firstname);
		Thread.sleep(1000);
		lastname_field.sendKeys(lastname);
		Thread.sleep(1000);
		email_field.sendKeys(email);
		Thread.sleep(1000);
		mobile_field.sendKeys(mobile);
		Thread.sleep(1000);
		
		//hobbies_field.click();
		//state_field.click();
		//city_field.click();
		
	}

}
