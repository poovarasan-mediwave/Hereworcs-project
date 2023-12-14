package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Waistcircumference {

	public WebDriver driver;
	public Waistcircumference(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//li[@class='nav-scroller-item search-font-size-reduce']/a[@href='/tracker/waistcircumference']
	@FindBy (xpath = "//li[@class='nav-scroller-item search-font-size-reduce']/a[@href='/tracker/waistcircumference']")
	private WebElement waistcircumferencesec;
	public WebElement waistcircumferencesec() {
		return waistcircumferencesec;
	}
	
	
	@FindBy (xpath = "//input[@name='waist_circumference_date']")
	private WebElement waistcircumferencecalendar;
	public WebElement waistcircumferencecalendar() {
		return waistcircumferencecalendar;
	}
	
	
	@FindBy (xpath = "//select[@class='ui-datepicker-year']")
	private WebElement Yeardrp;
	public WebElement yeardropdown() {
		return Yeardrp;
	}
	
	@FindBy (xpath = "//select[@class='ui-datepicker-month']")
	private WebElement Monthdrp;
	
	public WebElement monthdropdown() {
		return Monthdrp;
	}
	
	@FindBy (xpath = "//a[@class='ui-state-default']")
	private List<WebElement> waistcircumferencedateselect;
  
	public List<WebElement> getwaistcircumferencedateselect() {
	return waistcircumferencedateselect;
     }
	
	@FindBy (xpath = "//input[@id='waist_circumference_measurement']")
	private WebElement waistcircumferencestepscount;
  
	public WebElement getwaistcircumferencestepscount() {
	return waistcircumferencestepscount;
     }
	
	@FindBy (xpath = "//button[@id='waist_circumference_submit']")
	private WebElement waistcircumferencesubmit;
  
	public WebElement getwaistcircumferencesubmit() {
	return waistcircumferencesubmit;
     }
}
