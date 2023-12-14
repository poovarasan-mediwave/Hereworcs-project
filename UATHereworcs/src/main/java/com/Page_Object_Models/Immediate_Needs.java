package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Immediate_Needs {

	public WebDriver driver;

	@FindBy(xpath = "(//i[@class='fa fa-angle-down accordian-add-icon'])[2]")
	private WebElement arrow;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[5]")
	private WebElement edit;

	@FindBy(xpath = "(//label[@for='englishLanguage'])[2]")
	private WebElement checkbox1;

	@FindBy(xpath = "(//label[contains(@for,'hearLoop')])[1]")
	private WebElement checkbox2;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[2]/div[1]/div[5]/div[1]/div[4]/div[5]/div[2]/div[1]/section[1]/div[1]/div[16]/textarea[1]")
	private WebElement communicate;

	@FindBy(xpath = "(//input[@placeholder='Enter your preferred language of communication, if your first language is not English . '])[1]")
	private WebElement language;

	@FindBy(xpath = "(//textarea[@placeholder='Description about your everyday, how you engage with others and how you feel on a typical day'])[1]")
	private WebElement typical_Day;

	@FindBy(xpath = "(//button[@class='mw-btn'][normalize-space()='SAVE'])[5]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement ok;

	public Immediate_Needs(WebDriver needs) {
		this.driver = needs;
		PageFactory.initElements(driver, this);
	}

	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getCommunicate() {
		return communicate;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getTypical_Day() {
		return typical_Day;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOk() {
		return ok;
	}

}
