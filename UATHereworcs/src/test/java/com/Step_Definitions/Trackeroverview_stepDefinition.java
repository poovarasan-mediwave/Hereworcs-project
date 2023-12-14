package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import com.Base_Class.Base_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Trackeroverview_stepDefinition extends Base_Class {

	public static WebDriver driver = Runner_Class.driver;

	public static Class_Objects pom = new Class_Objects(driver);
	
	
	
	
	
	 @Given("^User click cookies accept buton for Trackeroverview$")
	 public void user_click_cookies_accept_buton_for_Trackeroverview() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	 }

	 @When("^Click on login button for daily steps for Trackeroverview$")
	 public void click_on_login_button_for_daily_steps_for_Trackeroverview() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	 }

	 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field for Trackeroverview$")
	 public void user_enters_valid_in_Emailaddres_field_for_Trackeroverview(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
			Sleep(3000);
	 }

	 @Then("^User enters \"([^\"]*)\" in Passowrd for Trackeroverview$")
	 public void user_enters_in_Passowrd_for_Trackeroverview(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
			Sleep(3000);
	 }

	 @Then("^Click on Submit button for Trackeroverview$")
	 public void click_on_Submit_button_for_Trackeroverview() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
			Sleep(28000);
	 }

	 @Then("^clicking over Bento menu for Trackeroverview$")
	 public void clicking_over_Bento_menu_for_Trackeroverview() throws Throwable {
		 //clickOnElement(pom.getbentomenu().getbentoicon());
		 WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
			
	 }

	 @Then("^clicking over Tracker module for Trackeroverview$")
	 public void clicking_over_Tracker_module_for_Trackeroverview() throws Throwable {
		 clickOnElement(pom.getbentomenu().getTrackermodule());
			Sleep(3000);
	 }

	 @Then("^click on Tracker overview link$")
	 public void click_on_Tracker_overview_link() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().trackeroverviewmodule());
			Sleep(3000);
	 }

	 @Then("^click on Add Trackers plus symbol$")
	 public void click_on_Add_Trackers_plus_symbol() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().addTrackersbtn());
			Sleep(3000);
	 }

	 @Then("^click on sleep Tracker average box$")
	 public void click_on_sleep_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().sleepaverage());
			Sleep(3000);
	 }

	 @Then("^click on Mood Tracker average box$")
	 public void click_on_Mood_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().moodaverage());
			Sleep(3000);
	 }

	 @Then("^click on Diet Tracker average box$")
	 public void click_on_Diet_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().dietaverage());
		 Sleep(3000);
	 }

	 @Then("^click on Exercise Tracker average box$")
	 public void click_on_Exercise_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().exerciseaverage());
		 Sleep(3000);
	 }

	 @Then("^click on Medication Tracker average box$")
	 public void click_on_Medication_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().medicationaverage());
		 Sleep(3000);
	 }

	 @Then("^click on Fluid Tracker average box$")
	 public void click_on_Fluid_Tracker_average_box() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().fluidaverage());
		 Sleep(5000);
	 }

    @Then("click on your tracker left arrow cursor for Trackeroverview")
	public void click_on_your_tracker_left_arrow_cursor_for_trackeroverview()throws Throwable  {
    	 ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
    	//clickOnElement(pom.gettrackeroverview().yourtrackerleftarrow());
    	 WebElement element= driver.findElement(By.xpath("(//div[@class='d-flexes m-l-12 mw-text-primary'])[1]/button[1][@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary btn-empty']"));
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("arguments[0].click();", element);
		 Sleep(3000);
	}
	@Then("click on week button for Trackeroverview")
	public void click_on_week_button_for_trackeroverview()throws Throwable  {
		 clickOnElement(pom.gettrackeroverview().yourtrackerweekbutton());
		 Sleep(3000);
	}
	
	@Then("click on month button for Trackeroverview")
	public void click_on_month_button_for_trackeroverview()throws Throwable  {
		 clickOnElement(pom.gettrackeroverview().yourtrackermonthbutton());
		 Sleep(3000);
	}
	
	@Then("click on year button for Trackeroverview")
	public void click_on_year_button_for_trackeroverview()throws Throwable  {
		 clickOnElement(pom.gettrackeroverview().yourtrackeryearbutton());
		 Sleep(5000);
	}
	
	@Then("click on your tracker right arrow cursor for Trackeroverview")
	public void click_on_your_tracker_right_arrow_cursor_for_trackeroverview()throws Throwable  {
		//clickOnElement(pom.gettrackeroverview().yourtrackerrightarrow());
		WebElement element= driver.findElement(By.xpath("(//div[@class='d-flexes m-l-12 mw-text-primary'])[1]/button[2][@class='fa fa-2x fa-angle-right cursor-pointer date-list-arrow mw-text-primary btn-empty']"));
   	 JavascriptExecutor js = (JavascriptExecutor)driver;
   	 js.executeScript("arguments[0].click();", element);
		 Sleep(3000);
	}


	 @Then("^click on trackeroverview graph$")
	 public void click_on_trackeroverview_graph() throws Throwable {
		 clickOnElement(pom.gettrackeroverview().sleeptrackeroverview());
			Sleep(2000);
			clickOnElement(pom.gettrackeroverview().moodtrackeroverview());
			Sleep(2000);
			clickOnElement(pom.gettrackeroverview().fluidtrackeroverview());
			Sleep(6000);
	    
	 }
	 
	 @Then("click on tracker_overview left arrow cursor for Trackeroverview")
	public void click_on_tracker_overview_left_arrow_cursor_for_trackeroverview()throws Throwable  {
		// clickOnElement(pom.gettrackeroverview().trackeroverviewleftarrow());
		 WebElement element= driver.findElement(By.xpath("(//div[@class='d-flexes m-l-12 mw-text-primary'])[2]/button[1][@class='fa fa-2x fa-angle-left cursor-pointer date-list-arrow mw-text-primary btn-empty']"));
	   	 JavascriptExecutor js = (JavascriptExecutor)driver;
	   	 js.executeScript("arguments[0].click();", element);
		 Sleep(3000);
	}
	@Then("click on Exercise,Diet,Medication graph for Trackeroverview")
	public void click_on_exercise_diet_medication_graph_for_trackeroverview()throws Throwable  {
		clickOnElement(pom.gettrackeroverview().exercisetrackeroverview());
		 Sleep(3000);
		 clickOnElement(pom.gettrackeroverview().diettrackeroverview());
		 Sleep(3000);
		 clickOnElement(pom.gettrackeroverview().medicationtrackeroverview());
		 Sleep(6000);
	}
	@Then("click on tracker_overview right arrow cursor for Trackeroverview")
	public void click_on_tracker_overview_right_arrow_cursor_for_trackeroverview()throws Throwable  {
		//clickOnElement(pom.gettrackeroverview().trackeroverviewrightarrow());
		 WebElement element= driver.findElement(By.xpath("(//div[@class='d-flexes m-l-12 mw-text-primary'])[2]/button[2][@class='fa fa-2x fa-angle-right cursor-pointer date-list-arrow mw-text-primary btn-empty']"));
	   	 JavascriptExecutor js = (JavascriptExecutor)driver;
	   	 js.executeScript("arguments[0].click();", element);
		 Sleep(3000);
	}

   

}
