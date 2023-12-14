package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyDairy_StepDefinitions  extends Base_Class {

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);

	
	 @Given("User launch URL for my Dairy")
	 public void user_launch_url_for_my_dairy() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }


	 @When("User click login button for my Dairy")
	 public void user_click_login_button_for_my_dairy()throws Throwable  {
		 clickOnElement(pom.getlogin().getcookie());
	 }
	 @Then("User enters valid {string} in Emailaddres field for my Dairy")
	 public void user_enters_valid_in_emailaddres_field_for_my_dairy(String string)throws Throwable  {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }
	 @Then("User enters {string} in Passowrd for my Dairy")
	 public void user_enters_in_passowrd_for_my_dairy(String string) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
		 Sleep(3000);
	 }
	 @Then("Click on Submit button for my Dairy")
	 public void click_on_submit_button_for_my_dairy()throws Throwable  {
		 clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
			Sleep(40000);
	 }
	 
	 
	 @Then("click on My Dairy button on smartdashboard")
     public void click_on_my_dairy_button_on_smartdashboard()throws Throwable {
     clickOnElement(pom.getsmartDashboard().getmydiary_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(4000);
     }
	 
	 
	 @Then("click on Add entry buttton for validation")
	 public void click_on_add_entry_buttton_for_validation()throws Throwable {
		 clickOnElement(pom.getmydairy().getmydairy_addentry());
		 Sleep(5000);
	 }

	 @Then("User select on Date field for my Dairy")
	 public void user_select_on_date_field_for_my_dairy()throws Throwable  {
		 clickOnElement(pom.getmydairy().getmydairydatefield());
			Sleep(4000);
			
			
		Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year")));
			dairycalender.selectByVisibleText("2012");
			Sleep(4000);
			
		Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
			dairymonth.selectByVisibleText("Jan");
			Sleep(4000);
			
			driver.findElement(By.xpath("(//td/a[@class='ui-state-default'])[1] ")).click();
			Sleep(4000);
	 }
	 @Then("User add on Dairy entry for my Dairy")
	 public void user_add_on_dairy_entry_for_my_dairy()throws Throwable  {
		 Inputvalues(pom.getmydairy().getmydairy_dairyentry(),"dairy of january one 2012");
			Sleep(4000);
			
		 
	 }
	 @Then("User click on Add Entry button for my Dairy")
	 public void user_click_on_add_entry_button_for_my_dairy() throws Throwable {
		 clickOnElement(pom.getmydairy().getmydairy_addentry());
		 Sleep(4000);
	 }
	 
	 @Then("User click on on Take me to diary button inside popup")
     public void user_click_on_on_take_me_to_diary_button_inside_popup()throws Throwable  {
		//******Take me to diary page*************///
		 //clickOnElement(pom.getmydairy().getmydairy_takemetodairy());
		 Sleep(4000);
		 driver.findElement(By.xpath("(//div[@class='mw-pop mw-bg-white-card mw-border-dark-gray p-md-5 p-3']/button)[7]/*[name()='svg']")).click();
		 Sleep(4000);
}

	 

}
