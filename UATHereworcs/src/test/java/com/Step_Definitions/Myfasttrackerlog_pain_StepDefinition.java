package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Myfasttrackerlog_pain_StepDefinition extends Base_Class{

	
	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);

	 @Given("User launch URL for my MyFasttrackerlogPain")
	 public void user_launch_url_for_my_my_fasttrackerlog_pain() throws Throwable{
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }


	 @When("User click login button for my MyFasttrackerlogPain")
	 public void user_click_login_button_for_my_my_fasttrackerlog_pain()throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	 }
	 @Then("User enters valid {string} in Emailaddres field for my MyFasttrackerlogPain")
	 public void user_enters_valid_in_emailaddres_field_for_my_my_fasttrackerlog_pain(String string) throws Throwable{
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }
	 @Then("User enters {string} in Passowrd for MyFasttrackerlogPain")
	 public void user_enters_in_passowrd_for_my_fasttrackerlog_pain(String string) throws Throwable{
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
		 Sleep(3000);
	 }
	 @Then("Click on Submit button for MyFasttrackerlogPain")
	 public void click_on_submit_button_for_my_fasttrackerlog_pain() throws Throwable{
		 clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
			Sleep(27000);
	 }
	 @Then("click my Fasttrackerlog button from Dashboard for MyFasttrackerlogPain")
	 public void click_my_fasttrackerlog_button_from_dashboard_for_my_fasttrackerlog_pain() throws Throwable{
		 Sleep(4000);
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dash-list-card search-font-size-reduce position-relative']/button/span/*[name()='svg'][@alt='My fast tracker log img']"))).click();

			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(9000);
			driver.navigate().refresh();
			Sleep(9000);
	 }
	 @Then("click on Log my pain for my MyFasttrackerlogPain")
	 public void click_on_log_my_pain_for_my_my_fasttrackerlog_pain() throws Throwable{
		 WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my pain']"))).click();
			Sleep(4000);
	 }
	 @Then("click on Add Entry of MyFasttrackerlogMood for pain validation")
	 public void click_on_add_entry_of_my_fasttrackerlog_mood_for_pain_validation() throws Throwable{
		 clickOnElement(pom.getMyfasttracker_pain().getlogmypainaddentry());
			Sleep(4000);
	 }
	 @Then("click on Date field for pain MyFasttrackerlogPain")
	 public void click_on_date_field_for_pain_my_fasttrackerlog_pain() throws Throwable{
		 clickOnElement(pom.getMyfasttracker_pain().getlogmypaindate());
			Sleep(4000);
			Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year")));
			dairycalender.selectByVisibleText("2012");
			
			Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
			dairymonth.selectByVisibleText("Jan");
			driver.findElement(By.xpath("(//td/a[@class='ui-state-default'])[1]")).click();
			Sleep(4000);
	 }
	 @Then("select on pain severity rating for MyFasttrackerlogMood")
	 public void select_on_pain_severity_rating_for_my_fasttrackerlog_mood() throws Throwable{
			Select painrating = new Select(driver.findElement(By.xpath("//select[@id='rate']")));
			painrating.selectByVisibleText("5");
			Sleep(4000);
			
	 }
	 @Then("enter on pain type for MyFasttrackerlogMood")
	 public void enter_on_pain_type_for_my_fasttrackerlog_mood() throws Throwable{
		 
		 Inputvalues(pom.getMyfasttracker_pain().getlogmypaintype(),"normal");
		 
			Sleep(4000);
			
	 }
	 @Then("enter on pain location for my MyFasttrackerlogMood")
	 public void enter_on_pain_location_for_my_my_fasttrackerlog_mood()throws Throwable {
		
		 Inputvalues(pom.getMyfasttracker_pain().getlogmypainlocation(),"leg");
			Sleep(4000);
	
	 }
	 @Then("click on Add Entry button for my pain Fasttrackerlog")
	 public void click_on_add_entry_button_for_my_pain_fasttrackerlog()throws Throwable {
		 clickOnElement(pom.getMyfasttracker_pain().getlogmypainaddentry());
			Sleep(4000);
			driver.findElement(By.xpath("(//div[@class='Remove-focus-to-close-pain-tracker']/button)[7]")).click();
			Sleep(4000);
			
			driver.findElement(By.xpath("//span[@id='Remove-focus-to-close-pain-tracker']/*[name()='svg']")).click();
			Sleep(4000);
	 }
}
