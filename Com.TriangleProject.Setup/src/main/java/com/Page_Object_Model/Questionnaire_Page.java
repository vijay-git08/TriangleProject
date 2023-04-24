package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Base_class;

public class Questionnaire_Page extends Base_class{
	
	public Questionnaire_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'QUESTIONNAIRES')]")
	private WebElement click_questionnaireapage;
	
	@FindBy(xpath="//a[contains(text(),'QUESTIONNAIRE LIBRARY')]")
	private WebElement click_questionnairelibrary;
	
	@FindBy(xpath="(//button[contains(text(),'SHARE')])[2]")
	private WebElement share_questionnaire;
	
	@FindBy(xpath="//div[@class='react-select__input-container css-19bb58m']")
	private WebElement selectuser_group;
	
	@FindBy(xpath="//p[contains(text(),'cl user')]")     // (xpath="//p[contains(text(),'young patient')]")    
	private WebElement user_details;
	
	@FindBy(xpath="//a[contains(text(),'LOG IN')]")   //landingpage
	private WebElement login_landingpage;
	
	public WebElement getLogin_landingpage() {
		return login_landingpage;
	}

	public void setLogin_landingpage(WebElement login_landingpage) {
		this.login_landingpage = login_landingpage;
	}

	@FindBy(xpath="(//button[contains(text(),'SHARE')])[1]")
	private WebElement share_buttonquestionnaire;
	
	@FindBy(xpath="//button[contains(text(),'BACK TO QUESTIONNAIRE')]")
    private WebElement backto_questionnaire;
	
	@FindBy(xpath="//a[contains(text(),'QUESTIONNAIRES')]")
	private WebElement clinicain_questionnaire;
	
	@FindBy(xpath="//a[contains(text(),'NEW QUESTIONNAIRES')]")
	private WebElement clician_Newquestionnaie;
	
	@FindBy(xpath="(//button[contains(text(),'View')])[2]")
	private WebElement clinician_viewbutton;
	
	@FindBy(xpath="(//input[@class='text-field w-100    '])[1]")
	private WebElement qb_patientname;
	
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/section[1]/div[1]/section[2]/div[5]/div[1]/div[1]/div[2]/input[1]") 
	//(xpath="(//input[@class='text-field w-100    '])[2]")
	private WebElement qb_date;
	
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/section[1]/div[1]/section[2]/div[6]/div[1]/div[1]/div[2]/input[1]")
	//(xpath="(//input[@class='text-field w-100    '])[3]")
	private WebElement qb_patientID;
	
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/section[1]/div[1]/section[2]/div[7]/div[1]/div[1]/div[2]/input[1]")
	//(xpath="(//input[@class='text-field w-100    '])[4]")
	private WebElement qb_Rater;
	
	@FindBy(xpath="(//span[contains(text(),'1')])[2]")
	private WebElement qbquestion_1;
	
	@FindBy(xpath="(//span[contains(text(),'2')])[2]")
	private WebElement qbquestion_1b;
	
	@FindBy(xpath="(//span[contains(text(),'3')])[3]")
	private WebElement qbquestion_2;
	
	@FindBy(xpath="(//span[contains(text(),'1')])[5]")
	private WebElement qbquestion_3;
	
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/section[1]/div[1]/section[2]/div[12]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	//(xpath="(//button[@type='button'])[7]")
	private WebElement qbquestion_4;
	
	@FindBy(xpath="(//span[@class='choose-checkmark'])[22]")
	//(xpath="(//span[contains(text(),'2')])[5]")
	private WebElement qbquestion_5;
	

	@FindBy(xpath="(//span[contains(text(),'2')])[7]")
	private WebElement qbquestion_6;
	
	@FindBy(xpath="(//span[contains(text(),'4')])[7]")
	private WebElement qbquestion_6b;
	
	@FindBy(xpath="(//span[contains(text(),'4')])[8]")
	private WebElement qbquestion_7;
	
	@FindBy(xpath="(//span[contains(text(),'2')])[9]")
	private WebElement qbquestion_8;
	
	@FindBy(xpath="//body/div[@id='root']/main[1]/div[2]/section[1]/div[1]/section[2]/div[18]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	//(xpath="(//button[@type='button'])[8]")
	private WebElement qbquestion_9;
	
	@FindBy(xpath="(//span[contains(text(),'4')])[10]")
	private WebElement qbquestion_10;
	
	@FindBy(xpath="//button[contains(text(),'SUBMIT')]")
	private WebElement qb_submit;
	
	@FindBy(xpath="//button[contains(text(),'BACK TO QUESTIONNAIRE')]")
	private WebElement qb_backtoquestionnre;
	
	@FindBy(xpath="//a[contains(text(),'COMPLETED QUESTIONNAIRES')]")
	private WebElement qb_completedquestionnaire;
	
	@FindBy(xpath="(//button[contains(text(),'View')])[2]")
	private WebElement completedquestionniare_view;
	
	@FindBy(xpath="//div[@class='back_block']")
	private WebElement clicktoback;

	public WebElement getClick_questionnaireapage() {
		return click_questionnaireapage;
	}

	public void setClick_questionnaireapage(WebElement click_questionnaireapage) {
		this.click_questionnaireapage = click_questionnaireapage;
	}

	public WebElement getClick_questionnairelibrary() {
		return click_questionnairelibrary;
	}

	public void setClick_questionnairelibrary(WebElement click_questionnairelibrary) {
		this.click_questionnairelibrary = click_questionnairelibrary;
	}

	public WebElement getShare_questionnaire() {
		return share_questionnaire;
	}

	public void setShare_questionnaire(WebElement share_questionnaire) {
		this.share_questionnaire = share_questionnaire;
	}

	public WebElement getSelectuser_group() {
		return selectuser_group;
	}

	public void setSelectuser_group(WebElement selectuser_group) {
		this.selectuser_group = selectuser_group;
	}

	public WebElement getUser_details() {
		return user_details;
	}

	public void setUser_details(WebElement user_details) {
		this.user_details = user_details;
	}

	public WebElement getShare_buttonquestionnaire() {
		return share_buttonquestionnaire;
	}

	public void setShare_buttonquestionnaire(WebElement share_buttonquestionnaire) {
		this.share_buttonquestionnaire = share_buttonquestionnaire;
	}

	public WebElement getBackto_questionnaire() {
		return backto_questionnaire;
	}

	public void setBackto_questionnaire(WebElement backto_questionnaire) {
		this.backto_questionnaire = backto_questionnaire;
	}

	public WebElement getClinicain_questionnaire() {
		return clinicain_questionnaire;
	}

	public void setClinicain_questionnaire(WebElement clinicain_questionnaire) {
		this.clinicain_questionnaire = clinicain_questionnaire;
	}

	public WebElement getClician_Newquestionnaie() {
		return clician_Newquestionnaie;
	}

	public void setClician_Newquestionnaie(WebElement clician_Newquestionnaie) {
		this.clician_Newquestionnaie = clician_Newquestionnaie;
	}

	public WebElement getClinician_viewbutton() {
		return clinician_viewbutton;
	}

	public void setClinician_viewbutton(WebElement clinician_viewbutton) {
		this.clinician_viewbutton = clinician_viewbutton;
	}

	public WebElement getQb_patientname() {
		return qb_patientname;
	}

	public void setQb_patientname(WebElement qb_patientname) {
		this.qb_patientname = qb_patientname;
	}

	public WebElement getQb_date() {
		return qb_date;
	}

	public void setQb_date(WebElement qb_date) {
		this.qb_date = qb_date;
	}

	public WebElement getQb_patientID() {
		return qb_patientID;
	}

	public void setQb_patientID(WebElement qb_patientID) {
		this.qb_patientID = qb_patientID;
	}

	public WebElement getQb_Rater() {
		return qb_Rater;
	}

	public void setQb_Rater(WebElement qb_Rater) {
		this.qb_Rater = qb_Rater;
	}

	public WebElement getQbquestion_1() {
		return qbquestion_1;
	}

	public void setQbquestion_1(WebElement qbquestion_1) {
		this.qbquestion_1 = qbquestion_1;
	}

	public WebElement getQbquestion_1b() {
		return qbquestion_1b;
	}

	public void setQbquestion_1b(WebElement qbquestion_1b) {
		this.qbquestion_1b = qbquestion_1b;
	}

	public WebElement getQbquestion_2() {
		return qbquestion_2;
	}

	public void setQbquestion_2(WebElement qbquestion_2) {
		this.qbquestion_2 = qbquestion_2;
	}

	public WebElement getQbquestion_3() {
		return qbquestion_3;
	}

	public void setQbquestion_3(WebElement qbquestion_3) {
		this.qbquestion_3 = qbquestion_3;
	}

	public WebElement getQbquestion_4() {
		return qbquestion_4;
	}

	public void setQbquestion_4(WebElement qbquestion_4) {
		this.qbquestion_4 = qbquestion_4;
	}

	public WebElement getQbquestion_5() {
		return qbquestion_5;
	}

	public void setQbquestion_5(WebElement qbquestion_5) {
		this.qbquestion_5 = qbquestion_5;
	}

	public WebElement getQbquestion_6() {
		return qbquestion_6;
	}

	public void setQbquestion_6(WebElement qbquestion_6) {
		this.qbquestion_6 = qbquestion_6;
	}

	public WebElement getQbquestion_6b() {
		return qbquestion_6b;
	}

	public void setQbquestion_6b(WebElement qbquestion_6b) {
		this.qbquestion_6b = qbquestion_6b;
	}

	public WebElement getQbquestion_7() {
		return qbquestion_7;
	}

	public void setQbquestion_7(WebElement qbquestion_7) {
		this.qbquestion_7 = qbquestion_7;
	}

	public WebElement getQbquestion_8() {
		return qbquestion_8;
	}

	public void setQbquestion_8(WebElement qbquestion_8) {
		this.qbquestion_8 = qbquestion_8;
	}

	public WebElement getQbquestion_9() {
		return qbquestion_9;
	}

	public void setQbquestion_9(WebElement qbquestion_9) {
		this.qbquestion_9 = qbquestion_9;
	}

	public WebElement getQbquestion_10() {
		return qbquestion_10;
	}

	public void setQbquestion_10(WebElement qbquestion_10) {
		this.qbquestion_10 = qbquestion_10;
	}

	public WebElement getQb_submit() {
		return qb_submit;
	}

	public void setQb_submit(WebElement qb_submit) {
		this.qb_submit = qb_submit;
	}

	public WebElement getQb_backtoquestionnre() {
		return qb_backtoquestionnre;
	}

	public void setQb_backtoquestionnre(WebElement qb_backtoquestionnre) {
		this.qb_backtoquestionnre = qb_backtoquestionnre;
	}

	public WebElement getQb_completedquestionnaire() {
		return qb_completedquestionnaire;
	}

	public void setQb_completedquestionnaire(WebElement qb_completedquestionnaire) {
		this.qb_completedquestionnaire = qb_completedquestionnaire;
	}

	public WebElement getCompletedquestionniare_view() {
		return completedquestionniare_view;
	}

	public void setCompletedquestionniare_view(WebElement completedquestionniare_view) {
		this.completedquestionniare_view = completedquestionniare_view;
	}

	public WebElement getClicktoback() {
		return clicktoback;
	}

	public void setClicktoback(WebElement clicktoback) {
		this.clicktoback = clicktoback;
	}
	
	
}
