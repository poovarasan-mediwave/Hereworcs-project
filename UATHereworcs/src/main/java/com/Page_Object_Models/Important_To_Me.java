package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Important_To_Me {

	public WebDriver driver;

	@FindBy(xpath = "(//i[contains(@class,'fa fa-minus-circle accordian-add-icon')])[1]")
	private WebElement down_Arow;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[2]")
	private WebElement edit;

	@FindBy(xpath = "(//input[@placeholder='Full name'])[1]")
	private WebElement name;

	@FindBy(xpath = "(//input[@placeholder='Enter relationship type '])[1]")
	private WebElement relationship;

	@FindBy(xpath = "(//input[@placeholder='Enter person’s email address'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[2]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement ok;

	public Important_To_Me(WebDriver important) {
		this.driver = important;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDown_Arow() {
		return down_Arow;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getRelationship() {
		return relationship;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOk() {
		return ok;
	}





}
