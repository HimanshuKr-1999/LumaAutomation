package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {
	@Test
	public static void Login() throws InterruptedException {
		
		
		driver.findElement(By.linkText(loc.getProperty("Sign-In"))).click();
		driver.findElement(By.name(loc.getProperty("login-username"))).sendKeys(loc.getProperty("username"));
		
		driver.findElement(By.name(loc.getProperty("login-password"))).sendKeys("Anshu@12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("sign-in-button"))).click();
		Thread.sleep(2000);

	}

}