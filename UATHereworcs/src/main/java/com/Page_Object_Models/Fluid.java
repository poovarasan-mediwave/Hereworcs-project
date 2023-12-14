package com.Page_Object_Models;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fluid {

	
public WebDriver driver;
	
   
	public Fluid(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//ul[@class='d-flex second-nav-bar-items']/li/a[@href='/tracker/fluid']
	@FindBy (xpath = "//div[@id='submenu-height']/div/ul/li/a[@href='/tracker/fluid']")
	private WebElement fluidTracker;
	
	@FindBy (xpath = "//button[contains(text(),'ADD FLUID INFORMATION')]")
	private WebElement fluidInformation;
	
	@FindBy (xpath = "//input[@placeholder='Select the date']")
	private WebElement fluidcalendar;
	
	
	@FindBy (xpath = "//div[@class='vc-arrow is-left']")
	private WebElement fluidmonth;
	
	
	@FindBy (xpath = "//span[contains(@aria-label, ' 6 December 2021')] | //span[contains(@aria-label, ' December 6, 2021')]")
	private WebElement fluiddate;
	

	@FindBy (xpath = "//label[@for='small_cup']")
	private WebElement smallcup;
	
	@FindBy (xpath = "//label[@for='large_cup']")
	private WebElement largecup;
	
	@FindBy (xpath = "//label[@for='small_bottle']")
	private WebElement smallbottle;
	
	@FindBy (xpath = "//label[@for='large_bottle']")
	private WebElement largebottle;
	
	
	
	@FindBy (xpath = "//div[@class='counter-container border-0 m-h-50 input-width-small']/div[3]/button")
	private WebElement qualityadd;
	
	@FindBy (xpath = "//button[contains(text(),'RECORD FLUID')]")
	private WebElement recordfluid;
	
	
	
	
	public WebElement getfluidTracker() {
		return fluidTracker;
	}

	public WebElement getfluidInformation() {
		return fluidInformation;
	}
	
	public WebElement getfluidcalendar() {
		return fluidcalendar;
	}
	
	public WebElement getfluidmonth() {
		return fluidmonth;
	}
	
	public WebElement getfluiddate() {
	
		return fluiddate;
	}
	
	/*public WebElement getfluiddate() {
		return fluiddate;
	}*/
	
	
	////
	public WebElement getlargecup() {
		return largecup;
	}
	
	public WebElement getsmallcup() {
		return smallcup;
	}
	public WebElement getsmallbottle() {
		return smallbottle;
	}
	public WebElement getlargebottle() {
		return largebottle;
	}
	
	public WebElement getqualityadd() {
		return qualityadd;
	}
	
	public WebElement getrecordfluid() {
		return recordfluid;
	}
	

		
}



