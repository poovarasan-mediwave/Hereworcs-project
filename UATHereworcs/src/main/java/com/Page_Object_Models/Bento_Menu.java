package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bento_Menu {

	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']")
	private WebElement bentoicon;
	
	@FindBy(xpath = "//a[@href='/tracker/overview']/li")
	private WebElement Trackermodule;
	
	@FindBy(xpath = "//a[@href='/tracker']")
	private WebElement Trackers;
	
	@FindBy(xpath = "(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon']/a[@href='/clinician'])[1]")
	private WebElement clinician_dashboard_bentoicon;
	
	@FindBy(xpath = "(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon']/a[@href='/clinician'])[1]")
	private WebElement cliniciancaseloadmenu;
	@FindBy(xpath = "(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon']/a[@href='/admin'])[1]")
	private WebElement Admindashboardmenuicon;
	
	//(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon']/a[@href='/admin'])[1]
	//(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon']/a[@href='/clinician'])[1]
	public Bento_Menu(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}
	public WebElement getbentoicon() {
		return bentoicon;
	}
	
	
	public WebElement getTrackermodule() {
		return Trackermodule;
	}
	
	public WebElement getTrackers() {
		return Trackers;
	}
	
	public WebElement getclinician_dashboard_bentoicon() {
		return clinician_dashboard_bentoicon;
	}
	
	public WebElement getcliniciancaseloadmenu() {
		return cliniciancaseloadmenu;
	}
	public WebElement getAdmindashboardmenuicon() {
		return Admindashboardmenuicon;
	}
}
