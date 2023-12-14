package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myfasttracker_pain {

	
	public WebDriver driver;
	public Myfasttracker_pain(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my pain']")
	private WebElement logmypain;
	public WebElement getlogmypain() {
		return logmypain;
	}
	@FindBy (xpath = "//input[@id='dashboard-pain-date'] ")
	private WebElement logmypaindate;
	public WebElement getlogmypaindate() {
		return logmypaindate;
	}
	
	@FindBy (xpath = "//input[@id='pain_feel']")
	private WebElement logmypaintype;
	public WebElement getlogmypaintype() {
		return logmypaintype;
	}
	@FindBy (xpath = "//input[@id='pain_place']")
	private WebElement logmypainlocation;
	public WebElement getlogmypainlocation() {
		return logmypainlocation;
	}
	
	@FindBy (xpath = "//button[text()='ADD ENTRY']")
	private WebElement logmypainaddentry;
	public WebElement getlogmypainaddentry() {
		return logmypainaddentry;
	}
	//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my pain']
	//input[@id='dashboard-pain-date']  
	
//	Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//	dairycalender.selectByVisibleText("2012");
	
//	Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//	dairymonth.selectByVisibleText("Jan");
	//(//td/a[@class='ui-state-default'])[1] - dairy date
	
	
//	Select painrating = new Select(driver.findElement(By.xpath("//select[@id='rate']"));
//	painrating.selectByVisibleText("5");
	
	//input[@id='pain_feel']
	//input[@id='pain_place']
	//button[text()='ADD ENTRY']
	
}
