package com.Step_Definitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

public class Resources_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch The url")
	public void user_launch_The_url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		Sleep(3000);
	}

	@When("user enter the valid email address in user field")
	public void user_enter_the_valid_email_address_in_user_field() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj280990+lesner@gmail.com");
		Sleep(3000);
	}

	@When("user Enter the valid password in Password field")
	public void user_Enter_the_valid_password_in_Password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@@");
		Sleep(3000);
	}

	@When("user click the accept in Cookies button")
	public void user_click_the_accept_in_Cookies_button() throws Throwable {
		//clickOnElement(pom.getpageLogin().getCookies());
		Sleep(3000);
	}

	@Then("user Click the login Button And it navigates to dashboard")
	public void user_Click_the_login_Button_And_it_navigates_to_dashboard() throws Throwable {
		clickOnElement(pom.getlogin().getLoginbtn());
		 Sleep(20000);
	}

	@Given("user click the Main Menu and shows the Submenu")
	public void user_click_the_Main_Menu_and_shows_the_Submenu() throws Throwable {
		 Sleep(9000);
		//clickOnElement(pom.getpageTracker().getMenu());
		driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']/following-sibling::p")).click();
		Sleep(3000);

	}

	@When("user the Resources button and It navigates to resources page")
	public void user_the_Resources_button_and_It_navigates_to_resources_page() throws Throwable {
		Sleep(5000);
		clickOnElement(pom.getpageResource().getResources());

	}

	@When("user click the Fliter option and Select the Particular Topics")
	public void user_click_the_Fliter_option_and_Select_the_Particular_Topics() throws Throwable {
		clickOnElement(pom.getpageResource().getFilter());
		clickOnElement(pom.getpageResource().getClick1());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getFilter());
		clickOnElement(pom.getpageResource().getClick2());
		Sleep(2000);
		clickOnElement(pom.getpageResource().getFilter());
		clickOnElement(pom.getpageResource().getClick3());

	}

	@When("user click the sort button and select the radio button")
	public void user_click_the_sort_button_and_select_the_radio_button() throws Throwable {
		clickOnElement(pom.getpageResource().getSort());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getRadiobtn());
		waitForSeconds(5);

	}

	@When("user Click the set preferences button and it navigates to set preference page")
	public void user_Click_the_set_preferences_button_and_it_navigates_to_set_preference_page() throws Throwable {
		clickOnElement(pom.getpageResource().getPreferences());

	}

	@When("user click the save and resource button and It Navigates to Resources Page")
	public void user_click_the_save_and_resource_button_and_It_Navigates_to_Resources_Page() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getpageResource().getSave());
		screenshot("snap9.png");
		clickOnElement(pom.getpageResource().getBack());
		Sleep(3000);

	}

	@When("user Click the Search button and Enter the topics name")
	public void user_Click_the_Search_button_and_Enter_the_topics_name() throws Throwable {
		Inputvalues(pom.getpageResource().getSearch(), "Assessment for care and support");
		Sleep(2000);

	}

	@When("user Click the Visit page button and it naviagtes to another window")
	public void user_Click_the_Visit_page_button_and_it_naviagtes_to_another_window() throws Throwable {

		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResource().getVisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
		screenshot("picture3.png");
		clickOnElement(pom.getpageResource().getFavourite());

	}

	@Then("user click the Favourite button and Close the Pop up")
	public void user_click_the_Favourite_button_and_Close_the_Pop_up() throws Throwable {
		clickOnElement(pom.getpageResource().getPopclose());
		Sleep(6000);

	}

	@Given("user click the saved resources and It navigates to Saved Resources page")
	public void user_click_the_saved_resources_and_It_navigates_to_Saved_Resources_page() throws Throwable {
		clickOnElement(pom.getpageResource().getSaved());
		screenshot("snap13.png");

	}

	@When("user click the resources page and it Navigates to Resources Page")
	public void user_click_the_resources_page_and_it_Navigates_to_Resources_Page() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		clickOnElement(pom.getpageResource().getResources());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getPagesend());
		Sleep(6000);

	}

	@When("user click the Patient name and it shows the message this person field")
	public void user_click_the_Patient_name_and_it_shows_the_message_this_person_field() throws Throwable {
		clickOnElement(pom.getpageResource().getMsgpatient());
	}

	@When("user click the send message button and it pop ups success message")
	public void user_click_the_send_message_button_and_it_pop_ups_success_message() throws Throwable {
		clickOnElement(pom.getpageResource().getMsgsend());
		screenshot("snap14.png");

	}

	@When("^user Click the videos button and It shows videos in the page$")
	public void user_Click_the_videos_button_and_It_shows_videos_in_the_page() throws Throwable {
		Sleep(15000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());

		clickOnElement(pom.getpageResource().getVideos());

	}

	@When("^user click the send Button for particular video and It navigates to message page and repeat the Flow$")
	public void user_click_the_send_Button_for_particular_video_and_It_navigates_to_message_page_and_repeat_the_Flow()
			throws Throwable {

		clickOnElement(pom.getpageResource().getVsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
		screenshot("picture4.png");
	}

	@When("user Click the Event button and it Shows events in the Page")
	public void user_Click_the_Event_button_and_it_Shows_events_in_the_Page() throws Throwable {
		Sleep(15000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());

		clickOnElement(pom.getpageResource().getEvents());

	}

	@When("user click the favourite and readinfo and Send button for the event and it navigates to Message Page and Repeated the flow")
	public void user_click_the_favourite_and_readinfo_and_Send_button_for_the_event_and_it_navigates_to_Message_Page_and_Repeated_the_flow()
			throws Throwable {
		clickOnElement(pom.getpageResource().getEfav());
		clickOnElement(pom.getpageResource().getEclose());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getEreadmore());

		clickOnElement(pom.getpageResource().getEsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
		screenshot("picture5.png");
	}

	@When("user Click the Support button and Search the particular name")
	public void user_Click_the_Support_button_and_Search_the_particular_name() throws Throwable {
		Sleep(15000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getSupport());

		Sleep(3000);
		Inputvalues(pom.getpageResources().getSsearch(), "Malnutrition");
	}

	@When("user click the visit and send button and It Navigates to message page and repeat The flow")
	public void user_click_the_visit_and_send_button_and_It_Navigates_to_message_page_and_repeat_The_flow()
			throws Throwable {

		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getSvisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
		screenshot("picture5.png");

		clickOnElement(pom.getpageResources().getSsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
	}

}
