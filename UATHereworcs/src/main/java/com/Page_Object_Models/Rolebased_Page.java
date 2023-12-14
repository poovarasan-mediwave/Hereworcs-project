package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rolebased_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[1]")
	private WebElement caselaod;

	@FindBy(xpath = "(//a[normalize-space()='Cookies'])[1]")
	private WebElement jscroll1;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[2]")
	private WebElement circle;

	@FindBy(xpath = "(//a[@class='add-person-link m-b-30 flex-between'])[1]")
	private WebElement jscroll2;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[3]")
	private WebElement msg;

	@FindBy(xpath = "(//input[@id='search_name'])[1]")
	private WebElement jscroll3;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[2]/div[3]/div[1]")
	private WebElement menu;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/a[1]/li[1]")
	private WebElement dashboard;

	@FindBy(xpath = "(//div[contains(@class,'card-body card-dash-body')])[4]")
	private WebElement resources;

	@FindBy(xpath = "(//button[normalize-space()='LOGOUT'])[1]")
	private WebElement logout;

	@FindBy(xpath = "(//a[@href='/resources/pdf'])[1]")
	private WebElement jscroll4;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[1]")
	private WebElement team;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[12]")
	private WebElement scroll1;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[2]/div[3]/div[1]")
	private WebElement menu1;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/a[1]/li[1]")
	private WebElement admindash;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[2]")
	private WebElement patientover;

	@FindBy(xpath = "(//input[@placeholder='Search name'])[1]")
	private WebElement scroll2;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[3]")
	private WebElement interest;

	@FindBy(xpath = "(//div[@class='p-20 mw-bg-card bgray-shadow'])[1]")
	private WebElement scroll3;

	@FindBy(xpath = "(//div[@class='card-body card-dash-body'])[4]")
	private WebElement caseload2;

	@FindBy(xpath = "(//div[@class='row w-100 mx-0'])[1]")
	private WebElement scroll4;

	@FindBy(xpath = "(//div[contains(@class,'card-body card-dash-body')])[5]")
	private WebElement savedresources;

	@FindBy(xpath = "(//a[@href='/resources/videos'])[1]")
	private WebElement scroll5;

	@FindBy(xpath = "(//div[@class='card tracker-dashboard clinician-dashboard'])[1]")
	private WebElement questions;

	@FindBy(xpath = "(//div[contains(@class,'text-center flex-q-container')])[1]")
	private WebElement scroll6;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[2]/div[3]/div[1]")
	private WebElement supermenu;

	public Rolebased_Page(WebDriver rollpg) {
		this.driver = rollpg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getCaselaod() {
		return caselaod;
	}

	public WebElement getJscroll1() {
		return jscroll1;
	}

	public WebElement getCircle() {
		return circle;
	}

	public WebElement getJscroll2() {
		return jscroll2;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getJscroll3() {
		return jscroll3;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getResources() {
		return resources;
	}

	public WebElement getJscroll4() {
		return jscroll4;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getTeam() {
		return team;
	}

	public WebElement getScroll1() {
		return scroll1;
	}

	public WebElement getMenu1() {
		return menu1;
	}

	public WebElement getAdmindash() {
		return admindash;
	}

	public WebElement getPatientover() {
		return patientover;
	}

	public WebElement getScroll2() {
		return scroll2;
	}

	public WebElement getInterest() {
		return interest;
	}

	public WebElement getScroll3() {
		return scroll3;
	}

	public WebElement getCaseload2() {
		return caseload2;
	}

	public WebElement getScroll4() {
		return scroll4;
	}

	public WebElement getSavedresources() {
		return savedresources;
	}

	public WebElement getScroll5() {
		return scroll5;
	}

	public WebElement getQuestions() {
		return questions;
	}

	public WebElement getScroll6() {
		return scroll6;
	}

	public WebElement getSupermenu() {
		return supermenu;
	}

}
