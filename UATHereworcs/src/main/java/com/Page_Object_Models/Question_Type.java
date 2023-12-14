package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_Type {
	public WebDriver driver;

	@FindBy(xpath = "(//a[normalize-space()='Questions'])[1]")
	private WebElement Quehead;

	@FindBy(xpath = "(//span[normalize-space()='Add a question'])[1]")
	private WebElement addque;

	@FindBy(xpath = "(//button[normalize-space()='Free TEXT'])[1]")
	private WebElement Freetext;

	@FindBy(xpath = "(//input[@placeholder='Type your short text question here'])[1]")
	private WebElement Freeque;

	@FindBy(xpath = "(//option[text()='Physical Health'])[1]")
	private WebElement assign;

	@FindBy(xpath = "(//span[contains(@class,'bg-blue round')])[1]")
	private WebElement toggle;

	@FindBy(xpath = "(//button[normalize-space()='IMAGERY'])[1]")
	private WebElement image;

	@FindBy(xpath = "(//input[@placeholder='Add question to go with this image'])[1]")
	private WebElement imageque;

	@FindBy(xpath = "(//input[@placeholder='Add text to go with this image'])[1]")
	private WebElement imagetext;

	@FindBy(xpath = "(//button[normalize-space()='DROPDOWN'])[1]")
	private WebElement dropdown;

	@FindBy(xpath = "(//textarea[@placeholder='Type a question here that requires dropdown response'])[1]")
	private WebElement dropque;

	@FindBy(xpath = "(//input[@name='options[0][text]'])[1]")
	private WebElement response1;

	@FindBy(xpath = "(//span[normalize-space()='Add another response'])[1]")
	private WebElement addresponse;

	@FindBy(xpath = "(//input[contains(@name,'options[1][text]')])[1]")
	private WebElement response2;

	@FindBy(xpath = "(//option[text()='Physical Health'])[2]")
	private WebElement assign2;

	@FindBy(xpath = "(//option[text()='Physical Health'])[3]")
	private WebElement assign3;

	@FindBy(xpath = "(//select[@name='questions[0][section_uniq_id]'])[1]")
	private WebElement clickfree;

	@FindBy(xpath = "(//select[@id='contact_type'])[1]")
	private WebElement clickimage;

	@FindBy(xpath = "(//select[@id='contact_type'])[2]")
	private WebElement clickdrop;

	@FindBy(xpath = "(//button[normalize-space()='MULTIPLE CHOICE'])[1]")
	private WebElement Multiplechoice;

	@FindBy(xpath = "(//textarea[@placeholder='Type a question here that requires a multiple choice response'])[1]")
	private WebElement multique;

	@FindBy(xpath = "(//input[@name='options[2][text]'])[1]")
	private WebElement mutltiresponse1;

	@FindBy(xpath = "(//input[@name='options[3][text]'])[1]")
	private WebElement multirespone2;

	@FindBy(xpath = "(//input[@name='options[4][text]'])[1]")
	private WebElement multiresponse3;

	@FindBy(xpath = "(//select[@id='contact_type'])[1]")
	private WebElement clickmulti;

	@FindBy(xpath = "(//option[text()='Physical Health'])[4]")
	private WebElement assign4;

	@FindBy(xpath = "(//span[contains(@for,'share-entire-phr')])[2]")
	private WebElement radio;

	@FindBy(xpath = "(//span[contains(text(),'Add another response')])[2]")
	private WebElement addresponse1;

	@FindBy(xpath = "(//button[normalize-space()='LIKERT'])[1]")
	private WebElement likert;

	@FindBy(xpath = "(//textarea[@placeholder='Type a question here that requires a rated response'])[1]")
	private WebElement likertque;

	@FindBy(xpath = "(//textarea[@placeholder='Type how many numbers you require on the scale (1-10)'])[1]")
	private WebElement scale;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/section[1]/div[1]/div[10]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")
	private WebElement from;

	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/section[1]/div[1]/div[10]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/select[1]")
	private WebElement to;

	@FindBy(xpath = "(//textarea[@placeholder='Type a description for this range'])[1]")
	private WebElement range;

	@FindBy(xpath = "(//textarea[@placeholder='Type the indicator for the low end of the scale'])[1]")
	private WebElement lowend;

	@FindBy(xpath = "(//textarea[@placeholder='Type the indicator for the high end of the scale'])[1]")
	private WebElement highend;
	
	@FindBy(xpath = "(//select[@id='contact_type'])[7]")
	private WebElement clicklikert;
	
	@FindBy (xpath = "(//option[text()='Physical Health'])[5]")
	private WebElement assign5;
	
	@FindBy(xpath = "(//option[text()='8'])[1]")
	private WebElement High;
	
	@FindBy(xpath = "(//option[text()='4'])[2]")
	private WebElement Low;
	

	public Question_Type(WebDriver typepg) {
		this.driver = typepg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getQuehead() {
		return Quehead;
	}

	public WebElement getAddque() {
		return addque;
	}

	public WebElement getFreetext() {
		return Freetext;
	}

	public WebElement getFreeque() {
		return Freeque;
	}

	public WebElement getAssign() {
		return assign;
	}

	public WebElement getToggle() {
		return toggle;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getImageque() {
		return imageque;
	}

	public WebElement getImagetext() {
		return imagetext;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getDropque() {
		return dropque;
	}

	public WebElement getResponse1() {
		return response1;
	}

	public WebElement getAddresponse() {
		return addresponse;
	}

	public WebElement getResponse2() {
		return response2;
	}

	public WebElement getAssign2() {
		return assign2;
	}

	public WebElement getAssign3() {
		return assign3;
	}

	public WebElement getClickfree() {
		return clickfree;
	}

	public WebElement getClickimage() {
		return clickimage;
	}

	public WebElement getClickdrop() {
		return clickdrop;
	}

	public WebElement getMultiplechoice() {
		return Multiplechoice;
	}

	public WebElement getMultique() {
		return multique;
	}

	public WebElement getMutltirespons1() {
		return mutltiresponse1;
	}

	public WebElement getMultirespone2() {
		return multirespone2;
	}

	public WebElement getClickmulti() {
		return clickmulti;
	}

	public WebElement getAssign4() {
		return assign4;
	}

	public WebElement getMultiresponse3() {
		return multiresponse3;
	}

	public WebElement getAddresponse1() {
		return addresponse1;
	}

	public WebElement getLikert() {
		return likert;
	}

	public WebElement getLikertque() {
		return likertque;
	}

	public WebElement getScale() {
		return scale;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getRange() {
		return range;
	}

	public WebElement getLowend() {
		return lowend;
	}

	public WebElement getHighend() {
		return highend;
	}

	public WebElement getClicklikert() {
		return clicklikert;
	}

	public WebElement getAssign5() {
		return assign5;
	}

	public WebElement getHigh() {
		return High;
	}

	public WebElement getLow() {
		return Low;
	}

}
