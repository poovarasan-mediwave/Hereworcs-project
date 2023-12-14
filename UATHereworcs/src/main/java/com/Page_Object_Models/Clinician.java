package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clinician {
	public WebDriver driver; 
	
	public Clinician(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//button[@class='card card-gl-dashboard clinic-dashboard']/div")
	private WebElement clinical_caseload;
	
	@FindBy (xpath = "(//div[@class='search-font-size-reduce'])[2]/button/div")
	private WebElement listfirstname;
	
	@FindBy (xpath = "//button[text()='SEND MESSAGE']")
	private WebElement sendmessagebutton;
	
	@FindBy (xpath = "//div[@class='circle-profile-list-blk search-font-size-reduce']/div[1]/span")
	private WebElement firstpersononlist;
	@FindBy (xpath = "//button[text()='MESSAGE THIS PERSON']")
	private WebElement messagethisperson;
	@FindBy (xpath = "//input[@placeholder='Write subject here']")
	private WebElement subjectfield;
	@FindBy (xpath = "//textarea[@placeholder='Create message']")
	private WebElement createmessage;
	@FindBy (xpath = "//img[@alt='camera icon']//parent::span")
	private WebElement cameraicon;
	
	@FindBy (xpath = "//button[@id='cam--startbutton']")
	private WebElement takephoto;
	@FindBy (xpath = "//button[contains(text(),'Upload Photo')]")
	private WebElement uploadphoto;
	@FindBy (xpath = "//button[@id='sendMsg']")
	private WebElement Sendmessagebtn;
	
	
	@FindBy (xpath = "(//div[@class='col-6 col-sm-6 col-lg-3 col-md-3 p-2'])[1]")
	private WebElement backbutton;
	
	@FindBy (xpath = "//input[@placeholder='Enter recipient name']")
	private WebElement searchname;
	@FindBy (xpath = "//input[@placeholder='Enter recipient name']/following-sibling::button")
	private WebElement searchicon;
	
	//label[@class='send-mg attach m-0-null img-mob-bot']/a
	@FindBy (xpath = "//img[@alt='attachment']//parent::label")
	private WebElement Attachmentfile;
	
	public WebElement getclinical_caseload() {
		return clinical_caseload;
	}

	public WebElement getlistfirstname() {
		return listfirstname;
	}

	public WebElement getsendmessagebutton() {
		return sendmessagebutton;
	}
	public WebElement getfirstpersononlist() {
		return firstpersononlist;
	}
	public WebElement getsubjectfield() {
		return subjectfield;
	}
	public WebElement getmessagethisperson() {
		return messagethisperson;
	}
	public WebElement getcreatemessage() {
		return createmessage;
	}
	public WebElement getcameraicon() {
		return cameraicon;
	}
	public WebElement gettakephoto() {
		return takephoto;
	}
	public WebElement getuploadphoto() {
		return uploadphoto;
	}
	public WebElement getSendmessagebtn() {
		return Sendmessagebtn;
	}
	
	public WebElement getbackbutton() {
		return backbutton;
	}
	
	public WebElement getsearchname() {
		return searchname;
	}
	public WebElement getsearchicon() {
		return searchicon;
	}
	public WebElement getAttachmentfile() {
		return Attachmentfile;
	}
	
}
