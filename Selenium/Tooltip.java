
//https://www.youtube.com/watch?v=gplxQ3mtmGY&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=9
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// dropdown in the button 
public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://jqueryui.com/tooltip/");  
	    driver.switchTo().frame(0);
	    WebElement inputbox = driver.findElement(By.xpath("//input[@id='age']"));
	    String tooltiptext=inputbox.getAttribute("title");
	    System.out.println(tooltiptext);
	    driver.close();
	   
	    
	   
	}

}
