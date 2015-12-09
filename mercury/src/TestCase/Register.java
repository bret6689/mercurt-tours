package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.REGISTER_Page;

public class Register {
WebDriver driver = null;
	
	
	@BeforeMethod
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1,groups="Registration")
	public void newregistration () {
			 Home_Page.REGISTER(driver).click();
			 REGISTER_Page.txtbx_first_name(driver).sendKeys("swapnil");
			 REGISTER_Page.txtbx_last_name(driver).sendKeys("dhondge");
			 REGISTER_Page.txtbx_phone(driver).sendKeys("5109746061");
			 REGISTER_Page.txtbx_email(driver).sendKeys("sss@gmail.com");
			 REGISTER_Page.txtbx_address(driver).sendKeys("4120 Stevenson Blvd.");
			 REGISTER_Page.txtbx_city(driver).sendKeys("Fremont");
			 REGISTER_Page.txtbx_state(driver).sendKeys("CA");
			 REGISTER_Page.txtbx_postal(driver).sendKeys("94538");
			 REGISTER_Page.txtbx_country(driver).sendKeys("UNITED STATES ");
			 REGISTER_Page.txtbx_username(driver).sendKeys("sss@gmail.com");
			 REGISTER_Page.txtbx_password(driver).sendKeys("ABC123");
			 REGISTER_Page.txtbx_confirmpassword(driver).sendKeys("ABC123");
			 REGISTER_Page.SUBMIT(driver).click();
			 
				
			
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
		
}
		
		
		


