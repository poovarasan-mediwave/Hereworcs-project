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


public class Resource1_Def extends Base_Class {
/*
	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch the URl")
	public void user_launch_the_URl() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the valid email address In user field")
	public void user_enter_the_valid_email_address_In_user_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj280990+lesner@gmail.com");
	}

	@When("user Enter the valid password In Password field")
	public void user_Enter_the_valid_password_In_Password_field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@");
		Sleep(3000);
	}

	@When("user click the accept In Cookies button")
	public void user_click_the_accept_In_Cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("user Click the login Button And it navigates To dashboard")
	public void user_Click_the_login_Button_And_it_navigates_To_dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(4000);
	}

	@When("user Click the Covid button and it shows Covid News")
	public void user_Click_the_Covid_button_and_it_shows_Covid_News() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getCovid());

	}

	@When("user Select the Visit page and Send button for thr Covid page and Repeats the flow")
	public void user_Select_the_Visit_page_and_Send_button_for_thr_Covid_page_and_Repeats_the_flow() throws Throwable {

		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getCvisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
        screenshot("picture6.png");
        
		clickOnElement(pom.getpageResources().getSsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
		screenshot("picture7.png");
	}

	@When("user click the Tips and Self help  and search button and Enter the topic Name")
	public void user_click_the_Tips_and_Self_help_and_search_button_and_Enter_the_topic_Name() throws Throwable {
		Sleep(16000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getTips());

		Sleep(3000);
		Inputvalues(pom.getpageResources().getTsearch(), "Think positive");
	}

	@When("user Click the Visit Page and Send Button for the Tips and self help page and Repeated the Flow")
	public void user_Click_the_Visit_Page_and_Send_Button_for_the_Tips_and_self_help_page_and_Repeated_the_Flow()
			throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getTvisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
     screenshot("picture8.png");
		clickOnElement(pom.getpageResources().getTsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);

	}

	@When("user Click the Prostate Cancer button and Select the Favourite Button in the Page")
	public void user_Click_the_Prostate_Cancer_button_and_Select_the_Favourite_Button_in_the_Page() throws Throwable {
		Sleep(16000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getProcancer());
		Sleep(3000);
		clickOnElement(pom.getpageResources().getPfav());
		clickOnElement(pom.getpageResource().getEclose());
	}

	@When("user Click the visit page and send button in the Prostate cancer page and the flow repeated")
	public void user_Click_the_visit_page_and_send_button_in_the_Prostate_cancer_page_and_the_flow_repeated()
			throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getPvisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
       screenshot("picture9.png");
       
		clickOnElement(pom.getpageResources().getPsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);

	}

	@When("user Click the Colorectal cancer button and select the visit button in the page")
	public void user_Click_the_Colorectal_cancer_button_and_select_the_visit_button_in_the_page() throws Throwable {
		Sleep(14000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getColo());

		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getColovisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
      screenshot("picture10.png");
	}

	@When("user click the Send button in colo cancer and It naviagtes to message page and repeat the flow")
	public void user_click_the_Send_button_in_colo_cancer_and_It_naviagtes_to_message_page_and_repeat_the_flow()
			throws Throwable {
		clickOnElement(pom.getpageResources().getColosend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);

	}

	@When("user click the Useful Link button and Select the favourite button")
	public void user_click_the_Useful_Link_button_and_Select_the_favourite_button() throws Throwable {
		Sleep(16000);
		clickOnElement(pom.getpageTracker().getMenu());
		Sleep(6000);
		clickOnElement(pom.getpageResource().getResources());
		clickOnElement(pom.getpageResources().getUsefullink());
		Sleep(2000);
		clickOnElement(pom.getpageResources().getUfav());
		clickOnElement(pom.getpageResource().getEclose());

	}

	@Then("user Click the link and send button in useful link and repeated the flow")
	public void user_Click_the_link_and_send_button_in_useful_link_and_repeated_the_flow() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageResources().getUvisit());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
		screenshot("picture11.png");
		clickOnElement(pom.getpageResources().getUsend());
		waitForSeconds(5);
		clickOnElement(pom.getpageResource().getMsgpatient());
		clickOnElement(pom.getpageResource().getMsgsend());
		Sleep(3000);
	}
*/
	
}
