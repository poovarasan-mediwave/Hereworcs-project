package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal {

	public WebDriver driver;

	@FindBy(xpath = "(//i[@class='fa fa-angle-down accordian-add-icon'])[1]")
	private WebElement down_Arrow;

	@FindBy(xpath = "(//button[@onclick='viewAboutme()'])[1]")
	private WebElement about;

	@FindBy(xpath = "(//i[@class='fa fa-angle-down accordian-add-icon'])[1]")
	private WebElement personal_Arrow;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[1]")
	private WebElement edit;

	@FindBy(xpath = "(//select[@selected='selected'])[2]")
	private WebElement gender_Dropdown;

	@FindBy(xpath = "(//input[contains(@placeholder,'Please address me as / by')])[1]")
	private WebElement Nick_Name;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[1]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement ok;

	public Personal(WebDriver health) {
		this.driver = health;
		PageFactory.initElements(driver, this);

	}

	public WebElement getDown_Arrow() {
		return down_Arrow;
	}

	public WebElement getAbout() {
		return about;
	}

	public WebElement getPersonal_Arrow() {
		return personal_Arrow;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getGender_Dropdown() {
		return gender_Dropdown;
	}

	public WebElement getNick_Name() {
		return Nick_Name;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOk() {
		return ok;
	}
}
