package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class Login_Page extends Base_class {
	
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement email_field;
	
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_field;
	
	@FindBy(xpath="//*[contains(text(), 'Next')]")
	private WebElement login_button;

	 
	public WebElement getEmail_field() {
		return email_field;
	}

	public WebElement getPassword_field() {
		return password_field;
	}

	public WebElement getLogin_button() {
		return login_button;
	};
	
	
	


}
