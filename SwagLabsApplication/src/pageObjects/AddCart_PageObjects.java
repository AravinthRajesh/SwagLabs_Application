package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCart_PageObjects {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	public static WebElement addBackBag;
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	public static WebElement addJacket;
	
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	public static WebElement addTshirt;
	
	@FindBy(id = "shopping_cart_container")
	public static WebElement shoppingCart;

}
