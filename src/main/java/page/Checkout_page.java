package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page {
	WebDriver driver;
	


//@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/span")
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement clickcart;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
   public Checkout_page (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
//public Checkout_page() {
	// TODO Auto-generated constructor stub

public void cartclick(){
	clickcart.click();
	
	
}
   public void checkout() {
	   checkout.click();
	   }}
