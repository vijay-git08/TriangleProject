package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class AddingUser_Page extends Base_class{
	
	public AddingUser_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text (),'Add a new user')]")
	private WebElement addbutton_field;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstname_field;
	

	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastname_field;
	
	

	@FindBy(xpath="//input[@id='email']")
	private WebElement email_field;
	
	@FindBy(xpath="//img[@src='/static/media/Profileicon.0d3bf2e9858fa72d2b812953c8156a66.svg']")
	private WebElement profileicon_field;
	
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	private WebElement logout_button;
	
	@FindBy(xpath="//button[contains(text(),'ADD')]")
	private WebElement click_Addbutton;
	
	public WebElement getClick_Addbutton() {
		return click_Addbutton;
	}


	public void setClick_Addbutton(WebElement click_Addbutton) {
		this.click_Addbutton = click_Addbutton;
	}


	public WebElement getProfileicon_field() {
		return profileicon_field;
	}


	public WebElement getLogoutfinal_click() {
		return logoutfinal_click;
	}

	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement logoutfinal_click;
	


	public WebElement getLogout_button() {
		return logout_button;
	}


	public WebElement getAddbutton_field() {
		return addbutton_field;
	}


	public WebElement getFirstname_field() {
		return firstname_field;
	}


	public WebElement getLastname_field() {
		return lastname_field;
	}



	public WebElement getEmail_field() {
		return email_field;
	}


	

}
