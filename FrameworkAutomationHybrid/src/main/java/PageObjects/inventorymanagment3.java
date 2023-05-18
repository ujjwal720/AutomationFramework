package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class inventorymanagment3 {

	@FindBy(xpath ="//a[@title='Inventory Management']")
	WebElement button;
	
	

	public void inventory() {

		button.click();

	}

	public void getcount() {

	}

}
