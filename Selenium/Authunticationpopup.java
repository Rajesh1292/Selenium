

package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// drop down in the button 
public class Authunticationpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //http://username:password@test.com
	    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");  
	    String popupmessage = driver.findElement(By.cssSelector("p")).getText();
	    System.out.println(popupmessage);
	   
	   
	}

}
