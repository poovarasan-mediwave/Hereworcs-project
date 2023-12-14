package com.Page_Object_Models;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sleep_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//button[normalize-space()='ADD SLEEP INFORMATION'])[1]")
	private WebElement addinfo;

	@FindBy(xpath = "(//input[@placeholder='Select the date'])[1]")
	private WebElement calendar;

	@FindBy(xpath = "(//div[@class='vc-title'])[1]")
	private WebElement title;

	@FindBy(xpath = "(//span[normalize-space()='2022'])[1]")
	private WebElement years;

	@FindBy(xpath = "(//span[@aria-label='2021'])[1]")
	private WebElement year;

	@FindBy(xpath = "(//span[@class='vc-nav-item'])[11]")
	private WebElement month;

	@FindBy(xpath = "//div[@class='vc-weeks']//div//span[@tabindex='-1' or @tabindex='0']")
	private List<WebElement> date;

	@FindBy(xpath = "(//select[@id='bed_time'])[1]")
	private WebElement From;

	@FindBy(xpath = "(//select[@id='wakeup_time'])[1]")
	private WebElement To;

	@FindBy(xpath = "(//select[@id='wakeup_count'])[1]")
	private WebElement wakeup;

	@FindBy(xpath = "(//label[normalize-space()='Great'])[1]")
	private WebElement great;
	
	@FindBy(xpath = "(//label[normalize-space()='Average'])[1]")
	private WebElement average;
	
	@FindBy(xpath = "(//label[normalize-space()='Poor'])[1]")
	private WebElement poor;

	@FindBy(xpath = "(//button[contains(text(),'RECORD')])[1]")
	private WebElement record;
	
	@FindBy(xpath = "(//a[normalize-space()='Sleep'])[1]")
	private WebElement sleepbutton;

	public Sleep_Page(WebDriver sleeppg) {
		this.driver = sleeppg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getAddinfo() {
		return addinfo;
	}

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	
	public List<WebElement> getDate() {
		return date;
	}

	public WebElement getFrom() {
		return From;
	}

	
	public WebElement getTo() {
		return To;
	}

	public WebElement getWakeup() {
		return wakeup;
	}

	public WebElement getGreat() {
		return great;
	}

	public WebElement getAverage() {
		return average;
	}

	public WebElement getPoor() {
		return poor;
	}

	public WebElement getRecord() {
		return record;
	}

	public WebElement getSleepbutton() {
		return sleepbutton;
	}

	
	
	
}
