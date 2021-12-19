package testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.BasePage;
import pageobjects.LoginPage;

public class NavigateTo {
	
	String username;
	
	BasePage pageToNavigateTo;
	LoginPage loginPage;
	
	public NavigateTo(WebDriver driver, BasePage pageToNavigateTo) {
		
		this.loginPage = new LoginPage(driver);
	}
	
	public NavigateTo withUsername(String username) {
		this.username = username;
		return this;
	}

	public void start() {
		if (this.pageToNavigateTo.getClass() == LoginPage.class) {
			loginPage.clickBasicAuth();
		}
	}
}
