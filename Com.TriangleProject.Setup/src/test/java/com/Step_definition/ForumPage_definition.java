package com.Step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.When;

public class ForumPage_definition extends Base_class {
	
	public static Singe_Ton si=new Singe_Ton();
	
	@When("Clickinf Forum page")
	public void clickinf_forum_page() {
	    Click(si.getForum_Page().getForum_module());
	}

	@When("Clicking Create New Topic")
	public void clicking_create_new_topic() {
		Click(si.getForum_Page().getCreatenew_topic());
	   
	}

	@When("Entering Topic Title")
	public void entering_topic_title() throws Throwable {
		Click(si.getForum_Page().getForum_title());
		String EnterTitle=FileReader_Manager.getInstanceConfig().getConfigdata().getForumtitle();
		inputValue(si.getForum_Page().getForum_title(),EnterTitle);
		
		
	 
	}

	@When("Entering End Time")
	public void entering_end_time() {
		
	   
	}

	@When("Entering Topic description")
	public void entering_topic_description() throws Throwable {
		Click(si.getForum_Page().getTopic_description());
		String TopicDescription=FileReader_Manager.getInstanceConfig().getConfigdata().gettopicdescription();
		inputValue(si.getForum_Page().getTopic_description(), TopicDescription);
	   
	}

	@When("Entering post details")
	public void entering_post_details() throws Throwable {
		Click(si.getForum_Page().getEnter_post());
		String PostDetails=FileReader_Manager.getInstanceConfig().getConfigdata().getEnterPost();
		inputValue(si.getForum_Page().getEnter_post(), PostDetails);
		Thread.sleep(2000);
	    
	}

	@When("seleting user")
	public void seleting_user() throws AWTException, InterruptedException {
        Click(si.getForum_Page().getSelecting_user());
        Thread.sleep(2000);
        Robot rt=new Robot();
		Actions a=new Actions(driver);
		rt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);

		rt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);


			Thread.sleep(4000);
			Click(si.getForum_Page().getSelecting_cliniciciuser());
			Thread.sleep(2000);
	    
	}

	@When("Clicking save button")
	public void clicking_save_button() throws InterruptedException {
		Click(si.getForum_Page().getSave());
		Thread.sleep(2000);
		Click(si.getForum_Page().getClosewindow_button());
		Thread.sleep(1000);
	/*   Click(si.getForum_Page().getUpcoming_forum());
	   Thread.sleep(2000);   */
	   Click(si.getAddingUser_Page().getProfileicon_field());
	   Thread.sleep(1000);
	   Click(si.getAddingUser_Page().getLogout_button());
	   Thread.sleep(1000);
	   Click(si.getAddingUser_Page().getLogoutfinal_click());
	}




}
