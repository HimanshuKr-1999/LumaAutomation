package base;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	public static WebDriver driver;
	public static Properties prop= new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	@BeforeSuite
	public void SetUp() throws IOException {
		
		if(driver==null) {
			
			System.out.println(System.getProperty("user.dir"));// C:\Users\KIIT\eclipse-workspace-Practice\AutomationProject\com.Automation.Framework.Project
			FileReader fr = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\configfiles\\config.properties");
			FileReader fr1= new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\configfiles\\locators.properties");
			loc.load(fr1);
			prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			
		}
	}
	//@AfterSuite
	public void TearDown() {
		driver.close();
	}
}
