package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//source: https://www.youtube.com/watch?v=55ZxPTqscxI&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=21

public class Dynamicwebtableandpages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://demo.opencart.com/admin/index.php");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    WebElement username = driver.findElement(By.id("input-username"));
	    username.clear();
	    username.sendKeys("demo");
	    WebElement password = driver.findElement(By.id("input-password"));
	    password.clear();
	    password.sendKeys("demo");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	    //Sales-->orders
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
	    //1, Find total number of pages in table
	    String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
	    System.out.println(text);
	    
	    //Table
	    //break the total number of pages in table
	    int total_pages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
	    System.out.println("Total number of pages:"  +total_pages);
	    
	    //2, Find total number rows in each pages
	    
	    //for(int p=1; p<=total_pages; p++)
	    
	     for(int p=1; p<=3; p++){
	    	WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//li//span"));
	    	System.out.println("Active page:" +activepage.getText());
	    	activepage.click();
	    	
	    	int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
	    	System.out.println("Number of rows:" +rows);
	    	
	    	//3, Read all the rows from each page
	    	
	    	for(int r=1;r<=rows;r++) {
	    		String OrderID = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	    		String CustomerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
	    		String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();
	    	
	    		if(Status.equals("Pending"))
	    		{
	    			System.out.println(OrderID+ "  " +CustomerName+ "  "+Status);
	    		}
	    	}
	    	
	    	
	    	String pageno= Integer.toString(p+1);
	    	driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='" +pageno+ "']")).click();
	    	
	    	
	    }
	     driver.close();
	}
	 
}
