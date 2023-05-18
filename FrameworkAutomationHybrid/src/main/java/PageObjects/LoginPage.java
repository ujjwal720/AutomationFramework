package PageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/*
	 * Why we need the frameowk in our project the framework will basically help us
	 * to configure the projects and it will help in working for our automation
	 * project.
	 */

	/*
	 * Locators will bw configured in this page
	 */

	WebDriver driver;
	Properties a;

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public LoginPage(WebDriver driver) throws IOException {
		this.driver = driver;
		String propertiesFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Creds.properties";

		File p_z = new File(propertiesFilePath);
		FileInputStream p_o = new FileInputStream(p_z);
		a = new Properties();
		a.load(p_o);

		PageFactory.initElements(driver, this);
	}

	public void enterEmail() {
		String emailAddress = a.getProperty("username");
		email.sendKeys(emailAddress);

	}

	public void enterpassword() {
		String pas = a.getProperty("password");

		password.sendKeys(pas);

	}

	public void submitbutton() {

		submit.click();

	}

}
