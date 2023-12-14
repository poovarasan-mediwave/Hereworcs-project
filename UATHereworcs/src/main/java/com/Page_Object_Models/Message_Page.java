package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message_Page {

	public WebDriver driver;

	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[6]/div[1]/div[1]/div[3]/div[5]/a[1]/li[1]")
	private WebElement message;

	@FindBy(xpath = "(//input[@id='search_name'])[1]")
	private WebElement searchname;

	@FindBy(xpath = "(//div[@class='message-card border-primary bg-card mb-4 position-relative view-profile-block search-font-size-reduce'])[1]")
	private WebElement clinicianname;

	@FindBy(xpath = "(//button[normalize-space()='MESSAGE THIS PERSON'])[1]")
	private WebElement person;

	@FindBy(xpath = "(//input[@placeholder='Write subject here'])[1]")
	private WebElement subject;

	@FindBy(xpath = "(//textarea[@placeholder='Create message'])[1]")
	private WebElement createmsg;

	@FindBy(xpath = "(//label[@class='send-mg attach m-0-null img-mob-bot'])[1]")
	private WebElement addfile;

	@FindBy(xpath = "//div[@class='bottom-pos abs abs-bottom']/div/label[2]/a/img")
	private WebElement camera;

	@FindBy(xpath = "(//button[normalize-space()='Take Photo'])[1]")
	private WebElement Takephoto;

	@FindBy(xpath = "(//button[normalize-space()='Upload Photo'])[1]")
	private WebElement uploadphoto;

	@FindBy(xpath = "//button[@id='sendMsg']")
	private WebElement msgsend;
	
	@FindBy(xpath = "(//*[name()='svg'][@class='mw-icon-primary'])[1]")
	private WebElement search;
	
	@FindBy(xpath = "(//div[@class='message-card border-primary bg-card mb-4 position-relative view-profile-block search-font-size-reduce'])[1]")
	private WebElement patient;
	
	@FindBy(xpath = "(//a[@href='#'][normalize-space()='My circle'])[1]")
	private WebElement circle;
	
	@FindBy(xpath = "(//a[@class='add-person-link m-b-30 flex-between'])[1]")
	private WebElement scroll;

	public Message_Page(WebDriver messagepg) {
		this.driver = messagepg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSearchname() {
		return searchname;
	}

	public WebElement getClinicianname() {
		return clinicianname;
	}

	public WebElement getPerson() {
		return person;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getCreatemsg() {
		return createmsg;
	}

	public WebElement getAddfile() {
		return addfile;
	}

	public WebElement getCamera() {
		return camera;
	}

	public WebElement getTakephoto() {
		return Takephoto;
	}

	public WebElement getUploadphoto() {
		return uploadphoto;
	}

	public WebElement getMsgsend() {
		return msgsend;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getPatient() {
		return patient;
	}

	public WebElement getCircle() {
		return circle;
	}

	public WebElement getScroll() {
		return scroll;
	}

}
