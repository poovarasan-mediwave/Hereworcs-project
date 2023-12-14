package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Fast_Log {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My fast tracker log img']")
	private WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='CONTINUE'])[2]")
	private WebElement continue_Btn;

	@FindBy(xpath = "(//div[@class='dash-panel-heading'])[4]")
	private WebElement srn_Sht;

	public My_Fast_Log(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public WebElement getSrn_Sht() {
		return srn_Sht;
	}

}
