package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryManagment {

	@FindBy(xpath = "(//p[@class='card-text fw-bold mb-2']/following-sibling::h5)[1]")
	WebElement registered;

	@FindBy(xpath = "(//p[@class='card-text fw-bold mb-2']/following-sibling::h5)[2]")
	WebElement unregistered;

	static String reg = "";
	static String unreg = "";

	public void coun() {
		
		reg=registered.getText();
		unreg=unregistered.getText();
		

	}
	
}
