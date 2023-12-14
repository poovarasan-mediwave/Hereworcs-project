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

public class Resources3_Def extends Base_Class {
/*
	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch The URL")
	public void user_launch_The_URL() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the valid EMAIL address in User field")
	public void user_enter_the_valid_EMAIL_address_in_User_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");

	}

	@When("user Enter The valid PASSWORD in Password field")
	public void user_Enter_The_valid_PASSWORD_in_Password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
		Sleep(3000);
	}

	@When("User click The accept In Cookies Button")
	public void user_click_The_accept_In_Cookies_Button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("User click the login Button and it navigates To Dashboard")
	public void user_click_the_login_Button_and_it_navigates_To_Dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
	}

	@Given("user Click the Apps button and Select more Options in the page")
	public void user_Click_the_Apps_button_and_Select_more_Options_in_the_page() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getResources());
		Sleep(3000);
		for (int i = 0; i < 7; i++) {
			clickOnElement(pom.getpageResources2().getClick());

		}
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getApps());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getInfo());
	}

	@When("user Click the Download button and It navigates to another page and Click Cancel button")
	public void user_Click_the_Download_button_and_It_navigates_to_another_page_and_Click_Cancel_button()
			throws Throwable {
		screenshot("pic2.png");
		String title = driver.getTitle();
		System.out.println(title);
		Sleep(8000);
		clickOnElement(pom.getpageResources2().getDownload());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
		screenshot("picture13.png");
		Sleep(6000);
		clickOnElement(pom.getpageResources2().getCancel());
		Sleep(3000);
	}

	@When("user Click forms button and DOB and Click the Check box")
	public void user_Click_forms_button_and_DOB_and_Click_the_Check_box() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(3000);
		clickOnElement(pom.getpageResource().getResources());
		Sleep(3000);
		for (int i = 0; i < 7; i++) {
			clickOnElement(pom.getpageResources2().getClick());

		}
		Sleep(8000);
		clickOnElement(pom.getpageResources2().getForm());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getSelect());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getTitle());
		clickOnElement(pom.getpageResources2().getYears());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getYear());
		clickOnElement(pom.getpageResources2().getMonth());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getDay());

		clickOnElement(pom.getpageResources2().getCheckbox());

	}

	@When("user Click Practical concern button and Select the Rate scale")
	public void user_Click_Practical_concern_button_and_Select_the_Rate_scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getPracticle());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getYellow());
	}

	@When("user Click Family concerns button and Select the rate Scale")
	public void user_Click_Family_concerns_button_and_Select_the_rate_Scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getParent());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getRed());
	}

	@When("user Click Emotional Concern Button and select the Rate Scale")
	public void user_Click_Emotional_Concern_Button_and_select_the_Rate_Scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getEmotional());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getGreen());
	}

	@When("user Click Spritual concern button and Select the range scale")
	public void user_Click_Spritual_concern_button_and_Select_the_range_scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getSpritual());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getYellow1());
	}

	@When("user click Physical concern button and Select the Range Scale")
	public void user_click_Physical_concern_button_and_Select_the_Range_Scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getPhysical());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getRed1());
	}

	@When("user click lifestyle need button and select The range scale")
	public void user_click_lifestyle_need_button_and_select_The_range_scale() throws Throwable {
		clickOnElement(pom.getpageResources2().getLifestyle());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getGreen1());
	}

	@When("user click the comments button and Save the data form")
	public void user_click_the_comments_button_and_Save_the_data_form() throws Throwable {
		Inputvalues(pom.getpageResources2().getComments(), "Test");
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getSave());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getsubmit());
		screenshot("picture2.png");
		Sleep(10000);

	}

	@When("user Click the Stories button and select the Favourite button")
	public void user_Click_the_Stories_button_and_select_the_Favourite_button() throws Throwable {
		clickOnElement(pom.getpageResources2().getStories());
		Sleep(3000);
		clickOnElement(pom.getpageResources2().getFav());
		Sleep(4000);
		clickOnElement(pom.getpageResources2().getClose());
	}

	@Then("user Click the Send button and Navigates to message page and Send message to the person")
	public void user_Click_the_Send_button_and_Navigates_to_message_page_and_Send_message_to_the_person()
			throws Throwable {
		clickOnElement(pom.getpageResources2().getSend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
		screenshot("Picture.png");
	}
*/
}
