package com.Step_Definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
/*import com.Singleton.Singleton_Design_Pattern;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	//public static Singleton_Design_Pattern pom = new Singleton_Design_Pattern(driver);
	 public static Class_Objects pom = new Class_Objects(driver);

	
	@Given("^user Launch the browser$")
	public void user_Launch_the_browser() throws Throwable {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk");
		clickOnElement(pom.getInstanceSgn_up().getSign_btn());
	}

	@When("^user enter \"([^\"]*)\" first name$")
	public void user_enter_first_name(String firstname) throws Throwable {
		Inputvalues((WebElement) pom.getInstanceSgn_up().getFirst_Name(), firstname);
	}

	@When("^User enter \"([^\"]*)\" last name$")
	public void user_enter_last_name(String lastname) throws Throwable {
		
	Inputvalues(pom.getInstanceSgn_up().getLast_Name(), lastname);	
	}

	@When("^user enter \"([^\"]*)\" Email$")
	public void user_enter_Email(String Email) throws Throwable {
		Inputvalues(pom.getInstanceSgn_up().getEmail(), "makeswaran2610+h1@gmail.com");
	}

	@When("^user enter \"([^\"]*)\" Password$")
	public void user_enter_Password(String Password) throws Throwable {
		Inputvalues(pom.getInstanceSgn_up().getPass_Create(), "Admin@123");
	}

	@When("^user ReEnter \"([^\"]*)\"  password$")
	public void user_ReEnter_password(String pass) throws Throwable {
		Inputvalues(pom.getInstanceSgn_up().getPass_ReEnter(), "Admin@123");
		clickOnElement(pom.getInstanceSgn_up().getCookies());
	}

	@When("^user click the checkbox$")
	public void user_click_the_checkbox() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getInstanceSgn_up().getRemember());
		Sleep(3000);
		clickOnElement(pom.getInstanceSgn_up().getTerms());
	}

	@Then("^user click the signup button$")
	public void user_click_the_signup_button() throws Throwable {
		Sleep(3000);
		clickOnElement(pom.getInstanceSgn_up().getSignup());
		Sleep(3000);
		screenshot("Created.png");
	}	
}
