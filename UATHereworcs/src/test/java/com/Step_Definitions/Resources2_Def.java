package com.Step_Definitions;

import java.util.Set;

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

public class Resources2_Def extends Base_Class {
/*
	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch the URL")
	public void user_launch_the_URL() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the valid email address in User field")
	public void user_enter_the_valid_email_address_in_User_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");

	}

	@When("user Enter The valid password in Password field")
	public void user_Enter_The_valid_password_in_Password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
		Sleep(3000);
	}

	@When("user click The accept in Cookies button")
	public void user_click_The_accept_in_Cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("user Click the login Button And it navigates To Dashboard")
	public void user_Click_the_login_Button_And_it_navigates_To_Dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
	}

	@Given("user Click the End of life support button and search button")
	public void user_Click_the_End_of_life_support_button_and_search_button() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getEnd());
		Sleep(3000);
	}

	@When("user Enter the name in search button and click favourite")
	public void user_Enter_the_name_in_search_button_and_click_favourite() throws Throwable {
		Inputvalues(pom.getpageResources().getEndsearch(), "Care homes");
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getFavs());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getSaveclose());
	}

	@When("user Click the send button and it Navigates to message page and repeated the Flow")
	public void user_Click_the_send_button_and_it_Navigates_to_message_page_and_repeated_the_Flow() throws Throwable {
		clickOnElement(pom.getpageResources().getEndsend());
		waitForSeconds(10);
		clickOnElement(pom.getpageResource().getMsgpatient());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getMsgsend());
	}

	@When("user Click the Health A to Z button and shows the page")
	public void user_Click_the_Health_A_to_Z_button_and_shows_the_page() throws Throwable {
		Sleep(15000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		Sleep(3000);
		for (int i = 0; i < 5; i++) {
			clickOnElement(pom.getpageResources2().getClick());

		}
		Sleep(6000);
		clickOnElement(pom.getpageResources().getHealth());

	}

	@When("user Click the Search button and Enter the valid name and it shows up")
	public void user_Click_the_Search_button_and_Enter_the_valid_name_and_it_shows_up() throws Throwable {
		frame_Into(pom.getpageResources2().getFrames());
		Sleep(3000);
		Inputvalues(pom.getpageResources2().getSearch(), "Abscess");
		Sleep(3000);
		frame_Out();

		jsScrollDownElement(pom.getpageResources().getHsearch());
		screenshot("pic1.snap");

	}

	@When("user Click the Bereavement button and select favourite in the page")
	public void user_Click_the_Bereavement_button_and_select_favourite_in_the_page() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getpageResources().getBereavement());
		clickOnElement(pom.getpageResources().getBfav());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getEclose());

	}

	@Then("user Click the Send button and It navigates to Message page and Repeats the flow")
	public void user_Click_the_Send_button_and_It_navigates_to_Message_page_and_Repeats_the_flow() throws Throwable {
		clickOnElement(pom.getpageResources().getBsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		Sleep(15000);
		Inputvalues(pom.getpageMsg().getSubject(), "Test");
		Sleep(10000);
		Inputvalues(pom.getpageMsg().getCreatemsg(), "test");
		Sleep(10000);
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(10000);
	}

	@When("user Click the Social prescribing button and Shows in Page")
	public void user_Click_the_Social_prescribing_button_and_Shows_in_Page() throws Throwable {
		Sleep(16000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		Sleep(3000);
		for (int i = 0; i < 5; i++) {
			clickOnElement(pom.getpageResources2().getClick());

		}

		clickOnElement(pom.getpageResources().getSocial());
	}

	@Then("user Click the Links in social page and it naviagates to another window")
	public void user_Click_the_Links_in_social_page_and_it_naviagates_to_another_window() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getSlink());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
		screenshot("picture12.png");
	}
  */
}
