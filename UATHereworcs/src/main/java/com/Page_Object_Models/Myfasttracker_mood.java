package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myfasttracker_mood {

	
	public WebDriver driver;
	public Myfasttracker_mood(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy (xpath = "//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my mood']")
		private WebElement logmymood;
		public WebElement getlogmymood() {
			return logmymood;
		}
		
		@FindBy (xpath = "//input[@id='dashboard-mood-date']")
		private WebElement mymooddatefield;
		public WebElement getmymooddatefield() {
			return mymooddatefield;
		}
		
		@FindBy (xpath = "//div[@id='smiley-block']/div[2]/div[@class='mood-img mood-happy']")
		private WebElement mymoodfeeling;
		public WebElement getmymoodfeeling() {
			return mymoodfeeling;
		}
		
		
		@FindBy (xpath = "//textarea[@placeholder='Describe your mood']")
		private WebElement mymoodnotes;
		public WebElement getmymoodnotes() {
			return mymoodnotes;
		}
		

		@FindBy (xpath = "//button[normalize-space(text()) = 'ADD ENTRY']")
		private WebElement mymoodaddentry;
		public WebElement getmymoodaddentry() {
			return mymoodaddentry;
		}
		//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my mood']
		//input[@id='dashboard-mood-date'] -  mood date
		
//		Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year"));
//		dairycalender.selectByVisibleText("2012");
		
//		Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month"));
//		dairymonth.selectByVisibleText("Jan");
//		(//td/a[@class='ui-state-default'])[1] - dairy date
		
		//div[@id='smiley-block']/div[2]/div[@class='mood-img mood-happy']
		
//		Select moodentry = new Select(driver.findElement(By.By.xpath("//select[@class='form-control dash-input mrg-bt-5 h-50']"));
//		moodentry.selectByVisibleText("Better");
		
		//textarea[@placeholder='Describe your mood']
		//button[text()='ADD ENTRY']
		//dialog[@id='mood-popup']/div/button - mood popup close
		//button[text()='Take me to mood tracker'] -  take me to mood tracker
	
}




