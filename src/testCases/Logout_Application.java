package testCases;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import commonFunctions.CommonFunctions;

import pageObjects.Logout_PageObjects;

public class Logout_Application extends CommonFunctions{
	String actualmessage =null;
	public void orderConfirmation() {
		PageFactory.initElements(driver, Logout_PageObjects.class);
		actualmessage = Logout_PageObjects.orderconfirmation.getText();
		
		
	}
	public void logout() {
		PageFactory.initElements(driver, Logout_PageObjects.class);
		Logout_PageObjects.backTohome.click();
		Logout_PageObjects.burgerbutton.click();
		Logout_PageObjects.logoutbutton.click();
		
	}
	
	@Test
	public void Logout_Function() {
		orderConfirmation();
		logout();
		
	
		  assertEquals(actualmessage, "Thank you for your order!");
		 
	}

}
