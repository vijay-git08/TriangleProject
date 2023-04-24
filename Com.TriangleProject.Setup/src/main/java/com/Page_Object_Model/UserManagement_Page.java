package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class UserManagement_Page extends Base_class {
	
	public UserManagement_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id='filterBy']")
	private WebElement filterby_field;
	
	
	
	@FindBy(xpath="//input[@class='text-field']")
	private WebElement searchbox_field;
	
	
	@FindBy(xpath="//span[contains(text(),'Clear')]")
	private WebElement clear_field;
	
	
	@FindBy(xpath="//img[@src='/static/media/Profileicon.0d3bf2e9858fa72d2b812953c8156a66.svg']")
	private WebElement profileicon_field;
	
	@FindBy(xpath="//div[contains(text(),'Logout')]")
	private WebElement logout_button;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement logoutfinal_click;
	
	@FindBy(xpath="(//button[@class='btn secondary-btn'])[3]")
	private WebElement edit_button;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement getlastName_Edit;
	
	@FindBy(xpath="(//div[@class='popup-card-close'])[1]")
	private WebElement cancel_symbol;
	
	@FindBy(xpath="//button[contains(text(),'UPDATE')]")
	private WebElement updatebutton_profilepage;
	
	@FindBy(xpath="//div[contains(text(),'Account')]")
	private WebElement Account_button;
	
	@FindBy (xpath="//input[@id='mobileNo']")
	private WebElement mobile_field;
	
	@FindBy(xpath="//button[contains(text(),'Update')]")
	private WebElement updatebutton_progilepage;
	
	
	



	public WebElement getEdit_button() {
		return edit_button;
	}

	

	

	public WebElement getGetlastName_Edit() {
		return getlastName_Edit;
	}





	public WebElement getCancel_symbol() {
		return cancel_symbol;
	}

	public WebElement getUpdatebutton_profilepage() {
		return updatebutton_profilepage;
	}

	public WebElement getAccount_button() {
		return Account_button;
	}

	public WebElement getMobile_field() {
		return mobile_field;
	}

	public WebElement getUpdatebutton_progilepage() {
		return updatebutton_progilepage;
	}

	public WebElement getLogoutfinal_click() {
		return logoutfinal_click;
	}



	public WebElement getLogout_button() {
		return logout_button;
	}

	public WebElement getProfileicon_field() {
		return profileicon_field;
	}

	public WebElement getClear_field() {
		return clear_field;
	}

	public WebElement getFilterby_field() {
		return filterby_field;
	}

	public WebElement getSearchbox_field() {
		return searchbox_field;
	}





}
