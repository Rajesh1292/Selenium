
//https://www.youtube.com/watch?v=48e8KsxF_ns&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=24
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// dropdown in the button 
public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");  
	    
	    WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
	    System.out.println("Location of the min slider:" +min_slider.getLocation()); //59, 250
	    System.out.println("Height & width of the element:" +min_slider.getSize()); //21,21
	    
	    Actions act = new Actions(driver);
	    act.dragAndDropBy(min_slider,100,0).perform();
	    
	    System.out.println("Location of the min slider:" +min_slider.getLocation()); 
	    System.out.println("Height & width of the element:" +min_slider.getSize());
	   
	    WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
	    act.dragAndDropBy(max_slider,-100,0).perform();
	}

}
