
//https://www.youtube.com/watch?v=gplxQ3mtmGY&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=9
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// dropdown in the button 
public class BootstrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https:hdfc.com");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//div[@class=drp1]//div[@class='dropdown'")).click();
	    
	    List<WebElement> producttypes = driver.findElements(By.xpath("u1[@class=dropdown1 dropdown-menu']/li"));
	    
	    System.out.println("Number of options"+ producttypes.size());
	    
	    for(WebElement ptype:producttypes) {
			   if(ptype.getText().equals("Accounts"))
			   {
				   ptype.click();
				   break;
			   }
		   }
	    

	}

}
