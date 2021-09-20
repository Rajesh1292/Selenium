package Selenium;
//https://www.youtube.com/watch?v=PkK9wU_mupQ&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=11

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.twoplugs.com/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
	    
	    WebElement drpElement = driver.findElement(By.name("category_id"));
	    Select drpSelect = new Select (drpElement);
	    
	    List<WebElement> options = drpSelect.getOptions();
	    
	    ArrayList originallist = new ArrayList();
	    ArrayList templist = new ArrayList();
	    
	    for(WebElement option:options)
	    {
	    	originallist.add(option.getText());
	    	templist.add(option.getText());
	    }
	    
	    System.out.println("Original List:" +originallist);
	    System.out.println("Temporary List:" +templist);
	    
	    Collections.sort(templist); //sorting
	    
	    System.out.println("Original List:" +originallist);
	    System.out.println("Temporary List After sorting:" +templist);
	
	
	if (originallist.equals(templist))
	{
		System.out.println("Dropdown sorted..");
	}
	else
	{
		System.out.println("Dropdown not sorted");
	}
	driver.close();
}
}
