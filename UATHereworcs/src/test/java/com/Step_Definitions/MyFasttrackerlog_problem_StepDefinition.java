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

public class MyFasttrackerlog_problem_StepDefinition extends Base_Class {

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
	 
	 @Given("User launch URL for my MyFasttrackerlogProblem")
	 public void user_launch_url_for_my_my_fasttrackerlog_problem() throws Throwable  {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("User click login button for my MyFasttrackerlogProblem")
	 public void user_click_login_button_for_my_my_fasttrackerlog_problem()  throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	 }
	 @Then("User enters valid {string} in Emailaddres field for my MyFasttrackerlogProblem")
	 public void user_enters_valid_in_emailaddres_field_for_my_my_fasttrackerlog_problem(String string) throws Throwable  {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }
	 @Then("User enters {string} in Passowrd for my MyFasttrackerlogProblem")
	 public void user_enters_in_passowrd_for_my_my_fasttrackerlog_problem(String string) throws Throwable  {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
		 Sleep(3000);
	 }
	 @Then("Click on Submit button for my MyFasttrackerlogProblem")
	 public void click_on_submit_button_for_my_my_fasttrackerlog_problem()  throws Throwable {
	 clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
			Sleep(27000);
	 }
	 @Then("click my Fasttrackerlog button from Dashboard for my MyFasttrackerlogProblem")
	 public void click_my_fasttrackerlog_button_from_dashboard_for_my_my_fasttrackerlog_problem() throws Throwable  {
		 WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dash-list-card search-font-size-reduce position-relative']/button/span/*[name()='svg'][@alt='My fast tracker log img']"))).click();
         	Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(9000);
			driver.navigate().refresh();
			Sleep(9000);
	 }
	 @Then("click on Log my problem for my MyFasttrackerlogProblem")
	 public void click_on_log_my_problem_for_my_my_fasttrackerlog_problem()  throws Throwable {
		 WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span/span[text()='Log my problem']"))).click();
			Sleep(4000);
			
	 }
	 @Then("click on Add Entry of my MyFasttrackerlogProblem for problem validation")
	 public void click_on_add_entry_of_my_my_fasttrackerlog_problem_for_problem_validation() throws Throwable  {
		 clickOnElement(pom.getmyFasttrackerlogmood().getmymoodaddentry());
			Sleep(4000);
	 }
	 @Then("click on Date field for problem for MyFasttrackerlogProblem")
	 public void click_on_date_field_for_problem_for_my_fasttrackerlog_problem()  throws Throwable {
		 clickOnElement(pom.getMyfasttracker_problem().getlogmyproblemdate());
			Sleep(4000);
			
			 Select dairycalender = new Select(driver.findElement(By.className("ui-datepicker-year")));
			dairycalender.selectByVisibleText("2012");

			Select dairymonth = new Select(driver.findElement(By.className("ui-datepicker-month")));
			dairymonth.selectByVisibleText("Jan");
			driver.findElement(By.xpath("(//td/a[@class='ui-state-default'])[1] ")).click();
			Sleep(4000);

	 }
	 @Then("select on problem compare to last time for  MyFasttrackerlogProblem")
	 public void select_on_problem_compare_to_last_time_for_my_fasttrackerlog_problem() throws Throwable  {
		Select problemcompare = new Select(driver.findElement(By.xpath("//select[@id='problem-overviews-rate']")));
		problemcompare.selectByVisibleText("Better");
		Sleep(4000);

	 }
	 @Then("select on impact of problem for MyFasttrackerlogProblem")
	 public void select_on_impact_of_problem_for_my_fasttrackerlog_problem()  throws Throwable {
		 driver.findElement(By.xpath("//div[@id='smiley']/div/input[@id='pbm-chk2']/following-sibling::label")).click();
			Sleep(4000);
	 }
	 @Then("Add mood notes for my MyFasttrackerlogProblem")
	 public void add_mood_notes_for_my_my_fasttrackerlog_problem()  throws Throwable {
		 Inputvalues(pom.getMyfasttracker_problem().getlogmyproblemnotes(),"problem feeling");
			Sleep(4000);
	 }
	 @Then("click on Add Entry mood for my MyFasttrackerlogProblem")
	 public void click_on_add_entry_mood_for_my_my_fasttrackerlog_problem()  throws Throwable {
		 clickOnElement(pom.getmyFasttrackerlogmood().getmymoodaddentry());
			Sleep(4000);
			driver.findElement(By.xpath("(//div[@class='mw-pop mw-bg-white-card mw-border-dark-gray p-md-5 p-3']/button)[7]")).click();
			Sleep(4000);
			//span[@id='Remove-focus-to-close-sleep-tracker']/*[name()='svg']
			driver.findElement(By.xpath("//span[@id='Remove-focus-to-close-problem-tracker']/*[name()='svg']")).click();
			Sleep(4000);
	 }

}
