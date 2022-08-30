package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

	private static  WebElement element = null;
	
	public static WebElement Add_To_Cart(WebDriver driver) {
		element = driver.findElement(By.className("button-2 product-box-add-to-cart-button"));
		return element;
	}
	
	public static WebElement Virtual_Gift_Card(WebDriver driver) {
		//Recipient's Name:
		element = driver.findElement(By.className("recipient-name"));
		return element;
	}
	
}
