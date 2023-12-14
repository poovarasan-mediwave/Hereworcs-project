package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tracker_Overview {

	public WebDriver driver;

	@FindBy(xpath = "(//*[name()='svg'][@class='mw-btn-icon cursor-pointer'])[1]")
	private WebElement add;

	@FindBy(xpath = "//button[contains(@type,'button')][contains(text(),'Add')]")
	private List<WebElement> add_Trackers;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]")
	private WebElement remove_Trackers1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]")
	private WebElement remove_Trackers2;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]")
	private WebElement remove_Trackers3;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[4]/div[1]/div[2]")
	private WebElement remove_Trackers4;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[5]/div[1]/div[2]")
	private WebElement remove_Trackers5;
	
	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[6]/div[1]/div[2]")
	private WebElement remove_Trackers6;

	@FindBy(xpath = "(//div[@class='overview-card-header d-flex align-items-center justify-content-between mw-bg-title'])[1]")
	private WebElement screenshot1;

	@FindBy(xpath = "(//label[@for='monthOVerview'])[1]")
	private WebElement month1;

	@FindBy(xpath = "(//label[@for='yearOVerview'])[1]")
	private WebElement year1;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/i[1]")
	private WebElement arrow1;

	@FindBy(xpath = "(//label[contains(@for,'month')][normalize-space()='Month'])[2]")
	private WebElement month2;

	@FindBy(xpath = "(//label[@for='year'])[1]")
	private WebElement year2;

	@FindBy(xpath = "(//i[contains(@class,'fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary')])[2]")
	private WebElement arrow2;

	@FindBy(xpath = "(//h5[normalize-space()='Sleep'])[1]")
	private WebElement sleep;

	@FindBy(xpath = "(//h5[normalize-space()='Mood'])[1]")
	private WebElement mood;

	@FindBy(xpath = "(//h5[normalize-space()='Fluid'])[1]")
	private WebElement fluid;

	@FindBy(xpath = "(//h5[normalize-space()='Exercise'])[1]")
	private WebElement exercise;

	@FindBy(xpath = "(//h5[normalize-space()='Diet'])[1]")
	private WebElement diet;

	@FindBy(xpath = "(//h5[normalize-space()='Medication'])[1]")
	private WebElement Medication;

	@FindBy(xpath = "(//p[contains(text(),'Choose up to 3 trackers to compare. Currently, onl')])[1]")
	private WebElement ss2;

	public Tracker_Overview(WebDriver tracker) {
		this.driver = tracker;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdd() {
		return add;
	}

	public List<WebElement> getAdd_Trackers() {
		return add_Trackers;
	}

	public WebElement getRemove_Trackers1() {
		return remove_Trackers1;
	}

	public WebElement getRemove_Trackers2() {
		return remove_Trackers2;
	}

	public WebElement getRemove_Trackers3() {
		return remove_Trackers3;
	}

	public WebElement getRemove_Trackers4() {
		return remove_Trackers4;
	}

	public WebElement getRemove_Trackers5() {
		return remove_Trackers5;
	}

	public WebElement getRemove_Trackers6() {
		return remove_Trackers6;
	}

	public WebElement getScreenshot1() {
		return screenshot1;
	}

	public WebElement getMonth1() {
		return month1;
	}

	public WebElement getYear1() {
		return year1;
	}

	public WebElement getArrow1() {
		return arrow1;
	}

	public WebElement getMonth2() {
		return month2;
	}

	public WebElement getYear2() {
		return year2;
	}

	public WebElement getArrow2() {
		return arrow2;
	}

	public WebElement getSleep() {
		return sleep;
	}

	public WebElement getMood() {
		return mood;
	}

	public WebElement getFluid() {
		return fluid;
	}

	public WebElement getExercise() {
		return exercise;
	}

	public WebElement getDiet() {
		return diet;
	}

	public WebElement getMedication() {
		return Medication;
	}

	public WebElement getSs2() {
		return ss2;
	}

}
