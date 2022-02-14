package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public  HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id= "userNavButton")
	WebElement userMenu;
	
	@FindBy(linkText ="Logout")
	WebElement logout;

	

	public WebElement getUserMenu() {
		return userMenu;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	
	
	

}
