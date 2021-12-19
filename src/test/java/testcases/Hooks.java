package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		
		String url = "https://the-internet.herokuapp.com";
		String pathToDriver = System.getProperty("user.dir").concat("/Resources/chromedriver");
		
		System.setProperty("webdriver.chrome.driver", pathToDriver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	@AfterMethod(alwaysRun=true)
	public void teardown() {
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
