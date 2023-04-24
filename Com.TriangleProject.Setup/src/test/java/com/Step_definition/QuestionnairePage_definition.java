package com.Step_definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.configuration_reader.FileReader_Manager;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuestionnairePage_definition extends Base_class {
	
	public static Singe_Ton si=new Singe_Ton();
	
	@And("Navigating to Questionnaire page")
	public void navigating_to_questionnaire_page() throws InterruptedException {
	   Click(si.getQuestionnaire_Page().getClick_questionnaireapage());
	   Thread.sleep(5000);
	}

	@And("click Questionnaire library")
	public void click_questionnaire_library() throws InterruptedException {
	    Click(si.getQuestionnaire_Page().getClick_questionnairelibrary());
		Thread.sleep(5000);

	}

	@And("click share button for cybocs clinician")
	public void click_share_button_for_cybocs_clinician() throws InterruptedException {
	    Click(si.getQuestionnaire_Page().getShare_questionnaire());
		Thread.sleep(7000);

	}

	@And("Select User Group")
	public void select_user_group() throws AWTException, InterruptedException {
	  Click(si.getQuestionnaire_Page().getSelectuser_group());
		Thread.sleep(5000);

	  Robot rt=new Robot();
		Actions a=new Actions(driver);
		rt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);

		rt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	@And("Select user")
	public void select_user() throws InterruptedException {
	  Click(si.getQuestionnaire_Page().getUser_details());
		Thread.sleep(4000);

	}

	@And("Click Share button")
	public void click_share_button() throws InterruptedException {
	   Click(si.getQuestionnaire_Page().getShare_buttonquestionnaire());
		Thread.sleep(3000);

	}

	@And("Click Back To Questionnaire")
	public void click_back_to_questionnaire() throws InterruptedException {
	    Click(si.getQuestionnaire_Page().getBackto_questionnaire());
		Thread.sleep(3000);

	}

	@And("Click Profile icon and logout")
	public void click_profile_icon_and_logout() throws InterruptedException {
	   Click(si.getAddingUser_Page().getProfileicon_field());
	   Thread.sleep(2000);
	   Click(si.getAddingUser_Page().getLogout_button());
		Thread.sleep(3000);

	   Click(si.getAddingUser_Page().getLogoutfinal_click());
		Thread.sleep(3000);
		
	}

	@And("Login as Clinician")
	public void login_as_clinician() throws Throwable {
		Click(si.getQuestionnaire_Page().getLogin_landingpage());
		Thread.sleep(2000);
	  String clinicianname=FileReader_Manager.getInstanceConfig().getConfigdata().getclinicianname();
	  inputValue(si.getLogin_Page().getEmail_field(), clinicianname);
	  String Passwordc=FileReader_Manager.getInstanceConfig().getConfigdata().getPasswordc();
	    inputValue(si.getLogin_Page().getPassword_field(), Passwordc);
	    Click(si.getLogin_Page().getLogin_button());
		Thread.sleep(2000);

	}

	@And("click Questionnaire")
	public void click_questionnaire() throws Throwable {
		Click(si.getQuestionnaire_Page().getClinicain_questionnaire());
		Thread.sleep(2000);
		
		
	}

	@And("click New Questionnaire")
	public void click_new_questionnaire() throws InterruptedException {
	  Click(si.getQuestionnaire_Page().getClician_Newquestionnaie());
		Thread.sleep(2000);

	}

	@And("click view Questionnaire")
	public void click_view_questionnaire() throws InterruptedException {
	    Click(si.getQuestionnaire_Page().getClinician_viewbutton());
		Thread.sleep(2000);
					

	}

	@And("Fill all details in the page")
	public void fill_all_details_in_the_page() throws Throwable {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		Click(si.getQuestionnaire_Page().getQb_patientname());
		Thread.sleep(4000);
		FileReader_Manager.getInstanceConfig();
		String patientname=FileReader_Manager.getConfigdata().getPatientname();
		inputValue(si.getQuestionnaire_Page().getQb_patientname(), patientname);
		Thread.sleep(1000);
		
		Click(si.getQuestionnaire_Page().getQb_date());
		Thread.sleep(1000);
		FileReader_Manager.getInstanceConfig();
		String dates=FileReader_Manager.getConfigdata().getDate();
		inputValue(si.getQuestionnaire_Page().getQb_date(), dates);
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		Click(si.getQuestionnaire_Page().getQb_patientID());
		Thread.sleep(1000);
		FileReader_Manager.getInstanceConfig();
		String patientid=FileReader_Manager.getConfigdata().getPatientId();
		inputValue(si.getQuestionnaire_Page().getQb_patientID(), patientid);
		Thread.sleep(1000);

		
		Click(si.getQuestionnaire_Page().getQb_Rater());
		Thread.sleep(1000);
		FileReader_Manager.getInstanceConfig();
		String rater=FileReader_Manager.getConfigdata().getRater();
		inputValue(si.getQuestionnaire_Page().getQb_Rater(), rater);
		Thread.sleep(1000);
		
		Click(si.getQuestionnaire_Page().getQbquestion_1());
		Thread.sleep(2000);
		
		Click(si.getQuestionnaire_Page().getQbquestion_1b());
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(4000);

		
		Click(si.getQuestionnaire_Page().getQbquestion_2());
		Thread.sleep(2000);
		
		
		Click(si.getQuestionnaire_Page().getQbquestion_3());
		Thread.sleep(2000);
		
		Click(si.getQuestionnaire_Page().getQbquestion_4());
		Thread.sleep(2000);

		
		Click(si.getQuestionnaire_Page().getQbquestion_5());
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,710)");
		Thread.sleep(7000);
		

		
		Click(si.getQuestionnaire_Page().getQbquestion_6());
		Thread.sleep(5000);
		
		Click(si.getQuestionnaire_Page().getQbquestion_6b());
		Thread.sleep(4000);
		


		
		Click(si.getQuestionnaire_Page().getQbquestion_7());
		Thread.sleep(2000);
		

		Click(si.getQuestionnaire_Page().getQbquestion_8());
		Thread.sleep(5000);
		
		Click(si.getQuestionnaire_Page().getQbquestion_9());
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,712)");

		
		Click(si.getQuestionnaire_Page().getQbquestion_10());
		Thread.sleep(5000);
		
		
	    
	}

	@And("Click submit button")
	public void click_submit_button() throws InterruptedException {
	  Click(si.getQuestionnaire_Page().getQb_submit());
		Thread.sleep(4000);

	}
	@And("click Back To Questionnaire button")
	public void click_back_to_questionnaire_button() throws InterruptedException {
	   Click(si.getQuestionnaire_Page().getBackto_questionnaire());
		Thread.sleep(5000);

	}

/*	@And("click completed Questionnaire page")
	public void click_completed_questionnaire_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click and view completed Qustionnaire")
	public void click_and_view_completed_qustionnaire() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("click to Back")
	public void click_to_back() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
*/
	@And("click profile icon")
	public void click_profile_icon() throws InterruptedException {
	   Click(si.getAddingUser_Page().getProfileicon_field());
		Thread.sleep(2000);

	   Click(si.getAddingUser_Page().getLogout_button());
		Thread.sleep(2000);

	}

	@Then("click logout button")
	public void click_logout_button() throws InterruptedException {
	    Click(si.getAddingUser_Page().getLogoutfinal_click());
		Thread.sleep(2000);

	}



}