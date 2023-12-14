package com.Step_Definitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;

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

public class Super_Def extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);

	@Given("user launch the url")
	public void user_launch_the_url() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("user enter the email address in text box")
	public void user_enter_the_email_address_in_text_box() throws Throwable {
		Inputvalues(pom.getpageSuperadmin().getEmail(), "superadmin1@mindwaveventures.com");

	}

	@When("user enter the password in text box")
	public void user_enter_the_password_in_text_box() throws Throwable {
		Inputvalues(pom.getpageSuperadmin().getPassword(), "Test@123");

	}

	@When("user Click the Accept cookies Button")
	public void user_Click_the_Accept_cookies_Button() throws Throwable {
		clickOnElement(pom.getpageSuperadmin().getAccept());

	}

	@Then("user click the login Button and it naviagtes to home page")
	public void user_click_the_login_Button_and_it_naviagtes_to_home_page() throws Throwable {
		clickOnElement(pom.getpageSuperadmin().getButton());
		Sleep(3000);

	}

	@Given("user click the Questionnaire button and it navigates to questionnaire page")
	public void user_click_the_Questionnaire_button_and_it_navigates_to_questionnaire_page() throws Throwable {
		clickOnElement(pom.getpageQuestionnaire().getQuestions());
		Sleep(3000);
	}

	@When("user click the create new button and It Navigates to New Questionnaire page")
	public void user_click_the_create_new_button_and_It_Navigates_to_New_Questionnaire_page() throws Throwable {
		clickOnElement(pom.getpageQuestionnaire().getPlus());
		Sleep(3000);
	}

	@When("user click the Title button and title Text box shows up")
	public void user_click_the_Title_button_and_title_Text_box_shows_up() throws Throwable {
		clickOnElement(pom.getpageQuestionnaire().getTitle());

	}

	@When("user Enter the questionnaire title in text box")
	public void user_Enter_the_questionnaire_title_in_text_box() throws Throwable {
		Inputvalues(pom.getpageQuestionnaire().getQuetitle(), "Health Info1");
		Sleep(3000);

	}

	@When("user Click the Welcome Button and Welcome text Box Shows Up")
	public void user_Click_the_Welcome_Button_and_Welcome_text_Box_Shows_Up() throws Throwable {
		clickOnElement(pom.getpageQuestionnaire().getWelcomeinfo());

	}

	@When("user Enter the welcome message in the text box")
	public void user_Enter_the_welcome_message_in_the_text_box() throws Throwable {
		Inputvalues(pom.getpageQuestionnaire().getQuewelcome(), "How was your health today?");
		Sleep(3000);
	}

	@When("user click the Sections button and Title and description shows")
	public void user_click_the_Sections_button_and_Title_and_description_shows() throws Throwable {
		clickOnElement(pom.getpageQuestionnaire().getSections());

	}

	@When("user Enter the valid title in section title box")
	public void user_Enter_the_valid_title_in_section_title_box() throws Throwable {
		Inputvalues(pom.getpageQuestionnaire().getSectitle(), "Physical Health");

	}

	@When("user enter the Valid description in Section Description Box")
	public void user_enter_the_Valid_description_in_Section_Description_Box() throws Throwable {
		Inputvalues(pom.getpageQuestionnaire().getSecdescription(), "Testing");

	}

	@Given("user Click the Question button and it Shows add questions button")
	public void user_Click_the_Question_button_and_it_Shows_add_questions_button() throws Throwable {
		clickOnElement(pom.getpageType().getQuehead());
		Sleep(3000);
	}

	@When("user click the Add question button and question types are pop up")
	public void user_click_the_Add_question_button_and_question_types_are_pop_up() throws Throwable {
		clickOnElement(pom.getpageType().getAddque());
		Sleep(3000);
	}

	@When("user Click the Free text Button and short questions and assign text box occured")
	public void user_Click_the_Free_text_Button_and_short_questions_and_assign_text_box_occured() throws Throwable {
		clickOnElement(pom.getpageType().getFreetext());
	}

	@When("user enter the texts in question text box")
	public void user_enter_the_texts_in_question_text_box() throws Throwable {
		Inputvalues(pom.getpageType().getFreeque(), "Neckpains");

	}

	@When("user select the Assign to section")
	public void user_select_the_Assign_to_section() throws Throwable {
		clickOnElement(pom.getpageType().getClickfree());
		Sleep(3000);
		clickOnElement(pom.getpageType().getAssign());

	}

	@When("user Click the Toggle and makes Mandatory")
	public void user_Click_the_Toggle_and_makes_Mandatory() throws Throwable {
		clickOnElement(pom.getpageType().getToggle());
		Sleep(3000);

	}

	@When("user click the add Question Button and click the Imagery question type")
	public void user_click_the_add_Question_Button_and_click_the_Imagery_question_type() throws Throwable {
		clickOnElement(pom.getpageType().getAddque());
		Sleep(3000);
		clickOnElement(pom.getpageType().getImage());
	}

	@When("user Enter the question related to the Image")
	public void user_Enter_the_question_related_to_the_Image() throws Throwable {
		Inputvalues(pom.getpageType().getImageque(), "Whats in the picture?");
	}

	@When("user enter the text to go with the image and select the assign to Section")
	public void user_enter_the_text_to_go_with_the_image_and_select_the_assign_to_Section() throws Throwable {
		Inputvalues(pom.getpageType().getImagetext(), "Patient report");
		Sleep(3000);
		clickOnElement(pom.getpageType().getClickimage());
		clickOnElement(pom.getpageType().getAssign2());
	}

	@When("user Click the Add Question button and Click the dropdown type")
	public void user_Click_the_Add_Question_button_and_Click_the_dropdown_type() throws Throwable {
		clickOnElement(pom.getpageType().getAddque());
		Sleep(2000);
		clickOnElement(pom.getpageType().getDropdown());

	}

	@When("user enter the Question requires Dropdown Response")
	public void user_enter_the_Question_requires_Dropdown_Response() throws Throwable {
		Inputvalues(pom.getpageType().getDropque(), "Medicines patient takes in");

	}

	@When("user Enter the reponse options and add another response and Select the Assign to section")
	public void user_Enter_the_reponse_options_and_add_another_response_and_Select_the_Assign_to_section()
			throws Throwable {
		Inputvalues(pom.getpageType().getResponse1(), "DOLO650");
		Sleep(3000);
		clickOnElement(pom.getpageType().getAddresponse());
		Inputvalues(pom.getpageType().getResponse2(), "DOLO250");
		Sleep(3000);
		clickOnElement(pom.getpageType().getClickdrop());
		clickOnElement(pom.getpageType().getAssign3());
		Sleep(3000);

	}

	@When("user click the add question and click the Multiple choice type")
	public void user_click_the_add_question_and_click_the_Multiple_choice_type() throws Throwable {
		clickOnElement(pom.getpageType().getAddque());
		Sleep(3000);
		clickOnElement(pom.getpageType().getMultiplechoice());
	}

	@When("user Enter the valid response question for multichoice")
	public void user_Enter_the_valid_response_question_for_multichoice() throws Throwable {
		Inputvalues(pom.getpageType().getMultique(), "How many days having the pain?");
		Sleep(3000);

	}

	@When("user enter The Response option and add another response and click the sections")
	public void user_enter_The_Response_option_and_add_another_response_and_click_the_sections() throws Throwable {

		Inputvalues(pom.getpageType().getMutltirespons1(), "9days");
		Sleep(3000);
		clickOnElement(pom.getpageType().getAddresponse1());
		Sleep(3000);
		Inputvalues(pom.getpageType().getMultirespone2(), "12days");
		clickOnElement(pom.getpageType().getClickmulti());
		clickOnElement(pom.getpageType().getAssign4());
		Sleep(3000);

	}

	@When("user click the add a question button and Click the likert button")
	public void user_click_the_add_a_question_button_and_Click_the_likert_button() throws Throwable {
		clickOnElement(pom.getpageType().getAddque());
		Sleep(3000);
		clickOnElement(pom.getpageType().getLikert());

	}

	@When("user Enter the Question and Requirement of the scale")
	public void user_Enter_the_Question_and_Requirement_of_the_scale() throws Throwable {
		Inputvalues(pom.getpageType().getLikertque(), "How much the pain in neck?");
		Sleep(3000);
		Inputvalues(pom.getpageType().getScale(), "10");

	}

	@When("user enter The Specify range and description for the range")
	public void user_enter_The_Specify_range_and_description_for_the_range() throws Throwable {
		clickOnElement(pom.getpageType().getFrom());
		clickOnElement(pom.getpageType().getHigh());
		Sleep(3000);
		clickOnElement(pom.getpageType().getTo());
		clickOnElement(pom.getpageType().getLow());
		Sleep(3000);
		Inputvalues(pom.getpageType().getRange(), "Mildpain");
		Sleep(3000);
	}

	@Then("user Enter the low and high end of the scale and select The assign to Section")
	public void user_Enter_the_low_and_high_end_of_the_scale_and_select_The_assign_to_Section() throws Throwable {
		Inputvalues(pom.getpageType().getLowend(), "four to eight");
		Inputvalues(pom.getpageType().getHighend(), "eight to four");
		Sleep(3000);
		clickOnElement(pom.getpageType().getClicklikert());
		clickOnElement(pom.getpageType().getAssign5());

	}

	@Given("user click the closing info button and Click the Add Closing section button")
	public void user_click_the_closing_info_button_and_Click_the_Add_Closing_section_button() throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getClose());
		Sleep(3000);
		clickOnElement(pom.getpageCloseinfo().getAddclose());
	}

	@When("user Click the Privacy notice button and Enter the privacy notes in the text box")
	public void user_Click_the_Privacy_notice_button_and_Enter_the_privacy_notes_in_the_text_box() throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getPrivacy());
		Inputvalues(pom.getpageCloseinfo().getPrivacynotes(), "Read it carefully");
		Sleep(3000);
	}

	@When("user click the Disclaimer Button and enter the Terms and Condition in the Text Box")
	public void user_click_the_Disclaimer_Button_and_enter_the_Terms_and_Condition_in_the_Text_Box() throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getAddclose());
		Sleep(3000);
		clickOnElement(pom.getpageCloseinfo().getDisclaimer());
		Inputvalues(pom.getpageCloseinfo().getDisclaimernotes(), "All terms and condition are applied");

	}

	@When("user Click the What's Next button and Enter the Info")
	public void user_Click_the_What_s_Next_button_and_Enter_the_Info() throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getAddclose());
		Sleep(3000);
		clickOnElement(pom.getpageCloseinfo().getNextinfo());
		Inputvalues(pom.getpageCloseinfo().getInfonotes(), "What's next");
		Sleep(3000);

	}

	@When("user click the Final statement Button and enter the statement and click the category radio Button")
	public void user_click_the_Final_statement_Button_and_enter_the_statement_and_click_the_category_radio_Button()
			throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getAddclose());
		Sleep(3000);
		clickOnElement(pom.getpageCloseinfo().getStatement());
		Inputvalues(pom.getpageCloseinfo().getStatementnotes(), "Final Condition");
		Sleep(3000);
		clickOnElement(pom.getpageCloseinfo().getRadiobtn());

	}

	@Then("user Click the Preview button and It navigates to Preview Page")
	public void user_Click_the_Preview_button_and_It_navigates_to_Preview_Page() throws Throwable {
		clickOnElement(pom.getpageCloseinfo().getPreview());
		Sleep(3000);
		jsScrollDownElement(pom.getpageHealth().getJsscroll());
		screenshot("snap5.png");

	}

	@Given("user click the Edit Button in preview page and it Navigates to Questionnaire edit Page")
	public void user_click_the_Edit_Button_in_preview_page_and_it_Navigates_to_Questionnaire_edit_Page()
			throws Throwable {
		clickOnElement(pom.getpageHealth().getEdit());
		Sleep(3000);

	}

	@When("user Click the Upload Image button and upload an image")
	public void user_Click_the_Upload_Image_button_and_upload_an_image() throws Throwable {
		WebElement findElement = driver.findElement(By.xpath("//label[@class='button-center']"));
		findElement.click();

		Sleep(4000);
		StringSelection str = new StringSelection("C:\\Users\\Mediwave\\Desktop\\msg5.PNG");
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

	}

	@When("user Click the Publish Button and Navigates to Questionnaire page and select Logout button")
	public void user_Click_the_Publish_Button_and_Navigates_to_Questionnaire_page_and_select_Logout_button()
			throws Throwable {
		// clickOnElement(pom.getpageHealth().getyesbtn());
		// Sleep(7000);
		// clickOnElement(pom.getpageHealth().getYesmulti1());
		// Sleep(3000);
		// clickOnElement(pom.getpageHealth().getSec1());
		// Sleep(8000);
		// clickOnElement(pom.getpageHealth().getYesmulti2());
		// Sleep(3000);
		// clickOnElement(pom.getpageHealth().getSec2());
		Sleep(6000);
		clickOnElement(pom.getpageHealth().getPublish());

		Sleep(10000);
		actionsClick(pom.getpageHealth().getLogout());
		Sleep(10000);
	}

	@Given("User Click the URL link")
	public void user_Click_the_URL_link() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");

	}

	@When("User Enter the email Address in text box")
	public void user_Enter_the_email_Address_in_text_box() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "satieshkumar+cl@mindwaveventures.com");

	}

	@When("User Enter the password in Text box")
	public void user_Enter_the_password_in_Text_box() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");

	}

	@When("User Click the login Button and it naviagtes to Home page")
	public void user_Click_the_login_Button_and_it_naviagtes_to_Home_page() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		Sleep(3000);

	}

	@When("user Click the Clinician menu button and Submenu Questionnaire button and It navigates to Questionnaire dashboard")
	public void user_Click_the_Clinician_menu_button_and_Submenu_Questionnaire_button_and_It_navigates_to_Questionnaire_dashboard()
			throws Throwable {
		clickOnElement(pom.getpageHealth().getClinicanmenu());
		Sleep(3000);
		clickOnElement(pom.getpageHealth().getClinicianque());
		screenshot("screenshot21.png");
	}

	@When("user Click the questionnaire button and Pop up shows up")
	public void user_Click_the_questionnaire_button_and_Pop_up_shows_up() throws Throwable {
		clickOnElement(pom.getpageHealth().getDots());
	}

	@Then("^user Click share and Select patient name and Share the Questionnaires$")
	public void user_Click_share_and_Select_patient_name_and_Share_the_Questionnaires() throws Throwable {
		Sleep(12000);
		clickOnElement(pom.getpageHealth().getShare());

		screenshot("screenshot22.png");
	}

}
