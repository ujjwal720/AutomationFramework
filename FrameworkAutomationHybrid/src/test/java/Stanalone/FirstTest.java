package Stanalone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void test1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net/");
		LoginPage a_v = new LoginPage(driver);
		a_v.enterEmail("Ujjwal@yopmail.com");
		a_v.enterpassword("Nac@1234");

	}

}
