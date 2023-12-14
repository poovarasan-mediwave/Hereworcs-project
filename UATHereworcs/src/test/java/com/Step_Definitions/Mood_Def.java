package com.Step_Definitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

//import com.Base_Class.base_class;
//import com.Runner.runner_class;
//import com.Singleton_Design_Pattern.singleton;


//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Mood_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch The Application")
	public void user_launch_The_Application() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("^user enter the valid Email address in user Field$")
	public void user_enter_the_valid_Email_address_in_user_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");

	}

	@When("user Enter the valid Password in Password Field")
	public void user_Enter_the_valid_Password_in_Password_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
		Sleep(3000);

	}

	@When("user Click the accept in cookies button")
	public void user_Click_the_accept_in_cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("^user Click the Login Button And it navigates to Dashboard$")
	public void user_Click_the_Login_Button_And_it_navigates_to_Dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
		waitForSeconds(20);

	}

	@Given("^user Click the main menu and shows the Submenu$")
	public void user_Click_the_main_menu_and_shows_the_Submenu() throws Throwable {
		try {
			waitForSeconds(20);
			clickOnElement(pom.getpageTracker().getMenu());
			Sleep(3000);

		} catch (Exception e) {
		}

	}

	@When("user Click the Tracker button and it naviagtes to Tracker Overview")
	public void user_Click_the_Tracker_button_and_it_naviagtes_to_Tracker_Overview() throws Throwable {
		try {
			clickOnElement(pom.getpageTracker().getTracker());
			Sleep(3000);

		} catch (Exception e) {

		}

	}

	@When("user Click the Tracker menu in tracker overview and show the tracker Dashboard")
	public void user_Click_the_Tracker_menu_in_tracker_overview_and_show_the_tracker_Dashboard() throws Throwable {
		clickOnElement(pom.getpageTracker().getTracker1());
		Sleep(3000);

	}

	@Then("user Click the Inactive Tracker and shows the inactive trackers")
	public void user_Click_the_Inactive_Tracker_and_shows_the_inactive_trackers() throws Throwable {
		clickOnElement(pom.getpageTracker().getInactivetracker());
		Sleep(2000);
	}

	@Given("user Click the Toggle button and Active the mood Tracker")
	public void user_Click_the_Toggle_button_and_Active_the_mood_Tracker() throws Throwable {

		clickOnElement(pom.getpageMood().getToggle());

	}

	@When("user Click the Active button and It navigates to Active Page")
	public void user_Click_the_Active_button_and_It_navigates_to_Active_Page() throws Throwable {
		clickOnElement(pom.getpageMood().getActivetracker());
		Sleep(3000);

	}

	@When("user Click the Active Mood button and It Navigates to Mood page")
	public void user_Click_the_Active_Mood_button_and_It_Navigates_to_Mood_page() throws Throwable {
		clickOnElement(pom.getpageMood().getMood());

	}

	@Then("user Click the Add My Mood Information Button and It navigates to New Entry Page")
	public void user_Click_the_Add_My_Mood_Information_Button_and_It_navigates_to_New_Entry_Page() throws Throwable {
		clickOnElement(pom.getpageMood().getAddinfo2());
		Sleep(3000);

	}

	@Given("user click the Calender and it shows Title of the Calender")
	public void user_click_the_Calender_and_it_shows_Title_of_the_Calender() throws Throwable {
		clickOnElement(pom.getpageMood().getCalendar2());

	}

	@When("user Click the Title and It shows years")
	public void user_Click_the_Title_and_It_shows_years() throws Throwable {
		clickOnElement(pom.getpageMood().getTitle2());
		Sleep(6000);

	}

	@When("user Click the years")
	public void user_Click_the_years() throws Throwable {
		clickOnElement(pom.getpageMood().getYears2());
		Sleep(3000);

	}

	@When("user select the Particular Year and It navigates to Months")
	public void user_select_the_Particular_Year_and_It_navigates_to_Months() throws Throwable {
		clickOnElement(pom.getpageMood().getYear2());
		Sleep(4000);

	}

	@When("user select the Month and it navigates to Date")
	public void user_select_the_Month_and_it_navigates_to_Date() throws Throwable {
		clickOnElement(pom.getpageMood().getMonth2());
		Sleep(3000);

	}

	@When("user add the entry for Whole month and Select the Moods and Ratings and Notes and Record and It navigates to new entry page")
	public void user_add_the_entry_for_Whole_month_and_Select_the_Moods_and_Ratings_and_Notes_and_Record_and_It_navigates_to_new_entry_page()
			throws Throwable {
		List<WebElement> date = pom.getpageMood().getDate2();
		int size = date.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			if (i == 1 || i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14 || i == 16 || i == 18
					|| i == 20) {
				clickOnElement(date.get(i));
				Sleep(3000);
				clickOnElement(pom.getpageMood().getVeryhappy());

				clickOnElement(pom.getpageMood().getAverage());

				Inputvalues(pom.getpageMood().getNotes(), "happymood");
				clickOnElement(pom.getpageMood().getRecordmood());
				waitForSeconds(10);
				clickOnElement(pom.getpageMood().getAddinfo2());
				Sleep(3000);
				clickOnElement(pom.getpageMood().getCalendar2());
				clickOnElement(pom.getpageMood().getTitle2());
				clickOnElement(pom.getpageMood().getYears2());
				clickOnElement(pom.getpageMood().getYear2());
				clickOnElement(pom.getpageMood().getMonth2());
				Sleep(3000);

			}

			if (i == 2 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13 || i == 15 || i == 17 || i == 19
					|| i == 21) {
				clickOnElement(date.get(i));
				Sleep(3000);
				clickOnElement(pom.getpageMood().getHappy());
				clickOnElement(pom.getpageMood().getGreat());
				Inputvalues(pom.getpageMood().getNotes(), "happymood");
				clickOnElement(pom.getpageMood().getRecordmood());
				waitForSeconds(10);
				clickOnElement(pom.getpageMood().getAddinfo2());
				Sleep(6000);
				clickOnElement(pom.getpageMood().getCalendar2());
				clickOnElement(pom.getpageMood().getTitle2());
				clickOnElement(pom.getpageMood().getYears2());
				clickOnElement(pom.getpageMood().getYear2());
				clickOnElement(pom.getpageMood().getMonth2());
				Sleep(3000);

			}
			if (i == 3 || i == 22 || i == 23 || i == 25 || i == 27 || i == 29 || i == 30 || i == 24 || i == 28
					|| i == 26 || i == 0) {
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getpageMood().getNeutral());
				clickOnElement(pom.getpageMood().getPoor());
				Inputvalues(pom.getpageMood().getNotes(), "happymood");
				clickOnElement(pom.getpageMood().getRecordmood());
				waitForSeconds(10);
				clickOnElement(pom.getpageMood().getAddinfo2());
				Sleep(30000);
				clickOnElement(pom.getpageMood().getCalendar2());
				clickOnElement(pom.getpageMood().getTitle2());
				clickOnElement(pom.getpageMood().getYears2());
				clickOnElement(pom.getpageMood().getYear2());
				clickOnElement(pom.getpageMood().getMonth2());
				Sleep(3000);

			}

		}

		clickOnElement(pom.getpageMood().getMoodclick());
	}

	@When("user click the month button and the graph for month Occured")
	public void user_click_the_month_button_and_the_graph_for_month_Occured() throws Throwable {
		clickOnElement(pom.getpageMoodgraph().getMonth());
	}

	@When("user Click the Left Arrow for particular month")
	public void user_Click_the_Left_Arrow_for_particular_month() throws Throwable {
		for (int i = 0; i < 3; i++) {
			clickOnElement(pom.getpageMoodgraph().getLeftarrow());
			jsScrollDownElement(pom.getpageMoodgraph().getScroll());
		}
		screenshot("snap.png");
		
	}

	@When("user click the edit button and it shows new entry page")
	public void user_click_the_edit_button_and_it_shows_new_entry_page() throws Throwable {
		clickOnElement(pom.getpageMoodgraph().getEdit());

	}

	@When("user click the update button and it navigates to saved record page")
	public void user_click_the_update_button_and_it_navigates_to_saved_record_page() throws Throwable {
		clickOnElement(pom.getpageMoodgraph().getRecord());
	}

	@When("user click the Delete button and Continue Button shows up")
	public void user_click_the_Delete_button_and_Continue_Button_shows_up() throws Throwable {
		clickOnElement(pom.getpageMoodgraph().getDelete());

	}

	@Then("Click the continue button and success message Popup")
	public void click_the_continue_button_and_success_message_Popup() throws Throwable {
		clickOnElement(pom.getpageMoodgraph().getConti());
		waitForSeconds(10);

	}

}
