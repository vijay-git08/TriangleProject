package com.Step_definition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_definition extends Base_class {
	
	public static Singe_Ton si=new Singe_Ton();
	
	
	@Given("Launching browser for application")
	public void launching_browser_for_application() throws Throwable {
		openbrowser("chrome");
		FileReader_Manager.getInstanceConfig();
		String url=FileReader_Manager.getConfigdata().getURL();
		getURL(url);
		Thread.sleep(5000);
	  
	}
	@When("User Entering email and password")
	public void user_entering_email_and_password() throws Throwable {
		
		FileReader_Manager.getInstanceConfig();
		String username=FileReader_Manager.getConfigdata().getUsername();
		 inputValue(si.getLogin_Page().getEmail_field(), username);
		 FileReader_Manager.getInstanceConfig();
		 Thread.sleep(2000);
		String password=FileReader_Manager.getConfigdata().getPassword();
		 inputValue(si.getLogin_Page().getPassword_field(),password);
		 Thread.sleep(2000);
		 Click(si.getLogin_Page().getLogin_button()); 
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         Thread.sleep(5000);
         JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,-1200)");
			Thread.sleep(4000);
	}

	@And("User clicking login  password")
	public void user_clicking_login_password() throws InterruptedException {
		Click(si.getAddingUser_Page().getAddbutton_field());
		Thread.sleep(5000);
		 
	    
	}

	@And("User entering First name")
	public void user_entering_first_name() throws Throwable {
	
		  
		FileReader_Manager.getInstanceConfig();
		String firstname=FileReader_Manager.getConfigdata().getFirstname();
		inputValue(si.getAddingUser_Page().getFirstname_field(), firstname);
		Thread.sleep(2000);
	
	  
	}

	@And("User entering Last name")
	public void user_entering_last_name() throws Throwable {
		FileReader_Manager.getInstanceConfig();
		String lastname=FileReader_Manager.getConfigdata().getLastname();
		inputValue(si.getAddingUser_Page().getLastname_field(), lastname);
		Thread.sleep(3000);

		
	  
	}

	@Then("User entering Email address")
	public void user_entering_email_address() throws Throwable {
		FileReader_Manager.getInstanceConfig();
		String email=FileReader_Manager.getConfigdata().getEmail_new();
		inputValue(si.getAddingUser_Page().getEmail_field(), email);
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@id='userType']")).click();
		Robot rt=new Robot();
		Actions a=new Actions (driver);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rt.keyPress(KeyEvent.VK_DOWN);
	
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_ENTER);
		
		
     

		driver.findElement(By.xpath("//button[contains(text(), 'ADD')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/dialog[1]/div/div[1]/div[1]")).click();
		Thread.sleep(3000);
		Click(si.getAddingUser_Page().getProfileicon_field());
		Thread.sleep(2000);
		Click(si.getAddingUser_Page().getLogout_button());
		Thread.sleep(3000);
		Click(si.getAddingUser_Page().getLogoutfinal_click());
	
		
		
		
	  
	}




}
