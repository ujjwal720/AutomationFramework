package Stanalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	String browser = "chrome";

	public WebDriver setup() {

		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			

		}
		
		return driver;

	}

}
