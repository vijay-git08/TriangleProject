package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.Page_Object_Model.Forum_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	

	public static WebDriver driver;
	
	public static WebDriver openbrowser (String type) {
		
		if (type.equalsIgnoreCase("chrome"))  {
				
				
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
			}
	
	else if(type.equalsIgnoreCase ("firefox"))   {
		
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}
	
	else if(type.equalsIgnoreCase ("msedge"))   {
		
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	
	public static void getURL(String URL) {
		driver.get(URL);
	}
	
	
	
	public static void clear(WebElement element) {
		element.clear();
		
	}
	
	
	public static void Click(WebElement findelement)
	{
		findelement.click();
       	}
	
	
	
	public static void doubleClick(WebElement findelement)
	{
		Actions a=new Actions(driver);
		a.doubleClick(findelement).perform();
	}
	
		
	
	public static void inputValue(WebElement webElement,String UserName) {
		webElement.sendKeys (UserName);
	}
	
	
	
	public static void inputValue2(WebElement findelement,String MobileNumber) {
		findelement.sendKeys (MobileNumber);
	}
	
	
	
	
	public static void jsScrollDown(WebElement element) throws InterruptedException {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)",element);
	Thread.sleep(1000);
	js.executeScript("window.scrollBy(0,-300)",element);
	Thread.sleep(2000);
	}
}


