package com.Step_Definitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class clinicaldirectory_stepDefinition  extends Base_Class {

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);

	 @Given("^User launch the Url for clinical directory$")
	 public void user_launch_the_Url_for_clinical_directory() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("^User click the accept cookies Button clinical directory$")
	 public void user_click_the_accept_cookies_Button_clinical_directory() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
		
	 }

	 @Then("^User enter the Email address in text box clinical directory$")
	 public void user_enter_the_Email_address_in_text_box_clinical_directory() throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj+break@mindwaveventures.com");
			Sleep(3000);
	 }

	 @Then("^User enter the Password in text box for clinical directory$")
	 public void user_enter_the_Password_in_text_box_for_clinical_directory() throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
			Sleep(3000);
	 }

	 @Then("^User click the Login Button and it naviagtes to home page for clinical directory$")
	 public void user_click_the_Login_Button_and_it_naviagtes_to_home_page_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
			Sleep(30000);
	 }

	 @Given("^User click on bentomenu for clinical directory$")
	 public void user_click_on_bentomenu_for_clinical_directory() throws Throwable {
		 //clickOnElement(pom.getclinicaldirectory().getclinicalbentomenu());
			//WebElement ele = driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]/div"));
			WebElement ele = driver.findElement(By.xpath("//div[@class='footer-main-view res-div position-relative']/div[3]/button/div"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
	 }

	 @When("^User select on clinical circle for clinical directory$")
	 public void user_select_on_clinical_circle_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinical_circle());
			Sleep(3000);
	 }

	 @Then("^User click on clinical directory section$")
	 public void user_click_on_clinical_directory_section() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinical_directory());
			Sleep(3000);
	 }

	 @Then("^User select on clinical colleagues searchbox for Enter username$")
	 public void user_select_on_clinical_colleagues_searchbox_for_Enter_username() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getclinicaldirectorybox(),"king");
			Sleep(3000);
	 }
	// @Then("^User click on clinical colleagues searchicon$")
	/* public void user_click_on_clinical_colleagues_searchicon() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinicaldirectorysearchicon());
			Sleep(3000);
	 }*/

	 @Then("^User select under clinical collegues$")
	 public void user_select_under_clinical_collegues() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinicalcolleaguename());
			Sleep(3000);
	 }

	 @Then("^User clicking message this person button for clinical directory$")
	 public void user_clicking_message_this_person_button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getmessagethispersonbtn());
			Sleep(3000);
	 }

	 @Then("^User Enter text on subject for clinical directory$")
	 public void user_Enter_text_on_subject_for_clinical_directory() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getsubjecthere(),"lorep isum");
			Sleep(3000);
	 }

	 @Then("^User Enter message in create message field for clinical directory$")
	 public void user_Enter_message_in_create_message_field_for_clinical_directory() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getcreatemessage()," it to make a type specimen book. It has survived not only five "
		 		+ "centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ");
			Sleep(3000);
	 }

	 @Then("^user click camera icon in the page for clinical directory$")
	 public void user_click_camera_icon_in_the_page_for_clinical_directory() throws Throwable {
			clickOnElement(pom.getcliniciandash().getcameraicon());
			Sleep(6000);
	 }

	 @Then("^click take photo button for clinical directory$")
	 public void click_take_photo_button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().gettakephoto());
			Sleep(4000);
	 }

	 @Then("^click on upload photo button for clinical directory$")
	 public void click_on_upload_photo_button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getuploadphoto());
			Sleep(3000);
	 }

	 @Then("^user Click the Addfile Button for clinical directory$")
	 public void user_Click_the_Addfile_Button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getAttachmentfile());
			Sleep(3000);
			Sleep(4000);
			StringSelection str = new StringSelection("C:\\Users\\mindwave\\Downloads\\blackpanther.PNG");
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
			Sleep(3000);
	 }

	 @Then("^user Click the Send Button and The message send to the User for clinical directory$")
	 public void user_Click_the_Send_Button_and_The_message_send_to_the_User_for_clinical_directory() throws Throwable {
			clickOnElement(pom.getcliniciandash().getSendmessagebtn());
			Sleep(3000);
	 }

}
