package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropdowns {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();   
		    driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial/");  
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    WebElement noofEmpsEle= driver.findElement(By.name("NoofEmployees"));
		    selectOptionFromDropdown(noofEmpsEle, "16 - 20");
		    
		    WebElement industryEle= driver.findElement(By.name("NoofEmployees"));
		    selectOptionFromDropdown(industryEle, "Healthcare");
		    
		    WebElement Country= driver.findElement(By.name("NoofEmployees"));
		    selectOptionFromDropdown(Country, "Ghana");
		    
		    
	}
		    //Generic method for multiple drop downs
	
		    public static void selectOptionFromDropdown(WebElement ele,String value)
		    {
		    
		    Select drp = new Select(ele);
		    
		    List<WebElement>allOptions= drp.getOptions();
			   for(WebElement option:allOptions) {
				   if(option.getText().equals(value))
				   {
					   option.click();
					   break;
				   }
			   }
		    }
	}


