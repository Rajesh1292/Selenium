package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



//source: https://www.youtube.com/watch?v=1Sy7Wdx_NgA&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=20
public class TC_Edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rajes\\Downloads\\edgedriver_win32\\msedgedriver.exe");  
	    WebDriver driver=new EdgeDriver();   
	    driver.get("https:selenium.dev/downloads/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    driver.quit();
	    

	}

}
