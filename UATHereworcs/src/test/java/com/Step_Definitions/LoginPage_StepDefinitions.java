package com.Step_Definitions;


import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
//import com.Singleton.Singleton_Design_Pattern;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefinitions extends Base_Class{
	
	public static WebDriver driver = Runner_Class.driver;

	//public static Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
	public static Class_Objects pom = new Class_Objects(driver);

	@Given("User need to launch the browser")
	public void user_need_to_launch_the_browser() throws InterruptedException {
	    geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	    Thread.sleep(4000);
	}

	@When("User enters email address in {string} field")
	public void user_enters_email_address_in_field(String string) throws InterruptedException {
	    Inputvalues(pom.getpageLogin().getEmail(), string);
	    Thread.sleep(4000);
	}

	@When("user enters passwoed in {string} field")
	public void user_enters_passwoed_in_field(String string) throws InterruptedException {
	    Inputvalues(pom.getpageLogin().getPassword(), string);
	    Thread.sleep(4000);
	}
	
	@Then("user clicks to accept cookies")
	public void user_clicks_to_accept_cookies() throws InterruptedException {
		clickOnElement(pom.getpageLogin().getAcceptcookies());
		Thread.sleep(4000);
	}

	@Then("user click Login")
	public void user_click_login() throws InterruptedException {
	   clickOnElement(pom.getpageLogin().getLoginbutton());
	   Thread.sleep(4000);
	}

	
	
	@Then("User navigated to Home Page")
	public void user_navigated_to_home_page() throws InterruptedException {
	    System.out.println("Logged in Successful");
	    Thread.sleep(10000);
	}
}
