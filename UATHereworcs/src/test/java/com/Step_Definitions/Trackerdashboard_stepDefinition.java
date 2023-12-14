package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;

import com.Runner.Runner_Class;



import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Trackerdashboard_stepDefinition extends Base_Class {

	
    //public static WebDriver driver= Runner_class.driver;
	//public static Objectclasses pom = new Objectclasses(driver);
	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);
	
	 
	 @Given("^User click cookies accept buton for Trackerdashboard$")
	 public void user_click_cookies_accept_buton_for_Trackerdashboard() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	 }

	 @When("^Click on login button for Trackerdashboard$")
	 public void click_on_login_button_for_Trackerdashboard() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	 }

	 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field for Trackerdashboard$")
	 public void user_enters_valid_in_Emailaddres_field_for_Trackerdashboard(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"hereworc01@mailinator.com");
			Sleep(3000);
	 }

	 @Then("^User enters \"([^\"]*)\" in Passowrd for Trackerdashboard$")
	 public void user_enters_in_Passowrd_for_Trackerdashboard(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Test@123");
			Sleep(3000);
	 }

	 @Then("^Click on Submit button for Trackerdashboard$")
	 public void click_on_Submit_button_for_Trackerdashboard() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
			Sleep(3000);
	 }

	 @Then("^clicking over Bento menu for Trackerdashboard$")
	 public void clicking_over_Bento_menu_for_Trackerdashboard() throws Throwable {
		 clickOnElement(pom.getbentomenu().getbentoicon());
			Sleep(3000);
	 }

	 @Then("^clicking over Tracker module for Trackerdashboard$")
	 public void clicking_over_Tracker_module_for_Trackerdashboard() throws Throwable {
		 clickOnElement(pom.getbentomenu().getTrackermodule());
			Sleep(3000);
	 }
	 
	 @Then("^click on Trackerdashboard section$")
     public void click_on_Trackerdashboard_section() throws Throwable {
		 clickOnElement(pom.gettrackerDashboard().trackerdashboard());
			Sleep(3000);
     }

	 @Then("^click on Inactive tracker link$")
	 public void click_on_Inactive_tracker_link() throws Throwable {
		 clickOnElement(pom.gettrackerDashboard().inactivetracker());
			Sleep(3000);
	 }

	 @Then("^click over All Tracker enable one by one$")
	 public void click_over_All_Tracker_enable_one_by_one() throws Throwable {
		 System.out.println("sleep");
		 clickOnElement(pom.gettrackerDashboard().sleeptrackerenable());
			Sleep(3000);
			 System.out.println("mood");
			clickOnElement(pom.gettrackerDashboard().moodtrackerenable());
			Sleep(2000);
			System.out.println("problem");
			clickOnElement(pom.gettrackerDashboard().problemtrackerenable());
			Sleep(2000);
			System.out.println("pain");
			clickOnElement(pom.gettrackerDashboard().paintrackerenable());
			Sleep(2000);
			System.out.println("weight");
			clickOnElement(pom.gettrackerDashboard().weighttrackerenable());
			Sleep(2000);
			System.out.println("dailystep");
			clickOnElement(pom.gettrackerDashboard().dailystepstrackerenable());
			Sleep(4000);
			System.out.println("bloodpresr");
			clickOnElement(pom.gettrackerDashboard().bloodpressuretrackerenable());
			Sleep(3000);
			System.out.println("waistcircumference");
			clickOnElement(pom.gettrackerDashboard().waistcircumferencetrackerenable());
			Sleep(4000);
			System.out.println("waistcircumference");
			clickOnElement(pom.gettrackerDashboard().diettrackerenable());
			Sleep(4000);
			System.out.println("waistcircumference");
			clickOnElement(pom.gettrackerDashboard().exercisetrackerenable());
			Sleep(4000);
			System.out.println("waistcircumference");
			clickOnElement(pom.gettrackerDashboard().fluidtrackerenable());
			Sleep(4000);
			System.out.println("waistcircumference");
			clickOnElement(pom.gettrackerDashboard().mediationtrackerenable());
			Sleep(2000);
	 }
	 

}
