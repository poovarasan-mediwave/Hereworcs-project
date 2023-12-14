package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resources_Page {
	public WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[7]/a[1]/li[1]")
	private WebElement resources;

	@FindBy(xpath = "(//p[normalize-space()='Filter'])[1]")
	private WebElement filter;

	@FindBy(xpath = "(//label[normalize-space()='Physical health'])[1]")
	private WebElement click1;

	@FindBy(xpath = "(//label[normalize-space()='Driving'])[1]")
	private WebElement click2;

	@FindBy(xpath = "(//label[normalize-space()='Dimentia'])[1]")
	private WebElement click3;

	@FindBy(xpath = "(//p[normalize-space()='Sort by'])[1]")
	private WebElement sort;

	@FindBy(xpath = "(//span[@for='resources sortby id 2'])[1]")
	private WebElement radiobtn;

	@FindBy(xpath = "(//button[normalize-space()='Set preferences'])[1]")
	private WebElement preferences;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Resources'])[1]")
	private WebElement back;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/input[1]")
	private WebElement search;

	@FindBy(xpath = "(//a[@class='mw-btn outline m-2'][normalize-space()='Visit page'])[1]")
	private WebElement visit;

	@FindBy(xpath = "(//*[name()='svg'][@id='pdfArticle--ckxfqbja701fc0ipfh9rhse4h'])[1]")
	private WebElement favourite;

	@FindBy(xpath = "(//button[@onclick='closeSavedResourcePopup()'])[1]")
	private WebElement popclose;

	@FindBy(xpath = "(//input[@id='search_name'])[1]")
	private WebElement name;

	@FindBy(xpath = "/html[1]/body[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[8]/div[1]/div[1]/button[1]")
	private WebElement msgsend;

	@FindBy(xpath = "(//a[normalize-space()='Saved resources'])[1]")
	private WebElement saved;

	@FindBy(xpath = "(//*[name()='path'][@id='Path_11125'])[6]")
	private WebElement exit;

	@FindBy(xpath = "(//a[normalize-space()='PDFs and articles'])[1]")
	private WebElement pdf;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")
	private WebElement pagesend;

	@FindBy(xpath = "(//div[contains(@class,'message-card border-primary bg-card mb-4 position-relative view-profile-block search-font-size-reduce')])[1]")
	private WebElement msgpatient;

	@FindBy(xpath = "(//input[@id='search_name'])[1]")
	private WebElement msgsearch;

	@FindBy(xpath = "(//input[@id='search_name'])[1]")
	private WebElement searchname;

	@FindBy(xpath = "(//a[normalize-space()='Videos'])[1]")
	private WebElement videos;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[3]")
	private WebElement Vsend;

	@FindBy(xpath = "/html[1]/body[1]/div[10]/div[2]/button[1]")
	private WebElement backbutton;

	@FindBy(xpath = "/html[1]/body[1]/div[10]/div[2]/button[1]")
	private WebElement backbutton1;

	@FindBy(xpath = "(//a[normalize-space()='Events'])[1]")
	private WebElement events;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
	private WebElement Efav;

	@FindBy(xpath = "(//span[@class='more resources-more'][normalize-space()='Read more'])[2]")
	private WebElement Ereadmore;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[2]")
	private WebElement Esend;

	@FindBy(xpath = "(//button[@onclick='closeSavedResourcePopup()'])[1]")
	private WebElement Eclose;

	public Resources_Page(WebDriver resourcepg) {
		this.driver = resourcepg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getResources() {
		return resources;
	}

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}

	public WebElement getSort() {
		return sort;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getPreferences() {
		return preferences;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getBack() {
		return back;
	}

	public WebElement getVisit() {
		return visit;
	}

	public WebElement getFavourite() {
		return favourite;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPopclose() {
		return popclose;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMsgsend() {
		return msgsend;
	}

	public WebElement getSaved() {
		return saved;
	}

	public WebElement getExit() {
		return exit;
	}

	public WebElement getPdf() {
		return pdf;
	}

	public WebElement getPagesend() {
		return pagesend;
	}

	public WebElement getMsgpatient() {
		return msgpatient;
	}

	public WebElement getMsgsearch() {
		return msgsearch;
	}

	public WebElement getSearchname() {
		return searchname;
	}

	public WebElement getVideos() {
		return videos;
	}

	public WebElement getVsend() {
		return Vsend;
	}

	public WebElement getBackbutton() {
		return backbutton;
	}

	public WebElement getBackbutton1() {
		return backbutton1;
	}

	public WebElement getEvents() {
		return events;
	}

	public WebElement getEfav() {
		return Efav;
	}

	public WebElement getEreadmore() {
		return Ereadmore;
	}

	public WebElement getEsend() {
		return Esend;
	}

	public WebElement getEclose() {
		return Eclose;
	}

}
