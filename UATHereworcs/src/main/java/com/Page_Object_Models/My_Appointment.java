package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Appointment {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My appointments img']")
	private WebElement adding;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement ctn_btn;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[6]")
	private WebElement scrn_sht;

	@FindBy(xpath = "(//button[normalize-space()='GO TO APPOINTMENTS'])[1]")
	private WebElement go_To_Apt;

	@FindBy(xpath = "(//div[@class='vc-header align-center'])[1]")
	private WebElement scroll;

	public My_Appointment(WebDriver appt) {
		this.driver = appt;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdding() {
		return adding;
	}

	public WebElement getCtn_btn() {
		return ctn_btn;
	}

	public WebElement getScrn_sht() {
		return scrn_sht;
	}

	public WebElement getGo_To_Apt() {
		return go_To_Apt;
	}

	public WebElement getScroll() {
		return scroll;
	}

}
