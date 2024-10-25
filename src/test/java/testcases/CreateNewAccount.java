package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class CreateNewAccount extends BaseTest {
	@Test
	public static void CreateAccount() throws InterruptedException {
		
		 driver.findElement(By.xpath(loc.getProperty("create-account"))).click();
		 driver.findElement(By.xpath(loc.getProperty("create-First_name"))).sendKeys("xyz");
		 driver.findElement(By.xpath(loc.getProperty("create-last-name"))).sendKeys("abc");
		 driver.findElement(By.xpath(loc.getProperty("create-email-id"))).sendKeys("mmm1@mko.com");
		 driver.findElement(By.xpath(loc.getProperty("create-password"))).sendKeys("Ppp!12345");
		 driver.findElement(By.xpath(loc.getProperty("create-password-repeat"))).sendKeys("Ppp!12345");
		 driver.findElement(By.xpath(loc.getProperty("create-submit-button"))).click();
		 Thread.sleep(1000);
	}
	
	

}
