package testcases;

import java.io.File;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import java.io.IOException;


import base.BaseTest;

public class Search_AddToCart extends BaseTest {
	
	  //String Product_Color,String Product_Quantity
	@Test
	public void SearchAndAddToCart() throws InterruptedException, IOException {
		
		
		//LoginTest.Login();
		
		
	//	Circe Hooded Ice Fleece
	//	Sparta Gym Tank
//		if(product_Size=="XS") {
//			product_Size=loc.getProperty("product-size-XS");
//		}
//		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product name");  //Sample name- Circe Hooded Ice Fleece
		String Pname= scanner.nextLine();
		driver.findElement(By.className(loc.getProperty("search-box"))).sendKeys(Pname);
		driver.findElement(By.className(loc.getProperty("search-box"))).submit();
		
		
		//////////////////////// SCREENSHOT//////////////////////
		
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destFile1 = new File(".//screenshot/Productscreen.png");
	    FileUtils.copyFile(screenshotFile1,destFile1);
	    System.out.println("Screenshot saved successfully.");
		
		
		
		
		try {
            driver.findElement(By.xpath(loc.getProperty("product-locator")));
            System.out.println("product is available.");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("(//div[@class='price-box price-final_price'])[1]")).click();
				driver.findElement(By.xpath(loc.getProperty("product-locator"))).click();
				System.out.println("Product opened");	
				Thread.sleep(5000);
				System.out.println("5 sec");
				driver.findElement(By.xpath(loc.getProperty("product-size-M"))).click();
				driver.findElement(By.xpath(loc.getProperty("product-colour-GREEN"))).click();
				driver.findElement(By.xpath(loc.getProperty("product-quantity"))).clear();
				driver.findElement(By.xpath(loc.getProperty("product-quantity"))).sendKeys("1");
				driver.findElement(By.id(loc.getProperty("product-add-to-cart-button"))).click();
			}
        catch (NoSuchElementException e) {
            
            
        }
		
		
		
		

		
	}
	

	
	
	
	
//	@Test
//	public static void main(String args[]) throws InterruptedException {
//		Search_AddToCart obj1 = new Search_AddToCart();
//		obj1.SearchAndAddToCart("Sparta Gym Tank", "XS");
//	}
//	
//	//SearchAndAddToCart(Sparta Gym Tank,XS);
	

}
