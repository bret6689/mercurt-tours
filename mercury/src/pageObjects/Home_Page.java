package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	
	private static WebElement element = null;

public static WebElement REGISTER(WebDriver driver){

	element = driver.findElement(By.linkText("REGISTER"));
	
   

   return element;

   }


}
