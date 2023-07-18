package Stanalone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObjects.InventoryManagment;
import PageObjects.LoginPage;
import PageObjects.inventorymanagment3;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest extends TestBase {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		this.driver = TestBase.setups(); // Initialize the driver before the test execution
	}

	@BeforeMethod
	public void initialize() {
		TestBase.driver = this.driver; // Update the driver instance in TestBase to use the same instance in all
										// methods
	}

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

			driver.quit();
			System.out.println("Login is succesfu;");
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Test(priority = 1, singleThreaded = true)
	public void test2() {

		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");

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
	public void test4() throws InterruptedException {

		Thread.sleep(3000);
		inventorymanagment3 a = new inventorymanagment3(driver);
		a.inventory();
		Thread.sleep(4000);
		InventoryManagment l = new InventoryManagment(driver);
		l.coun();
		JavascriptExecutor r = ((JavascriptExecutor) driver);

		r.executeScript("window.scrollBy(0,90000)", "");

	}

	@AfterTest
	public void teardown() {

		driver.quit();

	}

}
