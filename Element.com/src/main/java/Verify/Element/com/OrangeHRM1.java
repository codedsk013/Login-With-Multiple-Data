package Verify.Element.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM1 {

	@Test
	public void titleTest() 
	{
		String expectedtitle = "OrangeHRM";
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
}
