

package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//https://www.youtube.com/watch?v=wq2BfYTWdmg&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=61
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    WebElement sourceElement = driver.findElement(By.id("draggable"));
	    WebElement targetElement = driver.findElement(By.id("droppable"));
	    
	    Actions action = new Actions(driver);
	    action.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();
	    
	   
	    
	   
	}

}
