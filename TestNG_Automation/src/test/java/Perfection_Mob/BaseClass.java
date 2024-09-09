package Perfection_Mob;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Org.Objects.WebDriverUtilities;

public class BaseClass extends WebDriverUtilities {
	
	WebDriverUtilities webDriverUtilities;
	public WebDriver driver;

	@BeforeTest
	public void setUp() {

		webDriverUtilities = new WebDriverUtilities();

		driver =webDriverUtilities.launchBrowser("chrome");
		webDriverUtilities.maximiseBrowser();
		webDriverUtilities.implicitWait(10);

	}

	@AfterTest
	public void tearDown() {
		webDriverUtilities.closeBrowser();
	}
}
