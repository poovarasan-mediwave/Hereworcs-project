package com.Step_Definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
//import com.Configuration_Reader.File_Reader;
import com.Runner.Runner_Class;

/*import com.Singleton_Design_Pattern.Singleton_Design_Pattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tracker_Over extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	//public static Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
	public static Class_Objects pom = new Class_Objects(driver);
	
	
	
	@Given("^user launch the Browser$")
	public void user_launch_the_Browser() throws Throwable {
		//String url = File_Reader.getInstanceFR().getInstanceCR().getUrl();
		//geturl(url);
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/");
	}

	@When("^user click the Login button$")
	public void user_click_the_Login_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getButton());
	}

	@When("^user enter the username in the field$")
	public void user_enter_the_username_in_the_field() throws Throwable {
		waitForSeconds(10);
		clickOnElement(pom.getInstanceHome_Page().getCookies());
		//String username = File_Reader.getInstanceFR().getInstanceCR().getUsername();
		//Inputvalues(sdp.getInstanceLogin().getUser(), username);
		Inputvalues(pom.getpageLogin().getUser(), "dhanraj280990+lesner@gmail.com");
	}

	@When("^user enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		//String password = File_Reader.getInstanceFR().getInstanceCR().getPassword();
		//Inputvalues(sdp.getInstanceLogin().getPass(), password);
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@@");
	}

	@Then("^user click the signin button and page navigates to the home page$")
	public void user_click_the_signin_button_and_page_navigates_to_the_home_page() throws Throwable {
		clickOnElement(pom.getpageLogin().getSignin());
	}

	@When("^user click the menu icon$")
	public void user_click_the_menu_icon() throws Throwable {
		Sleep(2000);
	//	clickOnElement(pom.getInstanceHome_Page().getCookies());
		Sleep(2000);
		//clickOnElement(pom.getInstanceHome_Page().getMenu());

	}

	@When("^user click the tracker menu and navigates to the tracker overview page$")
	public void user_click_the_tracker_menu_and_navigates_to_the_tracker_overview_page() throws Throwable {
		waitForSeconds(10);
		clickOnElement(pom.getInstanceHome_Page().gettracker());
	}

	@When("^In Your Tracker page user select month or year or weeks$")
	public void in_Your_Tracker_page_user_select_month_or_year_or_weeks() throws Throwable {
	
		// clickOnElement(sdp.getInstanceTracker().getMonth1());
	}

	@When("^user click the arrow$")
	public void user_click_the_arrow() throws Throwable {
	
	}

	@When("^In Your Tracker page user add tracker$")
	public void in_Your_Tracker_page_user_add_tracker() throws Throwable {

		clickOnElement(pom.getInstanceTracker().getAdd());

		
		
		List<WebElement> add_Trackers = pom.getInstanceTracker().getAdd_Trackers();
		int size2 = add_Trackers.size();
		System.out.println(size2);
		for (int i = 0; i < size2; i++) {
			clickOnElement(add_Trackers.get(i));
			Sleep(3000);
		}
		
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getYear1());
		waitForSeconds(10);
		clickOnElement(pom.getInstanceTracker().getArrow1());
		
		jsScrollDownElement(pom.getInstanceTracker().getScreenshot1());
		Sleep(4000);
		screenshot("trackers.png");
		Sleep(7000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers1());
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers2());
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers3());
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers4());
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers5());
		Sleep(3000);
		clickOnElement(pom.getInstanceTracker().getRemove_Trackers6());

	}

	@When("^user took screenshot of Your Tracker overview$")
	public void user_took_screenshot_of_Your_Tracker_overview() throws Throwable {
	}

	@When("^user choose month or year or weeks in Trackers overview$")
	public void user_choose_month_or_year_or_weeks_in_Trackers_overview() throws Throwable {
		clickOnElement(pom.getInstanceTracker().getYear2());
		// clickOnElement(sdp.getInstanceTracker().getMonth2());

	}

	@When("^user click Arrow to change dates$")
	public void user_click_Arrow_to_change_dates() throws Throwable {
		clickOnElement(pom.getInstanceTracker().getArrow2());

	}

	@When("^user select the trackers$")
	public void user_select_the_trackers() throws Throwable {

		clickOnElement(pom.getInstanceTracker().getDiet());
		clickOnElement(pom.getInstanceTracker().getExercise());
		clickOnElement(pom.getInstanceTracker().getFluid());

		jsScrollDownElement(pom.getInstanceTracker().getSs2());
		Sleep(3000);
		screenshot("Graph.png");
		Sleep(3000);

		clickOnElement(pom.getInstanceTracker().getDiet());
		clickOnElement(pom.getInstanceTracker().getExercise());
		clickOnElement(pom.getInstanceTracker().getFluid());

		Sleep(2000);

		clickOnElement(pom.getInstanceTracker().getMedication());
		clickOnElement(pom.getInstanceTracker().getSleep());
		clickOnElement(pom.getInstanceTracker().getMood());

		jsScrollDownElement(pom.getInstanceTracker().getSs2());
		Sleep(3000);
		screenshot("Graph.png");
		Sleep(3000);

	}

	@Then("^user took screenshot of trackers overview$")
	public void user_took_screenshot_of_trackers_overview() throws Throwable {
		jsScrollDownElement(pom.getInstanceTracker().getSs2());
		Sleep(3000);
		screenshot("Graph.png");
		Sleep(3000);
	}

}
