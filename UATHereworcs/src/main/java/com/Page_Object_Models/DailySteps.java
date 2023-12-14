package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailySteps {
	
	
	public WebDriver driver;
	public DailySteps(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//a[@href='/tracker/dailysteps'])[1]")
	private WebElement Dailystepstracker;
	
	@FindBy (xpath = "//input[@name='daily_steps_date']")
	private WebElement dailystepcalendar;
	
	@FindBy (xpath = "//td[@data-month='1' and @data-year='2022']/a[text()='1']")
	private WebElement dailystepdate;
	
	@FindBy (xpath = "//input[@id='daily_steps']")
	private WebElement addsteps;
	
	@FindBy (xpath = "//button[@id='daily_steps_submit']")
	private WebElement dailystepssubmitbtn;
	
	
	@FindBy (xpath = "//select[@class='ui-datepicker-year']")
	private WebElement Yeardrp;
	
	@FindBy (xpath = "//select[@class='ui-datepicker-month']")
	private WebElement Monthdrp;
	
	//a[@class='ui-state-default']
	@FindBy (xpath = "//a[@class='ui-state-default']")
	private List<WebElement> dailystepdateselect;
  
	public List<WebElement> getdailystepdateselect() {
	return dailystepdateselect;
     }
	
	public WebElement yeardropdown() {
		return Yeardrp;
	}
	
	
	public WebElement monthdropdown() {
		return Monthdrp;
	}
	
	public WebElement getDailystepstracker() {
		return Dailystepstracker;
	}
	public WebElement getdailystepcalendar() {
		return dailystepcalendar;
	}
	
	public WebElement getdailystepdate() {
		return dailystepdate;
	}
	
	public WebElement getaddsteps() {
		return addsteps;
	}
	
	public WebElement getdailystepssubmitbtn() {
		return dailystepssubmitbtn;
	}
	
	
}
