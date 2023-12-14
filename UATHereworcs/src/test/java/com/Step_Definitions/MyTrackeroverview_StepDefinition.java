package com.Step_Definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.When;


public class MyTrackeroverview_StepDefinition  extends Base_Class{

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
	 
	 @Given("User launch URL for My Trackeroverview")
	 public void user_launch_url_for_my_trackeroverview()throws Throwable  {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }


	 @When("User click login button forMy Trackeroverview")
	 public void user_click_login_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getlogin().getcookie());
	 }
	 @Then("User enters valid {string} in Emailaddres field forMy Trackeroverview")
	 public void user_enters_valid_in_emailaddres_field_for_my_trackeroverview(String string)throws Throwable  {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }
	 @Then("User enters {string} in Passowrd for My Trackeroverview")
	 public void user_enters_in_passowrd_for_my_trackeroverview(String string)throws Throwable  {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
		 Sleep(3000);
	 }
	 @Then("Click on Submit button for My Trackeroverview")
	 public void click_on_submit_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
			Sleep(40000);
	 }
	 @Then("click on My Trackeroverview button on My Trackeroverview")
	 public void click_on_my_trackeroverview_button_on_my_trackeroverview()throws Throwable  {
			clickOnElement(pom.getsmartDashboard().getmytrackeroverview_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
	 }
	 @Then("User select on sleep button for My Trackeroverview")
	 public void user_select_on_sleep_button_for_my_trackeroverview()throws Throwable  {
		 
		 ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_sleep());
			Sleep(4000);
	 }
	 @Then("User select on mood button for My Trackeroverview")
	 public void user_select_on_mood_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_mood());
			Sleep(4000);
	 }
	 @Then("User select on fluid button for My Trackeroverview .")
	 public void user_select_on_fluid_button_for_my_trackeroverview() throws Throwable {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_fluid());
			Sleep(4000);
	 }
	 @Then("User click on previous button for my Trackeroverview")
	 public void user_click_on_previous_button_for_my_trackeroverview() throws Throwable {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_previous());
			Sleep(4000);
	 }
	 @Then("User click on Month button for my Trackeroverview")
	 public void user_click_on_month_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_month());
			Sleep(4000);
	 }
	 @Then("User click on Week button for my Trackeroverview")
	 public void user_click_on_week_button_for_my_trackeroverview() throws Throwable {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_week());
			Sleep(4000);
	 }
	 @Then("User click on Next button for my Trackeroverview")
	 public void user_click_on_next_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_next());
			Sleep(4000);
	 }
	 @Then("User click on year button for my Trackeroverview")
	 public void user_click_on_year_button_for_my_trackeroverview()throws Throwable  {
		 clickOnElement(pom.getmyTrackeroverview().getmytrackeroverview_year());
			Sleep(4000);
	 }

	
}
