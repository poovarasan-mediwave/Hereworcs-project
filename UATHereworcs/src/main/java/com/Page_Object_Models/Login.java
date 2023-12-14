package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[normalize-space()='Login / Sign up']")
	private WebElement login_signup;
	
	@FindBy(xpath = "//button[@class='accept_cookie']")
	private WebElement cookie;
	
	@FindBy(xpath = "//input[@name='Email Address']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement Loginbutton;
	
	public Login(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}
	/*public WebElement getlogin_signup() {
		return login_signup;
	}*/
	
	public WebElement getcookie() {
		return cookie;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return Loginbutton;
	}
}

