package com.Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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


public class Patient_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user Launch the url")
	public void user_Launch_the_url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the email address in text Box")
	public void user_enter_the_email_address_in_text_Box() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");

	}

	@When("user enter The password in text Box")
	public void user_enter_The_password_in_text_Box() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");

	}

	@When("user click the accept cookies button")
	public void user_click_the_accept_cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("user click the login Button and it naviagtes to Home Page")
	public void user_click_the_login_Button_and_it_naviagtes_to_Home_Page() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);

	}

	@Given("user click the Main menu button and Submenu shows up")
	public void user_click_the_Main_menu_button_and_Submenu_shows_up() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(3000);

	}

	@When("user click the My health button and It navigates to my Health Overview Page")
	public void user_click_the_My_health_button_and_It_navigates_to_my_Health_Overview_Page() throws Throwable {
		clickOnElement(pom.getpageHealth().getMyhealth());

	}

	@When("user click the Questionnaire button in my health page and it Navigates to Dashboard")
	public void user_click_the_Questionnaire_button_in_my_health_page_and_it_Navigates_to_Dashboard() throws Throwable {
		clickOnElement(pom.getpageHealth().getPatientquestions());
		Sleep(3000);
	}

	@When("user click questionnaire menu and select the start button")
	public void user_click_questionnaire_menu_and_select_the_start_button() throws Throwable {
		clickOnElement(pom.getpageHealth().getHealthmenu());
		Sleep(3000);

		clickOnElement(pom.getpageHealth().getStart());

	}

	@When("user select the answers in Questionnaire page")
	public void user_select_the_answers_in_Questionnaire_page() throws Throwable {
		Inputvalues(pom.getpageHealth().getAnswer1(), "Heavy");
		Sleep(3000);
		Inputvalues(pom.getpageHealth().getAnswer2(), "Report");
		Sleep(3000);
		dropdownSelectByVisibleText(pom.getpageHealth().getAnswer3(), "DOLO650");
		Sleep(8000);
		clickOnElement(pom.getpageHealth().getAnswer4());
		Sleep(3000);
		clickOnElement(pom.getpageHealth().getAnswer5());
		Sleep(3000);

	}

	@When("user click privacy policies and Done button and Sucess message Popups")
	public void user_click_privacy_policies_and_Done_button_and_Sucess_message_Popups() throws Throwable {

		clickOnElement(pom.getpageHealth().getPrivacy());

		Sleep(10000);
		clickOnElement(pom.getpageHealth().getDisclaimer());
		clickOnElement(pom.getpageHealth().getHappens());
		Sleep(8000);
		clickOnElement(pom.getpageHealth().getStatement());

		Sleep(6000);
		clickOnElement(pom.getpageHealth().getDone());

		screenshot("snaps.png");
	}

	@Then("user Click the Logout button and It navigates to Login page")
	public void user_Click_the_Logout_button_and_It_navigates_to_Login_page() throws Throwable {
		clickOnElement(pom.getpageHealth().getLogout());

	}
}
