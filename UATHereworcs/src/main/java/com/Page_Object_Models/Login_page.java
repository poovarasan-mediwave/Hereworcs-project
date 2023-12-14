package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='login_email']")
	private WebElement user;
	
	@FindBy(xpath = "(//input[@id='login_email'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@id='login_password'])[1]")
	private WebElement password;
	
	@FindBy(xpath = "(//button[@name='button'])[1]")
	private WebElement cookies;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement login;
	
	@FindBy(xpath = "(//button[normalize-space()='LOGOUT'])[1]")
	private WebElement logout;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement cookies1;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement signin;
	
	@FindBy(xpath = "(//button[@type='button'][normalize-space()='LOGIN'])[1]")
	private WebElement button;
	
	@FindBy(xpath="//button[@class='accept_cookie']")
	private WebElement Acceptcookies;
	
	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement Loginbutton;
	
	
	public Login_page(WebDriver loginpg) {
		this.driver = loginpg;

		PageFactory.initElements(driver, this);

	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getUser() {
		return user;
	}
	
	public WebElement getCookies1() {
		return cookies1;
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getButton() {
		return button;
	}

	public WebElement getAcceptcookies() {
		return Acceptcookies;
	}
	
	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	

}
