package Verify.Element.com;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddToCart {
	
	String baseUrl = "http://demowebshop.tricentis.com/login";
	static WebDriver driver = null;
	
	@BeforeTest
	public static void Checkout() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (3)/chromedriver.exe");
	driver = new ChromeDriver();
	}
	
	@Test
	public void verifylogincredentials() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("hamzasultani352@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hamzasultani4545");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
			WebElement account = driver.findElement(By.className("account"));
			Assert.assertTrue(account.isDisplayed());
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[5]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[5]/input")).sendKeys("3");
		js.executeScript("window.scrollBy(300,500)");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();
		Thread.sleep(4000);
		//Check Box
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Demo Web Shop. Checkout");
		assertTrue(verifyTitle);
		
//		Assert.assertTrue(driver.getTitle().equals("Demo Web Shop. Demo Web Shop. Checkout"));
		
		driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("Pakistan");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Faisalabad");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Millat Road Faisalabad");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("38000");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("+92-311-7419417");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();

		
		//Shipping Method
		driver.findElement(By.id("shippingoption_2")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")).click();
		
		//Payment Method
		driver.findElement(By.id("paymentmethod_2")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();
		
		//Payment Information
		driver.findElement(By.id("CreditCardType")).sendKeys("Master card");
		driver.findElement(By.id("CardholderName")).sendKeys("Hamza Sultani");
		driver.findElement(By.id("CardNumber")).sendKeys("5105 1051 0510 5100");
		driver.findElement(By.id("ExpireMonth")).sendKeys("06");
		driver.findElement(By.id("ExpireYear")).sendKeys("2025");
		driver.findElement(By.id("CardCode")).sendKeys("1234");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();
		
		driver.quit();
		
		

}

}
