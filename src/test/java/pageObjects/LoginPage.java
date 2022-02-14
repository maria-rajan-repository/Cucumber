
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath  = "//input[@id='username']")
	WebElement emailAddressField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(id = "Login")
	WebElement loginButton;

	@FindBy(name = "pw")
	WebElement clearPassWordField;

	@FindBy(id = "error")
	WebElement actualErrorMessage;

	@FindBy(xpath = "//a[@id='forgot_password_link']")
	WebElement forgotPassword;
	 
	@FindBy(xpath = "//input[@id='rememberUn']")
	WebElement chkrememberMeButton;
	

	public void setUserName(String userName) {
		emailAddressField.clear();
		emailAddressField.sendKeys(userName);

	}

	public void setPassword(String password) {
		
		clearPw();
		
		passwordField.sendKeys(password);

	}

	public void clearPw() {

		passwordField.clear();

	}

	public void clickSubmit() {

		loginButton.click();

	}
	public WebElement getChkrememberMeButton() {
		return chkrememberMeButton;
	}

	public String actualErrorMessage() {

		return actualErrorMessage.getText();
	}

	

	public WebElement forgotPassword() {
		return forgotPassword;
	}

	

	

	}

