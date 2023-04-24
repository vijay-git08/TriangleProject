package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class Forum_Page extends Base_class {
	
	public  Forum_Page() {
		PageFactory.initElements(driver, this);	
		}
	
	
	@FindBy(xpath="(//a[contains(text(),'FORUM')])[1]")
	private WebElement Forum_module;
	
	@FindBy(xpath="//button[contains(text(),'CREATE NEW TOPIC')]")
	private WebElement createnew_topic;
	
	@FindBy(xpath="//input[@id='title']")
	private WebElement forum_title;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement Topic_description;
	
	@FindBy(xpath="//textarea[@id='entryPost']")
	private WebElement Enter_post;
	
	@FindBy(xpath="//div[@class='react-select__control css-1im77uy-control']/div[2]")
	private WebElement Selecting_user;
	
	@FindBy(xpath="//button[contains(text(),'CLOSE WINDOW')]")
	private WebElement closewindow_button;
	
	@FindBy (xpath="//button[contains(text(),'CLOSE WINDOW')]")
	private WebElement upcoming_forum;
	

	
	
	
	public WebElement getClosewindow_button() {
		return closewindow_button;
	}

	public void setClosewindow_button(WebElement closewindow_button) {
		this.closewindow_button = closewindow_button;
	}

	public WebElement getUpcoming_forum() {
		return upcoming_forum;
	}

	public void setUpcoming_forum(WebElement upcoming_forum) {
		this.upcoming_forum = upcoming_forum;
	}

	public WebElement getSelecting_user() {
		return Selecting_user;
	}

	public void setSelecting_user(WebElement selecting_user) {
		Selecting_user = selecting_user;
	}


	@FindBy (xpath="//p[contains(text(),'cl user')]")
	private WebElement selecting_cliniciciuser;
	
	public WebElement getForum_module() {
		return Forum_module;
	}

	public void setForum_module(WebElement forum_module) {
		Forum_module = forum_module;
	}

	public WebElement getCreatenew_topic() {
		return createnew_topic;
	}

	public void setCreatenew_topic(WebElement createnew_topic) {
		this.createnew_topic = createnew_topic;
	}

	public WebElement getForum_title() {
		return forum_title;
	}

	public void setForum_title(WebElement forum_title) {
		this.forum_title = forum_title;
	}

	public WebElement getTopic_description() {
		return Topic_description;
	}

	public void setTopic_description(WebElement topic_description) {
		Topic_description = topic_description;
	}

	public WebElement getEnter_post() {
		return Enter_post;
	}

	public void setEnter_post(WebElement enter_post) {
		Enter_post = enter_post;
	}

	public WebElement getSelecting_cliniciciuser() {
		return selecting_cliniciciuser;
	}

	public void setSelecting_cliniciciuser(WebElement selecting_cliniciciuser) {
		this.selecting_cliniciciuser = selecting_cliniciciuser;
	}

	public WebElement getSave() {
		return save;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}


	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement save;
	
	
	
}
