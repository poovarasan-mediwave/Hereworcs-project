/*package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Base_Class.BaseClass;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.ClassObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Notification_stepDefinition  extends BaseClass{

	public static WebDriver driver= Runner_Class.driver;
	 public static ClassObject pom = new ClassObject(driver);
	
	@Given("^User launch URL for Notification$")
	public void user_launch_URL_for_Notification() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	}

	@When("^User click on cookies button for notification$")
	public void user_click_on_cookies_button_for_notification() throws Throwable {
		clickOnElement(pom.getlogin().getcookie());	
	}

	@Then("^User enters valid \"([^\"]*)\" in Emailaddres field for Notification$")
	public void user_enters_valid_in_Emailaddres_field_for_Notification(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990@gmail.com");
		 Sleep(3000);
	}

	@Then("^User enters \"([^\"]*)\" in Passowrd for Notification$")
	public void user_enters_in_Passowrd_for_Notification(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		 Sleep(3000);
	}

	@Then("^Click on Submit button for Notification$")
	public void click_on_Submit_button_for_Notification() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
		 Sleep(3000);
	}

	@Then("^Click on Notification icon$")
	public void click_on_Notification_icon() throws Throwable {
		clickOnElement(pom.getnotification().getnotificationclick());
		 Sleep(3000);
	}

	@Then("^Click on go to notification page button$")
	public void click_on_go_to_notification_page_button() throws Throwable {
		clickOnElement(pom.getnotification().getgotonotificationspage());
		 Sleep(3000);
	}

}
*/
