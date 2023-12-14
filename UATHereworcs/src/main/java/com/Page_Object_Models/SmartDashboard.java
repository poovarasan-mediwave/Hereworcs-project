package com.Page_Object_Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartDashboard {

	
	public WebDriver driver;
	public SmartDashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//div[@class='position-relative w-fit-content'])[2]//*[name()='svg']")
	private WebElement adddashboarditem;
	public WebElement getadddashboarditem() {
		return adddashboarditem;
	}
	
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative'][1]/div[1]/span/*[name()='svg'][@alt='My Location img']")
	private WebElement mylocation_dashboard;
	public WebElement getmylocation_dashboard() {
		return mylocation_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My diary img']")
	private WebElement mydiary_dashboard;
	public WebElement getmydiary_dashboard() {
		return mydiary_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My tracker overview img']")
	private WebElement mytrackeroverview_dashboard;
	public WebElement getmytrackeroverview_dashboard() {
		return mytrackeroverview_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My fast tracker log img']")
	private WebElement myfasttrackerlog_dashboard;
	public WebElement getmyfasttrackerlog_dashboard() {
		return myfasttrackerlog_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My messages img']")
	private WebElement mymessage_dashboard;
	public WebElement getmymessage_dashboard() {
		return mymessage_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My appointments img']")
	private WebElement myappointment_dashboard;
	public WebElement getmyappointment_dashboard() {
		return myappointment_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My circle img']")
	private WebElement mycircle_dashboard;
	public WebElement getmycircle_dashboard() {
		return mycircle_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My recommended resources img']")
	private WebElement myrecommended_dashboard;
	public WebElement getmyrecommended_dashboard() {
		return myrecommended_dashboard;
	}
	
	@FindBy (xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My saved resources img']")
	private WebElement mysavedresource_dashboard;
	public WebElement getmysavedresource_dashboard() {
		return mysavedresource_dashboard;
	}
	
	
	//(//button[text()='CONTINUE'])[2]  - continue button
			@FindBy (xpath = "(//button[text()='CONTINUE'])[2]")
			private WebElement continuebt_dashboardpopup;
			public WebElement getcontinuebt_dashboardpopup() {
				return continuebt_dashboardpopup;
			}	
			
	//div[@class='top-arrow smart info-tooltip-guide popover tour-guide-bg tour tour-tour tour-tour-0 fade bottom in']/div/div/button
	//div[@class='down-arrow smart-dash info-tooltip-guide popover tour-guide-bg tour tour-tour tour-tour-2 fade top in']/div/div/button
	//div[@class='dash-list-card search-font-size-reduce position-relative'][1]/div[1]/span - location button
	//div[@class='dash-list-card search-font-size-reduce position-relative'][2]/div[1]/span  -my diary
	//div[@class='dash-list-card search-font-size-reduce position-relative'][3]/div[1]/span  -my tracker overview
	//div[@class='dash-list-card search-font-size-reduce position-relative'][4]/div[1]/span  -my fast tracker log
	//div[@class='dash-list-card search-font-size-reduce position-relative'][5]/div[1]/span -my message
	//div[@class='dash-list-card search-font-size-reduce position-relative'][6]/div[1]/span  -my appointment
	//div[@class='dash-list-card search-font-size-reduce position-relative'][7]/div[1]/span - my circle
	//div[@class='dash-list-card search-font-size-reduce position-relative'][8]/div[1]/span  -my recommended resource
	//div[@class='dash-list-card search-font-size-reduce position-relative'][9]/div[1]/span  - my saved resource
	
	  //  (//button[text()='CONTINUE'])[2]  - continue button
	
	
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/h3[text()='My Location']/following-sibling::div")
	private WebElement remove_mylocation;
	public WebElement getremove_mylocation() {
		return remove_mylocation;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[text()='My diary']/following-sibling::div")
	private WebElement remove_mydairy;
	public WebElement getremove_mydairy() {
		return remove_mydairy;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-lg-12 py-2']/div/div/div[2]")
	private WebElement remove_mytrackeroverview;
	public WebElement getremove_mytrackeroverview() {
		return remove_mytrackeroverview;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='trackerDashboard'][text()='My fast tracker log']/following-sibling::div/span")
	private WebElement remove_myfasttrackerlog;
	public WebElement getremove_myfasttrackerlog() {
		return remove_myfasttrackerlog;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='messageDashboard'][text()='My messages']/following-sibling::div/span")
	private WebElement remove_mymessages;
	public WebElement getremove_mymessages() {
		return remove_mymessages;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='appointmentDash'][text()='My appointments']/following-sibling::div/span")
	private WebElement remove_myappointment;
	public WebElement getremove_myappointment() {
		return remove_myappointment;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/h3[@id='circleDashboard'][text()='My circle']/following-sibling::div/span")
	private WebElement remove_mycircle;
	public WebElement getremove_mycircle() {
		return remove_mycircle;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-8 py-2']/div/div/div/h3[@id='recommendedDashboard'][text()='My recommended resources']/following-sibling::div/span")
	private WebElement remove_myrecommendedresource;
	public WebElement getremove_myrecommendedresource() {
		return remove_myrecommendedresource;
	}
	
	@FindBy (xpath = "//div[@class='dash-box col-xl-8 py-2']/div/div/div/h3[@id='savedDashboard'][text()='My saved resources']/following-sibling::div/span")
	private WebElement remove_mysavedresource;
	public WebElement getremove_mysavedresource() {
		return remove_mysavedresource;
	}
	//div[@class='dash-box col-xl-4 py-2']/div/div/h3[text()='My Location']/following-sibling::div  - remove my location
	//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[text()='My diary']/following-sibling::div  - remove my dairy
	//div[@class='dash-box col-lg-12 py-2']/div/div/div[2]                   -  remove my tracker overview
	//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='trackerDashboard'][text()='My fast tracker log']/following-sibling::div/span -remove my fast tracker log
	//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='messageDashboard'][text()='My messages']/following-sibling::div/span  - my messages
	//div[@class='dash-box col-xl-4 py-2']/div/div/div/h3[@id='appointmentDash'][text()='My appointments']/following-sibling::div/span  - remove my appointment
	//div[@class='dash-box col-xl-4 py-2']/div/div/h3[@id='circleDashboard'][text()='My circle']/following-sibling::div/span     -My circle
	//div[@class='dash-box col-xl-8 py-2']/div/div/div/h3[@id='recommendedDashboard'][text()='My recommended resources']/following-sibling::div/span  - my recommended resource
	//div[@class='dash-box col-xl-8 py-2']/div/div/div/h3[@id='savedDashboard'][text()='My saved resources']/following-sibling::div/span   -my saved resu
	
	
	
	//div[@class='dash-panel position-relative search-font-size-reduce']/div[1]/div[2]/form/div[1]/input[@id='diary_date'] - dairy date
//	Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//	dairycalender.selectByVisibleText("2012");
	
//	Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//	dairymonth.selectByVisibleText("Jan");
//	(//td/a[@class='ui-state-default'])[1] - dairy date
	//input[@placeholder='Please make a diary entry']  - diary entry
	//button[text()='ADD ENTRY']-- add entry button
	//button[text()='Take me to diary'] - Take me to diary button inside popup
	
	
	@FindBy (xpath = "//button[contains(text(),'RECORD MEDICATION')]")
	private WebElement recordmedicationbtn;
	
	@FindBy (xpath = "//a[@href=' /tracker/medication/add  ']")
	private WebElement addnewmedicationpage ;
	
	
}
