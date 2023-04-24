package com.Step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingUser_definition extends Base_class{
	
	public static Singe_Ton si=new Singe_Ton();

	@When("User clicking Add new user button")
	public void user_clicking_add_new_user_button() throws InterruptedException {
	    Click(si.getAddingUser_Page().getAddbutton_field());
	    Thread.sleep(2000);
	}

	@When("User entering Firstt name")
	public void user_entering_firstt_name() throws Throwable {
		Click(si.getAddingUser_Page().getFirstname_field());
		Thread.sleep(2000);
		String one=FileReader_Manager.getInstanceConfig().getConfigdata().getFirstname();
		inputValue(si.getAddingUser_Page().getFirstname_field(), one);
		Thread.sleep(2000);
	  
	}

	@When("User entering Lastt name")
	public void user_entering_lastt_name() throws Throwable {
		Click(si.getAddingUser_Page().getFirstname_field());
		Thread.sleep(2000);
		String two=FileReader_Manager.getInstanceConfig().getConfigdata().getLastname();
		inputValue(si.getAddingUser_Page().getLastname_field(), two);
	  
	}

	@When("User entering Emaill address")
	public void user_entering_emaill_address() throws Throwable {
		Click(si.getAddingUser_Page().getEmail_field());
		Thread.sleep(2000);
		String three=FileReader_Manager.getInstanceConfig().getConfigdata().getEmail_new();
		inputValue(si.getAddingUser_Page().getEmail_field(), three);		
	    
	}
	@When("User selecting rolee")
	public void user_selecting_rolee() {
	    
	}

	@When("clicking Add buttonn")
	public void clicking_add_buttonn() throws AWTException, InterruptedException {
		  Robot rt=new Robot();
			Actions a=new Actions(driver);
			rt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
	    
	}


	@When("user clicking profile buttonn")
	public void user_clicking_profile_buttonn() throws InterruptedException {
	Click(si.getAddingUser_Page().getProfileicon_field());
	Thread.sleep(1000);
	Click(si.getAddingUser_Page().getLogout_button());
	Thread.sleep(1000);
	   
	}

	@Then("clicking logout buttonn")
	public void clicking_logout_buttonn() {
		Click(si.getAddingUser_Page().getLogoutfinal_click());
	  
	}

}
