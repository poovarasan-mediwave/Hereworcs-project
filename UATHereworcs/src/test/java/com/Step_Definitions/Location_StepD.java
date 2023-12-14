package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import com.Config_Reader.File_Reader;
//import com.Singleton.Singleton_Design;
//import Base_Class.Base_Class;
//import Runner.Runner_Class_dash;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Location_StepD extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);

	@Given("^user launch the browser$")
	public void user_launch_the_browser() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	
	@When("^user enter the username$")
	public void user_enter_the_username() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getpageLogin().getCookies1());
		Sleep(4000);
	//	String username = File_Reader.getInstanceFR().getInstanceCR().getUsername();
		Inputvalues(pom.getpageLogin().getUser(), "dhanraj280990+lesner@gmail.com");
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
	//	String password = File_Reader.getInstanceFR().getInstanceCR().getpassword();
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@@");
		Sleep(4000);
		
	}


	@When("^user accept cookies$")
	public void user_accept_cookies() throws Throwable {
		// clickOnElement(pom.getInstanceLog_In().getCookies());
	}
	
	@Then("click signin button and navigates to home page")
	public void click_signin_button_and_navigates_to_home_page()throws Throwable {
		clickOnElement(pom.getpageLogin().getSignin());
		Sleep(27000);
	}

	@When("^user click the Add icon from My Dashboard Item$")
	public void user_click_the_Add_icon_from_My_Dashboard_Item() throws Throwable {
		//WebDriverWait ref = new WebDriverWait(driver, 10);
		//ref.until(ExpectedConditions.elementToBeClickable(pom.getInstanceAdding().getAdd()));
		actionsClick(pom.getInstanceAdding().getAdd());
		Sleep(4000);
	}

	@When("^user click the Continue button in popup$")
	public void user_click_the_Continue_button_in_popup() throws Throwable {
		//Sleep(3000);
		clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
		
	}

	@Then("^user take screenshot of my location added in a dashboard item$")
	public void user_take_screenshot_of_my_location_added_in_a_dashboard_item() throws Throwable {
		Sleep(4000);
	//	jsScrollDownElement(pom.getInstanceAdding().getJs_Down());
	//screenshot("Snap_Location.png");
	}

	
	@When("^user Click add button$")
	public void user_Click_add_button() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceAdd_Diary().getAdd());
		Sleep(4000);
	}
	

  @Then("user Click Add Entry button for validation")
  public void user_click_add_entry_button_for_validation()throws Throwable {
    	clickOnElement(pom.getInstanceAdd_Diary().getAdd_Entry());
		Sleep(3000);
  }

	
   //
	@When("^user Took Screenshot in added Dashboard item$")
	public void user_Took_Screenshot_in_added_Dashboard_item() throws Throwable {
		Sleep(4000);
		//clickOnElement(pom.getInstanceAdd_Diary().getContinue_Btn());
		driver.findElement(By.xpath("(//button[text()='CONTINUE'])[2]")).click();
		Sleep(6000);
		screenshot("diary_Dashboard.png");
	}

	@When("^user Add data in Diary Entry Field$")
	public void user_Add_data_in_Diary_Entry_Field() throws Throwable {
		//waitForSeconds(10);
		Inputvalues(pom.getInstanceAdd_Diary().getDiary_Entry(), "Hi");
		Sleep(6000);
		screenshot("diary_Dashboard.png");
	}

	@When("^user Click Add Entry button$")
	public void user_Click_Add_Entry_button() throws Throwable {
		clickOnElement(pom.getInstanceAdd_Diary().getAdd_Entry());
		Sleep(3000);
	}

	@When("^user Click take me to Diary button and page Navigates to Diary page$")
	public void user_Click_take_me_to_Diary_button_and_page_Navigates_to_Diary_page() throws Throwable {
		//clickOnElement(pom.getInstanceAdd_Diary().getTake_Me_Diary());
		driver.findElement(By.xpath("(//div[@class='mw-pop mw-bg-white-card mw-border-dark-gray p-md-5 p-3']/button)[7]")).click();
		Sleep(4000);
	}

	@Then("^user Take Screenshot in diary page$")
	public void user_Take_Screenshot_in_diary_page() throws Throwable {
		jsScrollDownElement(pom.getInstanceAdd_Diary().getSreen_S());
		Sleep(2000);
		screenshot("Diary.png");
		clickOnElement(pom.getInstanceAdd_Diary().getHome());
	}

	@When("^user Add the My Tracker Overview in Dashboard$")
	public void user_Add_the_My_Tracker_Overview_in_Dashboard() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceTracker_Add().getAdd());
	}

	@When("^user click the continue button in the popup$")
	public void user_click_the_continue_button_in_the_popup() throws Throwable {
		Sleep(6000);
		clickOnElement(pom.getInstanceTracker_Add().getContinue_Btn());
	}

	@When("^user select the mood tracker$")
	public void user_select_the_mood_tracker() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceTracker_Add().getMood());
	}

	@When("^user select the fluid tracker$")
	public void user_select_the_fluid_tracker() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceTracker_Add().getFluid());
	}

	@When("^user select the Exercise tracker$")
	public void user_select_the_Exercise_tracker() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceTracker_Add().getExercise());
	}

	@When("^user select the month to get a report for the month$")
	public void user_select_the_month_to_get_a_report_for_the_month() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceTracker_Add().getMonth());
		Sleep(4000);
		clickOnElement(pom.getInstanceTracker_Add().getArrow());
	}

	@Then("^user finally take a Screenshot$")
	public void user_finally_take_a_Screenshot() throws Throwable {

		jsScrollDownElement(pom.getInstanceTracker_Add().getJs_Scroll());
		Sleep(4000);
		screenshot("Tracker.png");
	}

	@When("^user click add icon and click continue button$")
	public void user_click_add_icon_and_click_continue_button() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceFast_log().getAdd());
		Sleep(3000);
		clickOnElement(pom.getInstanceFast_log().getContinue_Btn());
	}

	@Then("^user check added item in dashboard and took screenshot$")
	public void user_check_added_item_in_dashboard_and_took_screenshot() throws Throwable {
		jsScrollDownElement(pom.getInstanceFast_log().getSrn_Sht());
		Sleep(2000);
		screenshot("fastlog.png");
	}

	@When("^user add messages in my dashboard$")
	public void user_add_messages_in_my_dashboard() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceMessage().getAdding());
	}

	@When("^user click the continue button$")
	public void user_click_the_continue_button() throws Throwable {
		Sleep(6000);
		clickOnElement(pom.getInstanceMessage().getContinuee());
	}

	@When("^user took screenshot added in dashboard$")
	public void user_took_screenshot_added_in_dashboard() throws Throwable {
		jsScrollDownElement(pom.getInstanceMessage().getScroll());
		Sleep(3000);
		screenshot("message.png");
	}

	@When("^user click go to message button and page navigates to message page$")
	public void user_click_go_to_message_button_and_page_navigates_to_message_page() throws Throwable {
		clickOnElement(pom.getInstanceMessage().getGo_To());
		Sleep(2000);
	}

	@Then("^user click on particular person and message section will open$")
	public void user_click_on_particular_person_and_message_section_will_open() throws Throwable {
		Sleep(6000);
		clickOnElement(pom.getInstanceMessage().getMessage_page());
		Sleep(3000);
		clickOnElement(pom.getInstanceAdd_Diary().getHome());
	}

	@When("^user click the add button in the dashboard$")
	public void user_click_the_add_button_in_the_dashboard() throws Throwable {
		Sleep(3000);
		actionsClick(pom.getInstanceAppointment().getAdding());
		Sleep(6000);
	}

	@When("^user took screenshot$")
	public void user_took_screenshot() throws Throwable {
		clickOnElement(pom.getInstanceAppointment().getCtn_btn());
		Sleep(2000);
		jsScrollDownElement(pom.getInstanceAppointment().getScrn_sht());
		Sleep(3000);
		screenshot("My Appoint.png");
	}

	@When("^user click My appointment button and page navigates to appointment page$")
	public void user_click_My_appointment_button_and_page_navigates_to_appointment_page() throws Throwable {
		Sleep(2000);
		clickOnElement(pom.getInstanceAppointment().getGo_To_Apt());

	}

	@Then("^user took screenshot in appoint ment page$")
	public void user_took_screenshot_in_appoint_ment_page() throws Throwable {
		jsScrollDownElement(pom.getInstanceAppointment().getScroll());
		Sleep(2000);
		screenshot("My appointment page.png");
		clickOnElement(pom.getInstanceAdd_Diary().getHome());

	}

	@When("^user add the my circle in dashboard$")
	public void user_add_the_my_circle_in_dashboard() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceCircle().getAdd());
		Sleep(6000);
		clickOnElement(pom.getInstanceCircle().getContinue_Btn());
	}

	@When("^user check added Dashboard item$")
	public void user_check_added_Dashboard_item() throws Throwable {
		Sleep(3000);
		jsScrollDownElement(pom.getInstanceCircle().getScrn_sht());
		Sleep(2000);
		screenshot("Mycircledash.png");

	}

	@When("^user click the invite button and page redirects to my circle page$")
	public void user_click_the_invite_button_and_page_redirects_to_my_circle_page() throws Throwable {
		Sleep(2000);
		clickOnElement(pom.getInstanceCircle().getAdd_Circle());
	}

	@Then("^user scroll down and took screenshot$")
	public void user_scroll_down_and_took_screenshot() throws Throwable {
		Sleep(6000);
		clickOnElement(pom.getInstanceCircle().getPerson());
		Sleep(2000);
		jsScrollDownElement(pom.getInstanceCircle().getScroll());
		Sleep(2000);
		screenshot("addCircle.png");
		clickOnElement(pom.getInstanceAdd_Diary().getHome());
	}

	@When("^user click the Add Icon$")
	public void user_click_the_Add_Icon() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceRecommended().getAdd());
		Sleep(3000);
		clickOnElement(pom.getInstanceRecommended().getContinue_Btn());
	}

	@When("^user check the Added item and take screenshot$")
	public void user_check_the_Added_item_and_take_screenshot() throws Throwable {
		Sleep(3000);
		jsScrollDownElement(pom.getInstanceRecommended().getScrn_Sht());
		Sleep(2000);
		screenshot("MyRecommended.png");
	}

	@When("^user click the view button and page navigates to particular page$")
	public void user_click_the_view_button_and_page_navigates_to_particular_page() throws Throwable {
		Sleep(5000);
		clickOnElement(pom.getInstanceRecommended().getView());
		Sleep(3000);
	}

	@Then("^Took a Screenshot$")
	public void took_a_Screenshot() throws Throwable {
		Sleep(3000);
		jsScrollDownElement(pom.getInstanceRecommended().getScroll());
		screenshot("MyRecomm2.png");
		Sleep(5000);
		clickOnElement(pom.getInstanceAdd_Diary().getHome());
	}

	@When("^user add the saved resource item$")
	public void user_add_the_saved_resource_item() throws Throwable {
		Sleep(6000);
		actionsClick(pom.getInstanceSave().getAdd());
		Sleep(3000);
		clickOnElement(pom.getInstanceSave().getContinue_Btn());

	}

	@When("^user check the added item and took screenshot$")
	public void user_check_the_added_item_and_took_screenshot() throws Throwable {
		Sleep(3000);
		jsScrollDownElement(pom.getInstanceSave().getScrn_sht());
		Sleep(3000);
		screenshot("saved.png");
	}

	@When("^user click the view buttton and navigates to saved resources page$")
	public void user_click_the_view_buttton_and_navigates_to_saved_resources_page() throws Throwable {
		Sleep(5000);
		clickOnElement(pom.getInstanceSave().getView_btn());
		Sleep(3000);

	}

	@Then("^user check the particular page$")
	public void user_check_the_particular_page() throws Throwable {
		jsScrollDownElement(pom.getInstanceSave().getScroll());
		Sleep(2000);
		screenshot("saved_2.png");
	}
  
}
