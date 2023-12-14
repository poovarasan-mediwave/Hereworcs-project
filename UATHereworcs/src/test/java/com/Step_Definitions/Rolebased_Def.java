package com.Step_Definitions;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

//import com.Base_Class.base_class;
//import com.Runner.runner_class;
//import com.Singleton_Design_Pattern.singleton;
//import com.mongodb.gridfs.CLI;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Rolebased_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user Launch the Url")
	public void user_Launch_the_Url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the Valid Email Address in User field")
	public void user_enter_the_Valid_Email_Address_in_User_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "superadmin1@mindwaveventures.com");
	}

	@When("user enter the Valid Password in password field")
	public void user_enter_the_Valid_Password_in_password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Test@123");

	}

	@When("user click the accept in Cookies Button")
	public void user_click_the_accept_in_Cookies_Button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
	}

	@Then("user click the Login Button and it Navigates to dashboard")
	public void user_click_the_Login_Button_and_it_Navigates_to_dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);

	}

	@Given("user click the Questionnaries button and It navigates to Questionnaire Builder page")
	public void user_click_the_Questionnaries_button_and_It_navigates_to_Questionnaire_Builder_page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getQuestions());
	}

	@When("user take The screenshot of the page and click the Main Menu button")
	public void user_take_The_screenshot_of_the_page_and_click_the_Main_Menu_button() throws Throwable {
		jsScrollDownElement(pom.getpageRolebased().getScroll6());
		screenshot("screenshot10.png");

	}

	@Then("user Click the logout button and it Navigates to login Page")
	public void user_Click_the_logout_button_and_it_Navigates_to_login_Page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getLogout());
		waitForSeconds(5);
	}

	@Given("user Launch The Url")
	public void user_Launch_The_Url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("user Enter the valid Email Address in User field")
	public void user_Enter_the_valid_Email_Address_in_User_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "sathya+kk1@mindwaveventures.com");

	}

	@When("user enter the valid Password in password field")
	public void user_enter_the_valid_Password_in_password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
	}

	@Then("user click the Login Button And it Navigates to dashboard")
	public void user_click_the_Login_Button_And_it_Navigates_to_dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);

	}

	@Given("user click the Team caseload button and It navigates to Caseload overview page")
	public void user_click_the_Team_caseload_button_and_It_navigates_to_Caseload_overview_page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getTeam());
		Sleep(3000);
	}

	@When("user Take the screenshot Of the page and click the menu and dashboard button")
	public void user_Take_the_screenshot_Of_the_page_and_click_the_menu_and_dashboard_button() throws Throwable {
		jsScrollDownElement(pom.getpageRolebased().getScroll1());
		screenshot("screenshot5.png");

		clickOnElement(pom.getpageRolebased().getMenu1());
		clickOnElement(pom.getpageRolebased().getAdmindash());
		Sleep(3000);
	}

	@When("user click the patient overview button and It Navigates to Patient Overview page and repeat The flow")
	public void user_click_the_patient_overview_button_and_It_Navigates_to_Patient_Overview_page_and_repeat_The_flow()
			throws Throwable {
		clickOnElement(pom.getpageRolebased().getPatientover());
		Sleep(3000);
		jsScrollDownElement(pom.getpageRolebased().getScroll2());
		screenshot("screenshot6.png");
	}

	@When("user click the best interest decision button and it Navigates to BID page and Repeat the flow")
	public void user_click_the_best_interest_decision_button_and_it_Navigates_to_BID_page_and_Repeat_the_flow()
			throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu1());
		clickOnElement(pom.getpageRolebased().getAdmindash());
		Sleep(3000);

		clickOnElement(pom.getpageRolebased().getInterest());
		jsScrollDownElement(pom.getpageRolebased().getScroll3());
		screenshot("screenshot7.png");
	}

	@When("user click the my clinical caseload button and it navigates to clinical caseload page and repeat The Flow")
	public void user_click_the_my_clinical_caseload_button_and_it_navigates_to_clinical_caseload_page_and_repeat_The_Flow()
			throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu1());
		clickOnElement(pom.getpageRolebased().getAdmindash());
		Sleep(3000);

		clickOnElement(pom.getpageRolebased().getCaseload2());
		jsScrollDownElement(pom.getpageRolebased().getScroll4());
		screenshot("screenshot8.png");
	}

	@When("user Click the Saved Resources button and It navigates to Resources page")
	public void user_Click_the_Saved_Resources_button_and_It_navigates_to_Resources_page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu1());
		clickOnElement(pom.getpageRolebased().getAdmindash());
		Sleep(3000);

		clickOnElement(pom.getpageRolebased().getSavedresources());
		jsScrollDownElement(pom.getpageRolebased().getScroll5());
		screenshot("screenshot9.png");
	}

	@Then("user Click the Logout button and It navigates to Login Page")
	public void user_Click_the_Logout_button_and_It_navigates_to_Login_Page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getLogout());
		waitForSeconds(5);

	}

	@Given("user launch The Url")
	public void user_launch_The_Url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the valid Email Address in user field")
	public void user_enter_the_valid_Email_Address_in_user_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "satieshkumar+cl@mindwaveventures.com");

	}

	@When("user Enter the valid Password in Password field")
	public void user_Enter_the_valid_Password_in_Password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
	}

	@Then("user Click the Login Button And it navigates to dashboard")
	public void user_Click_the_Login_Button_And_it_navigates_to_dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);

	}

	@Given("user click the clinician caseload button and it navigates to Caseload page")
	public void user_click_the_clinician_caseload_button_and_it_navigates_to_Caseload_page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getCaselaod());
	}

	@When("user take the Screenshot of the Page and Click the Menu and Dashboard Button")
	public void user_take_the_Screenshot_of_the_Page_and_Click_the_Menu_and_Dashboard_Button() throws Throwable {
		jsScrollDownElement(pom.getpageRolebased().getJscroll1());
		screenshot("screenshot.png");
	}

	@When("user click the Message button and it naviagtes to Message page and Repeate the Flow")
	public void user_click_the_Message_button_and_it_naviagtes_to_Message_page_and_Repeate_the_Flow() throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu());
		clickOnElement(pom.getpageRolebased().getDashboard());
		Sleep(6000);

		clickOnElement(pom.getpageRolebased().getMsg());
		jsScrollDownElement(pom.getpageRolebased().getJscroll3());
		screenshot("screenshot2.png");
		Sleep(3000);
	}

	@When("user Click the saved resources button and it navigates to resources page")
	public void user_Click_the_saved_resources_button_and_it_navigates_to_resources_page() throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu());
		clickOnElement(pom.getpageRolebased().getDashboard());
		Sleep(3000);

		clickOnElement(pom.getpageRolebased().getResources());
		jsScrollDownElement(pom.getpageRolebased().getJscroll4());
		screenshot("screenshot3.png");
		Sleep(4000);
	}

	@Then("user click the Clinician circle button and It Navigates to Circle page and repeat the flow")
	public void user_click_the_Clinician_circle_button_and_It_Navigates_to_Circle_page_and_repeat_the_flow()
			throws Throwable {
		clickOnElement(pom.getpageRolebased().getMenu());
		clickOnElement(pom.getpageRolebased().getDashboard());
		Sleep(3000);
		clickOnElement(pom.getpageRolebased().getCircle());
		jsScrollDownElement(pom.getpageRolebased().getJscroll2());
		Sleep(10000);
		screenshot("screenshot1.png");
		Sleep(3000);

	}

}
