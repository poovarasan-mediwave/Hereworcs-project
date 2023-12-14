package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
// com.Base_Class.base_class;
import com.Runner.Runner_Class;
//import com.Runner.runner_class;
import com.Singleton_Design_Pattern.Class_Objects;
//import com.Singleton_Design_Pattern.singleton;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Clinician_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("^User launch the uRl$")
	public void user_launch_the_uRl() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		
	}

	@When("^User enter the email Address in text Box$")
	public void user_enter_the_email_Address_in_text_Box() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "satieshkumar+cl@mindwaveventures.com");
		
	}

	@When("^user Enter The password in Text Box$")
	public void user_Enter_The_password_in_Text_Box() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
	}

	@When("^user click the accept Cookies button$")
	public void user_click_the_accept_Cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
		
	}

	@Then("^User click the login Button and it naviagtes to home page$")
	public void user_click_the_login_Button_and_it_naviagtes_to_home_page() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);
		
	}

	@When("^user click the main menu button and submenu shows up$")
	public void user_click_the_main_menu_button_and_submenu_shows_up() throws Throwable {
		clickOnElement(pom.getpageHealth().getClinicanmenu());
	
	}

	@Then("^user click the questionnaire button and it navigates to questionnaire page$")
	public void user_click_the_questionnaire_button_and_it_navigates_to_questionnaire_page() throws Throwable {
		clickOnElement(pom.getpageHealth().getClinicianque());
		
	}

	@Then("^user click the submit image button and it Navigates to health info page$")
	public void user_click_the_submit_image_button_and_it_Navigates_to_health_info_page() throws Throwable {
		clickOnElement(pom.getpageHealth().getQueimg());
		Sleep(6000);
		jsScrollDownElement(pom.getpageHealth().getScrolldown2());
		screenshot("snaped.png");
		
	}

}
