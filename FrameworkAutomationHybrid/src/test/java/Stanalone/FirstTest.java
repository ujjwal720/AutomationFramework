package Stanalone;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
  
	@Test(description="To Test the Login functionality of the following user",priority=2)
	public void test1() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage a_v = new LoginPage(driver);
		a_v.enterEmail();
		a_v.enterpassword();
		a_v.submitbutton();
		driver.quit();
		System.out.println("Login is succesfu;");

	}

	
	@Test(priority=1)
	public void test2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		driver.quit();

	}

}
