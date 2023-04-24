																																package com.Step_definition;

import org.openqa.selenium.WebElement;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition extends Base_class {
	
	
	
	public static Singe_Ton si=new Singe_Ton();
	
	
	
	@Given("Launching browser")
	public void launching_browser() throws Throwable {
		openbrowser("chrome");
		String url=FileReader_Manager.getInstanceConfig().getConfigdata().getURL();
		getURL(url);
		Thread.sleep(4000);
	  
	}

	@When("User Entering email")
	public void user_entering_email() throws Throwable {
		String username=FileReader_Manager.getInstanceConfig().getConfigdata().getUsername();
		 inputValue(si.getLogin_Page().getEmail_field(), username);
			Thread.sleep(4000);

	 
	}



	@And("User enetring password")
	public void user_enetring_password() throws Throwable {
		String password=FileReader_Manager.getInstanceConfig().getConfigdata().getPassword();
		 inputValue(si.getLogin_Page().getPassword_field(),password);
		 Thread.sleep(2000);
	 
	}

	@Then("User clicking button")
	public void user_clicking_button() throws InterruptedException {
		
	  Click(si.getLogin_Page().getLogin_button()); 
		Thread.sleep(4000);

	}




}
