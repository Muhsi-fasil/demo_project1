package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
WebDriver driver;

@FindBy(id="user-name")
WebElement Saucename;

@FindBy(id="password")
WebElement Saucepass;

@FindBy(name="login-button")
WebElement sauceLogin;
public login(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
public void setValues(String un,String pswd) {
	Saucename.sendKeys(un);
	Saucepass.sendKeys(pswd);
}
public void loginclick() {
	sauceLogin.click();
}
}

