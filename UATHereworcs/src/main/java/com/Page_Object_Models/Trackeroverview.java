package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trackeroverview {

	
	
	public WebDriver driver;
	public Trackeroverview(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//a[text()='TRACKER OVERVIEW']
	@FindBy (xpath = "//a[text()='TRACKER OVERVIEW']")
	private WebElement Trackeroverviewmodule;
	public WebElement trackeroverviewmodule() {
		return Trackeroverviewmodule;
	}
	 
	//div[@class='add-tracker-list notify-bar d-flex']/following-sibling::p
	@FindBy (xpath = "//div[@class='add-tracker-list notify-bar d-flex']")
	private WebElement AddTrackersbtn;
	public WebElement addTrackersbtn() {
		return AddTrackersbtn;
	}
	
	//********Add Trackers for view information**********/
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-sleep-tracker']/div[2]/div[2]/button")
	private WebElement Sleepaverage;
	public WebElement sleepaverage() {
		return Sleepaverage;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-mood-tracker']/div[2]/div[2]/button")
	private WebElement Moodaverage;
	public WebElement moodaverage() {
		return Moodaverage;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-diet-tracker']/div[2]/div[2]/button")
	private WebElement Dietaverage;
	public WebElement dietaverage() {
		return Dietaverage;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-exercise-tracker']/div[2]/div[2]/button")
	private WebElement Exerciseaverage;
	public WebElement exerciseaverage() {
		return Exerciseaverage;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-medication-tracker']/div[2]/div[2]/button")
	private WebElement Medicationaverage;
	public WebElement medicationaverage() {
		return Medicationaverage;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card h-100 add-fluid-tracker']/div[2]/div[2]/button")
	private WebElement Fluidaverage;
	public WebElement fluidaverage() {
		return Fluidaverage;
	}
	
	//*************your tracker -left arrow and right arrow ****************//

	@FindBy (xpath = "(//div[@class='d-flexes m-l-12 mw-text-primary'])[1]/button[1][@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary btn-empty']")
	private WebElement Yourtrackerleftarrow;
	public WebElement yourtrackerleftarrow() {
		return Yourtrackerleftarrow;
	}
	
	@FindBy (xpath = "(//div[@class='d-flexes m-l-12 mw-text-primary'])[1]/button[2]")
	private WebElement Yourtrackerrightarrow;
	public WebElement yourtrackerrightarrow() {
		return Yourtrackerrightarrow;
	}
	
	//*********your tracker button for week, month, year***********//
	
	@FindBy (xpath = "//input[@name='chartTypeOverview']/following-sibling::label[@for='weekOverview']")
	private WebElement Yourtrackerweekbutton;
	public WebElement yourtrackerweekbutton() {
		return Yourtrackerweekbutton;
	}
	
	
	@FindBy (xpath = "//input[@name='chartTypeOverview']/following-sibling::label[@for='weekOverview']")
	private WebElement Yourtrackermonthbutton;
	public WebElement yourtrackermonthbutton() {
		return Yourtrackermonthbutton;
	}
	
	//input[@name='chartTypeOverview']/following-sibling::label[@for='yearOVerview']
	@FindBy (xpath = "//input[@name='chartTypeOverview']/following-sibling::label[@for='yearOVerview']")
	private WebElement Yourtrackeryearbutton;
	public WebElement yourtrackeryearbutton() {
		return Yourtrackeryearbutton;
	}
	
	/***** Remove Tracker from view information*************/
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-sleep-tracker']/div[1]/div[2]/button")
	private WebElement Sleepaverageremove;
	public WebElement sleepaverageremove() {
		return Sleepaverageremove;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-mood-tracker']/div[1]/div[2]/button")
	private WebElement Moodaverageremove;
	public WebElement moodaverageremove() {
		return Moodaverageremove;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-exercise-tracker position-relative']/div[1]/div[2]/button")
	private WebElement Dietaverageremove;
	public WebElement dietaverageremove() {
		return Dietaverageremove;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-exercise-tracker position-relative']/div/div[2]")
	private WebElement Exerciseaverageremove;
	public WebElement exerciseaverageremove() {
		return Exerciseaverageremove;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-medication-tracker position-relative']/div[1]/div[2]/button")
	private WebElement Medicationaverageremove;
	public WebElement medicationaverageremove() {
		return Medicationaverageremove;
	}
	@FindBy (xpath = "//div[@class='tracker-overview-card mw-border-primary mw-bg-white-card average-fluid-tracker position-relative']/div[1]/div[2]/button")
	private WebElement Fluidaverageremove;
	public WebElement fluidaverageremove() {
		return Fluidaverageremove;
	}
	
	
	/************************** Tracker overview************************/
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-sleep-tracker-btn']/label/div")
	private WebElement Sleeptrackeroverview;
	public WebElement sleeptrackeroverview() {
		return Sleeptrackeroverview;
	}
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-mood-tracker-btn']/label/div")
	private WebElement Moodtrackeroverview;
	public WebElement moodtrackeroverview() {
		return Moodtrackeroverview;
	}
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-fluid-tracker-btn']/label/div")
	private WebElement Fluidtrackeroverview;
	public WebElement fluidtrackeroverview() {
		return Fluidtrackeroverview;
	}
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-exercise-tracker-btn']/label/div")
	private WebElement Exercisetrackeroverview;
	public WebElement exercisetrackeroverview() {
		return Exercisetrackeroverview;
	}
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-diet-tracker-btn']/label/div")
	private WebElement Diettrackeroverview;
	public WebElement diettrackeroverview() {
		return Diettrackeroverview;
	}
	@FindBy (xpath = "//div[@class='appointment-filter-group compare-graph compare-medication-tracker-btn']/label/div")
	private WebElement Medicationtrackeroverview;
	public WebElement medicationtrackeroverview() {
		return Medicationtrackeroverview;
	}
	
	//******Tracker overview - left arrow and right arrow*************//

	@FindBy (xpath = "(//div[@class='d-flexes m-l-12 mw-text-primary'])[2]/button[1]")
	private WebElement Trackeroverviewleftarrow;
	public WebElement trackeroverviewleftarrow() {
		return Trackeroverviewleftarrow;
	}
	
	
	@FindBy (xpath = "(//div[@class='d-flexes m-l-12 mw-text-primary'])[2]/button[2]")
	private WebElement Trackeroverviewrightarrow;
	public WebElement trackeroverviewrightarrow() {
		return Trackeroverviewrightarrow;
	}

	
	//*************Tracker overview *************//
	
	@FindBy (xpath = "//input[@name='chartType']/following-sibling::label[@for='week']")
	private WebElement Trackeroverviewweektbutton;
	public WebElement trackeroverviewweektbutton() {
		return Trackeroverviewweektbutton;
	}

	
	@FindBy (xpath = "//input[@name='chartType']/following-sibling::label[@for='month']")
	private WebElement Trackeroverviewmonthbutton;
	public WebElement trackeroverviewmonthbutton() {
		return Trackeroverviewmonthbutton;
	}

	@FindBy (xpath = "//input[@name='chartType']/following-sibling::label[@for='year']")
	private WebElement Trackeroverviewyearbutton;
	public WebElement trackeroverviewyearbutton() {
		return Trackeroverviewyearbutton;
	}
}

