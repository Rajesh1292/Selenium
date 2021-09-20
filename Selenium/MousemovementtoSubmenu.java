
//https://www.youtube.com/watch?v=wq2BfYTWdmg&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=61
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// dropdown in the button 
public class MousemovementtoSubmenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    driver.navigate().to("http://mrbool.com/");  
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.className("menulink"))).perform();
	    Thread.sleep(3000);
	    //xpath created manually
	    driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	    
	   
	}

}
