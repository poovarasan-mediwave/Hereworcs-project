package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public WebDriver driver;

	@FindBy(xpath = "//label[text()='Menu']")
	private WebElement menu;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[3]/a[1]/li[1]")
	private WebElement health;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[6]/a[1]/li[1]")
	private WebElement tracker;
	
	@FindBy(xpath = "(//button[@name='button'])[1]")
	private WebElement cookies;

	public Home(WebDriver Home) {
		this.driver = Home;
		PageFactory.initElements(driver, this);

	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getHealth() {
		return health;
	}

	public WebElement gettracker() {
		return tracker;
	}

	public WebElement getCookies() {
		return cookies;
	}

}
