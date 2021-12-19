package pageobjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxesPage extends BasePage{

	public CheckBoxesPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickCheckBoxPage() {
		driver.findElement(By.cssSelector("ul li:nth-child(6) a")).click();
	}
	
	public void checkBox(int box) {
		if (box==1)
		driver.findElement(By.cssSelector("form#checkboxes input:nth-child(1)")).click();
		if (box==2)
		driver.findElement(By.cssSelector("form#checkboxes input:nth-child(3)")).click();	
	}
}
