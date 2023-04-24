package com.singleTon_Design;

import com.BaseClass.Base_class;
import com.Page_Object_Model.AddingUser_Page;
import com.Page_Object_Model.Forum_Page;
import com.Page_Object_Model.Login_Page;
import com.Page_Object_Model.Questionnaire_Page;
import com.Page_Object_Model.Resource_Page;
import com.Page_Object_Model.UserManagement_Page;

import io.cucumber.core.resource.Resource;

public class Singe_Ton extends Base_class {
	
	
	private Login_Page login_Page;
	private AddingUser_Page addingUser_Page;
	private UserManagement_Page userManagement_Page;
	private Resource_Page resource_Page;
	private Questionnaire_Page questionnaire_Page;
	private Forum_Page forum_Page;
	
	public UserManagement_Page getUserManagement_Page() {
		userManagement_Page=new UserManagement_Page();
		return userManagement_Page;
	}

	public Login_Page getLogin_Page() {
		login_Page=new Login_Page();
		return login_Page;
		
	}

	public AddingUser_Page getAddingUser_Page() {
		addingUser_Page=new AddingUser_Page();
		return addingUser_Page;
	}
	
	public Resource_Page getResource_Page() {
		resource_Page=new Resource_Page();
		return resource_Page;
	}
	
	public Questionnaire_Page getQuestionnaire_Page() {
		questionnaire_Page=new Questionnaire_Page();
		return questionnaire_Page;

	}
     
	 public  Forum_Page getForum_Page() {
		 forum_Page=new Forum_Page();
		return forum_Page;

	}
	
	

}
