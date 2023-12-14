package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medication {

	
public WebDriver driver;
	
	public Medication(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "//div[@id='submenu-height']/ul/li/a[@href='/tracker/medication']")
	private WebElement medicationtracker;
	
	@FindBy (xpath = "//button[contains(text(),'RECORD MEDICATION')]")
	private WebElement recordmedicationbtn;
	
	@FindBy (xpath = "//a[@href=' /tracker/medication/add  ']")
	private WebElement addnewmedicationpage ;
	
	@FindBy (xpath = "//input[@placeholder='Select the date']")
	private WebElement medicationcreatecalendar;
	
	@FindBy (xpath = "//div[@class='vc-arrows-container title-center']/div")
	private WebElement medicationcreatedatemontharrow;
	
	//span[contains(@aria-label, ' "+a[i]+" December 2021')] | //span[contains(@aria-label, ' December "+a[i]+", 2021')]
	@FindBy (xpath = "//span[contains(@aria-label, ' 5 December 2021')] | //span[contains(@aria-label, ' December 5, 2021')]")
	private WebElement medicationcreatedate;
	
	@FindBy (xpath = "//div[@class='grid grid-cols-4 gap-10 button-group-input']/span/input[@id='tablet']/following-sibling::label/div")
	private WebElement tablet;
	@FindBy (xpath = "//div[@class='grid grid-cols-4 gap-10 button-group-input']/span/input[@id='capsule']/following-sibling::label/div")
	private WebElement capsule;
	@FindBy (xpath = "//div[@class='grid grid-cols-4 gap-10 button-group-input']/span/input[@id='liquid']/following-sibling::label/div")
	private WebElement liquid;
	@FindBy (xpath = "//div[@class='grid grid-cols-4 gap-10 button-group-input']/span/input[@id='cream']/following-sibling::label/div")
	private WebElement cream;
	
	
	
	@FindBy (xpath = "//input[@id='medication_name']")
	private WebElement addmedicationname;
	
	@FindBy (xpath = "//input[@id='medication_dosage']")
	private WebElement addmedicationdosage;
	
	@FindBy (xpath = "//label[contains(text(),'Once a day')]")
	private WebElement onceaday;
	@FindBy (xpath = "//label[contains(text(),'Twice a day')]")
	private WebElement twiceaday;
	@FindBy (xpath = "//label[contains(text(),'Three times a day')]")
	private WebElement thriceaday;
	
	@FindBy (xpath = "//label[contains(text(),'Four times a day')]")
	private WebElement fourthday;
	
	@FindBy (xpath = "//button[contains(text(),'ADD MEDICATION')]")
	private WebElement addmedicationbtn;
	
	
	
	
	@FindBy (xpath = "//a[@href=' /tracker/medication/list ']")
	private WebElement viewmedicationlist;
	@FindBy (xpath = "//button[contains(text(),'RECORD MEDICATION')]")
	private WebElement recordmedicationunderlist;
	@FindBy (xpath = "//input[@placeholder='Select the date']")
	private WebElement recordmedicationcalendar;
	@FindBy (xpath = "//div[@class='vc-arrow is-left']")
	private WebElement recordmedicationcalendararrow;
	
	@FindBy (xpath = "//span[contains(@aria-label, ' December 5, 2021')]")
	private WebElement recordmedicationdate;
	
	@FindBy (xpath = "//h5[contains(text(), 'second two point')]")
	private WebElement recordmedicationdateitems;
	@FindBy (xpath = "//button[contains(text(), 'ADD RECORD MEDICATION')]")
	private WebElement addrecordmedication;
	
	
	
	@FindBy (xpath = "//h5[contains(text(),'medic-1')]")
	private WebElement medic1btn;
	@FindBy (xpath = "//h5[contains(text(),'medic-2')]")
	private WebElement medic2btn;
	@FindBy (xpath = "//h5[contains(text(),'medic-3')]")
	private WebElement medic3btn;
	@FindBy (xpath = "//h5[contains(text(),'medic-4')]")
	private WebElement medic4btn;
	
	
	public WebElement getmedicationtracker() {
		return medicationtracker;
	}

	public WebElement getrecordmedicationbtn() {
		return recordmedicationbtn;
	}
	
	public WebElement getaddnewmedicationpage() {
		return addnewmedicationpage;
	}

	public WebElement getmedicationcreatecalendar() {
		return medicationcreatecalendar;
	}
	
	public WebElement getmedicationcreatedatemontharrow() {
		return medicationcreatedatemontharrow;
	}

	public WebElement getmedicationcreatedate() {
		return medicationcreatedate;
	}
	public WebElement getcream() {
		return cream;
	}
	//
	public WebElement getcapsule() {
		return capsule;
	}
	public WebElement getliquid() {
		return liquid;
	}
	public WebElement gettablet() {
		return tablet;
	}
	
	//
	public WebElement getaddmedicationname() {
		return addmedicationname;
	}
	public WebElement getaddmedicationdosage() {
		return addmedicationdosage;
	}

	public WebElement getonceaday() {
		return onceaday;
	}
	//
	public WebElement gettwiceaday() {
		return twiceaday;
	}
	public WebElement getthriceaday() {
		return thriceaday;
	}
	public WebElement getfourtimesday() {
		return fourthday;
	}
	
	//
	public WebElement getaddmedicationbtn() {
		return addmedicationbtn;
	}

	
	
	public WebElement getviewmedicationlist() {
		return viewmedicationlist;
	}
	public WebElement getrecordmedicationunderlist() {
		return recordmedicationunderlist;
	}
	public WebElement getrecordmedicationcalendar() {
		return recordmedicationcalendar;
	}
	public WebElement gerecordmedicationcalendararrow() {
		return recordmedicationcalendararrow;
	}
	public WebElement getrecordmedicationdate() {
		return recordmedicationdate;
	}
	public WebElement getrecordmedicationdateitems() {
		return recordmedicationdateitems;
	}
	public WebElement getaddrecordmedication() {
		return addrecordmedication;
	}
	
	
	
	public WebElement getmedic1btn() {
		return medic1btn;
	}
	public WebElement getmedic2btn() {
		return medic2btn;
	}
	public WebElement getmedic3btn() {
		return medic3btn;
	}
	public WebElement getamedic4btn() {
		return medic4btn;
	}
}
