package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_PageObjects {

	@FindBy(id = "checkout")
	public static WebElement checkoutbutton;
	
	@FindBy(id = "first-name")
	public static WebElement firstname;
	
	@FindBy(id = "last-name")
	public static WebElement lastname;
	
	@FindBy(id = "postal-code")
	public static WebElement postalcode;
	
	@FindBy(id = "continue")
	public  static WebElement continuebutton;
	
	@FindBy(id = "finish")
	public static WebElement finishbutton;
}
