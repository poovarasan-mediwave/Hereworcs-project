package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDiary {
	
	public WebDriver driver;
	public MyDiary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@class='dash-panel position-relative search-font-size-reduce']/div[1]/div[2]/form/div[1]/input[@id='diary_date']")
	private WebElement mydairydatefield;
	public WebElement getmydairydatefield() {
		return mydairydatefield;
	}
	
	@FindBy (xpath = "//input[@placeholder='Please make a diary entry']")
	private WebElement mydairy_dairyentry;
	public WebElement getmydairy_dairyentry() {
		return mydairy_dairyentry;
	}
	
	
	@FindBy (xpath = "//button[text()='ADD ENTRY']")
	private WebElement mydairy_addentry;
	public WebElement getmydairy_addentry() {
		return mydairy_addentry;
	}
	
	@FindBy (xpath = "//button[text()='Take me to diary']")
	private WebElement mydairy_takemetodairy;
	public WebElement getmydairy_takemetodairy() {
		return mydairy_takemetodairy;
	}
	
	
	//div[@class='dash-panel position-relative search-font-size-reduce']/div[1]/div[2]/form/div[1]/input[@id='diary_date'] - dairy date
//	Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//	dairycalender.selectByVisibleText("2012");
	
//	Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//	dairymonth.selectByVisibleText("Jan");
//	(//td/a[@class='ui-state-default'])[1] - dairy date
	//input[@placeholder='Please make a diary entry']  - diary entry
	//button[text()='ADD ENTRY']-- add entry button
	//button[text()='Take me to diary'] - Take me to diary button inside popup

}
