package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout_PageObjects {
	
	@FindBy(xpath = "//*[@id=\'checkout_complete_container\']/h2")
	public static WebElement orderconfirmation;

	@FindBy(id = "back-to-products")
	public static WebElement backTohome;

	@FindBy(id = "react-burger-menu-btn")
	public static WebElement burgerbutton;

	@FindBy(id = "logout_sidebar_link")
	public static WebElement logoutbutton;

}
