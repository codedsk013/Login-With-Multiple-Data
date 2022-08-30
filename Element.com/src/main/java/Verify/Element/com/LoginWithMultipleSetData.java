package Verify.Element.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class LoginWithMultipleSetData {
	
	String baseUrl = "http://demowebshop.tricentis.com/login";
	static WebDriver driver;
	
	@BeforeTest
	public static void intailized() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (3)/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void verifylogincredentials() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().addCookie(new Cookie("foo", "bar", baseUrl, "/", null));

		driver.findElement(By.id("Email")).sendKeys("hamzasultani352@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hamzasultani4545");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
			WebElement account = driver.findElement(By.className("account"));
			Assert.assertTrue(account.isDisplayed(), "Login Not Success");
			//Window Scrolling
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
		}
		
//	@Test
//	public void Add_To_Cart() throws InterruptedException {
//	
//		//Add To Cart Button
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a")).click();
//		//Recipient's Name:
//		driver.findElement(By.className("recipient-name")).sendKeys("Hamza Sultani");
//		//Recipient's Email:
//		driver.findElement(By.className("recipient-email")).sendKeys("hamzasultani352@gmail.com");
//		Thread.sleep(4000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
//		//Quantity Box
//		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
//		Thread.sleep(4000);
		
		}
		
	


