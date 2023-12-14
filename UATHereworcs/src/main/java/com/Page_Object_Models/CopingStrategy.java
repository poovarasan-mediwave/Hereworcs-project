package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopingStrategy {
	
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


	@FindBy(xpath = "//div[@id='open-desktop-footer']//div")
	private WebElement clickMenus;

	@FindBy(xpath= "(//a[@href='/tracker/overview']/li[1])[1]")
	private WebElement ClickTrackersinMenu;
	
	
	@FindBy(xpath="//button[text()='Add coping strategies']")
	private WebElement AddCopyStartbutton;
	
	@FindBy(xpath="//a[@href='/tracker/coping']")
	private WebElement CopingStrategymenu;
	
	@FindBy(xpath="//input[@class='form-control mt-2']")
	private WebElement Title;
	
	
	@FindBy(xpath="//textarea[@id='copingdescription']")
	private WebElement Description;
	

	@FindBy(xpath="//button[@id='coping_button']")
	private WebElement SaveButton;
	
	
	
	// dairy part
	
	@FindBy(xpath="//a[@href='/tracker/diary']")
	private WebElement Dairymenu;
	
	@FindBy(xpath="//input[contains(@class,'form-control date-icon')]")
	private WebElement datefield;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody[1]/tr[1]/td[5]/a[1]")
	private WebElement selectdate;
	
	@FindBy(xpath="//textarea[@id='diary_content']")
	private WebElement dairydesc;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement dairysubmit;
	
	public CopingStrategy(WebDriver log) {
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
	public WebElement getAddCopyStartbutton() {
		return AddCopyStartbutton;
	}
	public WebElement getCopingStrategymenu() {
		return CopingStrategymenu;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getDairymenu() {
		return Dairymenu;
	}

	public WebElement getDatefield() {
		return datefield;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getDairydesc() {
		return dairydesc;
	}

	public WebElement getDairysubmit() {
		return dairysubmit;
	}

}
