package testcases;

import base.BaseTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckoutAddedProducts extends BaseTest {
	@Test
	public void checkout() throws InterruptedException, IOException {
		
		
	
		
		driver.findElement(By.xpath(loc.getProperty("cart-icon"))).click();
		driver.findElement(By.xpath(loc.getProperty("proceed-to-checkout"))).click();
	
		if(!loc.getProperty("saved-address").isEmpty()) {
		
			driver.findElement(By.xpath("//input[@name='ko_unique_1']")).click();
		
			driver.findElement(By.xpath(loc.getProperty("address-submit"))).submit();
			System.out.println("address submit done");
			Thread.sleep(4000);
			
			
			
			
			driver.findElement(By.xpath(loc.getProperty("placeorder"))).click();//not clicking..... figuring out this
			System.out.println("Place order clicked");
			
			
			
		
////////////////////////SCREENSHOT//////////////////////
			
			
			
			
File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

File destFile2 = new File(".//screenshot/Checkoutscreen.png");
FileUtils.copyFile(screenshotFile2,destFile2);
System.out.println("Screenshot saved successfully.");
			


////////////displaying the order id is not working :( //////////////////////
//			WebElement orderid = driver.findElement(By.xpath("a[class='order-number'] strong"));
//			System.out.println("identified the element");
//			String PrintOrderid =orderid.getText();
//			System.out.println("saved the text in string");
//			System.out.println(PrintOrderid);
//			System.out.println("printed the orderid");
			
			
			
			
			
			
			
		}
		else {
			driver.findElement(By.xpath(loc.getProperty("address-firstname"))).clear();
			driver.findElement(By.xpath(loc.getProperty("address-firstname"))).sendKeys("Himanshu");
			driver.findElement(By.xpath(loc.getProperty("address-lastname"))).clear();
			driver.findElement(By.xpath(loc.getProperty("address-lastname"))).sendKeys("Kumarr");
			driver.findElement(By.xpath(loc.getProperty("address-street-address-1"))).sendKeys("Hinjewadi");
			driver.findElement(By.xpath(loc.getProperty("address-city"))).sendKeys("maharashtra");
			//Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("address-state"))).click();
		//	Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("address-state-option-1"))).click();
		//	Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("address-postalcode"))).sendKeys("1223");
			Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("address-telephone"))).sendKeys("12345678");
			Thread.sleep(3000);
			driver.findElement(By.xpath(loc.getProperty("address-shipping-method-2"))).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(loc.getProperty("address-submit"))).submit();
			Thread.sleep(4000);
			System.out.println("address submit done1111");
			Thread.sleep(3000);
			driver.findElement(By.xpath(loc.getProperty("placeorder"))).click();
			System.out.println("Place order clicked1111");
			
			////////////////////////SCREENSHOT//////////////////////
			
     		File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

     		File destFile2 = new File(".//screenshot/Checkoutscreen.png");
     		FileUtils.copyFile(screenshotFile2,destFile2);
     		System.out.println("Screenshot saved successfully.");


//     		WebElement orderid = driver.findElement(By.xpath("a[class='order-number'] strong"));
//     		orderid.getText();
//     		System.out.println(orderid);

			
			
		}
		
	}
}
