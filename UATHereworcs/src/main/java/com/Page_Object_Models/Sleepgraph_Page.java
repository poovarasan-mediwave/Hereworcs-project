package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sleepgraph_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//label[normalize-space()='Week'])[1]")
	private WebElement week1;

	@FindBy(xpath = "(//i[@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary'])[1]")
	private WebElement left;

	@FindBy(xpath = "(//label[normalize-space()='Month'])[1]")
	private WebElement Month1;

	@FindBy(xpath = "(//label[normalize-space()='Year'])[1]")
	private WebElement Year1;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[4]/div[3]/div[3]/div[1]/div[3]/a[1]/button[1]")
	private WebElement edit;

	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[1]/div[4]/div[2]/div[4]/button[2]")
	private WebElement update;
	
	@FindBy (xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[4]/div[3]/div[3]/div[1]/div[3]/button[1]")
	private WebElement delete;
	
	@FindBy (xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[4]/div[6]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	private WebElement cont;
	
	@FindBy (xpath = "/html[1]/body[1]/div[9]/div[2]/div[1]/div[4]/div[2]/div[5]/canvas[1]")
	private WebElement jsscroll;

	public Sleepgraph_Page(WebDriver graphpg) {
		this.driver = graphpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getWeek1() {
		return week1;
	}

	public WebElement getLeft() {
		return left;
	}

	public WebElement getMonth1() {
		return Month1;
	}

	public WebElement getYear1() {
		return Year1;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getUpdate() {
		return update;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getJsscroll() {
		return jsscroll;
	}
	

}
