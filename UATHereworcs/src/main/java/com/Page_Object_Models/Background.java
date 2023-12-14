package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Background {

	public WebDriver driver;

	@FindBy(xpath = "(//i[@class='fa fa-minus-circle accordian-add-icon'])[3]")
	private WebElement arrow;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[4]")
	private WebElement edit;

	@FindBy(xpath = "(//textarea[@placeholder='Describe where you have lived in the past'])[1]")
	private WebElement lived_In;

	@FindBy(xpath = "(//textarea[contains(@placeholder,'Describe where you have lived in the past')])[2]")
	private WebElement Nationality;

	@FindBy(xpath = "(//textarea[contains(@placeholder,'Describe your strengths and skills')])[1]")
	private WebElement strengts;

	@FindBy(xpath = "(//textarea[@placeholder='Describe your achievements and interests'])[1]")
	private WebElement achievements;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[4]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement Ok;

	public Background(WebDriver background) {
		this.driver = background;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getLived_In() {
		return lived_In;
	}

	public WebElement getNationality() {
		return Nationality;
	}

	public WebElement getStrengts() {
		return strengts;
	}

	public WebElement getAchievements() {
		return achievements;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOk() {
		return Ok;
	}

}
