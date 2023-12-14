package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExerciseTracker {
	
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
		
		// Menu  part
		
		@FindBy(xpath = "//div[@class='footer-desktop-img position-relative']")
		private WebElement clickMenus;
		
		@FindBy(xpath= "//li[text()[normalize-space()='Trackers']]")
		private WebElement ClickTrackersinMenu;
		
		//Exercise Tracker part
		
		
				
				//div[@id='submenu-height']//div[2]//div[1]//*[name()='svg']
				
				@FindBy(xpath="(//div[contains(@class,'material-icons wh-40')])[2]")
				private WebElement Swipearrow;
		
		@FindBy(xpath= "//li/a[@href='/tracker/exercise']")
		private WebElement ClickExerciseTracker;
		
		@FindBy(xpath= "//a[@href=' /tracker/exercise/add ']/button[@type='submit']")
		private WebElement AddExerciseInformation;
		
		
		
	
		
		@FindBy(xpath="//input[@class='tracker-goal-input cal-icon']")
		private WebElement clickcalendar;
		
		@FindBy(xpath="//div[@class='vc-title']")
		private WebElement Clickmonthandyear;
		
		@FindBy(xpath="//span[@class='vc-nav-title vc-grid-focus']")
		private WebElement ClickYear;
		
		@FindBy(xpath="(//span[@class='vc-nav-item'])[1]")
		private WebElement ClickYeartoSelect;
		
		@FindBy(xpath="(//span[@class='vc-nav-item'])[6]")
		private WebElement clickmonthtoselect;
		
		@FindBy(xpath="//div[@class='vc-weeks']//div//span[@tabindex='-1' or @tabindex='0']")
		private List<WebElement> choosedate;
		
				

		
		
		@FindBy(xpath= "//label[@for='casual']")
		private WebElement selectcasual;
		
		@FindBy(xpath= "//label[@for='active']")
		private WebElement selectactive;
		
		@FindBy(xpath= "//div[@id='casual-block-section']/div/div/input[@id='gardening']/following-sibling::label/div")
		private WebElement selectcasualactivity;
		
		@FindBy(xpath= "//div[@id='activity-block-section']/div/div/input[@id='Jogging']/following-sibling::label/div")
		private WebElement selectactiveactivity;
		
		@FindBy(xpath= "//input[@id='from_date']")
		private WebElement Enterminutes;
		
		
		@FindBy(xpath= "//input[@id='calories_burned']")
		private WebElement EnterCalories;
		
		
		@FindBy(xpath= "//div[@id='add-exercise-ctrl']//button[2]")
		private WebElement RecordExercisebutton;
		
		public ExerciseTracker(WebDriver log) {
			this.driver = log;
			PageFactory.initElements(driver, this);
		}

		public WebElement getSwipearrow() {
			return Swipearrow;
		}

		

		public WebElement getEmailaddress() {
			return Emailaddress;
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

		public WebElement getClickExerciseTracker() {
			return ClickExerciseTracker;
		}

		public WebElement getAddExerciseInformation() {
			return AddExerciseInformation;
		}

		
		
		public WebElement getClickcalendar() {
			return clickcalendar;
		}

		public WebElement getClickmonthandyear() {
			return Clickmonthandyear;
		}

		public WebElement getClickYear() {
			return ClickYear;
		}

		public WebElement getClickYeartoSelect() {
			return ClickYeartoSelect;
		}

		public WebElement getClickmonthtoselect() {
			return clickmonthtoselect;
		}

		public List<WebElement> getchoosedate() {
			return choosedate;
		}

		public WebElement getSelectcasual() {
			return selectcasual;
		}
		
		public WebElement getSelectactive() {
			return selectactive;
		}

		public WebElement getSelectcasualactivity() {
			return selectcasualactivity;
		}
		
		
		public WebElement getSelectactiveactivity() {
			return selectactiveactivity;
		}

		public WebElement getEnterminutes() {
			return Enterminutes;
		}

		public WebElement getEnterCalories() {
			return EnterCalories;
		}

		public WebElement getRecordExercisebutton() {
			return RecordExercisebutton;
		}
		
}

