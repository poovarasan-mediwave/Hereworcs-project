package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Tracker_Overview {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My tracker overview img']")
	private WebElement add;

	@FindBy(xpath = "(//button[text()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body yellow'])[1]")
	private WebElement mood;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body yellow1'])[1]")
	private WebElement fluid;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body black'])[2]")
	private WebElement exercise;

	@FindBy(xpath = "(//label[normalize-space()='Month'])[1]")
	private WebElement month;

	@FindBy(xpath = "(//i[@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary'])[1]")
	private WebElement arrow;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[3]")
	private WebElement js_Scroll;

	public My_Tracker_Overview(WebDriver track) {
		this.driver = track;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
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

	public WebElement getMonth() {
		return month;
	}

	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getJs_Scroll() {
		return js_Scroll;
	}

}
