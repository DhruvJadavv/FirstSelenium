package base;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.*;
import base1.BaseTest;
import org.openqa.selenium.JavascriptExecutor;

public class FirstTest extends BaseTest {
	@Test
	public void formcheck() throws InterruptedException {
		driver.manage().window().maximize();

		Thread.sleep(20000);

		WebElement threedots = driver.findElement(By.xpath("//span[@data-testid=\"menu\"]"));
		threedots.click();
		WebElement group_add = driver.findElement(By.xpath("//div[@aria-label='New group']"));
		group_add.click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Type contact name']"));
		search.sendKeys("Broker");
		
		Thread.sleep(5000);
		WebElement searchblank;
		List<WebElement> elements = null;

		// First, locate all the elements that you want to handle
		try {
			
			elements = driver.findElements(By.xpath("//*[starts-with(text(),\"Broker\") and starts-with(@title,\"Broker\")]"));
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: ");
			System.out.println("Element not found: ");
			
		}
		for (WebElement element : elements) {
			
			try {
				element.click();
				searchblank=driver.findElement(By.xpath("//input[@placeholder=' ']"));
				searchblank.sendKeys("Broker");
				elements = driver.findElements(By.xpath("//*[starts-with(text(),\"Broker\") and starts-with(@title,\"Broker\")]"));
				Thread.sleep(1000);
			} catch (ElementClickInterceptedException e) {
				System.out.println("Element click nai hua: ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		WebElement back_btn = driver.findElement(By.xpath("//div[@aria-label='Back']//span[@data-testid='back']"));
		back_btn.click();
		Thread.sleep(2000);
		threedots.click();

		WebElement logout = driver.findElement(By.xpath("//div[@aria-label='Log out']"));
		logout.click();
		Thread.sleep(5000);
		WebElement logoutfinal = driver.findElement(By.xpath(
				"//div[@class='tvf2evcx m0h2a7mj lb5m6g5c j7l1k36l ktfrpxia nu7pwgvd dnb887gk gjuq5ydh i2cterl7'][normalize-space()='Log out']"));
		logoutfinal.click();
		Thread.sleep(5000);

	}

}
