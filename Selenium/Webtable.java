package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//source: https://www.youtube.com/watch?v=1Sy7Wdx_NgA&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=20
public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https:selenium.dev/downloads/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //1, To find how many rows
	    
	    int rows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr")).size();
	    System.out.println("Total number of rows:" +rows);
	    
	    //2, To find how many cols
	    int cols = driver.findElements(By.xpath("//table[@class='data-list']//thead/tr/th")).size();
	    System.out.println("Total number of rows:" +cols);
	    
	    //3, To retrieve specific row/col value
	    
	    String value = driver.findElement(By.xpath("//table[@class='data-list']//tr[1]/td[1]")).getText();
	    System.out.println(value);
	    
	    //4, To retrieve all the data from the table
	    /*
	    for(int r=1; r<=rows;r++)
	    {
	    	for(int c=1;c<=cols;c++) 
	    	{
	    		String data = driver.findElement(By.xpath("//table[@class='data-list']//tr["+r+"]/td["+c+"]")).getText();
	    	    System.out.println(data+ "   ");
	    	}
	    	System.out.println();
	    } */
	    
	    //find the particular row and verify all column data
	    
	    for (int r=1;r<=rows;r++)
	    {
	    	String language = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[1]")).getText();
	    	if (language.equals("Java"))
	    	{
	    		String version= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[2]")).getText();
	    		String releasedate= driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr["+r+"]/td[3]")).getText();
	    		System.out.println(language+ " " + version+ " " + releasedate);
	    	}
	    }
	    
	    driver.quit();
	    

	}

}
