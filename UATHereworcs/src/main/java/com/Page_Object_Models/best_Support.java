package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class best_Support {
	public WebDriver driver;

	@FindBy(xpath = "(//i[@class='fa fa-minus-circle accordian-add-icon'])[2]")
	private WebElement best_Support_Me;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[3]")
	private WebElement edit;

	@FindBy(xpath = "(//textarea[@placeholder='Describe what you need in an emergency'])[1]")
	private WebElement emergency;

	@FindBy(xpath = "(//textarea[@placeholder='Describe the things that you enjoy doing'])[1]")
	private WebElement hobbies;

	@FindBy(xpath = "(//textarea[@placeholder='Describe your exercise routine'])[1]")
	private WebElement exercise;

	@FindBy(xpath = "(//textarea[@placeholder='Describe your care, support and medication needs'])[1]")
	private WebElement caring;

	@FindBy(xpath = "(//textarea[@placeholder='Describe what you do when this happens'])[1]")
	private WebElement unwell;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[3]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement ok;

	public best_Support(WebDriver support) {
		this.driver = support;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBest_Support_Me() {
		return best_Support_Me;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getEmergency() {
		return emergency;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getExercise() {
		return exercise;
	}

	public WebElement getCaring() {
		return caring;
	}

	public WebElement getUnwell() {
		return unwell;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getOk() {
		return ok;
	}

}
