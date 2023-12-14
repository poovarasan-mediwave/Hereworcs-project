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

public class Urgent_Def extends Base_Class{
	
	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);
	
	
	@Given("user launch The application")
	public void user_launch_The_application() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	    
	}

	@When("user Enter the valid Email Address in user Field")
	public void user_Enter_the_valid_Email_Address_in_user_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getEmail(), "siva241094+p@gmail.com");
	   
	}

	@When("user Enter the valid Password in password Field")
	public void user_Enter_the_valid_Password_in_password_Field() throws Throwable {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@123");
	   
	}

	@When("user click the Accept in cookies button")
	public void user_click_the_Accept_in_cookies_button() throws Throwable {
		clickOnElement(pom.getpageLogin().getCookies());
		Sleep(3000);
	    
	}

	@Then("user click the Login Button And it navigates to Dashboard")
	public void user_click_the_Login_Button_And_it_navigates_to_Dashboard() throws Throwable {
		clickOnElement(pom.getpageLogin().getLogin());
		waitForSeconds(5);
	    
	}

	@Given("user click the main menu and shows the submenu")
	public void user_click_the_main_menu_and_shows_the_submenu() throws Throwable {
		clickOnElement(pom.getpageUrgenthelp().getMenu());
	   
	}

	@When("user click the UrgentHelp button and It naviagtes to urgenthelp page")
	public void user_click_the_UrgentHelp_button_and_It_naviagtes_to_urgenthelp_page() throws Throwable {
		clickOnElement(pom.getpageUrgenthelp().getHelp());
		Sleep(3000);
	    
	}

	@When("user Click the Link fot helpline and it Navigates to another window")
	public void user_Click_the_Link_fot_helpline_and_it_Navigates_to_another_window() throws Throwable {
	    
		
		
		String title = driver.getTitle();
		System.out.println(title);
		clickOnElement(pom.getpageUrgenthelp().getHelpline());
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle1 : windowHandles) {

			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.switchTo().window(windowHandle1).getTitle().equalsIgnoreCase(title);
				break;
			}
		}
	}
	

	
	@Then("user Take the screenshot of the page")
	public void user_Take_the_screenshot_of_the_page() throws Throwable {
		screenshot("snap11.png");
		Sleep(3000);
	    
	}
	
	

}
