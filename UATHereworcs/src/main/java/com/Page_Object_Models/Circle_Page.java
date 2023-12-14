package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Circle_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//label[normalize-space()='Notifications'])[1]")
	private WebElement noticifaction;
	
	@FindBy(xpath = "(//span[contains(text(),'View')])[1]")
	private WebElement viewnow;
	
	@FindBy(xpath = "(//button[normalize-space()='DECLINE'])[1]")
	private WebElement decline;
	
	@FindBy(xpath = "(//button[normalize-space()='YES, CANCEL FOREVER'])[1]")
	private WebElement yes;
	
	@FindBy(xpath = "(//div[@class='footer-desktop-img position-relative'])[1]")
	private WebElement menu;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[2]/a[1]/li[1]")
	private WebElement circle;
	
	@FindBy(xpath = "(//a[@href='#'][normalize-space()='My circle'])[1]")
	private WebElement mycircle;
	
	@FindBy(xpath = "(//a[@class='add-person-link m-b-30 flex-between'])[1]")
	private WebElement addnew;
	
	@FindBy(xpath = "(//select[@id='relationship'])[1]")
	private WebElement choose;
	
	@FindBy(xpath = "(//option[@value='friends & family'])[1]")
	private WebElement family;
	
	@FindBy(xpath = "(//input[@id='fname'])[1]")
	private WebElement fname;
	
	@FindBy(xpath = "(//input[@id='lname'])[1]")
	private WebElement lname;
	
	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "(//span[@id='targetClick'])[1]")
	private WebElement myhealth;
	
	@FindBy(xpath = "(//span[@id='targetClick'])[3]")
	private WebElement tracker;
	
	@FindBy(xpath = "(//span[@for='share-entire-phr'])[5]")
	private WebElement saved;
	
	@FindBy(xpath = "(//button[contains(@class,'mw-btn m-2')][normalize-space()='INVITE'])[1]")
	private WebElement invite;
	
	@FindBy(xpath = "//option[@value='clinician']")
	private WebElement clinician;
	
	@FindBy(xpath = "(//input[@id='hospital'])[1]")
	private WebElement hospital;
	
	@FindBy(xpath = "(//*[name()='path'][@id='Path_11125'])[7]")
	private WebElement Exit;
	
	@FindBy(xpath = "(//input[@id='speciality'])[1]")
	private WebElement Speciality;
	
	
	public Circle_Page(WebDriver circlepg) {
		this.driver = circlepg;

		PageFactory.initElements(driver, this);

	}


	public WebElement getNoticifaction() {
		return noticifaction;
	}


	public WebElement getViewnow() {
		return viewnow;
	}


	public WebElement getDecline() {
		return decline;
	}


	public WebElement getYes() {
		return yes;
	}


	public WebElement getMenu() {
		return menu;
	}


	public WebElement getCircle() {
		return circle;
	}


	public WebElement getMycircle() {
		return mycircle;
	}


	public WebElement getAddnew() {
		return addnew;
	}


	public WebElement getFamily() {
		return family;
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getMyhealth() {
		return myhealth;
	}


	public WebElement getTracker() {
		return tracker;
	}


	public WebElement getSaved() {
		return saved;
	}


	public WebElement getInvite() {
		return invite;
	}


	public WebElement getChoose() {
		return choose;
	}


	public WebElement getExit() {
		return Exit;
	}


	public WebElement getClinician() {
		return clinician;
	}


	public WebElement getHospital() {
		return hospital;
	}


	public WebElement getSpeciality() {
		return Speciality;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
