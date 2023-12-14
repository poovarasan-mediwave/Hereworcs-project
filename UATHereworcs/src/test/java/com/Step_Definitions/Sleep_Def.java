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

public class Sleep_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user Launch The Application")
	public void user_Launch_The_Application() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user Enter the valid Email address in user Field")
	public void user_Enter_the_valid_Email_address_in_user_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");

	}

	@When("user Enter the Valid Password in Password Field")
	public void user_Enter_the_Valid_Password_in_Password_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
		Sleep(3000);
	}

	@When("user Click the Accept in Cookies button")
	public void user_Click_the_Accept_in_Cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
	}

	@Then("user Click the Login Button And It navigates to Dashboard")
	public void user_Click_the_Login_Button_And_It_navigates_to_Dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
		waitForSeconds(20);

	}

	@Given("user Click the main menu and Shows the Submenu")
	public void user_Click_the_main_menu_and_Shows_the_Submenu() throws Throwable {
		try {
			waitForSeconds(20);
			clickOnElement(pom.getpageTracker().getMenu());
			Sleep(3000);

		} catch (Exception e) {
		}
	}

	@When("^user Click the Tracker button and It naviagtes to Tracker Overview$")
	public void user_Click_the_Tracker_button_and_It_naviagtes_to_Tracker_Overview() throws Throwable {
		try {
			clickOnElement(pom.getpageTracker().getTracker());
			Sleep(3000);

		} catch (Exception e) {

		}

	}

	@When("user Click the Tracker menu in tracker overview and show the Tracker Dashboard")
	public void user_Click_the_Tracker_menu_in_tracker_overview_and_show_the_Tracker_Dashboard() throws Throwable {
		clickOnElement(pom.getpageTracker().getTracker1());

	}

	@When("user Click the Inactive Tracker and shows the Inactive trackers")
	public void user_Click_the_Inactive_Tracker_and_shows_the_Inactive_trackers() throws Throwable {
		clickOnElement(pom.getpageTracker().getInactivetracker());
		Sleep(3000);
	}

	@When("user Click the sleep Inactive tracker to Active Tracker and sleep tracker moves to active tracker")
	public void user_Click_the_sleep_Inactive_tracker_to_Active_Tracker_and_sleep_tracker_moves_to_active_tracker()
			throws Throwable {
		clickOnElement(pom.getpageTracker().getInactive());
	}

	@When("user Click the Active tracker and shows the sleep tracker")
	public void user_Click_the_Active_tracker_and_shows_the_sleep_tracker() throws Throwable {
		clickOnElement(pom.getpageTracker().getActive());
		Sleep(3000);

	}

	@Then("user Click the Sleep tracker and It navigates to  Sleep tracker page")
	public void user_Click_the_Sleep_tracker_and_It_navigates_to_Sleep_tracker_page() throws Throwable {
		try {
			clickOnElement(pom.getpageTracker().getSleep());
			waitForSeconds(20);
			Sleep(3000);

		} catch (Exception e) {
		}

	}

	@Given("user Click the add My mood information button and It navigates to New Entry Page")
	public void user_Click_the_add_My_mood_information_button_and_It_navigates_to_New_Entry_Page() throws Throwable {
		clickOnElement(pom.getpageSleep().getAddinfo());
		Sleep(3000);
	}

	@When("user Click the Calender and it shows title of the Calender")
	public void user_Click_the_Calender_and_it_shows_title_of_the_Calender() throws Throwable {
		clickOnElement(pom.getpageSleep().getCalendar());
		Sleep(3000);

	}

	@When("user Click the title and it shows years")
	public void user_Click_the_title_and_it_shows_years() throws Throwable {
		clickOnElement(pom.getpageSleep().getTitle());
		Sleep(4000);

	}

	@When("user Click the Years")
	public void user_Click_the_Years() throws Throwable {
		clickOnElement(pom.getpageSleep().getYears());

		Sleep(3000);

	}

	@When("user Select the particular Year and it navigates to months")
	public void user_Select_the_particular_Year_and_it_navigates_to_months() throws Throwable {
		clickOnElement(pom.getpageSleep().getYear());
		Sleep(3000);
	}

	@When("user Select the month and It navigates to Date")
	public void user_Select_the_month_and_It_navigates_to_Date() throws Throwable {
		clickOnElement(pom.getpageSleep().getMonth());
		Sleep(6000);

	}

	@Then("user the Entry for Whole Month and select the durations and wakes and rate of sleep and record and it navigates to New Entry page")
	public void user_the_Entry_for_Whole_Month_and_select_the_durations_and_wakes_and_rate_of_sleep_and_record_and_it_navigates_to_New_Entry_page()
			throws Throwable {
		List<WebElement> date = pom.getpageSleep().getDate();
		int size = date.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {

			if (i == 1 || i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14 || i == 16 || i == 18
					|| i == 20) {
				clickOnElement(date.get(i));
				Sleep(3000);
				Inputvalues(pom.getpageSleep().getFrom(), "09:30");
				Inputvalues(pom.getpageSleep().getTo(), "06:00");	
				
				Inputvalues(pom.getpageSleep().getWakeup(), "2");
				clickOnElement(pom.getpageSleep().getGreat());
				clickOnElement(pom.getpageSleep().getRecord());
				waitForSeconds(10);
				clickOnElement(pom.getpageSleep().getAddinfo());
				Sleep(3000);
				clickOnElement(pom.getpageSleep().getCalendar());
				clickOnElement(pom.getpageSleep().getTitle());
				clickOnElement(pom.getpageSleep().getYears());
				clickOnElement(pom.getpageSleep().getYear());
				clickOnElement(pom.getpageSleep().getMonth());
				Sleep(3000);
			}

			if (i == 2 || i == 5 || i == 7 || i == 25 || i == 11 || i == 27 || i == 15 || i == 17 || i == 29
					|| i == 26) {
				clickOnElement(date.get(i));
				Sleep(3000);
				Inputvalues(pom.getpageSleep().getFrom(), "08:30");
				Inputvalues(pom.getpageSleep().getTo(), "05:00");	
				
				Inputvalues(pom.getpageSleep().getWakeup(), "1");
				clickOnElement(pom.getpageSleep().getPoor());
				clickOnElement(pom.getpageSleep().getRecord());
				waitForSeconds(10);
				clickOnElement(pom.getpageSleep().getAddinfo());
				Sleep(2000);
				clickOnElement(pom.getpageSleep().getCalendar());
				clickOnElement(pom.getpageSleep().getTitle());
				clickOnElement(pom.getpageSleep().getYears());
				clickOnElement(pom.getpageSleep().getYear());
				clickOnElement(pom.getpageSleep().getMonth());
				Sleep(3000);

			}
			if (i == 3 || i == 22 || i == 23 || i == 9 || i == 13 || i == 19 || i == 30 || i == 24 || i == 28
					|| i == 21 || i == 0) {
				clickOnElement(date.get(i));
				Sleep(3000);
				Inputvalues(pom.getpageSleep().getFrom(), "07:30");
				Inputvalues(pom.getpageSleep().getTo(), "07:00");	
				
				Inputvalues(pom.getpageSleep().getWakeup(), "3");
				clickOnElement(pom.getpageSleep().getAverage());
				clickOnElement(pom.getpageSleep().getRecord());
				waitForSeconds(10);
				clickOnElement(pom.getpageSleep().getAddinfo());
				Sleep(2000);
				clickOnElement(pom.getpageSleep().getCalendar());
				clickOnElement(pom.getpageSleep().getTitle());
				clickOnElement(pom.getpageSleep().getYears());
				clickOnElement(pom.getpageSleep().getYear());
				clickOnElement(pom.getpageSleep().getMonth());
				Sleep(3000);

			}

		}
		clickOnElement(pom.getpageSleep().getSleepbutton());
	}

	@Given("user Click the Month Button and the graph for Month Occured")
	public void user_Click_the_Month_Button_and_the_graph_for_Month_Occured() throws Throwable {
		clickOnElement(pom.getpageGraph().getMonth1());
		Sleep(3000);
	}

	@When("user Click the left Arrow for Particular Month")
	public void user_Click_the_left_Arrow_for_Particular_Month() throws Throwable {
		for (int i = 0; i < 11; i++) {
			clickOnElement(pom.getpageGraph().getLeft());
			jsScrollDownElement(pom.getpageGraph().getJsscroll());

		}
		screenshot("snap1.png");
	}

	@When("user Click the Edit Button and it shows New Entry page")
	public void user_Click_the_Edit_Button_and_it_shows_New_Entry_page() throws Throwable {
		clickOnElement(pom.getpageGraph().getEdit());
		
	}

	@When("user Click the Update Button and it Navigates to saved record page")
	public void user_Click_the_Update_Button_and_it_Navigates_to_saved_record_page() throws Throwable {
		clickOnElement(pom.getpageGraph().getUpdate());
		Sleep(3000);
	}

	@When("user Click the delete button and continue button shows up")
	public void user_Click_the_delete_button_and_continue_button_shows_up() throws Throwable {
		clickOnElement(pom.getpageGraph().getDelete());
	}

	@Then("click the Continue Button and success message Popup")
	public void click_the_Continue_Button_and_success_message_Popup() throws Throwable {
		clickOnElement(pom.getpageGraph().getCont());
		waitForSeconds(5);
		screenshot("snap2.png");

	}

}
