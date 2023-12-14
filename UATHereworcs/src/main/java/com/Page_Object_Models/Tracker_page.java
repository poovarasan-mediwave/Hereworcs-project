package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tracker_page {

	public WebDriver driver;

	@FindBy(xpath = "//label[text()='Menu']")
	private WebElement menu;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[6]/a[1]/li[1]")
	private WebElement tracker;

	@FindBy(xpath = "(//a[@href='/tracker'])[1]")
	private WebElement Tracker1;

	@FindBy(xpath = "(//a[normalize-space()='Inactive trackers'])[1]")
	private WebElement Inactivetracker;

	@FindBy(xpath = "(//span[contains(@class,'tracker-dashboard-toggle round')])[1]")
	private WebElement Inactive;

	@FindBy(xpath = "(//a[normalize-space()='Active trackers'])[1]")
	private WebElement active;

	@FindBy(xpath = "(//div[contains(@class,'card tracker-dashboard')])[1]")
	private WebElement sleep;

	public Tracker_page(WebDriver Trackerpg) {
		this.driver = Trackerpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getTracker() {
		return tracker;

	}

	public WebElement getTracker1() {
		return Tracker1;
	}

	public WebElement getInactivetracker() {
		return Inactivetracker;
	}

	public WebElement getInactive() {
		return Inactive;
	}

	public WebElement getActive() {
		return active;
	}

	public WebElement getSleep() {
		return sleep;

	}

}
