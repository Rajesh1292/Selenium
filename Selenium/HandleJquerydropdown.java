package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJquerydropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("justAnInputBox")).click();
	    //selectChoiceValues(driver,"choice 1");
	    //selectChoiceValues(driver,"choice 1","choice 2","choice 2 1" );
	    selectChoiceValues(driver,"all");

	}

	public static void selectChoiceValues(WebDriver driver, String... value)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text = item.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
			}
		}
		else
		{
			try
			{
				for(WebElement item:choiceList)
				{
					item.click();
				}
			}
		catch(Exception e)
			{
			
			}
		}
	}
	
}
