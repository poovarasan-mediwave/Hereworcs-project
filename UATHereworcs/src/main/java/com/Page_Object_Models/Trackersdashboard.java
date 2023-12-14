package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trackersdashboard {

	
	//li/a[text()=' Tracker dashboard']
	//a[text()='Inactive trackers']
	
	//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][1]/div/label/span  -sleep
	//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][1]/div/label/span   -mood
	
	public WebDriver driver;
	public Trackersdashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy (xpath = "//li/a[text()=' Tracker dashboard']")
	@FindBy (xpath = "(//li/a[@href='/tracker'])[1]")
	private WebElement Trackerdashboard;
	public WebElement trackerdashboard() {
		return Trackerdashboard;
	}
	@FindBy (xpath = "//a[text()='Inactive trackers']")
	private WebElement Inactivetracker;
	public WebElement inactivetracker() {
		return Inactivetracker;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][1]/div/label/span")
	private WebElement Sleeptrackerenable;
	public WebElement sleeptrackerenable() {
		return Sleeptrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][2]/div/label/span")
	private WebElement Moodtrackerenable;
	public WebElement moodtrackerenable() {
		return Moodtrackerenable;
	}
	
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][3]/div/label/span")
	private WebElement Problemtrackerenable;
	public WebElement problemtrackerenable() {
		return Problemtrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][4]/div/label/span")
	private WebElement Paintrackerenable;
	public WebElement paintrackerenable() {
		return Paintrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][5]/div/label/span")
	private WebElement Weighttrackerenable;
	public WebElement weighttrackerenable() {
		return Weighttrackerenable;
	}
	
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][6]/div/label/span")
	private WebElement Dailystepstrackerenable;
	public WebElement dailystepstrackerenable() {
		return Dailystepstrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][7]/div/label/span")
	private WebElement Bloodpressuretrackerenable;
	public WebElement bloodpressuretrackerenable() {
		return Bloodpressuretrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][8]/div/label/span")
	private WebElement Waistcircumferencetrackerenable;
	public WebElement waistcircumferencetrackerenable() {
		return Waistcircumferencetrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][9]/div/label/span")
	private WebElement Diettrackerenable;
	public WebElement diettrackerenable() {
		return Diettrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][10]/div/label/spann")
	private WebElement Exercisetrackerenable;
	public WebElement exercisetrackerenable() {
		return Exercisetrackerenable;
	}
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][11]/div/label/span")
	private WebElement Fluidtrackerenable;
	public WebElement fluidtrackerenable() {
		return Fluidtrackerenable;
	}
	//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][12]/div/label/span
	@FindBy (xpath = "//div[@class='remove col-lg-3 col-md-4 col-sm-6 col-max-575 p-0  resize-div '][12]/div/label/span")
	private WebElement Mediationtrackerenable;
	public WebElement mediationtrackerenable() {
		return Mediationtrackerenable;
	}
}
