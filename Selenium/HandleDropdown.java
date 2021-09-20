package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();   
		    driver.navigate().to("https://www.opencart.com/index.php?route=account/register");  
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		   WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		   Select drpCountry = new Select (drpCountryEle);
		   //drpCountry.selectByVisibleText("Denmark");
		   //drpCountry.selectByValue("10"); //Argentina
		   //drpCountry.selectByIndex(13);//Australia
		   
		   //selecting option from the dropdown without using options
		   
		   List<WebElement>allOptions= drpCountry.getOptions();
		   for(WebElement option:allOptions) {
			   if(option.getText().equals("Cuba"))
			   {
				   option.click();
				   break;
			   }
		   }
		   

	}

}
