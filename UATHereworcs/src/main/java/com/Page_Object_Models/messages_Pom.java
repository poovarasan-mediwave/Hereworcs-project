package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class messages_Pom {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My messages img']")
	private WebElement adding;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continuee;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[5]")
	private WebElement scroll;

	@FindBy(xpath = "(//button[normalize-space()='GO TO MESSAGES'])[1]")
	private WebElement go_To;

	@FindBy(xpath = "/html[1]/body[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]")
	private WebElement message_page;

	public messages_Pom(WebDriver message) {
		this.driver = message;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdding() {
		return adding;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getGo_To() {
		return go_To;
	}

	public WebElement getMessage_page() {
		return message_page;
	}
}
