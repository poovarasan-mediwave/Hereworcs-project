package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diary_Add {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My diary img']")
	private WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "//input[@placeholder='Please make a diary entry']")
	private WebElement diary_Entry;

	@FindBy(xpath = "//button[text()='ADD ENTRY']")
	private WebElement add_Entry;

	@FindBy(xpath = "(//button[normalize-space()='Take me to diary'])[1]")
	private WebElement take_Me_Diary;

	@FindBy(xpath = "//h4[normalize-space()='My diary']")
	private WebElement Sreen_S;
	
	@FindBy(xpath = "//div[@class='header-mob']")
	private WebElement home;

	public Diary_Add(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getDiary_Entry() {
		return diary_Entry;
	}

	public WebElement getAdd_Entry() {
		return add_Entry;
	}

	public WebElement getTake_Me_Diary() {
		return take_Me_Diary;
	}

	public WebElement getSreen_S() {
		return Sreen_S;
	}

	public WebElement getHome() {
		return home;
	}

}
