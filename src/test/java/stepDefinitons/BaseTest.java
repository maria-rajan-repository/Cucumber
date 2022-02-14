package stepDefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class BaseTest {
	public WebDriver driver;
	LoginPage lp = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
