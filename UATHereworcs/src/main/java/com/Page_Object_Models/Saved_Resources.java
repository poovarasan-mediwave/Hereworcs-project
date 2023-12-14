package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saved_Resources {

	public WebDriver driver;

	@FindBy(xpath = "//div[@id='sidebar-wrapper1']//div[@id='sm-dash-first-child']//div[1]//button[1]")
	private WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[8]")
	private WebElement scrn_sht;

	@FindBy(xpath = "(//span[normalize-space()='Visit page'])[1]")
	private WebElement view_btn;

	@FindBy(xpath = "//p[normalize-space()='PDFs and articles']")
	private WebElement scroll;

	public Saved_Resources(WebDriver saved) {
		this.driver = saved;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getScrn_sht() {
		return scrn_sht;
	}

	public WebElement getView_btn() {
		return view_btn;
	}

	public WebElement getScroll() {
		return scroll;
	}

}
