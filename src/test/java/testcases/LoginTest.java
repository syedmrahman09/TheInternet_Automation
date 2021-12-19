package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import pageobjects.LoginPage;

public class LoginTest extends Hooks{
	
	@Test
	public void loginTest() {

		LoginPage loginPage = new LoginPage(driver);
		//loginPage.clickBasicAuth();	
		loginPage.enterUserName();
	}
}
