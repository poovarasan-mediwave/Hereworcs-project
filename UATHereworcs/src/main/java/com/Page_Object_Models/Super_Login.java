package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Super_Login {
	
	public WebDriver driver;
	
	@FindBy (xpath = "(//input[@id='login_email'])[1]")
	private WebElement Email;
	
	@FindBy(xpath = "(//input[@id='login_password'])[1]")
	private WebElement Password;
	
	@FindBy (xpath = "(//button[@name='button'])[1]")
	private WebElement accept;
	
	@FindBy (xpath = "(//button[@id='loginBtn'])[1]")
	private WebElement button;
	

	public Super_Login(WebDriver logpg) {
		this.driver = logpg;

		PageFactory.initElements(driver, this);

	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getAccept() {
		return accept;
	}


	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
