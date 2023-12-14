package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myfasttracker_sleep {

	public WebDriver driver;
	public Myfasttracker_sleep(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//div[@class='px-40 py-40 ']/span/span[text()='Log my sleep']
	@FindBy (xpath = "//span[@focusto='Remove-focus-to-close-sleep-tracker']")
	private WebElement logmysleep;
	public WebElement getlogmysleep() {
		return logmysleep;
	}
	
	@FindBy (xpath = "//input[@id='dashboard-sleep-date']")
	private WebElement mysleepdatefield;
	public WebElement getmysleepdatefield() {
		return mysleepdatefield;
	}
	

	@FindBy (xpath = "//button[text()='ADD ENTRY']")
	private WebElement mysleepaddentry;
	public WebElement getmysleepaddentry() {
		return mysleepaddentry;
	}
	
	@FindBy (xpath = "//button[text()[normalize-space() = 'GO TO TRACKER']]")
	private WebElement mysleepgototracker;
	public WebElement getmysleepgototracker() {
		return mysleepgototracker;
	}
	
	//input[@id='dashboard-sleep-date']- date.
//	Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//	dairycalender.selectByVisibleText("2012");
	
//	Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//	dairymonth.selectByVisibleText("Jan");
//	(//td/a[@class='ui-state-default'])[1] - dairy date
	
	
//	Select dairymonth = new Select(driver.findElement(By.Xpath("//select[@id='bed_time']"));
//	dairymonth.selectByVisibleText("00:30");
	
//	Select dairymonth = new Select(driver.findElement(By.Xpath("//select[@id='wakeup_time']"));
//	dairymonth.selectByVisibleText("07.00");

	
//	Select dairymonth = new Select(driver.findElement(By.Xpath("//select[@id='wakeup_count']"));
//	dairymonth.selectByVisibleText("5");
	
	
//	Select dairymonth = new Select(driver.findElement(By.Xpath("//select[@id='sleep-overviews-rate']"));
//	dairymonth.selectByVisibleText("Same");
	
	//button[text()='ADD ENTRY']
	//button[text()[normalize-space() = 'GO TO TRACKER']]
	
}
