package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clinicaldirectory {

	public WebDriver driver;
	public Clinicaldirectory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
			@FindBy (xpath = "//div[@class='footer-desktop-img position-relative ']")
			private WebElement clinicalbentomenu;
			@FindBy (xpath = "(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon'])[3]")
			private WebElement clinical_circle;
			
	@FindBy (xpath = "//a[text()='Clinical directory']")
	private WebElement clinical_directory;
	
	@FindBy (xpath = "//input[@placeholder='Search name']")
	private WebElement clinicaldirectorybox;
	
	
	@FindBy (xpath = "//button[@class='user-search-btn search-btn']")
	private WebElement clinicaldirectorysearchicon;
	

	@FindBy (xpath = "//div[@class='message-card border-primary bg-card mb-4 position-relative view-profile-block search-font-size-reduce show-modal-popup onkeyup']")
	private WebElement clinicalcolleaguename;
	
	@FindBy (xpath = "//button[text()='MESSAGE THIS PERSON']")
	private WebElement messagethispersonbtn;
	
	@FindBy (xpath = "//input[@placeholder='Write subject here']")
	private WebElement subjecthere;
	@FindBy (xpath = "//textarea[@placeholder='Create message']")
	private WebElement createmessage;
	
	
	public WebElement getclinicalbentomenu() {
		return clinicalbentomenu;
	}
	public WebElement getclinical_circle() {
		return clinical_circle;
	}
	
	
	
	public WebElement getclinical_directory() {
		return clinical_directory;
	}

	public WebElement getclinicaldirectorybox() {
		return clinicaldirectorybox;
	}
	
	public WebElement getclinicaldirectorysearchicon() {
		return clinicaldirectorysearchicon;
	}
	
	public WebElement getclinicalcolleaguename() {
		return clinicalcolleaguename;
	}
	public WebElement getmessagethispersonbtn() {
		return messagethispersonbtn;
	}
	
	public WebElement getsubjecthere() {
		return subjecthere;
	}
	public WebElement getcreatemessage() {
		return createmessage;
	}
	
	
}
