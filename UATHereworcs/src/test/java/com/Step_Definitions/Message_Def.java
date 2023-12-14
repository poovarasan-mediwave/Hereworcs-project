package com.Step_Definitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.Option;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
//import com.Base_Class.base_class;
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


public class Message_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch the Url")
	public void user_launch_the_Url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the Email address in text box")
	public void user_enter_the_Email_address_in_text_box() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094@gmail.com");

	}

	@When("user enter the Password in text box")
	public void user_enter_the_Password_in_text_box() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Test@123");

	}

	@When("user Click the accept cookies Button")
	public void user_Click_the_accept_cookies_Button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());

	}

	@Then("user click the Login Button and it naviagtes to home page")
	public void user_click_the_Login_Button_and_it_naviagtes_to_home_page() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);
		waitForSeconds(10);
	}

	@Given("user Click the Main menu and Shows the submenu")
	public void user_Click_the_Main_menu_and_Shows_the_submenu() throws Throwable {
		clickOnElement(pom.getpageTracker().getMenu());

	}

	@When("user Click the Message button and It naviagtes to My circle  Overview")
	public void user_Click_the_Message_button_and_It_naviagtes_to_My_circle_Overview() throws Throwable {
		clickOnElement(pom.getpageMsg().getMessage());
		Sleep(3000);
	}

	@When("user click the search button and Enter the Name")
	public void user_click_the_search_button_and_Enter_the_Name() throws Throwable {
		Inputvalues(pom.getpageMsg().getSearchname(), "Walter White");
		clickOnElement(pom.getpageMsg().getSearch());

	}

	@When("^user click the Clinician name and message the person button$")
	public void user_click_the_Clinician_name_and_message_the_person_button() throws Throwable {
		clickOnElement(pom.getpageMsg().getPatient());
		Sleep(3000);
		clickOnElement(pom.getpageMsg().getPerson());

	}

	@When("user Enter the subject in Text box")
	public void user_Enter_the_subject_in_Text_box() throws Throwable {
		Inputvalues(pom.getpageMsg().getSubject(), "Patient Report");

	}

	@When("user Enter the Particular message in Create Message Box")
	public void user_Enter_the_Particular_message_in_Create_Message_Box() throws Throwable {
		Inputvalues(pom.getpageMsg().getCreatemsg(), "Report of the patient");
		Sleep(3000);

	}

	@When("user click take Photo and upload button in the page")
	public void user_click_take_Photo_and_upload_button_in_the_page() throws Throwable {
		clickOnElement(pom.getpageMsg().getCamera());
		Sleep(3000);
		clickOnElement(pom.getpageMsg().getTakephoto());
		clickOnElement(pom.getpageMsg().getUploadphoto());
		Sleep(3000);
	}

	@When("user Click the Addfile Button")
	public void user_Click_the_Addfile_Button() throws Throwable {
		clickOnElement(pom.getpageMsg().getAddfile());
		Sleep(4000);
		StringSelection str = new StringSelection("C:\\Users\\Mediwave\\eclipse-workspace\\msg5.PNG");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb = new Robot();
		rb.delay(1000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		screenshot("snap7.png");

	}

	@When("user Click the Send Button and The message send to the Clinician")
	public void user_Click_the_Send_Button_and_The_message_send_to_the_Clinician() throws Throwable {
		Sleep(10000);
		clickOnElement(pom.getpageMsg().getMsgsend());

		screenshot("snap8.png");
	}

	@Then("user Click the my circle button and Takes screenshot")
	public void user_Click_the_my_circle_button_and_Takes_screenshot() throws Throwable {
		clickOnElement(pom.getpageMsg().getCircle());
		Sleep(3000);
		jsScrollDownElement(pom.getpageMsg().getScroll());
		screenshot("SNAP.png");
	}

}
