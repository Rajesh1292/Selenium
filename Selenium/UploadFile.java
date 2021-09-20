

package Selenium;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// dropdown in the button 
public class UploadFile {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https://www.monsterindia.com/");  
	    
	    driver.findElement(By.xpath("//*[@id='user-signup-actions']/div[1]/div[1]/a[2]")).click();
	//Using send keys
//	    driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\rajes\\OneDrive\\Desktop\\Sample.pdf");
//	    
//	    Using Robot class
	    WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", button);
	    
	    /* 1.Copy the path
	     2.CTRL+V
	     3.Enter
	     */
	    Robot rb=new Robot();
	    rb.delay(2000);
	   
	    //put path to file in a clipboard
	    
	   StringSelection ss = new StringSelection("C:\\Users\\rajes\\OneDrive\\Desktop\\Sample.pdf");
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	   
	   //CTRL+V
	   rb.keyPress(KeyEvent.VK_CONTROL);
	   rb.keyPress(KeyEvent.VK_V);
	   rb.delay(2000);
	   rb.keyRelease(KeyEvent.VK_CONTROL);
	   rb.keyRelease(KeyEvent.VK_V);
	   rb.delay(2000);
	   //Enter 
	   rb.keyPress(KeyEvent.VK_ENTER);
	   rb.keyRelease(KeyEvent.VK_ENTER);
	   
	}

}
