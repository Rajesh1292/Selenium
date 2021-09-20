
//https://www.youtube.com/watch?v=C_-N3_Kl8tE&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=13
package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteGoogleplacesDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.twoplugs.com/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	    WebElement searchBox = driver.findElement(By.id("autocomplete"));
	    
	    searchBox.clear();
	    
	    searchBox.sendKeys("Toronto");
	    
	    String text;
	    do
	    {
	    	searchBox.sendKeys(Keys.ARROW_DOWN);
	    	
	    	text = searchBox.getAttribute("value");
	    	 if(text.equals("Toronto, OH, USA"))
	    	 {
	    		 searchBox.sendKeys(Keys.ENTER);
	    		 break;
	    	 }
	    	 
	    }while(!text.isEmpty());
	    
	    driver.close();
	}


}
