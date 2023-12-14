//package com.Step_Definitions;

/*import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Config_Reader.File_Reader;
//import com.My_Health.Runner_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;
/*import com.Singleton.Singleton_Design_Pattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
*/
/*import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/*
public class About_Me extends Base_Class {

	//public static WebDriver driver = Runner_Class.driver;
	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);
	//public static Singleton_Design_Pattern pom = new Singleton_Design_Pattern(driver);

	@Given("^user launch The Browser$")
	public void user_launch_The_Browser() throws Throwable {
		String url = File_Reader.getInstanceFR().getInstanceCR().getUrl();
		geturl(url);
	}

	@When("^user click the accept cookies$")
	public void user_click_the_accept_cookies() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
	}

	@When("^enter username Field$")
	public void enter_username_Field() throws Throwable {
		String username = File_Reader.getInstanceFR().getInstanceCR().getUsername();
		Inputvalues(pom.getpageLogin().getUser(), username);
	}

	@When("^user Enter password$")
	public void user_Enter_password() throws Throwable {
		String password = File_Reader.getInstanceFR().getInstanceCR().getPassword();
		Inputvalues(pom.getpageLogin().getPassword(), password);
	}

	@Then("^click sigin button and Page Navigates to Home Page$")
	public void click_sigin_button_and_Page_Navigates_to_Home_Page() throws Throwable {
		clickOnElement(pom.getpageLogin().getSignin());
	}

	@When("^user click the menu icon$")
	public void user_click_the_menu_icon() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceHome_pg().getMenu());
	}

	@Then("^user click the My Health and page navigates to my health page$")
	public void user_click_the_My_Health_and_page_navigates_to_my_health_page() throws Throwable {
		clickOnElement(pom.getInstanceHome_pg().getHealth());
		Sleep(3000);
	}

	@When("^user click the about me$")
	public void user_click_the_about_me() throws Throwable {
		clickOnElement(pom.getInstancePer_Det().getDown_Arrow());
	}

	@Then("^user click view about me button$")
	public void user_click_view_about_me_button() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstancePer_Det().getAbout());
	}

	@When("^user click down arrow$")
	public void user_click_down_arrow() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstancePer_Det().getPersonal_Arrow());
	}

	@When("^user click the Edit button and page navigates to edit page$")
	public void user_click_the_Edit_button_and_page_navigates_to_edit_page() throws Throwable {
		waitForSeconds(10);
		clickOnElement(pom.getInstancePer_Det().getEdit());
	}

	@When("^user edit the Gender$")
	public void user_edit_the_Gender() throws Throwable {
		Sleep(4000);
		dropdownSelectByVisibleText(pom.getInstancePer_Det().getGender_Dropdown(), "Male");
	}

	@When("^user edit the Nick Name$")
	public void user_edit_the_Nick_Name() throws Throwable {
		clear(pom.getInstancePer_Det().getNick_Name());
		String nick = File_Reader.getInstanceFR().getInstancePersonal().getNick();
		Inputvalues(pom.getInstancePer_Det().getNick_Name(), nick);
		Sleep(3000);
	}

	@When("^user save the data$")
	public void user_save_the_data() throws Throwable {
		waitForSeconds(10);
		clickOnElement(pom.getInstancePer_Det().getSave());
	}

	@When("^user click Ok button in popup$")
	public void user_click_Ok_button_in_popup() throws Throwable {
		clickOnElement(pom.getInstancePer_Det().getOk());
	}

	@Then("^user click personal details and took screenshot$")
	public void user_click_personal_details_and_took_screenshot() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstancePer_Det().getPersonal_Arrow());
		jsScrollDownElement(pom.getInstancePer_Det().getPersonal_Arrow());
		Sleep(9000);
		screenshot("Personal.png");
	}

	@When("^user click the down arrow button$")
	public void user_click_the_down_arrow_button() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceImpt().getDown_Arow());

	}

	@When("^click the edit button in this page and navigate to next page$")
	public void click_the_edit_button_in_this_page_and_navigate_to_next_page() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getInstanceImpt().getEdit());
	}

	@When("^user enter the name$")
	public void user_enter_the_name() throws Throwable {
		Sleep(5000);
		clear(pom.getInstanceImpt().getName());
		String name = File_Reader.getInstanceFR().getInstanceImportant().getName();
		Inputvalues(pom.getInstanceImpt().getName(), name);
	}

	@When("^user enter the relationship$")
	public void user_enter_the_relationship() throws Throwable {
		clear(pom.getInstanceImpt().getRelationship());
		String relation = File_Reader.getInstanceFR().getInstanceImportant().getRelationship();
		Inputvalues(pom.getInstanceImpt().getEmail(), relation);
	}

	@When("^user enter the email$")
	public void user_enter_the_email() throws Throwable {
		clear(pom.getInstanceImpt().getEmail());
		String getemail = File_Reader.getInstanceFR().getInstanceImportant().getemail();
		Inputvalues(pom.getInstanceImpt().getEmail(), getemail);
	}

	@When("^user click the save button$")
	public void user_click_the_save_button() throws Throwable {
		clickOnElement(pom.getInstanceImpt().getSave());
	}

	@Then("^user click ok in pop and take screenshot$")
	public void user_click_ok_in_pop_and_take_screenshot() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceImpt().getOk());
		Sleep(4000);
		clickOnElement(pom.getInstanceImpt().getDown_Arow());
		jsScrollDownElement(pom.getInstanceImpt().getDown_Arow());
		Sleep(9000);
		screenshot("Important.png");
	}

	@When("^user click the arrow button in this field$")
	public void user_click_the_arrow_button_in_this_field() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceBest().getBest_Support_Me());
	}

	@When("^user click the edit button$")
	public void user_click_the_edit_button() throws Throwable {
		clickOnElement(pom.getInstanceBest().getEdit());
	}

	@When("^user enter text in emergency$")
	public void user_enter_text_in_emergency() throws Throwable {
		Sleep(4000);
		clear(pom.getInstanceBest().getEmergency());
		String getemergency = File_Reader.getInstanceFR().getInstanceSupport().getemergency();
		Inputvalues(pom.getInstanceBest().getEmergency(), getemergency);
	}

	@When("^user enter the text in Hobbies$")
	public void user_enter_the_text_in_Hobbies() throws Throwable {
		Sleep(4000);
		clear(pom.getInstanceBest().getHobbies());
		String gethobbbies = File_Reader.getInstanceFR().getInstanceSupport().gethobbbies();
		Inputvalues(pom.getInstanceBest().getHobbies(), gethobbbies);
	}

	@When("^user enter the text in exercise$")
	public void user_enter_the_text_in_exercise() throws Throwable {
		clear(pom.getInstanceBest().getExercise());
		String exercise = File_Reader.getInstanceFR().getInstanceSupport().getExercise();
		Inputvalues(pom.getInstanceBest().getExercise(), exercise);
	}

	@When("^user enter text in caring$")
	public void user_enter_text_in_caring() throws Throwable {
		clear(pom.getInstanceBest().getCaring());
		String getcaring = File_Reader.getInstanceFR().getInstanceSupport().getcaring();
		Inputvalues(pom.getInstanceBest().getCaring(), getcaring);
	}

	@When("^user enter the text in unwell$")
	public void user_enter_the_text_in_unwell() throws Throwable {
		clear(pom.getInstanceBest().getUnwell());
		String getunwell = File_Reader.getInstanceFR().getInstanceSupport().getunwell();
		Inputvalues(pom.getInstanceBest().getUnwell(), getunwell);
	}

	@When("^save data$")
	public void save_data() throws Throwable {
		clickOnElement(pom.getInstanceBest().getSave());
	}

	@Then("^click the popup ok button$")
	public void click_the_popup_ok_button() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceBest().getOk());
		Sleep(4000);
		clickOnElement(pom.getInstanceBest().getBest_Support_Me());
		jsScrollDownElement(pom.getInstanceBest().getBest_Support_Me());
		Sleep(9000);
		screenshot("BestSupport.png");
	}

	@When("^click down arrow button in background$")
	public void click_down_arrow_button_in_background() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceBackground().getArrow());

	}

	@When("^user click edit and navigates to editing page$")
	public void user_click_edit_and_navigates_to_editing_page() throws Throwable {
		clickOnElement(pom.getInstanceBackground().getEdit());
		Sleep(2000);
	}

	@When("^user enter text in lived in$")
	public void user_enter_text_in_lived_in() throws Throwable {
		Sleep(4000);
		clear(pom.getInstanceBackground().getLived_In());
		String lived_in = File_Reader.getInstanceFR().getInstanceBackground().getLived_in();
		Inputvalues(pom.getInstanceBackground().getLived_In(), lived_in);
	}

	@When("^user enter the Nationality$")
	public void user_enter_the_Nationality() throws Throwable {
		Sleep(4000);
		clear(pom.getInstanceBackground().getNationality());
		String nationality = File_Reader.getInstanceFR().getInstanceBackground().getNationality();
		Inputvalues(pom.getInstanceBackground().getNationality(), nationality);
	}

	@When("^user enter the strengts filed$")
	public void user_enter_the_strengts_filed() throws Throwable {
		clear(pom.getInstanceBackground().getStrengts());
		String strengts = File_Reader.getInstanceFR().getInstanceBackground().getStrengts();
		Inputvalues(pom.getInstanceBackground().getStrengts(), strengts);
	}

	@When("^user enter text in Achievements$")
	public void user_enter_text_in_Achievements() throws Throwable {
		clear(pom.getInstanceBackground().getAchievements());
		String achievements = File_Reader.getInstanceFR().getInstanceBackground().getAchievements();
		Inputvalues(pom.getInstanceBackground().getAchievements(), achievements);
	}

	@When("^user save this data$")
	public void user_save_this_data() throws Throwable {
		clickOnElement(pom.getInstanceBackground().getSave());
		Sleep(3000);
		clickOnElement(pom.getInstanceBackground().getOk());
	}

	@Then("^user click ok and take a screenshot$")
	public void user_click_ok_and_take_a_screenshot() throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceBackground().getArrow());
		jsScrollDownElement(pom.getInstanceBackground().getArrow());
		Sleep(9000);
		screenshot("Background.png");
	}

	@When("^user click arrow in immediate needs$")
	public void user_click_arrow_in_immediate_needs() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getInstanceImmediate().getArrow());
	}

	@When("^user click edit$")
	public void user_click_edit() throws Throwable {
		clickOnElement(pom.getInstanceImmediate().getEdit());
		Sleep(2000);
	}

	@When("^user select checkbox(\\d+)$")
	public void user_select_checkbox(int arg1) throws Throwable {
		Sleep(4000);
		clickOnElement(pom.getInstanceImmediate().getCheckbox1());
		clickOnElement(pom.getInstanceImmediate().getCheckbox2());
	}

	@When("^user enter How to communicate with me$")
	public void user_enter_How_to_communicate_with_me() throws Throwable {
		clear(pom.getInstanceImmediate().getCommunicate());
		String comm = File_Reader.getInstanceFR().getInstanceImmediate().getcommunicate();
		Inputvalues(pom.getInstanceImmediate().getLanguage(), comm);
	}

	@When("^user enter My preferred language is$")
	public void user_enter_My_preferred_language_is() throws Throwable {
		clear(pom.getInstanceImmediate().getLanguage());
		String getlanguage = File_Reader.getInstanceFR().getInstanceImmediate().getlanguage();
		Inputvalues(pom.getInstanceImmediate().getLanguage(), getlanguage);
	}

	@When("^user enter How I feel on a typical day:$")
	public void user_enter_How_I_feel_on_a_typical_day() throws Throwable {
		clear(pom.getInstanceImmediate().getTypical_Day());
		String typical_Day = File_Reader.getInstanceFR().getInstanceImmediate().getTypical_Day();
		Inputvalues(pom.getInstanceImmediate().getTypical_Day(), typical_Day);
	}

	@When("^click save$")
	public void click_save() throws Throwable {
		clickOnElement(pom.getInstanceImmediate().getSave());
	}

	@Then("^click ok and took Screenshot$")
	public void click_ok_and_took_Screenshot() throws Throwable {
		clickOnElement(pom.getInstanceImmediate().getOk());
		Sleep(3000);
		clickOnElement(pom.getInstanceImmediate().getArrow());
		jsScrollDownElement(pom.getInstanceImmediate().getArrow());
		Sleep(9000);
		screenshot("immediate.png");
	}

}
*/
