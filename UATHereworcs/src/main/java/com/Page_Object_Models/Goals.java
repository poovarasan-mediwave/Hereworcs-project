package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Goals {

	public WebDriver driver;

	//Login

	@FindBy(xpath = "//input[@id='login_email']")
	private WebElement Emailaddress;

	@FindBy(xpath = "//input[@id='login_password']")
	private WebElement password;

	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement Loginbutton;

	@FindBy(xpath="//button[@class='accept_cookie']")
	private WebElement Acceptcookies;


	@FindBy(xpath = "//div[@id='open-desktop-footer']//div")
	private WebElement clickMenus;

	@FindBy(xpath= "//li[text()[normalize-space()='Trackers']]")
	private WebElement ClickTrackersinMenu;


	@FindBy(xpath="//a[normalize-space()='Goals']")
	private WebElement GoalsMenu;

	@FindBy(xpath="//div[@id='goal-overview-app']//div//div//a//button[@type='submit']")
	private WebElement AddNewGoals;

	@FindBy(xpath="//input[@id='goal']")
	private WebElement whatisurgoal;

	@FindBy(xpath="//input[contains(@class,'tracker-goal-input Sdate')]")
	private WebElement datetostart;


	@FindBy(xpath="//div[@class='vc-title']")
	private WebElement ClickYearTitle;
	
	@FindBy(xpath="//div[text()='April 2022']")
	private WebElement ClickYearTitle1;

	@FindBy(xpath="//span[text()=' Oct ']")
	private WebElement ChooseMonth;
	
	public WebElement getClickYearTitle1() {
		return ClickYearTitle1;
	}


	@FindBy(xpath="//span[@aria-label='May 2000']")
	private WebElement ChooseMonth1;

	public WebElement getChooseMonth1() {
		return ChooseMonth1;
	}


	@FindBy(xpath="//span[@aria-label='Friday, April 1, 2022']")
	private WebElement ChooseStartDate;

	@FindBy(xpath="//input[@aria-label='Datepicker Date to achieve']")
	private WebElement goalachievedate;

	@FindBy(xpath="//span[contains(text(),'13')]")
	private WebElement dailydate;

	@FindBy(xpath="//span[contains(text(),'13')]")
	private WebElement weeklydate;

	@FindBy(xpath="//span[contains(text(),'13')]")
	private WebElement Monthlydate;

	@FindBy(xpath="//textarea[@placeholder='Drink more water']")
	private WebElement goaldescription;

	@FindBy(xpath="(//textarea[@id='step_description01'])[1]")
	private WebElement goalstepdesc;

	@FindBy(xpath="((//div[@class='field'])[2]/fieldset/div/div/span/label)[1]")
	private WebElement Yestoreapeattimespan;

	@FindBy(xpath="//form[@autocomplete='off']//label[@for='daily01']")
	private WebElement selectdaily;



	@FindBy(xpath="(//label[@for='weekly01'])[1]")
	private WebElement selectweekly;



	@FindBy(xpath="(//label[@for='monthly01'])[1]")
	private WebElement selectmonthly;


	public WebElement getSelectdaily() {
		return selectdaily;
	}


	@FindBy(xpath="//button[contains(@class,'mw-btn m-2')]")
	private WebElement SaveGoal;
	
	@FindBy(xpath="//span[text()='13']")
	private WebElement presentdate;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement ClickEditbutton;
	
	@FindBy(xpath="(//button[text()='Add another step'])[1]")
	private WebElement ClickAddAnotherStepButton;
	
	@FindBy(xpath="(//textarea[@name='step_description11'])[1]")
	private WebElement Enteraddstepdescription;
	
	@FindBy(xpath="//button[text()='UPDATE']")
	private WebElement clickUpdateButton;
	
	
	
	@FindBy(xpath="//button[text()='VIEW']")
	private WebElement ViewGoal;
	
	@FindBy(xpath="(//span[text()='MARK AS COMPLETED'])[1]")
	private WebElement markascompleted;
	
	@FindBy(xpath="//button[text()='DELETE']")
	private WebElement deletebuttonHome;
	
	@FindBy(xpath="(//span[text()='YES'])[2]")
	private WebElement Yestodelete;

	public WebElement getDeletebuttonHome() {
		return deletebuttonHome;
	}


	public WebElement getYestodelete() {
		return Yestodelete;
	}


	public WebElement getViewGoal() {
		return ViewGoal;
	}


	public WebElement getMarkascompleted() {
		return markascompleted;
	}


	public Goals(WebDriver log) {
		this.driver = log;
		PageFactory.initElements(driver, this);
	}


	public WebElement getDailydate() {
		return dailydate;
	}


	public WebElement getWeeklydate() {
		return weeklydate;
	}


	public WebElement getMonthlydate() {
		return Monthlydate;
	}


	public WebElement getClickYearTitle() {
		return ClickYearTitle;
	}


	public WebElement getChooseMonth() {
		return ChooseMonth;
	}


	public WebElement getChooseStartDate() {
		return ChooseStartDate;
	}


	public WebElement getChooseEndDate() {
		return dailydate;
	}


	public WebElement getEmailaddress() {
		return Emailaddress;
	}




	public WebElement getYestoreapeattimespan() {
		return Yestoreapeattimespan;
	}


	public WebElement getSelectweekly() {
		return selectweekly;
	}


	public WebElement getSelectmonthly() {
		return selectmonthly;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbutton() {
		return Loginbutton;
	}


	public WebElement getAcceptcookies() {
		return Acceptcookies;
	}


	public WebElement getClickMenus() {
		return clickMenus;
	}


	public WebElement getClickTrackersinMenu() {
		return ClickTrackersinMenu;
	}


	public WebElement getGoalsMenu() {
		return GoalsMenu;
	}


	public WebElement getAddNewGoals() {
		return AddNewGoals;
	}


	public WebElement getWhatisurgoal() {
		return whatisurgoal;
	}


	public WebElement getDatetostart() {
		return datetostart;
	}


	public WebElement getGoalachievedate() {
		return goalachievedate;
	}


	public WebElement getGoaldescription() {
		return goaldescription;
	}


	public WebElement getGoalstepdesc() {
		return goalstepdesc;
	}


	public WebElement getSaveGoal() {
		return SaveGoal;
	}


	public WebElement getPresentdate() {
		return presentdate;
	}


	public WebElement getClickEditbutton() {
		return ClickEditbutton;
	}


	public WebElement getClickAddAnotherStepButton() {
		return ClickAddAnotherStepButton;
	}


	public WebElement getEnteraddstepdescription() {
		return Enteraddstepdescription;
	}


	public WebElement getClickUpdateButton() {
		return clickUpdateButton;
	}



}
