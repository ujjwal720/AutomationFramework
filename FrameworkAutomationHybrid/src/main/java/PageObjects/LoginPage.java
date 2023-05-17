package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/*
	 * Why we need the frameowk in our project the framework will basically help us
	 * to configure the projects and it will help in working for our automation
	 * project.
	 */
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	

}
