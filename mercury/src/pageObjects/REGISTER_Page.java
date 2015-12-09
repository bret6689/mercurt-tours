package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class REGISTER_Page {
	 
    private static WebElement element = null;

public static WebElement txtbx_first_name(WebDriver driver){

     element = driver.findElement(By.name("firstName"));

     return element;

     }

 public static WebElement txtbx_last_name(WebDriver driver){

     element = driver.findElement(By.name("lastName"));

     return element;

     }

 public static WebElement txtbx_phone(WebDriver driver){

     element = driver.findElement(By.name("phone"));

     return element;

     }


public static WebElement txtbx_email(WebDriver driver){

    element = driver.findElement(By.id("userName"));

    return element;

    }

public static WebElement txtbx_address(WebDriver driver){

    element = driver.findElement(By.name("address1"));

    return element;

    }

public static WebElement txtbx_city(WebDriver driver){

    element = driver.findElement(By.name("city"));

    return element;
}

public static WebElement txtbx_state(WebDriver driver){

    element = driver.findElement(By.name("state"));

    return element;
}
public static WebElement txtbx_postal(WebDriver driver){

    element = driver.findElement(By.name("postalCode"));

    return element;
}
public static WebElement txtbx_country(WebDriver driver){

    element = driver.findElement(By.name("country"));

    return element;
}
public static WebElement txtbx_username(WebDriver driver){

    element = driver.findElement(By.name("email"));

    return element;
}
public static WebElement txtbx_password(WebDriver driver){

    element = driver.findElement(By.name("password"));

    return element;
}public static WebElement txtbx_confirmpassword(WebDriver driver){

    element = driver.findElement(By.name("confirmPassword"));

    return element;
}public static WebElement SUBMIT(WebDriver driver){

    element = driver.findElement(By.name("register"));

    return element;
    }}


