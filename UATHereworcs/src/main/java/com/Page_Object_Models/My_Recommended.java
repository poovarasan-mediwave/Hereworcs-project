package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Recommended {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='sidebar-wrapper1']//div[@id='sm-dash-first-child']//div[1]//button[1]")
	private WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "(//h5[normalize-space()='My recommended resources'])[1]")
	private WebElement scrn_Sht;

	@FindBy(xpath = "(//button[normalize-space()='GO TO RESOURCES'])[1]")
	private WebElement view;

	@FindBy(xpath = "(//div[@class='row w-100 mx-0 justify-content-between align-items-center'])[1]")
	private WebElement scroll;

	public My_Recommended(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getScrn_Sht() {
		return scrn_Sht;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getScroll() {
		return scroll;
	}
}
