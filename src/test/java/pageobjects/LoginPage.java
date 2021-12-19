package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
	private String xpathBasicAuth = "//a[@href='/basic_auth']";

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickBasicAuth() {
		click(xpathBasicAuth);
	}
	
	public void enterUserName() {
		driver.findElement(By.linkText("Basic Auth")).click();
	}
}
