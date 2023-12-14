package com.Step_Definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmartDashboard_stepDefinition extends Base_Class  {
	
	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);

	 
	    @Given("user launch the Browser for Smart Dashboard")
		public void user_launch_the_browser_for_smart_dashboard()throws InterruptedException  {
	    	geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	    	
	    	
		}

		@When("user click the Login button for Smart Dashboard")
		public void user_click_the_login_button_for_smart_dashboard()throws InterruptedException  {
			clickOnElement(pom.getInstanceExercise_Tracker().getAcceptcookies());
			Sleep(4000);
		}
		@When("user enter the username in the field for Smart Dashboard")
		public void user_enter_the_username_in_the_field_for_smart_dashboard()throws InterruptedException  {
			Inputvalues(pom.getInstanceExercise_Tracker().getEmailaddress(), "dhanraj280990+lesner@gmail.com");
			Sleep(3000);
		}
		@When("user enter the password in the password field for Smart Dashboard")
		public void user_enter_the_password_in_the_password_field_for_smart_dashboard()throws InterruptedException  {
			 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
			 Sleep(3000);
		}
		@Then("user click the login button and page navigates to the home page for Smart Dashboard")
		public void user_click_the_login_button_and_page_navigates_to_the_home_page_for_smart_dashboard()throws InterruptedException  {
			clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
			Sleep(40000);
		}

		////************************  *****************************///
	
		
		@Given("user click on Add dashboard item for smart Dashboard")
		public void user_click_on_add_dashboard_item_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getadddashboarditem());
			Sleep(4000);
		}



		@When("user click on close message popup for smart Dashboard")
		public void user_click_on_close_message_popup_for_smart_dashboard() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@class='top-arrow smart info-tooltip-guide popover tour-guide-bg tour tour-tour tour-tour-0 fade bottom in']/div/div/button")).click();
		 Sleep(4000);
		 driver.findElement(By.xpath("//div[@class='down-arrow smart-dash info-tooltip-guide popover tour-guide-bg tour tour-tour tour-tour-2 fade top in']/div/div/button")).click();
		 Sleep(4000);
			}
		
		
		@Then("user click on my location button for smart Dashboard")
		public void user_click_on_my_location_button_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmylocation_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
		}
		
		@Then("user click on My diary for smart Dashboard")
		public void user_click_on_my_diary_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmydiary_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);

		}
		
		@Then("user click on My tracker overview for smart Dashboard")
		public void user_click_on_my_tracker_overview_for_smart_dashboard()throws InterruptedException  {
			clickOnElement(pom.getsmartDashboard().getmytrackeroverview_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);

		}
		
		@Then("user click on My fast tracker log for smart Dashboard")
		public void user_click_on_my_fast_tracker_log_for_smart_dashboard()throws InterruptedException  {
			clickOnElement(pom.getsmartDashboard().getmyfasttrackerlog_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);

		}
		
		@Then("user click on My messages for smart Dashboard")
		public void user_click_on_my_messages_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmymessage_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
		}
		
		@Then("user click on My appointments for smart Dashboard")
		public void user_click_on_my_appointments_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmyappointment_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);

		}
		
		@Then("user click on My circle for smart Dashboard")
		public void user_click_on_my_circle_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmycircle_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
		}
		
		@Then("user click on My recommended resources for smart Dashboard")
		public void user_click_on_my_recommended_resources_for_smart_dashboard() throws InterruptedException {
			clickOnElement(pom.getsmartDashboard().getmyrecommended_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
		}
		
		@Then("user click on My saved resources for smart Dashboard")
		public void user_click_on_my_saved_resources_for_smart_dashboard()throws InterruptedException  {
			clickOnElement(pom.getsmartDashboard().getmysavedresource_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
		}


		
		/*********  **********///
		
			@Given("user click on remove my location button for smart Dashboard")
			public void user_click_on_remove_my_location_button_for_smart_dashboard()throws InterruptedException  {
				clickOnElement(pom.getsmartDashboard().getremove_mylocation());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}


			@When("user click on remove My diary button for smart Dashboard")
			public void user_click_on_remove_my_diary_button_for_smart_dashboard() throws InterruptedException {
				clickOnElement(pom.getsmartDashboard().getremove_mydairy());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My tracker overview for smart Dashboard")
			public void user_click_on_remove_my_tracker_overview_for_smart_dashboard()throws InterruptedException  {
				clickOnElement(pom.getsmartDashboard().getremove_mytrackeroverview());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My fast tracker log for smart Dashboard")
			public void user_click_on_remove_my_fast_tracker_log_for_smart_dashboard() throws InterruptedException {
				clickOnElement(pom.getsmartDashboard().getremove_myfasttrackerlog());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My messages button for smart Dashboard")
			public void user_click_on_remove_my_messages_button_for_smart_dashboard()throws InterruptedException  {
				clickOnElement(pom.getsmartDashboard().getremove_mymessages());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My appointments button for smart Dashboard")
			public void user_click_on_remove_my_appointments_button_for_smart_dashboard() throws InterruptedException {
				clickOnElement(pom.getsmartDashboard().getremove_myappointment());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My circle button for smart Dashboard")
			public void user_click_on_remove_my_circle_button_for_smart_dashboard()throws InterruptedException  {
				clickOnElement(pom.getsmartDashboard().getremove_mycircle());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
		
			@Then("user click on remove My recommended resources for smart Dashboard")
			public void user_click_on_remove_my_recommended_resources_for_smart_dashboard() throws InterruptedException {
				clickOnElement(pom.getsmartDashboard().getremove_myrecommendedresource());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}
			@Then("user click on remove My saved resources for smart Dashboard")
			public void user_click_on_remove_my_saved_resources_for_smart_dashboard() throws InterruptedException {
				clickOnElement(pom.getsmartDashboard().getremove_mysavedresource());
				Sleep(4000);
				clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
				Sleep(4000);
			}


}
