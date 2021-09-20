package Selenium;
import java.util.List;
//https://www.youtube.com/watch?v=s2anoT8GHKE&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=63
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	    
	    driver.get("https://www.w3schools.com/html/html_tables.asp");  
	    
	    String beforeXpath_company = "//*[@id='customers']/tbody/tr[";
	    String afterXpath_company = "]/td[1]";
	    
	    String beforeXpath_contact = "//*[@id='customers']/tbody/tr[";
	    String afterXpath_contact = "]/td[2]";
	    
	    List<WebElement>rows= driver.findElements(By.xpath("//table[@id='customers']//tr"));
	    System.out.println("Total number of rows:" + (rows.size()-1));
	    int rowCount = rows.size();
	    
	    for(int i=2; i<=rowCount; i++) {
	    	String actualXpath_company = beforeXpath_company+i+afterXpath_company;
	    	String companyName = driver.findElement(By.xpath(actualXpath_company)).getText();
	    	System.out.println(companyName);
	    	
	    	String actualXpath_contact = beforeXpath_contact+i+afterXpath_contact;
	    	String contactName = driver.findElement(By.xpath(actualXpath_contact)).getText();
	    	System.out.println(contactName);
	   
	    }
	    driver.close();
	}

}
