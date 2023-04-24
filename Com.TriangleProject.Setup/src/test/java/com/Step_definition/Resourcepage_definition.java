package com.Step_definition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import com.BaseClass.Base_class;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.singleTon_Design.Singe_Ton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Resourcepage_definition extends Base_class {
	
	public static Singe_Ton si=new Singe_Ton();
	
	@And("Navigating to Resource page")
	public void navigating_to_resource_page() throws InterruptedException {
		Thread.sleep(2000);
	   Click(si.getResource_Page().getNavigate_resourcepage());
	   Thread.sleep(5000);
	}


	@And("Clicking resource from the list")
	public void clicking_resource_from_the_list() throws AWTException, InterruptedException {
		Click(si.getResource_Page().getResource_fromlist());
	    Thread.sleep(2000);

	}

	@And("Click share button")
	public void click_share_button() throws InterruptedException {
		Click(si.getResource_Page().getClick_Sharebutton());
	    Thread.sleep(2000);

	}

	@And("Selecting user group")
	public void selecting_user_group() throws InterruptedException, AWTException {
	   Click(si.getResource_Page().getSelect_usergrouplist());
	   Thread.sleep(2000);
	   Robot rt=new Robot();
	   Actions a=new Actions(driver);
	   rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	@And("selecting user")
	public void selecting_user() throws InterruptedException {
	   Click(si.getResource_Page().getUsergroup_name());
	   Thread.sleep(2000);

	}

	@And("clicking share button")
	public void clicking_share_button() throws InterruptedException {
	  Click(si.getResource_Page().getShare_final());
      Thread.sleep(2000);

	}

	@And("clicking shared resource button")
	public void clicking_shared_resource_button() throws InterruptedException {
	   Click(si.getResource_Page().getBackto_resource());
	   Thread.sleep(2000);
	   JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);

	}

	@And("clicking view button in shared resource page")
	public void clicking_view_button_in_shared_resource_page() throws InterruptedException {
	   Click(si.getResource_Page().getShared_resource());
	   Thread.sleep(2000);

	}

	@And("clickinf remove button")
	public void clickinf_remove_button() throws InterruptedException {
	   Click(si.getResource_Page().getView_sharedresource());
	   Thread.sleep(3000);
	   Click(si.getResource_Page().getClicking_removebutton());
	   Thread.sleep(4000);

	}

	@And("clicking delete button")
	public void clicking_delete_button() throws InterruptedException {
	    Click(si.getResource_Page().getClicking_deletebutton());
	    Thread.sleep(4000);


	}

	@When("clicking continue button")
	public void clicking_continue_button() throws InterruptedException {
	   Click(si.getResource_Page().getClicking_continuebutton());
	   Thread.sleep(3000);

	}

	@When("clicking profile button")
	public void clicking_profile_button() throws InterruptedException {
	    Click(si.getAddingUser_Page().getProfileicon_field());
	    Thread.sleep(3000);

	}

	@Then("Clicking logout")
	public void clicking_logout() throws InterruptedException {
	    Click(si.getAddingUser_Page().getLogout_button());
	    Thread.sleep(3000);
	    Click(si.getAddingUser_Page().getLogoutfinal_click());

	}




}
