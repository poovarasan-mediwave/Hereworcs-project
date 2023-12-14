package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myfasttracker_problem {
	
	public WebDriver driver;
	public Myfasttracker_problem(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my problem']")
	private WebElement logmyproblem;
	public WebElement getlogmyproblem() {
		return logmyproblem;
	}

	@FindBy (xpath = "//input[@id='dashboard-problem-date']")
	private WebElement logmyproblemdate;
	public WebElement getlogmyproblemdate() {
		return logmyproblemdate;
	}
	
	@FindBy (xpath = "//textarea[@placeholder='Describe your problem notes']")
	private WebElement logmyproblemnotes;
	public WebElement getlogmyproblemnotes() {
		return logmyproblemnotes;
	}

//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my problem']
//input[@id='dashboard-problem-date']

// Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//dairycalender.selectByVisibleText("2012");

//Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//dairymonth.selectByVisibleText("Jan");

//  (//td/a[@class='ui-state-default'])[1] 

//Select problemcompare = new Select(driver.findElement(By.By.xpath("//select[@id='problem-overviews-rate']"));
//problemcompare.selectByVisibleText("Better");


//div[@id='smiley']/div/input[@id='pbm-chk2']/following-sibling::label
//textarea[@placeholder='Describe your problem notes']

//button[text()[normalize-space() = 'ADD ENTRY']] - add entry problem
//span[@id='Remove-focus-to-close-problem-tracker']/*[name()='svg'] - back to problem
	
}