
//https://www.youtube.com/watch?v=gplxQ3mtmGY&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=9
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WindowType;


// dropdown in the button 
public class OpenLinkinNexttab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	    driver.get("https://demo.nopcommerce.com");
//	    driver.switchTo().newWindow(WindowType.TAB);----- applicable only in Selenium 4
//	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.opencart.com");
	    driver.quit();
	   
	    
	   
	}

}
