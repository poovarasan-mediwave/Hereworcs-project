package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Moodgraph_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//label[normalize-space()='Year'])[1]")
	private WebElement Year;

	@FindBy(xpath = "(//i[@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary mw-text-primary'])[1]")
	private WebElement leftarrow;

	@FindBy(xpath = "(//label[normalize-space()='Month'])[1]")
	private WebElement month;
    
	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[3]/div[1]/div[3]/a[1]/button[1]")
	private WebElement edit;
	
	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/div[1]/div[2]/div[2]/div[2]/div[10]/button[2]")
	private WebElement record;
	
	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/div[2]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[3]/button[1]")
	private WebElement delete;
	
	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[2]/div[2]/div[1]/div[2]/div[5]/div[5]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	private WebElement Conti;
	
	@FindBy(xpath = "(//canvas[@id='moodChart'])[1]")
	private WebElement scroll;
	
	
	
	

	public Moodgraph_Page(WebDriver graphpg) {
		this.driver = graphpg;

		PageFactory.initElements(driver, this);

	}



	public WebElement getYear() {
		return Year;
	}



	public WebElement getLeftarrow() {
		return leftarrow;
	}



	public WebElement getMonth() {
		return month;
	}



	public WebElement getEdit() {
		return edit;
	}



	public WebElement getRecord() {
		return record;
	}



	public WebElement getDelete() {
		return delete;
	}



	public WebElement getConti() {
		return Conti;
	}



	public WebElement getScroll() {
		return scroll;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
