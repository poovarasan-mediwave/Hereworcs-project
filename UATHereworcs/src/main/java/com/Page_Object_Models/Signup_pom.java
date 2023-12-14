package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_pom {

	public WebDriver driver;

	@FindBy(xpath = "//button[normalize-space()='signup']")
	private WebElement sign_btn;

	@FindBy(xpath = "(//input[@id='sign_first_name'])[1]")
	private WebElement first_Name;

	@FindBy(xpath = "(//input[@id='sign_last_name'])[1]")
	private WebElement last_Name;

	@FindBy(xpath = "(//input[@id='sign_email'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//input[@id='sign_password'])[1]")
	private WebElement pass_Create;

	@FindBy(xpath = "(//input[@id='sign_password_confirm'])[1]")
	private WebElement pass_ReEnter;
	
	@FindBy(xpath = "//button[normalize-space()='ACCEPT']")
	private WebElement cookies;

	@FindBy(xpath = "(//span[@for='remember'])[1]")
	private WebElement remember;

	@FindBy(xpath = "(//span[@for='tc'])[1]")
	private WebElement terms;

	@FindBy(xpath = "(//button[normalize-space()='CREATE ACCOUNT'])[1]")
	private WebElement signup;

	public Signup_pom(WebDriver signup) {
		this.driver = signup;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSign_btn() {
		return sign_btn;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass_Create() {
		return pass_Create;
	}

	public WebElement getPass_ReEnter() {
		return pass_ReEnter;
	}

	public WebElement getRemember() {
		return remember;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getCookies() {
		return cookies;
	}

}
