package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class inventorymanagment3 {
	
	
	WebDriver driver;

	@FindBy(xpath = "//a[@title='Inventory Management']")
	WebElement button;

	public inventorymanagment3(WebDriver driver) {
		
		
		this.driver=driver;
		
		
	}

	public void inventory() {

		button.click();

	}

	public void getcount() {

	}

}
