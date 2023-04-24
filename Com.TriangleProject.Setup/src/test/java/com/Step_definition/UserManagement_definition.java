package com.Step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagement_definition extends Base_class {
	
	public static Singe_Ton si=new Singe_Ton();
	
	
	@Given("Login as Superadmin")
	public void login_as_superadmin() throws Throwable {
		openbrowser("chrome");
		String url=FileReader_Manager.getInstanceConfig().getConfigdata().getURL();
		getURL(url);
		Thread.sleep(3000);
		String username=FileReader_Manager.getInstanceConfig().getConfigdata().getUsername();
		 inputValue(si.getLogin_Page().getEmail_field(), username);
		 String password=FileReader_Manager.getInstanceConfig().getConfigdata().getPassword();
		 inputValue(si.getLogin_Page().getPassword_field(),password);
		 Click(si.getLogin_Page().getLogin_button());
		 Thread.sleep(5000);
	       	
	  
	}
	   


	@When("Clicking Filter by and selection one drop down options")
	public void clicking_filter_by_and_selection_one_drop_down_options() throws AWTException, InterruptedException {
		Click(si.getUserManagement_Page().getFilterby_field());
		Robot rt=new Robot();
		Actions a=new Actions (driver);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		rt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_DOWN);		
		Thread.sleep(3000);	
		rt.keyPress(KeyEvent.VK_ENTER);
	}

	@And("In user list table checking all names were  dispaying by scroll down")
	public void in_user_list_table_checking_all_names_were_dispaying_by_scroll_down() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);

	    
	}

	@And("In serach text box entering name")
	public void in_serach_text_box_entering_name() throws Throwable {
		String searchbox=FileReader_Manager.getInstanceConfig().getConfigdata().getSearchbox();
		inputValue(si.getUserManagement_Page().getSearchbox_field(), searchbox);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);	
		js.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(2000);
	    
		
	    
	}

	@And("In user list table checking enterd name displaying")
	public void in_user_list_table_checking_enterd_name_displaying() throws InterruptedException {
		Click(si.getUserManagement_Page().getClear_field());
		Thread.sleep(2000);
		
	}
	
	@And("Entering name for editing")
	public void entering_name_for_editing() throws Throwable{
	FileReader_Manager.getInstanceConfig();
	String searchbox=FileReader_Manager.getConfigdata().getSearchboxtwo();
	inputValue(si.getUserManagement_Page().getSearchbox_field(), searchbox);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	}
	@And("Click edit button")
	public void click_edit_button() throws InterruptedException, AWTException {
		Click(si.getUserManagement_Page().getEdit_button());
		Thread.sleep(5000);
		doubleClick(si.getUserManagement_Page().getGetlastName_Edit());
		Thread.sleep(5000);
		Robot rbt= new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_A);

		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_A);
		Thread.sleep(3000);
		
		
	}
	@And("Changing last name")
	public void changing_last_name() throws Throwable {
	
	FileReader_Manager.getConfigdata();
	String lastedit=FileReader_Manager.getConfigdata().getNameLastEdit();
	inputValue(si.getUserManagement_Page().getGetlastName_Edit(), lastedit);
	Thread.sleep(3000);
	

	    
	}
	@And("Clicking Update button")
	public void clicking_update_button() throws InterruptedException {
		Click(si.getUserManagement_Page().getUpdatebutton_profilepage());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);

	  
	}
	@And("Verifying Updated succesfully message and clicking cancel button")
	public void verifying_updated_succesfully_message_and_clicking_cancel_button() throws InterruptedException {
		Click(si.getUserManagement_Page().getCancel_symbol());
		Thread.sleep(4000);

	
	}

	@And("click Profile Icon2")
	public void click_profile_icon2() throws InterruptedException {
	Click(si.getUserManagement_Page().getProfileicon_field());
	Thread.sleep(2000);
		  
	  
	}
	@And("click Account button")
	public void click_account_button() throws InterruptedException, AWTException {
		Click(si.getUserManagement_Page().getAccount_button());
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
        

	   
	}
	@And("changing Mobile Number")
	public void changing_mobile_number() throws Throwable {
		doubleClick(si.getUserManagement_Page().getMobile_field());
		Thread.sleep(5000);
		Robot rbt= new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_A);

		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_A);
		Thread.sleep(3000);
		FileReader_Manager.getConfigdata();
		String mobile=FileReader_Manager.getConfigdata().getMobileProfile();
		inputValue2(si.getUserManagement_Page().getMobile_field(), mobile);
		Thread.sleep(2000);
		
	    
	}
	@And("clicking Update button2")
	public void clicking_update_button2() throws InterruptedException {
		Click(si.getUserManagement_Page().getUpdatebutton_progilepage());
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-100)");
	  
	}
	
	


	@And("click Profile Icon")
	public void click_profile_icon() throws InterruptedException {
		Click(si.getUserManagement_Page().getProfileicon_field());
		Thread.sleep(2000);
	  
	}

	@Then("User Click Logout button")
	public void user_click_logout_button() throws InterruptedException {
		Click(si.getUserManagement_Page().getLogout_button());
		Thread.sleep(3000);
		Click(si.getUserManagement_Page().getLogoutfinal_click());
		driver.quit();
		
	    
	}

}
