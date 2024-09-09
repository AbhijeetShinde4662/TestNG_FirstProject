package Org.Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilities {
	protected WebDriver driver=null;

	public WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public void maximiseBrowser() {

		driver.manage().window().maximize();
	}
	
	public void sendURL(String url) {

		driver.get(url);
	}
	
	@SuppressWarnings("deprecation")
	public void implicitWait(int time) {

		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	

	public void closeBrowser() {

		driver.quit();

	}
}
