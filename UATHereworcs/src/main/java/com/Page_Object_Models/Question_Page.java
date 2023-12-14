package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//div[@class='dashboard-module-card clician-dash'])[1]")
	private WebElement Questions;

	@FindBy(xpath = "(//div[contains(@class,'text-center flex-q-container')])[1]")
	private WebElement plus;

	@FindBy(xpath = "(//a[normalize-space()='Title'])[1]")
	private WebElement title;

	@FindBy(xpath = "(//input[@id='question-title'])[1]")
	private WebElement Quetitle;

	@FindBy(xpath = "(//a[normalize-space()='Welcome Info'])[1]")
	private WebElement welcomeinfo;

	@FindBy(xpath = "(//textarea[@placeholder='Type your welcome message here'])[1]")
	private WebElement Quewelcome;

	@FindBy(xpath = "(//a[normalize-space()='Sections'])[1]")
	private WebElement sections;

	@FindBy(xpath = "(//input[@placeholder='Section title'])[1]")
	private WebElement Sectitle;

	@FindBy(xpath = "(//input[@placeholder='Section description'])[1]")
	private WebElement Secdescription;
	
	@FindBy(xpath = "(//span[normalize-space()='Add another section'])[1]")
	private WebElement Addsec;
	
	

	public Question_Page(WebDriver questionpg) {
		this.driver = questionpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getQuestions() {
		return Questions;
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getQuetitle() {
		return Quetitle;
	}

	public WebElement getWelcomeinfo() {
		return welcomeinfo;
	}

	public WebElement getQuewelcome() {
		return Quewelcome;
	}

	public WebElement getSections() {
		return sections;
	}

	public WebElement getSectitle() {
		return Sectitle;
	}

	public WebElement getSecdescription() {
		return Secdescription;
	}

	public WebElement getAddsec() {
		return Addsec;
	}

	
}
