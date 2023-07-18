package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryManagment {

	WebDriver driver;

	@FindBy(xpath = "(//div[@class='card-body d-flex align-items-center'])[1]")
	WebElement registered;

	@FindBy(xpath = "(//p[@class='card-text fw-bold mb-2']/following-sibling::h5)[2]")
	WebElement unregistered;

	public InventoryManagment(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	static String reg = "";
	static String unreg = "";

	public void coun() {

		registered.click();

	}

}
