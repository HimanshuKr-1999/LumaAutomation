package testcases;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckoutAddedProducts extends BaseTest {
	@Test
	public void checkout() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("cart-icon"))).click();
		driver.findElement(By.xpath(loc.getProperty("proceed-to-checkout"))).click();
	}
}
