package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_Dropdown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.dummyticket.com/dummy-ticket-for-visa-application/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	   
	    driver.findElement(By.xpath("//input[@id='dob']")).click();
	    
	    Select month_drp = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	    month_drp.selectByVisibleText("Aug");
	    Select year_drp = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	    year_drp.selectByVisibleText("2021");

	    String date = "12";
	    
	    List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		   
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
