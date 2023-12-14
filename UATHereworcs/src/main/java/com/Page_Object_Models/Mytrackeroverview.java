package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mytrackeroverview {
	public WebDriver driver;
	public Mytrackeroverview(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//div[@class='overview-chart-block m-l-r-0 mw-bg-card mb-0 w-100']/div/fieldset/div[@class='appointment-filter-group compare-graph compare-sleep-tracker-btn']/label
	//div[@class='appointment-filter-group compare-graph compare-mood-tracker-btn']/label
	//div[@class='appointment-filter-group compare-graph compare-fluid-tracker-btn']/label
	//div[@class='appointment-filter-group compare-graph compare-exercise-tracker-btn']/label
	//div[@class='appointment-filter-group compare-graph compare-diet-tracker-btn']/label
	//div[@class='appointment-filter-group compare-graph compare-medication-tracker-btn']/label
	
	//button[@class='border-0 bg-none'][1] -preview	
	//button[@class='border-0 bg-none'][2]  - next
	//label[text()='Week'] -week
	//label[text()='Month'] - month
	//label[text()='Year'] -year
	
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-sleep-tracker-btn']/label")
	private WebElement mytrackeroverview_sleep;
	public WebElement getmytrackeroverview_sleep() {
		return mytrackeroverview_sleep;
	}
	
	
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-mood-tracker-btn']/label")
	private WebElement mytrackeroverview_mood;
	public WebElement getmytrackeroverview_mood() {
		return mytrackeroverview_mood;
	}
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-fluid-tracker-btn']/label")
	private WebElement mytrackeroverview_fluid;
	public WebElement getmytrackeroverview_fluid() {
		return mytrackeroverview_fluid;
	}
	
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-exercise-tracker-btn']/label")
	private WebElement mytrackeroverview_exercise;
	public WebElement getmytrackeroverview_exercise() {
		return mytrackeroverview_exercise;
	}
	
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-diet-tracker-btn']/label")
	private WebElement mytrackeroverview_diet;
	public WebElement getmytrackeroverview_diet() {
		return mytrackeroverview_diet;
	}
	
	@FindBy(xpath = "//div[@class='appointment-filter-group compare-graph compare-medication-tracker-btn']/label")
	private WebElement mytrackeroverview_medication;
	public WebElement getmytrackeroverview_medication() {
		return mytrackeroverview_medication;
	}
	
	@FindBy(xpath = "//button[@class='border-0 bg-none'][1]")
	private WebElement mytrackeroverview_previous;
	public WebElement getmytrackeroverview_previous() {
		return mytrackeroverview_previous;
	}
	
	@FindBy(xpath = "//button[@class='border-0 bg-none'][2]")
	private WebElement mytrackeroverview_next;
	public WebElement getmytrackeroverview_next() {
		return mytrackeroverview_next;
	}
	
	@FindBy(xpath = "//label[text()='Week']")
	private WebElement mytrackeroverview_week;
	public WebElement getmytrackeroverview_week() {
		return mytrackeroverview_week;
	}
	
	@FindBy(xpath = "//label[text()='Month']")
	private WebElement mytrackeroverview_month;
	public WebElement getmytrackeroverview_month() {
		return mytrackeroverview_month;
	}
	
	@FindBy(xpath = "//label[text()='Year']")
	private WebElement mytrackeroverview_year;
	public WebElement getmytrackeroverview_year() {
		return mytrackeroverview_year;
	}
	
}
