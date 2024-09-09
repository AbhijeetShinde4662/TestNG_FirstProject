package Perfection_Mob;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Script01<object> extends BaseClass {
	@Test(dataProvider = "logindata")
	public void myFirstScript01(String username, String password) {

		webDriverUtilities.sendURL("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();

		String name = driver.getTitle();
		System.out.println(name);

	}

	@Test(dataProvider = "logindata", priority = 1)
	public void myFirstScript02(String username, String password) {

		webDriverUtilities.sendURL("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		String name = driver.getTitle();
		System.out.println(name);

	}

	@DataProvider(name = "logindata")
	static Object[][] getData() {
		return new Object[][] { 
			{ "user1", "password1" },
			{ "user2", "password2" }, 
			{ "user3", "password3" } };
	}
}
