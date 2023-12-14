package com.Page_Object_Models;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Diet {

	
	public WebDriver driver;
	
	public Diet(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@href='/tracker/diet']")
	private WebElement dietTracker;
	
	@FindBy (xpath = "//a[contains(text(),'ENTER DIET INFORMATION')]")
	private WebElement dietInformation;
	
	@FindBy (xpath = "//input[@placeholder='Select the date']")
	private WebElement dietdate;
	
	/*@FindBy (xpath = "//div[@class='vc-arrow is-left']")
	private WebElement leftarrowformonthselect;
	*/
	
	@FindBy (xpath = "//div[@class='vc-title']")
	private WebElement calendartitle;
	
	@FindBy (xpath = "//span[@class='vc-nav-title vc-grid-focus']")
	private WebElement calendaryearoption;
	
	//span[@class='vc-nav-title vc-grid-focus']
	@FindBy (xpath = "//span[normalize-space()='2016']")
	private WebElement calendartitleyear;
	
	@FindBy (xpath = "//span[@class='vc-nav-item'][6]")
	private WebElement calendartitlemonth;
	
	
	
	@FindBy (xpath = "//div[@class='vc-weeks']//div//span[@tabindex='-1' or @tabindex='0']")
	private List<WebElement> selectdatess;
	 
	
	//div[@class='vc-weeks']//div//span[@tabindex='-1' or @tabindex='0']
	//span[@class='vc-nav-item'][6]
	//span[normalize-space()='2022']
	
	//@FindBy (xpath = "//span[contains(@aria-label, ' 17 December 2021')] | //span[contains(@aria-label, ' December 17, 2021')]")
	//private WebElement selectdatess;
	
	@FindBy (xpath = "//label[@for='Breakfast']")
	private WebElement Breakfast;
	
	@FindBy (xpath = "//label[@for='Lunch']")
	private WebElement Lunch;
	
	@FindBy (xpath = "//label[@for='Dinner']")
	private WebElement Dinner;
	@FindBy (xpath = "//label[@for='Snack']")
	private WebElement snack;
	
	@FindBy (xpath = "//label[@for='Small']")
	private WebElement small;
	

	@FindBy (xpath = "//label[@for='Medium']")
	private WebElement medium;
	
	@FindBy (xpath = "//label[@for='Large']")
	private WebElement Large;
	
	@FindBy (xpath = "//a[@href='/tracker/diet']/following-sibling::button")
	private WebElement recordmeal;
	
	@FindBy (xpath = "//div[@class='d-flexes m-l-12 mw-text-primary']/i[1]")
	private WebElement weekarrow;
	
	@FindBy (xpath = "//label[@for='Month ']")
	private WebElement dietMonth;
	
	@FindBy (xpath = "//label[@for='Week']")
	private WebElement dietWeek;
	
	@FindBy (xpath = "//label[@for='Year']")
	private WebElement dietYear;
	


public WebElement getdeitTracker() {
	return dietTracker;
}
	
public WebElement getdietInformation() {
	return dietInformation;
}
	
	
/*public WebElement getddietInformation() {
	return dietTracker;
}*/

public WebElement getdietdate() {
	return dietdate;
}

public WebElement getcalendartitle() {
	return calendartitle;
}

public WebElement getcalendaryearoption() {
	return calendaryearoption;
}

public WebElement getcalendartitleyear() {
	return calendartitleyear;
}

public WebElement getcalendartitlemonth() {
	return calendartitlemonth;
}


public List<WebElement> getdietselectdatess() {
	return selectdatess;
}

public WebElement getBreakfast() {
	return Breakfast;
}
///
public WebElement getLunch() {
	return Lunch;
}
public WebElement getDinner() {
	return Dinner;
}
public WebElement getsnack() {
	return snack;
}

///
public WebElement getsmall() {
	return small;
}

public WebElement getmedium() {
	return medium;
}
public WebElement getLarge() {
	return Large;
}	

public WebElement getrecordmeal() {
	return recordmeal;
}

public WebElement getdietMonth() {
	return dietMonth;
}

public WebElement getdietWeek() {
	return dietWeek;
}

public WebElement getdietYear() {
	return dietYear;
}

public WebElement getweekarrow() {
	// TODO Auto-generated method stub
	return weekarrow;
}
	
}

