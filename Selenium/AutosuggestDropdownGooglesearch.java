package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdownGooglesearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.google.com/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("q")).sendKeys("java tutorial");
	    Thread.sleep(3000);
	    
	    List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
	    
	    System.out.println("Size of Auto suggestions:" +list.size());
	    
	    for(WebElement listitem:list)
	    {
	    	if(listitem.getText().contains("beginners"))
	    	{
	    		listitem.click();
	    		break;
	    	
	    	}
	    }

	}

}
