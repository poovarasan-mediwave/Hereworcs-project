package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Weight {

public WebDriver driver;
	
	public Weight(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (xpath = "//div[@id='submenu-height']/div/ul/li/a[@href='/tracker/weight']")
		private WebElement Weighttracker;
		
		@FindBy (xpath = "//input[@id='weight_date']")
		private WebElement Weightcalendar;
		
		@FindBy (xpath = "//a[@class='ui-state-default']")
		private List<WebElement> weightdateselect;
		//private List<WebElement> selectdatess;

		@FindBy (xpath = "//select[@class='ui-datepicker-year']")
		private WebElement Yeardrp;
		
		@FindBy (xpath = "//select[@class='ui-datepicker-month']")
		private WebElement Monthdrp;
		
		
		
		@FindBy (xpath = "//input[@id='weight']")
		private WebElement weightadd;
		@FindBy (xpath = "//button[@id='weight_submit']")
		private WebElement weightsubmit;
		@FindBy (xpath = "//button[@class='chart-previous-link day-prev-btn click-btn-access']")
		private WebElement weightdayprevious;
		@FindBy (xpath = "//button[@class='chart-previous-link week-prev-btn click-btn-access']")
		private WebElement weightweekprevious;
		@FindBy (xpath = "//button[@class='chart-next-link week-next-btn click-btn-access']")
		private WebElement weightweeknext;
		@FindBy (xpath = "//button[@class='chart-previous-link month-prev-btn click-btn-access']")
		private WebElement weightmonthprevious;
		@FindBy (xpath = "//button[@class='chart-next-link month-next-btn click-btn-access']")
		private WebElement weightmonthnext;
		
		
		
		public WebElement getWeighttracker() {
			return Weighttracker;
		}

		public WebElement getWeightcalendar() {
			return Weightcalendar;
		}
		
		
		
		
		public WebElement yeardropdown() {
			
			return Yeardrp;
		}
		
		
		public WebElement monthdropdown() {
			
			return Monthdrp;
		}
		
		public List<WebElement> getweightdateselect() {
		return weightdateselect;
	     }

		public WebElement getweightadd() {
			return weightadd;
		}
		
		public WebElement getweightsubmit() {
			return weightsubmit;
		}

		public WebElement getweightdayprevious() {
			return weightdayprevious;
		}
		
		public WebElement getweightweekprevious() {
			return weightweekprevious;
		}

		public WebElement getweightweeknext() {
			return weightweeknext;
		}
		
		public WebElement getweightmonthprevious() {
			return weightmonthprevious;
		}

		public WebElement getweightmonthnext() {
			return weightmonthnext;
		}
		
}
