package com.Step_Definitions;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
//import com.Base_Class.base_class;
//import com.Configuration_Reader.ConfigReader;
//import com.Configuration_Reader.FileReaderManager;
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


public class Circle_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch the UrL for circle")
	public void user_launch_the_UrL_for_circle() throws Throwable {
		//String geturl = FileReaderManager.getInstanceFRM().getInstanceCRM().geturl();
		//geturl(geturl);
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("user enter the Valid email address in user field for Circle")
	public void user_enter_the_Valid_email_address_in_user_field_for_Circle() throws Throwable {
		//String getusername = FileReaderManager.getInstanceFRM().getInstanceCRM().getusername();
		//Inputvalues(pom.getpageLogin().getEmail(), getusername);
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj+jack@mindwaveventures.com");
	}

	@When("user Enter the Valid Password in Password field For circle")
	public void user_Enter_the_Valid_Password_in_Password_field_For_circle() throws Throwable {
		//String getpassword = FileReaderManager.getInstanceFRM().getInstanceCRM().getpassword();
		//Inputvalues(pom.getpageLogin().getPassword(), getpassword);
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@");

	}

	@When("user click the accept in cookies button for Circle")
	public void user_click_the_accept_in_cookies_button_for_Circle() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
		Sleep(3000);

	}

	@Then("user click the login Button And it navigates to dashboard of Circle flow")
	public void user_click_the_login_Button_And_it_navigates_to_dashboard_of_Circle_flow() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		waitForSeconds(10);
	}

	@Given("user click the notification and request pending pop ups")
	public void user_click_the_notification_and_request_pending_pop_ups() throws Throwable {
		clickOnElement(pom.getpageMycircle().getNoticifaction());

	}

	@When("user click the view now button it navigates to my circle invite page")
	public void user_click_the_view_now_button_it_navigates_to_my_circle_invite_page() throws Throwable {
		clickOnElement(pom.getpageMycircle().getViewnow());

	}

	@When("user click the decline and Yes button success message pop ups")
	public void user_click_the_decline_and_Yes_button_success_message_pop_ups() throws Throwable {
		clickOnElement(pom.getpageMycircle().getDecline());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getYes());
		Sleep(4000);
	}

	@Then("user click logout button and it navigates to login page")
	public void user_click_logout_button_and_it_navigates_to_login_page() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogout());
		Sleep(5000);
	}

	@Given("user enter the valid Email id in User textbox")
	public void user_enter_the_valid_Email_id_in_User_textbox() throws Throwable {
		//String getusername1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getusername1();
		//Inputvalues(pom.getpageLogin().getEmail(), getusername1);
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj+jack@mindwaveventures.com");
	}

	@When("^user enter the Valid Password in password Textbox$")
	public void user_enter_the_Valid_Password_in_password_Textbox() throws Throwable {
		//String getpassword1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getpassword1();
		//Inputvalues(pom.getpageLogin().getPassword(), getpassword1);
		Inputvalues(pom.getpageLogin().getPassword(), "Admin1@");
	}

	@When("^user Click the login button and It Navigates to main dashboard$")
	public void user_Click_the_login_button_and_It_Navigates_to_main_dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());

	}

	@When("^user Click the Main menu and My circle button and it navigates to my circle page$")
	public void user_Click_the_Main_menu_and_My_circle_button_and_it_navigates_to_my_circle_page() throws Throwable {
		clickOnElement(pom.getpageMycircle().getMenu());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getCircle());
	}

	@When("^user click the add new person button and it shows relationship popups$")
	public void user_click_the_add_new_person_button_and_it_shows_relationship_popups() throws Throwable {
		clickOnElement(pom.getpageMycircle().getMycircle());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getAddnew());
		Sleep(3000);
	}

	@When("^user click the family and friends button and it shows details$")
	public void user_click_the_family_and_friends_button_and_it_shows_details() throws Throwable {
		clickOnElement(pom.getpageMycircle().getChoose());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getFamily());

	}

	//satieshkumar+cl@mindwaveventures.com
	//Admin@123
	@When("^user Enter the First and last name and Email Address in the details$")
	public void user_Enter_the_First_and_last_name_and_Email_Address_in_the_details() throws Throwable {
		//String firstname = FileReaderManager.getInstanceFRM().getInstanceCRM().getFirstname();
		//Inputvalues(pom.getpageMycircle().getFname(), firstname);
		Inputvalues(pom.getpageMycircle().getFname(), "satieshk");
		Sleep(3000);
		//String lastname = FileReaderManager.getInstanceFRM().getInstanceCRM().getLastname();
		//Inputvalues(pom.getpageMycircle().getLname(), lastname);
		Inputvalues(pom.getpageMycircle().getFname(), "kumar");
		Sleep(3000);
		//String email = FileReaderManager.getInstanceFRM().getInstanceCRM().getEmail();
		//Inputvalues(pom.getpageMycircle().getEmail(), email);
		Inputvalues(pom.getpageMycircle().getEmail(), "satieshkumar+cl@mindwaveventures.com");
		Sleep(3000);
	}

	@When("^user Click the person can see buttons in the Details$")
	public void user_Click_the_person_can_see_buttons_in_the_Details() throws Throwable {
		clickOnElement(pom.getpageMycircle().getMyhealth());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getTracker());

	}

	@Then("^user click the invite button and success message shows up$")
	public void user_click_the_invite_button_and_success_message_shows_up() throws Throwable {
		clickOnElement(pom.getpageMycircle().getInvite());
		screenshot("shot1.png");
		Sleep(6000);
		clickOnElement(pom.getpageMycircle().getExit());
	}

	@Given("user click the Relationship button and it shows pop ups")
	public void user_click_the_Relationship_button_and_it_shows_pop_ups() throws Throwable {
		clickOnElement(pom.getpageMycircle().getChoose());
		Sleep(3000);

	}

	@When("user select the clinician button and it shows details")
	public void user_select_the_clinician_button_and_it_shows_details() throws Throwable {
		clickOnElement(pom.getpageMycircle().getClinician());

	}

	@When("user enter the Hospital and first and last name in the details")
	public void user_enter_the_Hospital_and_first_and_last_name_in_the_details() throws Throwable {
		//String hospital = FileReaderManager.getInstanceFRM().getInstanceCRM().getHospital();
		//Inputvalues(pom.getpageMycircle().getHospital(), hospital);
		Inputvalues(pom.getpageMycircle().getHospital(), "Government of Pondhicherry");
		Sleep(3000);
		//String firstname1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getFirstname1();
		//Inputvalues(pom.getpageMycircle().getFname(), firstname1);
		Inputvalues(pom.getpageMycircle().getFname(), "Ajithmediwave");
		Sleep(3000);
		//String lastname1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getLastname1();
		//Inputvalues(pom.getpageMycircle().getLname(), lastname1);
		Inputvalues(pom.getpageMycircle().getLname(), "kumars");
		Sleep(3000);

	}

	@When("user enter the Speciality and email address in the Details")
	public void user_enter_the_Speciality_and_email_address_in_the_Details() throws Throwable {
		//String speciality = FileReaderManager.getInstanceFRM().getInstanceCRM().getSpeciality();
		//Inputvalues(pom.getpageMycircle().getSpeciality(), speciality);
		Inputvalues(pom.getpageMycircle().getSpeciality(), "multi speciality hospital");
		Sleep(3000);
		//String email1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getEmail1();
		//Inputvalues(pom.getpageMycircle().getEmail(), email1);
		Inputvalues(pom.getpageMycircle().getEmail(), "ajithkumarmw@mindwaveventures.com");
		Sleep(3000);
	}

	@When("user Click the Person Can See Button in the details")
	public void user_Click_the_Person_Can_See_Button_in_the_details() throws Throwable {
		clickOnElement(pom.getpageMycircle().getMyhealth());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getTracker());
		Sleep(3000);

	}

	@Then("user click the Invite button and Success message pops up")
	public void user_click_the_Invite_button_and_Success_message_pops_up() throws Throwable {
		clickOnElement(pom.getpageMycircle().getInvite());
		Sleep(3000);
		screenshot("shot2.png");
		clickOnElement(pom.getpageMycircle().getExit());
		Sleep(3000);
		clickOnElement(pom.getpageLogin().getLogout());
	}

	@Given("user enter the valid email address in user Text Box")
	public void user_enter_the_valid_email_address_in_user_Text_Box() throws Throwable {
		//String email1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getEmail1();
		//Inputvalues(pom.getpageLogin().getEmail(), email1);
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj+jack@mindwaveventures.com");
		Sleep(3000);
	}

	@When("user Enter the valid Password in Password Text box")
	public void user_Enter_the_valid_Password_in_Password_Text_box() throws Throwable {
		//String getpassword1 = FileReaderManager.getInstanceFRM().getInstanceCRM().getpassword1();
		//Inputvalues(pom.getpageLogin().getPassword(), getpassword1);
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@");

	}

	@When("user click the login Button And it navigates to dashboard of clinician flow")
	public void user_click_the_login_Button_And_it_navigates_to_dashboard_of_clinician_flow() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
	}

	@When("user click the Notification and Request pending shows up")
	public void user_click_the_Notification_and_Request_pending_shows_up() throws Throwable {
		clickOnElement(pom.getpageMycircle().getNoticifaction());
		Sleep(3000);

	}

	@When("user click the View Now Button it Navigates to My circle Invite page")
	public void user_click_the_View_Now_Button_it_Navigates_to_My_circle_Invite_page() throws Throwable {
		clickOnElement(pom.getpageMycircle().getViewnow());

	}

	@When("user click the Decline button and Yes Button success messages shows up")
	public void user_click_the_Decline_button_and_Yes_Button_success_messages_shows_up() throws Throwable {
		clickOnElement(pom.getpageMycircle().getDecline());
		Sleep(3000);
		clickOnElement(pom.getpageMycircle().getYes());
	}

	@Then("user click the Logout button and It navigates to Login page")
	public void user_click_the_Logout_button_and_It_navigates_to_Login_page() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getpageLogin().getLogout());
	}

}
