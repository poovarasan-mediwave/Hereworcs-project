package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BloodPressureTracker {

	public WebDriver driver;
	
	//Login
	
	@FindBy(xpath = "//input[@id='login_email']")
	private WebElement Emailaddress;
	
	@FindBy(xpath = "//input[@id='login_password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement Loginbutton;
	
	@FindBy(xpath="//button[@class='accept_cookie']")
	private WebElement Acceptcookies;
	
	// Tracker part
	
	@FindBy(xpath = "//div[@class='footer-desktop-img position-relative']")
	private WebElement clickMenus;
	
	@FindBy(xpath= "//li[text()[normalize-space()='Trackers']]")
	private WebElement ClickTrackersinMenu;
	
	@FindBy(xpath ="//a[normalize-space()='Blood pressure']")
	private WebElement ClickBloodPressure;
	
	@FindBy(xpath ="//input[@id='bp_date']")
	private WebElement SelectCalendar;
	
	@FindBy(xpath="//a[@class='ui-state-default' or @class='ui-state-default ui-state-highlight']")
	private List<WebElement> Choosedate;
	
	@FindBy(xpath="//input[@id='heart_rate']")
	private WebElement EnterHeartRate;
	
	@FindBy(xpath="//input[@id='systolic']")
	private WebElement EnterSystolic;
	
	@FindBy(xpath="//input[@id='diastolic']")
	private WebElement EnterDiastolic;
	
	@FindBy(xpath="//button[@id='bp_submit']")
	private WebElement SubmitButton;
	
	@FindBy(xpath="//div[@id='toaster-contaier']//div//div//p")
	private WebElement SuccessMsg;
	
	public BloodPressureTracker(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailaddress() {
		return Emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getAcceptcookies() {
		return Acceptcookies;
	}

	public WebElement getClickMenus() {
		return clickMenus;
	}

	public WebElement getClickTrackersinMenu() {
		return ClickTrackersinMenu;
	}

	public WebElement getClickBloodPressure() {
		return ClickBloodPressure;
	}

	public WebElement getSelectCalendar() {
		return SelectCalendar;
	}

	public List<WebElement> getChoosedate() {
		return Choosedate;
	}

	public WebElement getEnterHeartRate() {
		return EnterHeartRate;
	}

	public WebElement getEnterSystolic() {
		return EnterSystolic;
	}

	public WebElement getEnterDiastolic() {
		return EnterDiastolic;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}
	
	
}
