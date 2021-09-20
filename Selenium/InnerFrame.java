package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();   
	    driver.navigate().to("http://demo.automationtesting.in/Frames.html");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	    WebElement outerframe= driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));
	    driver.switchTo().frame(outerframe);
	    
	    WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(innerframe);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
	    driver.close();

	}

}
