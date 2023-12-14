package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_circle {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My circle img']")
	private WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[7]")
	private WebElement scrn_sht;

	@FindBy(xpath = "//span[@class='mw-text-white']")
	private WebElement add_Circle;

	@FindBy(xpath = "/html/body/div[8]/div/div[2]/div/div[5]/div[1]/div/div[1]/a/svg/path")
	private WebElement person;
	
	@FindBy(xpath = "(//a[@class='add-person-link m-b-30 flex-between'])[1]")
	private WebElement scroll;

	public My_circle(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
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

	public WebElement getAdd_Circle() {
		return add_Circle;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getPerson() {
		return person;
	}

}
