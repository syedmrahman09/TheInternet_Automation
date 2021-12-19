package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.CheckBoxesPage;

public class CheckBoxesTest extends Hooks{
	
	@Test
	public void checkBoxesTest() {
		CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);
		checkBoxesPage.clickCheckBoxPage();
		checkBoxesPage.checkBox(2);
	}
}
