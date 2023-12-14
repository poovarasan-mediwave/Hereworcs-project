package com.Step_Definitions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
//import com.Singleton.Singleton_Design_Pattern;
import com.Singleton_Design_Pattern.Class_Objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Goals_StepDefinitions extends Base_Class{


	public static WebDriver driver = Runner_Class.driver;

	//public static Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
	public static Class_Objects pom = new Class_Objects(driver);

	@Given("User has to open the website in the chrome browser")
	public void user_has_to_open_the_website_in_the_chrome_browser() {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("User inputs the email address in {string} field")
	public void user_inputs_the_email_address_in_field(String string) {
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj280990+lesner@gmail.com");
	}
	@When("user inputs and enters the valid password in {string} field")
	public void user_inputs_and_enters_the_valid_password_in_field(String string) {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@");
	}
	@Then("user then accepts cookies")
	public void user_then_accepts_cookies() {
		clickOnElement(pom.getpageLogin().getAcceptcookies());
	}
	@Then("user then clicks the login button")
	public void user_then_clicks_the_login_button() {
		clickOnElement(pom.getpageLogin().getLoginbutton());
	}
	@Then("User then has to navigate to home page of dashboard")
	public void user_then_has_to_navigate_to_home_page_of_dashboard() throws InterruptedException {
		System.out.println("User logged in and dashboard page displayed successfully");
		Sleep(45000);
	}

	@Given("When Patient user has clicked the mainmenu in dashboard page")
	public void when_patient_user_has_clicked_the_mainmenu_in_dashboard_page()  throws InterruptedException{
		//clickOnElement(pom.getInstancegoal().getClickMenus());
		 WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
	}



	@Then("user click the tracker in main menu")
	public void user_click_the_tracker_in_main_menu()  throws InterruptedException{
		clickOnElement(pom.getInstancegoal().getClickTrackersinMenu());
		Sleep(3000);
	}

	@Then("User clicks Goals menu")
	public void user_clicks_goals_menu() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getGoalsMenu());
		Sleep(3000);
	}

	// add data for daily part

	@Then("User clicks Add a new Goal button")
	public void user_clicks_add_a_new_goal_button() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getAddNewGoals());
		Sleep(3000);
	}
	@Then("user enters input for {string} field")
	public void user_enters_input_for_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getWhatisurgoal(), "Eat and stay healthy always");
		Sleep(3000);
	}


	@Then("user selects date for  date to start field")
	public void user_selects_date_for_date_to_start_field() throws InterruptedException {


		clickOnElement(pom.getInstancegoal().getDatetostart());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getClickYearTitle());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getChooseMonth());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getDailydate());
		Sleep(1000);




	}
	@Then("user selects date for date to achieve field")
	public void user_selects_date_for_date_to_achieve_field() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getGoalachievedate());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getDailydate());
		Sleep(3000);
	}

	@Then("user enter input for goal description {string} field")
	public void user_enter_input_for_goal_description_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getGoaldescription(), "Take Veg");
		Sleep(2000);
	}

	@Then("user enters input for step field  {string} data field")
	public void user_enters_input_for_step_field_data_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getGoalstepdesc(), "First day -> Lunch");
		Sleep(2000);
	}

	@Then("user selects slider for repeat step during this span")
	public void user_selects_slider_for_repeat_step_during_this_span() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getYestoreapeattimespan());
		Sleep(2000);
	}



	@Then("user selects the option under timespan to repeat")
	public void user_selects_the_option_under_timespan_to_repeat() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSelectdaily());
		Sleep(2000);
	}

	@Then("User finally clicks Save goal button")
	public void user_finally_clicks_save_goal_button() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSaveGoal());
		Sleep(2000);
		System.out.println("Goal data for a daily option filled");

	}


	// Weekly PART

	@Given("When clicks Add new goal button for weekly")
	public void when_clicks_add_new_goal_button_for_weekly() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getAddNewGoals());
		Sleep(2000);
	}




	@Then("user enter input1 for {string} field")
	public void user_enter_input1_for_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getWhatisurgoal(), "Happy Holidays");
		Sleep(2000);
	}
	@Then("user select date2 for date to start field")
	public void user_select_date2_for_date_to_start_field() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getDatetostart());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getClickYearTitle());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getChooseMonth());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getDailydate());
		Sleep(1000);

	}
	@Then("user selects date2 for date to achieve field")
	public void user_selects_date2_for_date_to_achieve_field() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getGoalachievedate());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getWeeklydate());
		Sleep(1000);
	}

	@Then("user need to enter input2 for {string} field")
	public void user_need_to_enter_input2_for_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getGoaldescription(), "Annual Leave");
		Sleep(1000);
	}

	@Then("user need to enter input2 for step field {string} data field")
	public void user_need_to_enter_input2_for_step_field_data_field(String string) throws InterruptedException {

		Inputvalues(pom.getInstancegoal().getGoalstepdesc(), "Testing");
		Sleep(1000);
	}
	@Then("user selects slider again for selecting weekly for repeat step during this span")
	public void user_selects_slider_again_for_selecting_weekly_for_repeat_step_during_this_span() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getYestoreapeattimespan());
		Sleep(1000);
	}
	@Then("user selects timespan option to repeat")
	public void user_selects_timespan_option_to_repeat() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSelectweekly());
		Sleep(1000);
	}
	@Then("User has to click save goal button finally")
	public void user_has_to_click_save_goal_button_finally() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSaveGoal());
		Sleep(4000);
		System.out.println("Goal data for a Weekly option filled");
		
	}

	// Monthly part

	@Given("When clicks Add new goal button for Monthly")
	public void when_clicks_add_new_goal_button_for_monthly() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getAddNewGoals());
		Sleep(2000);
	}



	@Then("user enter input3 for {string} field")
	public void user_enter_input3_for_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getWhatisurgoal(), "Monthly goal description");
		Sleep(3000);
	}
	@Then("user select date3 for date to start field")
	public void user_select_date3_for_date_to_start_field() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getDatetostart());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getClickYearTitle());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getChooseMonth());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getDailydate());
		Sleep(1000);

	}
	@Then("user selects date3 for date to achieve field")
	public void user_selects_date3_for_date_to_achieve_field() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getGoalachievedate());
		Sleep(1000);
		
		clickOnElement(pom.getInstancegoal().getClickYearTitle1());
		Sleep(1000);
		clickOnElement(pom.getInstancegoal().getChooseMonth1());
		Sleep(1000);
		
		clickOnElement(pom.getInstancegoal().getMonthlydate());
		Sleep(1000);
	}
	@Then("user need to enter input3 for {string} field")
	public void user_need_to_enter_input3_for_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getGoaldescription(), "Monthly Steps");
		Sleep(1000);
	}
	
	@Then("user need to enter input3 for step field {string} data field")
	public void user_need_to_enter_input3_for_step_field_data_field(String string) throws InterruptedException {
		Inputvalues(pom.getInstancegoal().getGoalstepdesc(), "Goal Steps");
		Sleep(1000);
	}
	
	@Then("user selects slider again for selecting monthly for repeat step during this span")
	public void user_selects_slider_again_for_selecting_monthly_for_repeat_step_during_this_span() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getYestoreapeattimespan());
		Sleep(1000);
	}
	@Then("user selects timespan option to repeat monthly")
	public void user_selects_timespan_option_to_repeat_monthly() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSelectmonthly());
		Sleep(2000);
	}
	@Then("User has to click save goal button finally for monthly datasss")
	public void user_has_to_click_save_goal_button_finally_for_monthly_datasss() throws InterruptedException {
		clickOnElement(pom.getInstancegoal().getSaveGoal());
		System.out.println("Goal data for a Montly option filled");
		Sleep(1000);

	}
	
	
	// GOAL FUNCTIONS
	
	
	@Given("When clicks on date to view the added goal")
	public void when_clicks_on_date_to_view_the_added_goal() throws InterruptedException {
	    clickOnElement(pom.getInstancegoal().getPresentdate());
	    System.out.println("Date Selected");
	    Sleep(3000);
	}


	@Then("User clicks edit button to add another step")
	public void user_clicks_edit_button_to_add_another_step() throws InterruptedException {
	clickOnElement(pom.getInstancegoal().getClickEditbutton());
	System.out.println("Edit button clicked");
	Sleep(3000);
	}
	@Then("User clicks add another step button")
	public void user_clicks_add_another_step_button() throws InterruptedException {
	  clickOnElement(pom.getInstancegoal().getClickAddAnotherStepButton());
	  Sleep(2000);
	}
	@Then("User enters goalstep under need to achieve field")
	public void user_enters_goalstep_under_need_to_achieve_field() throws InterruptedException {
	 Inputvalues(pom.getInstancegoal().getEnteraddstepdescription(), "Additional goal data");
	 Sleep(2000);
	}
	@Then("user clicks update button")
	public void user_clicks_update_button()throws InterruptedException {
	   clickOnElement(pom.getInstancegoal().getClickUpdateButton());
	   System.out.println("Goal data updated successs");
	   Sleep(3000);
	}
	
	
	
	// GOAL COMPLETE PART
	
	@Given("when user clicks on date to view the already added goal")
	public void when_user_clicks_on_date_to_view_the_already_added_goal() throws InterruptedException {
	    clickOnElement(pom.getInstancegoal().getPresentdate());
	    System.out.println("Date selected");
	    Sleep(3000);
	    
	}


	@Then("user has to click the view button")
	public void user_has_to_click_the_view_button() throws InterruptedException {
	   clickOnElement(pom.getInstancegoal().getViewGoal());
	   System.out.println("View goal clicked");
	   Sleep(3000);
	}
	@Then("User has to click complete button")
	public void user_has_to_click_complete_button() throws InterruptedException {
	  clickOnElement(pom.getInstancegoal().getMarkascompleted());
	  System.out.println("goal completed");
	   Sleep(3000);
	}

	
	// GOAL DELETE PART
	
	@Given("When user need to click date to select")
	public void when_user_need_to_click_date_to_select() throws InterruptedException {
	   clickOnElement(pom.getInstancegoal().getPresentdate());
	   System.out.println("date selected");
	   Sleep(3000);
	}



	@Then("user click delete button")
	public void user_click_delete_button()  throws InterruptedException{
	    clickOnElement(pom.getInstancegoal().getDeletebuttonHome());
	    Sleep(3000);
	   
	    
	}
	    
	    @Then("user has to click yes to confirm deleteion")
	    public void user_has_to_click_yes_to_confirm_deleteion() throws InterruptedException {
	        clickOnElement(pom.getInstancegoal().getYestodelete());
	        System.out.println("Goal deleted successss");
	        Sleep(3000);
	    }

	}
