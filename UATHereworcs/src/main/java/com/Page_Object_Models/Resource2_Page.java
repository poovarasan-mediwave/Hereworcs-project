package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resource2_Page {

	public WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/ul[1]/li[15]/a[1]")
	private WebElement form;

	@FindBy(xpath = "(//input[@placeholder='Select the date'])[1]")
	private WebElement select;

	@FindBy(xpath = "(//div[@class='vc-title'])[1]")
	private WebElement title;

	@FindBy(xpath = "(//span[normalize-space()='2022'])[1]")
	private WebElement years;

	@FindBy(xpath = "(//span[@aria-label='2016'])[1]")
	private WebElement year;

	@FindBy(xpath = "(//span[@aria-label='January 2000'])[1]")
	private WebElement month;

	@FindBy(xpath = "(//span[@aria-label='Friday, January 1, 2016'])[1]")
	private WebElement day;

	@FindBy(xpath = "(//input[@id='consent'])[1]")
	private WebElement checkbox;

	@FindBy(xpath = "(//input[@id='0000bf3c-93fc-46d3-bc2f-3ee549371cab'])[1]")
	private WebElement practicle;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn yellow practical-class '])[1]")
	private WebElement yellow;

	@FindBy(xpath = "(//input[@id='54ba53fe-cae5-4ea8-8ebf-49ba24168c17'])[1]")
	private WebElement parent;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn green relationship'][normalize-space()='2'])[1]")
	private WebElement green;

	@FindBy(xpath = "(//input[@id='7dcd7619-943f-43d3-a72c-718d62a8acaf'])[1]")
	private WebElement emotional;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn red emotional'][normalize-space()='8'])[1]")
	private WebElement Red;

	@FindBy(xpath = "(//input[@id='e04755c0-724a-4067-b5c1-48ced7a4d2d6'])[1]")
	private WebElement spritual;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn yellow religious'][normalize-space()='6'])[1]")
	private WebElement yellow1;

	@FindBy(xpath = "(//input[@id='a9563ce8-d555-4187-8341-a42068471236'])[1]")
	private WebElement physical;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn red physical'][normalize-space()='8'])[1]")
	private WebElement red1;

	@FindBy(xpath = "(//input[@id='c5dbd47e-0dc1-4f81-8da9-e4ff45eaa01a'])[1]")
	private WebElement Lifestyle;

	@FindBy(xpath = "(//button[@class='btn btn-primary reg-btn hna-form-btn green lifestyle'][normalize-space()='0'])[1]")
	private WebElement green1;

	@FindBy(xpath = "(//textarea[@id='othercomments'])[1]")
	private WebElement comments;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement save;

	@FindBy(xpath = "(//div[@class='material-icons wh-40 mw-bg-white-card outline mw-shadow border mw-border-primary resources-next-arrow'])[1]")
	private WebElement click;

	@FindBy(xpath = "(//a[normalize-space()='Apps'])[1]")
	private WebElement Apps;

	@FindBy(xpath = "(//a[@id='gro_health'])[2]")
	private WebElement info;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[7]/a[1]")
	private WebElement download;

	@FindBy(xpath = "(//div[@class='pos-close cancel-btn'])[1]")
	private WebElement cancel;

	@FindBy(xpath = "(//a[normalize-space()='Stories'])[1]")
	private WebElement stories;

	@FindBy(xpath = "(//*[name()='svg'][@id='RLStories--ckxfxbz8n00hq0kqxuhbj3avn'])[1]")
	private WebElement fav;

	@FindBy(xpath = "(//button[@onclick='closeSavedResourcePopup()'])[1]")
	private WebElement close;

	@FindBy(xpath = "(//div[@class='block'])[1]")
	private WebElement send;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	private WebElement submit;

	@FindBy(xpath = "(//a[text()='Abscess'])[1]")
	private WebElement search;
	
	@FindBy(xpath = "(//iframe[@id='mc-iframe'])[1]")
	private WebElement frames;
	
	@FindBy(xpath = "//*[name()='svg'][@id='RL_EOL_Support--ckwvna9vm00070iqcgz079vdg']")
	private WebElement favs;
	
	@FindBy(xpath = "(//button[@onclick='closeSavedResourcePopup()'])[1]")
	private WebElement saveclose;

	public Resource2_Page(WebDriver resource2pg) {
		this.driver = resource2pg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getForm() {
		return form;
	}

	public WebElement getSelect() {
		return select;
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

	public WebElement getDay() {
		return day;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPracticle() {
		return practicle;
	}

	public WebElement getYellow() {
		return yellow;
	}

	public WebElement getParent() {
		return parent;
	}

	public WebElement getGreen() {
		return green;
	}

	public WebElement getEmotional() {
		return emotional;
	}

	public WebElement getRed() {
		return Red;
	}

	public WebElement getSpritual() {
		return spritual;
	}

	public WebElement getYellow1() {
		return yellow1;
	}

	public WebElement getPhysical() {
		return physical;
	}

	public WebElement getRed1() {
		return red1;
	}

	public WebElement getLifestyle() {
		return Lifestyle;
	}

	public WebElement getGreen1() {
		return green1;
	}

	public WebElement getComments() {
		return comments;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getApps() {
		return Apps;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getDownload() {
		return download;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getStories() {
		return stories;
	}

	public WebElement getFav() {
		return fav;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getSend() {
		return send;
	}

	public WebElement getsubmit() {
		return submit;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFrames() {
		return frames;
	}

	public WebElement getFavs() {
		return favs;
	}

	public WebElement getSaveclose() {
		return saveclose;
	}

}
