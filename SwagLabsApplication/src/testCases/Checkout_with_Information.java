package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Checkout_PageObjects;

public class Checkout_with_Information  extends CommonFunctions{
	
	public void click_Check_Out() {
		PageFactory.initElements(driver, Checkout_PageObjects.class);
		Checkout_PageObjects.checkoutbutton.click();
		
	}
	public void Checkout_information() {
		PageFactory.initElements(driver, Checkout_PageObjects.class);
		Checkout_PageObjects.firstname.sendKeys(properties.getProperty("firstname"));
		Checkout_PageObjects.lastname.sendKeys(properties.getProperty("lastname"));
		Checkout_PageObjects.postalcode.sendKeys(properties.getProperty("postalcode"));
		Checkout_PageObjects.continuebutton.click();
		Checkout_PageObjects.finishbutton.click();
		
	}
	
	
	
	@Test
	public void checkoutFunctions() {
		click_Check_Out();
		Checkout_information();
		
		
	}

}
