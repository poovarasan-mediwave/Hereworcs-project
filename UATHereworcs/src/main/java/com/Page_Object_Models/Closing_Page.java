package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Closing_Page {
	public WebDriver driver;
	
	@FindBy (xpath = "(//a[normalize-space()='Closing Info'])[1]")
	private WebElement close;
	
	@FindBy (xpath = "(//span[normalize-space()='Add closing section'])[1]")
	private WebElement addclose;
	
	@FindBy (xpath = "(//button[normalize-space()='PRIVACY NOTICE'])[1]")
	private WebElement privacy;
	
	@FindBy(xpath = "(//textarea[@name='privacy_notes'])[1]")
	private WebElement privacynotes;
	
	@FindBy (xpath = "(//button[normalize-space()='DISCLAIMER / Terms and Conditions'])[1]")
	private WebElement disclaimer;
	
	@FindBy (xpath = "(//textarea[@placeholder='Enter your disclaimer / Terms and Conditions here'])[1]")
	private WebElement disclaimernotes;
	
	@FindBy (xpath = "(//button[normalize-space()='WHATS NEXT INFO'])[1]")
	private WebElement nextinfo;
	
	@FindBy (xpath = "(//textarea[@placeholder='Enter your info about what happens next here'])[1]")
	private WebElement infonotes;
	
	@FindBy(xpath = "(//button[normalize-space()='FINAL STATEMENT'])[1]")
	private WebElement statement;
	
	@FindBy (xpath = "(//textarea[@name='final_statement'])[1]")
	private WebElement statementnotes;
	
	@FindBy (xpath = "//p[text()='Physical health']")
	private WebElement radiobtn;
	
	@FindBy (xpath = "(//button[normalize-space()='SAVE DRAFT'])[1]")
	private WebElement savedraft;
	
	@FindBy (xpath = "(//button[normalize-space()='PREVIEW'])[1]")
	private WebElement preview;
	
	@FindBy (xpath = "(//button[normalize-space()='SAVE AS TEMPLATE'])[1]")
	private WebElement template;
	
	@FindBy (xpath = "(//button[normalize-space()='PUBLISH'])[1]")
	private WebElement publish;
	
	@FindBy(xpath = "(//p[@class='ques-filter-btn activate-filter mw-bg-white-card'])[1]")
	private WebElement Scrolldown;
	
	@FindBy(xpath = "(//*[name()='svg'][@class='mw-icon-primary'])[4]")
	private WebElement starfav;
	
	public Closing_Page(WebDriver closepg) {
		this.driver = closepg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getAddclose() {
		return addclose;
	}

	public WebElement getPrivacy() {
		return privacy;
	}

	public WebElement getPrivacynotes() {
		return privacynotes;
	}

	public WebElement getDisclaimer() {
		return disclaimer;
	}

	public WebElement getDisclaimernotes() {
		return disclaimernotes;
	}

	public WebElement getNextinfo() {
		return nextinfo;
	}

	public WebElement getInfonotes() {
		return infonotes;
	}

	public WebElement getStatement() {
		return statement;
	}

	public WebElement getStatementnotes() {
		return statementnotes;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getSavedraft() {
		return savedraft;
	}

	public WebElement getPreview() {
		return preview;
	}

	public WebElement getTemplate() {
		return template;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getScrolldown() {
		return Scrolldown;
	}

	public WebElement getstarfav() {
		return starfav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
