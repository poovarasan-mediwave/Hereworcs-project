package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Add_Location {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='sidebar-wrapper1']//div[@id='sm-dash-first-child']//div[1]//button[1]")
	private WebElement add;

	@FindBy(xpath = "//div[@class='icon-block clinician-success-popup-close']")
	private WebElement continue_Btn;
	
	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative'][1]/div[1]/span/*[name()='svg'][@alt='My Location img']")
	private WebElement js_Down;

	public Dashboard_Add_Location(WebDriver dash_Add) {
		this.driver = dash_Add;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getJs_Down() {
		return js_Down;
	}

}
