package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class Resource_Page extends Base_class{
	
	public Resource_Page()
	{
		PageFactory.initElements(driver, this);
	}
   
	@FindBy(xpath="//a[contains(text(),'RESOURCES')]")
	private WebElement navigate_resourcepage;
	
	   
	@FindBy(xpath="(//div[@class='sc-hLseeU sc-gLDzan UVHqw gNRcrj rdt_TableCell'])[2]")
	private WebElement resource_fromlist;
	
	@FindBy(xpath="//button[contains(text(),'SHARE')]")
	private WebElement click_Sharebutton;
	
	
	@FindBy(xpath="(//div[@class='react-select__input-container css-19bb58m'])[2]")
	private WebElement select_usergrouplist;
	
	
	@FindBy(xpath="//p[contains(text(),'cp userrr')]")
	private WebElement usergroup_name;
	
	
	@FindBy(xpath="(//button[contains(text(),'SHARE')])[2]")
	private WebElement share_final;
	
	@FindBy(xpath="(//button[contains(text(),'BACK TO RESOURCE')])")
	private WebElement backto_resource;
	
	@FindBy(xpath="//a[contains(text(),'SHARED RESOURCES')]")
	private WebElement shared_resource;
	

	@FindBy(xpath="//span[contains(text(),'View')]")
	private WebElement view_sharedresource;
	
	
	@FindBy(xpath="//span[contains(text(),'Remove')]")
	private WebElement clicking_removebutton;
	
	@FindBy(xpath="//button[contains(text(),'DELETE')]")
	private WebElement clicking_deletebutton;
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE')]")
	private WebElement clicking_continuebutton;

	public WebElement getNavigate_resourcepage() {
		return navigate_resourcepage;
	}

	public void setNavigate_resourcepage(WebElement navigate_resourcepage) {
		this.navigate_resourcepage = navigate_resourcepage;
	}

	public WebElement getResource_fromlist() {
		return resource_fromlist;
	}

	public void setResource_fromlist(WebElement resource_fromlist) {
		this.resource_fromlist = resource_fromlist;
	}

	public WebElement getClick_Sharebutton() {
		return click_Sharebutton;
	}

	public void setClick_Sharebutton(WebElement click_Sharebutton) {
		this.click_Sharebutton = click_Sharebutton;
	}

	public WebElement getSelect_usergrouplist() {
		return select_usergrouplist;
	}

	public void setSelect_usergrouplist(WebElement select_usergrouplist) {
		this.select_usergrouplist = select_usergrouplist;
	}

	public WebElement getUsergroup_name() {
		return usergroup_name;
	}

	public void setUsergroup_name(WebElement usergroup_name) {
		this.usergroup_name = usergroup_name;
	}

	public WebElement getShare_final() {
		return share_final;
	}

	public void setShare_final(WebElement share_final) {
		this.share_final = share_final;
	}

	public WebElement getBackto_resource() {
		return backto_resource;
	}

	public void setBackto_resource(WebElement backto_resource) {
		this.backto_resource = backto_resource;
	}

	public WebElement getShared_resource() {
		return shared_resource;
	}

	public void setShared_resource(WebElement shared_resource) {
		this.shared_resource = shared_resource;
	}

	public WebElement getView_sharedresource() {
		return view_sharedresource;
	}

	public void setView_sharedresource(WebElement view_sharedresource) {
		this.view_sharedresource = view_sharedresource;
	}

	public WebElement getClicking_removebutton() {
		return clicking_removebutton;
	}

	public void setClicking_removebutton(WebElement clicking_removebutton) {
		this.clicking_removebutton = clicking_removebutton;
	}

	public WebElement getClicking_deletebutton() {
		return clicking_deletebutton;
	}

	public void setClicking_deletebutton(WebElement clicking_deletebutton) {
		this.clicking_deletebutton = clicking_deletebutton;
	}

	public WebElement getClicking_continuebutton() {
		return clicking_continuebutton;
	}

	public void setClicking_continuebutton(WebElement clicking_continuebutton) {
		this.clicking_continuebutton = clicking_continuebutton;
	}
	
	
	
	
	
}
