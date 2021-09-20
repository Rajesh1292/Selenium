package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Arrows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.redbus.in/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    String year = "2021";
	    String month="Aug";
	    String date ="12";
	    
	    driver.findElement(By.xpath("//input[@id='onward_cal']")).click();//open date picker
	    
	    while (true)
	    {
	    	String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	    	
	    	String arr[] = monthyear.split(" ");
	    	String mon=arr[0];
	    	String yr =arr[1];
	    	
	    	if(mon.equalsIgnoreCase(month) && yr.equals(year))
	    		break;
	    	
	    	else
	    		driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
	    }
	    
	    //date selection
	    
	   List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	   
	   for(WebElement ele: alldates) 
	   {
		   String dt = ele.getText();
		   if(dt.equals(date))
		   {
			   ele.click();
			   break;
		   }
	   }
	    

	}

}
