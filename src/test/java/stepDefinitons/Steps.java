package stepDefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps extends BaseTest{
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);

	}

	
	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    driver.manage().window().maximize();
	}
	

	@When("User enters Email as {string} and Password as clear {string}")
	public void user_enters_email_as_and_password_as_clear(String email, String password) {
		lp.setUserName(email);
		lp.setPassword(password);

	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {
		lp.clickSubmit();
		Thread.sleep(5000);

	}

	@Then("Error Message should be displayed")
	public void error_message_should_be_displayed() {
		lp.actualErrorMessage();

	}
	
	@When("click on remamber button")
	public void click_on_remamber_button() {
		lp.getChkrememberMeButton().click();
	    
	}
	
	@When("Click on UserMenu")
	public void Click_on_UserMenu() {
		WebElement dropDown = home.getUserMenu();
		dropDown.click();
	}
	
	
	@When("Click on Log out")
	public void click_on_log_out() {
		home.getLogout().click();
	}

	@And("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
