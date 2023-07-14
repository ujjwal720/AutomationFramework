package Stanalone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest extends TestBase {

	Logger loggers = Logger.getLogger(FirstTest.class);

	WebDriver driver = TestBase.setups();

	@Test(description = "To Test the Login functionality of the following user", priority = 2, singleThreaded = true)
	public void test1() throws IOException {

		try {
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
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Test(priority = 1, singleThreaded = true)
	public void test2() {

		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		loggers.info("Succesful");
		driver.quit();

	}

	@Test(priority = 3, singleThreaded = true)
	public void test3() throws IOException, InterruptedException {

		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage a_v = new LoginPage(driver);
		a_v.enterEmail();
		a_v.enterpassword();
		a_v.submitbutton();
		WebDriverWait ut = new WebDriverWait(driver, 20);
		WebElement actual = driver
				.findElement(By.xpath("//div[@class='d-flex justify-content-between align-items-center py-1']/h4"));
		Thread.sleep(4000);
		ut.until(ExpectedConditions.visibilityOf(actual));
		System.out.println("the following is visible so we can clsoe it");

	}

	@Test(dependsOnMethods = "test3", priority = 4, singleThreaded = true)
	public void test4() {

	    System.out.println("Hello");
		

	}

	@AfterTest
	public void teardown() {
		
		driver.quit();

	}

}
