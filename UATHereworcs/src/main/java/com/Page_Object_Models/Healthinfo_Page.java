package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Healthinfo_Page {
	public WebDriver driver;

	@FindBy(xpath = "(//a[normalize-space()='PREVIEW'])[1]")
	private WebElement healthinfopreview;

	@FindBy(xpath = "//button[@class='mw-btn outline d-block my-3 continue-edit']")
	private WebElement Edit;

	@FindBy(xpath = "(//input[@placeholder='Type your answer here'])[2]")
	private WebElement jsscroll;

	@FindBy(xpath = "(//div[@class='q-card-body'])[4]")
	private WebElement dot;

	@FindBy(xpath = "(//button[@name='status'])[3]")
	private WebElement publish;

	@FindBy(xpath = "(//button[@name='status'])[1]")
	private WebElement savebtn;

	@FindBy(xpath = "(//*[name()='path'][@id='Path_11125'])[8]")
	private WebElement exist;

	@FindBy(xpath = "(//div[@id='favourite'])[4]")
	private WebElement favourite;

	@FindBy(xpath = "(//button[normalize-space()='LOGOUT'])[1]")
	private WebElement logout;

	@FindBy(xpath = "(//div[@class='footer-desktop-img position-relative '])[1]")
	private WebElement clinicanmenu;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[5]/a[1]/li[1]")
	private WebElement clinicianque;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")
	private WebElement dots;

	@FindBy(xpath = "(//button[normalize-space()='SHARE'])[1]")
	private WebElement share;

	@FindBy(xpath = "(//@*[contains(.,'custom-control-label share pl-0 share-blue')])[1]")
	private WebElement walter;

	@FindBy(xpath = "(//p[@class='dropdown-u-name pr-3'])[1]")
	private WebElement account;

	@FindBy(xpath = "(//button[normalize-space()='LOGOUT'])[1]")
	private WebElement acclogout;

	@FindBy(xpath = "(//button[normalize-space()='Share'])[1]")
	private WebElement clinicianshare;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[3]/a[1]/li[1]")
	private WebElement myhealth;

	@FindBy(xpath = "(//a[normalize-space()='Questionnaires'])[1]")
	private WebElement patientquestions;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")
	private WebElement healthmenu;

	@FindBy(xpath = "(//a[normalize-space()='START QUESTIONNAIRE'])[1]")
	private WebElement start;

	@FindBy(xpath = "(//input[@name='userAnswers[0][answer]'])[1]")
	private WebElement answer1;

	@FindBy(xpath = "(//input[@name='userAnswers[1][answer]'])[1]")
	private WebElement answer2;

	@FindBy(xpath = "(//select[@name='userAnswers[2][answer]'])[1]")
	private WebElement answer3;

	@FindBy(xpath = "(//span[@for='share-entire-phr'])[2]")
	private WebElement answer4;

	@FindBy(xpath = "(//input[@name='userAnswers[4][answer]'])[1]")
	private WebElement answer5;

	@FindBy(xpath = "(//button[normalize-space()='DONE'])[1]")
	private WebElement Done;

	@FindBy(xpath = "(//div[@class='person-img'])[1]")
	private WebElement queimg;

	@FindBy(xpath = "(//div[@class='r-list d-flex-space mrg-bt-15 resize-div'])[1]")
	private WebElement scrolldown;

	@FindBy(xpath = "(//label[@class='custom-control-label share share-blue']/text())[3]")
	private WebElement disclaimer;

	@FindBy(xpath = "(//label[@for='privacy_policy'])[1]")
	private WebElement privacy;

	@FindBy(xpath = "(//label[contains(text(),'I understand what')])[1]")
	private WebElement happens;

	@FindBy(xpath = "(//label[contains(text(),'I understand the')])[1]")
	private WebElement statement;

	@FindBy(xpath = "(//*[name()='path'][@id='Path_11125'])[7]")
	private WebElement privacyclose;
	
	@FindBy(xpath = "(//select[@id='question_status'])[1]")
	private WebElement scrolldown2;
	
	@FindBy(xpath = "(//div[@class='checkbox-wrapper'])[1]")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//span[@for='share-entire-phr'])[1]")
	private WebElement yesbtn;
	
	@FindBy(xpath = "(//select[@id='contact_type'])[1]")
	private WebElement yesmulti1;
	
	@FindBy(xpath = "(//option[text()='Neckpains'])[1]")
	private WebElement sec1;
    
	@FindBy(xpath = "(//select[@id='contact_type'])[2]")
	private WebElement yesmulti2;
	
	@FindBy(xpath = "(//option[text()='How much the pain in neck?'])[2]")
	private WebElement sec2;
	
	public WebElement getPublish() {
		return publish;
	}

	public Healthinfo_Page(WebDriver healthpg) {
		this.driver = healthpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getHealthinfopreview() {
		return healthinfopreview;
	}

	public WebElement getEdit() {
		return Edit;
	}

	public WebElement getJsscroll() {
		return jsscroll;
	}

	public WebElement getDot() {
		return dot;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getExist() {
		return exist;
	}

	public WebElement getFavourite() {
		return favourite;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getClinicanmenu() {
		return clinicanmenu;
	}

	public WebElement getClinicianque() {
		return clinicianque;
	}

	public WebElement getDots() {
		return dots;
	}

	public WebElement getShare() {
		return share;
	}

	public WebElement getWalter() {
		return walter;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getAcclogout() {
		return acclogout;
	}

	public WebElement getClinicianshare() {
		return clinicianshare;
	}

	public WebElement getMyhealth() {
		return myhealth;
	}

	public WebElement getPatientquestions() {
		return patientquestions;
	}

	public WebElement getHealthmenu() {
		return healthmenu;
	}

	public WebElement getStart() {
		return start;
	}

	public WebElement getAnswer1() {
		return answer1;
	}

	public WebElement getAnswer2() {
		return answer2;
	}

	public WebElement getAnswer3() {
		return answer3;
	}

	public WebElement getAnswer4() {
		return answer4;
	}

	public WebElement getAnswer5() {
		return answer5;
	}

	public WebElement getDone() {
		return Done;
	}

	public WebElement getQueimg() {
		return queimg;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getDisclaimer() {
		return disclaimer;
	}

	public WebElement getPrivacy() {
		return privacy;
	}

	public WebElement getHappens() {
		return happens;
	}

	public WebElement getStatement() {
		return statement;
	}

	public WebElement getPrivacyclose() {
		return privacyclose;
	}

	public WebElement getScrolldown2() {
		return scrolldown2;
	}

	public WebElement getcheckbox() {
		return checkbox;
	}

	public WebElement getyesbtn() {
		return yesbtn;
	}

	public WebElement getYesmulti1() {
		return yesmulti1;
	}

	public WebElement getSec1() {
		return sec1;
	}

	public WebElement getYesmulti2() {
		return yesmulti2;
	}

	public WebElement getSec2() {
		return sec2;
	}

}
