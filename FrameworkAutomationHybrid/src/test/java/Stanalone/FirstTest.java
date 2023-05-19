package Stanalone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest extends TestBase{

	Logger loggers = Logger.getLogger(FirstTest.class);
	
	      WebDriver driver=TestBase.driver;

	@Test(description = "To Test the Login functionality of the following user", priority = 2, singleThreaded = true)
	public void test1() throws IOException {

		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage a_v = new LoginPage(driver);
		a_v.enterEmail();
		a_v.enterpassword();
		a_v.submitbutton();
		loggers.info("Succesful");
		driver.quit();
		System.out.println("Login is succesfu;");

	}

	@Test(priority = 1, singleThreaded = true)
	public void test2() {

		
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		loggers.info("Succesful");
		driver.quit();

	}
	
	
	
	@Test(priority = 3, singleThreaded = true)
	public void test3() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage a_v = new LoginPage(driver);
		a_v.enterEmail();
		a_v.enterpassword();
		a_v.submitbutton();
		WebDriverWait ut=new WebDriverWait(driver,20);
		

	}

}
