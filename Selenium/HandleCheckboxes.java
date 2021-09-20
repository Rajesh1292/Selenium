
//https://www.youtube.com/watch?v=LcTqCvovCPU&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=14
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    //select all check boxes for the day
	    
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
	    System.out.println("Total number of checkboxes" +checkboxes.size());
	    
//	    for(int i=0;i<checkboxes.size();i++)
//	    {
//	    	checkboxes.get(i).click();
//	    }
	 //   use either
//	    for(WebElement chbox:checkboxes)
//	    {
//	    	chbox.click();
//	    }
	    
	   // select based on choice
	  /*  for(WebElement chbox:checkboxes)
	    {
	    	String checkboxname=chbox.getAttribute("id");
	    	if(checkboxname.equals("monday")|| checkboxname.equals("sunday"))
	    	{
		    	chbox.click();
	    	}
	    }
	    */
	    //select last 2 text boxes
	    
	    int totalcheckboxes = checkboxes.size();
	    
	   /* for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
	    {
	    	checkboxes.get(i).click();
	    }
	    */
	    //select first 3 check boxes
	    for (int i=0;i<totalcheckboxes;i++)
	    {
	    	if(i<3)
	    	{
	    		checkboxes.get(i).click();
	    	}
	    }
	}

}
