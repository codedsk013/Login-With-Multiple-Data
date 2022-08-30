package Verify.Element.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Daraztest {
	
	static WebDriver driver = null;
	
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (3)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.daraz.pk/");
	
	
//		driver.get("https://www.daraz.pk/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//Login
		driver.findElement(By.xpath("//*[@id=\"anonLogin\"]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("03117419417");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("hamzasultani4545");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
		driver.findElement(By.linkText("Men's Fashion")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div/div/div/div/ul/ul[6]/li[4]/a/span")).click();
		//Test
				Assert.assertTrue(driver.getTitle().equals("Mens T Shirts Price In Pakistan - Rs. 260 On 0% Installment"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,700)");
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div[2]/div[9]/div/div/div[1]/div[1]/a/img")).click();
				//Add to Cart Button
				driver.findElement(By.className("pdp-button-text")).click();
	}
}
