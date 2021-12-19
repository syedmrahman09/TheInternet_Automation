package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	protected WebDriver driver;
	
	protected BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void input(String query, String xpath) {
		driver.findElement(By.xpath(xpath)).sendKeys(query);
	}
	
	protected void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void sleep(int time) {
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
