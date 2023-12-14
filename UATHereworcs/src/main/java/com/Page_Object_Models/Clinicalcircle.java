package com.Page_Object_Models;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clinicalcircle {
	

//	(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon'])[3]  -- clinical circle
			//a[text()='My clinical circle'] - my clinical circle
			//p[text()='Add new person'] - Add new person
			//select[@id='relationship']  - releationship
	
	public WebDriver driver;
	public Clinicalcircle(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//div[@class='col-lg-4 col-6 p-0 desktop-footer-icon'])[3]")
	private WebElement clinicalcirclebento;
	public WebElement getclinicalcirclebento() {
		return clinicalcirclebento;
		}
	
	@FindBy (xpath = "//a[text()='My clinical circle']")
	private WebElement myclinicalcirclecategory;
	public WebElement getmyclinicalcirclecategory() {
		return myclinicalcirclecategory;
		}
	@FindBy (xpath = "//button[text()='ADD A NEW PERSON']")
	private WebElement Addnewpersonclinical;
	public WebElement getAddnewpersonclinical() {
		return Addnewpersonclinical;
		}
	
	@FindBy (xpath = "//select[@id='relationship']")
	private WebElement relationship;
	public WebElement getrelationship() {
		return relationship;
		}
	
	
	@FindBy (xpath = "//input[@id='fname']")
	private WebElement firstname;
	public WebElement getfirstname() {
		return firstname;
		}
	@FindBy (xpath = "//input[@id='lname']")
	private WebElement lasttname;
	public WebElement getlasttname() {
		return lasttname;
		}
	@FindBy (xpath = "//input[@id='email']")
	private WebElement emailid;
	public WebElement getemailid() {
		return emailid;
		}
	//div[@class='connect-access-blk'][2]/div[2]/div[2]/div[1]/label/span
	@FindBy (xpath = "(//div[@class='connect-access-blk'][2]/div[2]/div[2]/fieldset/div/label/span[2])[1]")
	private WebElement connectenable;
	public WebElement getconnectenable() {
		return connectenable;
		}
	//div[@class='connect-access-blk track-list']/div[2]/div
	@FindBy (xpath = "//div[@class='connect-access-blk track-list']/div/div/label")
	private List<WebElement> trackerenable;
	public List<WebElement> gettrackerenable() {
		return trackerenable;
		}
	
	// (//div[@class='connect-access-blk'][3]/div[2]/div[2]/div/label/span[2])[1]
	@FindBy (xpath = "//div[@class='connect-access-blk'][3]/div[2]/div[2]/fieldset/div[1]/label/span[2]")
	private WebElement resourceenable;
	public WebElement getresourceenable() {
		return resourceenable;
		}
	//(//div[@class='connect-access-blk'][4]/div[2]/div[2]/div/label/span[2])[1]
	@FindBy (xpath = "(//div[@class='connect-access-blk'][4]/div[2]/div[2]/fieldset/div/label/span[2])[1]")
	private WebElement saveditemenable;
	public WebElement getsaveditemenable() {
		return saveditemenable;
		}
	//button[text()='INVITE']
	@FindBy (xpath = "//button[text()='INVITE']")
	private WebElement invitebtn;
	public WebElement getinvitebtn() {
		return invitebtn;
		}
}
