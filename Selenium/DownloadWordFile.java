
//https://www.youtube.com/watch?v=ZsSTZmlyIvc&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=30
package Selenium;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

// dropdown in the button 
public class DownloadWordFile {
	
	public static void main(String[] args) {
		String location=System.getProperty("C:\\Users\\rajes\\eclipse-workspace\\Sampleprograms\\Downloads\\");
		
		//Chrome
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(options); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("https:file-examples.com/index.php/sample-documents-download/sample-doc-download/");
	    try {
	        driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a[1]")).click();
	     } catch (Exception e) {
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a[1]")));
	     }
	   
	}

}
