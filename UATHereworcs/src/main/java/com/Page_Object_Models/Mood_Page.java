package com.Page_Object_Models;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mood_Page {
	public WebDriver driver;
	
	@FindBy (xpath = "(//span[contains(@class,'tracker-dashboard-toggle round')])[2]")
	private WebElement toggle;
	
	@FindBy (xpath = "(//a[normalize-space()='Active trackers'])[1]")
	private WebElement activetracker;
	
	
	@FindBy (xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
	private WebElement Mood;
	
	@FindBy (xpath = "(//button[normalize-space()='ADD MY MOOD INFORMATION'])[1]")
	private WebElement addinfo2;
	
	@FindBy (xpath = "(//input[@placeholder='Select the date'])[1]")
	private WebElement calendar2;
	
	@FindBy (xpath = "(//div[@class='vc-title'])[1]")
	private WebElement title2;
	
	@FindBy (xpath = "(//span[normalize-space()='2022'])[1]")
	private WebElement years2;
	
	@FindBy (xpath = "(//span[@aria-label='2021'])[1]")
	private WebElement year2;
	
	@FindBy (xpath = "(//span[@class='vc-nav-item'])[11]")
	private WebElement month2;
	
	@FindBy (xpath = "//div[@class='vc-weeks']//div//span[@tabindex='-1' or @tabindex='0']")
	private List<WebElement> date2;
	
	@FindBy (xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]")
	private WebElement veryhappy;
	
	@FindBy (xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]")
	private WebElement happy;
	
	@FindBy (xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]/div[1]/div[3]/div[1]/label[1]/div[1]")
	private WebElement neutral;
	
	@FindBy (xpath = "(//label[normalize-space()='Average'])[1]")
	private WebElement average;
	
	@FindBy (xpath = "(//label[normalize-space()='Great'])[1]")
	private WebElement great;
	
	@FindBy (xpath = "(//label[normalize-space()='Poor'])[1]")
	private WebElement poor;
	
	@FindBy (xpath = "(//textarea[@id='notes'])[1]")
	private WebElement notes;
	
	@FindBy (xpath = "(//button[normalize-space()='RECORD MOOD'])[1]")
	private WebElement recordmood;
	
	@FindBy (xpath = "(//a[normalize-space()='Mood'])[1]")
	private WebElement moodclick;
	
	public Mood_Page(WebDriver moodpg) {
		this.driver = moodpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getToggle() {
		return toggle;
	}

	public WebElement getActivetracker() {
		return activetracker;
	}

	public WebElement getMood() {
		return Mood;
	}

	public WebElement getAddinfo2() {
		return addinfo2;
	}

	public WebElement getCalendar2() {
		return calendar2;
	}

	public WebElement getTitle2() {
		return title2;
	}

	public WebElement getYears2() {
		return years2;
	}

	public WebElement getYear2() {
		return year2;
	}

	public WebElement getMonth2() {
		return month2;
	}

	public List<WebElement> getDate2() {
		return date2;
	}

	public WebElement getVeryhappy() {
		return veryhappy;
	}

	public WebElement getHappy() {
		return happy;
	}

	public WebElement getNeutral() {
		return neutral;
	}

	public WebElement getAverage() {
		return average;
	}

	public WebElement getGreat() {
		return great;
	}

	public WebElement getPoor() {
		return poor;
	}

	public WebElement getNotes() {
		return notes;
	}

	public WebElement getRecordmood() {
		return recordmood;
	}

	public WebElement getMoodclick() {
		return moodclick;
	}
	
	
	

}