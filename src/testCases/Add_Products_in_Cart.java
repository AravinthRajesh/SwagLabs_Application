package testCases;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.AddCart_PageObjects;
import pageObjects.Login_PageObjects;

public class Add_Products_in_Cart extends CommonFunctions {
	
	
	
	public void Login() {
		PageFactory.initElements(driver, Login_PageObjects.class);
		Login_PageObjects.username.sendKeys(properties.getProperty("username"));
		Login_PageObjects.password.sendKeys(properties.getProperty("password"));
		Login_PageObjects.loginbutton.click();
	}
	public void addcart() {
		PageFactory.initElements(driver, AddCart_PageObjects.class);
		AddCart_PageObjects.addBackBag.click();
		AddCart_PageObjects.addJacket.click();
		AddCart_PageObjects.addTshirt.click();
		AddCart_PageObjects.shoppingCart.click();
		
	}
	
	@Test
	private void AddProducts() {
		Login();
		addcart();

	}

}
