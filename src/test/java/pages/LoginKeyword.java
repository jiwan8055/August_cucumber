package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginKeyword {

	WebDriver driver;
	public LoginKeyword(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement lgn_button;
	@FindBy(id = "logout-trigger")
	WebElement logout_link;
	
	
	public void entercred(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
	}
	
	public void sumbit() {
		lgn_button.click();
	}
	
	public boolean logout_lnk_isdisplay() {
		return logout_link.isDisplayed();
	}
}
