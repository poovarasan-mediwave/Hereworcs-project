package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Urgenthelp_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//li[contains(@class,'')][normalize-space()='Urgent help'])[1]")
	private WebElement help;
	
	@FindBy(xpath = "(//a[normalize-space()='visit Shout Crisis Text Line'])[1]")
	private WebElement helpline;
	
	@FindBy(xpath = "(//div[@class='footer-desktop-img position-relative'])[1]")
	private WebElement menu;
	
	
	public Urgenthelp_Page(WebDriver urgentpg) {
		this.driver = urgentpg;

		PageFactory.initElements(driver, this);

	}


	public WebElement getHelp() {
		return help;
	}


	public WebElement getHelpline() {
		return helpline;
	}


	public WebElement getMenu() {
		return menu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
