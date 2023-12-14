package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFasttrackerlog_StepDefinition extends Base_Class {

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);

	
		@Given("User launch URL for my Fasttrackerlog")
		public void user_launch_url_for_my_fasttrackerlog()  throws Throwable{
			 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
			 Sleep(3000);
		}

		@When("User click login button for my Fasttrackerlog")
		public void user_click_login_button_for_my_fasttrackerlog() throws Throwable {
			 clickOnElement(pom.getlogin().getcookie());
		}
		@Then("User enters valid {string} in Emailaddres field for my Fasttrackerlog")
		public void user_enters_valid_in_emailaddres_field_for_my_fasttrackerlog(String string) throws Throwable {
			 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
			 Sleep(3000);
		   		}
		@Then("User enters {string} in Passowrd for my Fasttrackerlog")
		public void user_enters_in_passowrd_for_my_fasttrackerlog(String string) throws Throwable {
			 Inputvalues(pom.getlogin().getPassword(),"Admin01@@");
			 Sleep(3000);
		}
		@Then("Click on Submit button for my Fasttrackerlog")
		public void click_on_submit_button_for_my_fasttrackerlog() throws Throwable {
			 clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
				Sleep(27000);
		}
		@Then("click my Fasttrackerlog button from Dashboard for my Fasttrackerlog")
		public void click_my_fasttrackerlog_button_from_dashboard_for_my_fasttrackerlog() throws Throwable {
			driver.findElement(By.xpath("//div[@class='dash-list-card search-font-size-reduce position-relative']/div/span/*[name()='svg'][@alt='My fast tracker log img']")).click();
			Sleep(4000);
			
			//clickOnElement(pom.getsmartDashboard().getmyfasttrackerlog_dashboard());
			Sleep(4000);
			clickOnElement(pom.getsmartDashboard().getcontinuebt_dashboardpopup());
			Sleep(9000);
			driver.navigate().refresh();
			Sleep(9000);
		}
		@Then("click on Log my sleep for my Fasttrackerlog")
		public void click_on_log_my_sleep_for_my_fasttrackerlog() throws Throwable {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dash-box col-xl-4 py-2']/div/div/div[2]/span[1]/span[text()='Log my sleep']"))).click();
			Sleep(4000);
		}
		@Then("click on Add Entry of my Fasttrackerlog for sleep validation")
		public void click_on_add_entry_of_my_fasttrackerlog_for_sleep_validation() throws Throwable {
			clickOnElement(pom.getmyFasttrackerlog().getmysleepaddentry());
			Sleep(4000);
		}
		@Then("click on Date field for Sleep my my Fasttrackerlog")
		public void click_on_date_field_for_sleep_my_my_fasttrackerlog()  throws Throwable{
			clickOnElement(pom.getmyFasttrackerlog().getmysleepdatefield());
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
		@Then("select on start time for Sleep my my Fasttrackerlog")
		public void select_on_start_time_for_sleep_my_my_fasttrackerlog() throws Throwable {
			Select dairymonth = new Select(driver.findElement(By.xpath("//select[@id='bed_time']")));
			dairymonth.selectByVisibleText("00:30");
			Sleep(4000);
		}
		@Then("select on End time for Sleep my my Fasttrackerlog")
		public void select_on_end_time_for_sleep_my_my_fasttrackerlog() throws Throwable {
			
			Select dairymonth = new Select(driver.findElement(By.xpath("//select[@id='wakeup_time']")));
			dairymonth.selectByVisibleText("07.00");
			Sleep(4000);
		}
		@Then("choose on number of time wake up for Sleep my my Fasttrackerlog")
		public void choose_on_number_of_time_wake_up_for_sleep_my_my_fasttrackerlog() throws Throwable {
			Select dairymonth = new Select(driver.findElement(By.xpath("//select[@id='wakeup_count']")));
			dairymonth.selectByVisibleText("5");
			Sleep(4000);
		}
		@Then("select sleep compare to yesterday for Sleep my my Fasttrackerlog")
		public void select_sleep_compare_to_yesterday_for_sleep_my_my_fasttrackerlog() throws Throwable {
			Select dairymonth = new Select(driver.findElement(By.xpath("//select[@id='sleep-overviews-rate']")));
			dairymonth.selectByVisibleText("Same");
			Sleep(4000);
		}
		@Then("click on Add Entry for Sleep my my Fasttrackerlog")
		public void click_on_add_entry_for_sleep_my_my_fasttrackerlog()  throws Throwable{
			clickOnElement(pom.getmyFasttrackerlog().getmysleepaddentry());
						Sleep(4000);
					
			driver.findElement(By.xpath("(//div[@class='mw-pop mw-bg-white-card mw-border-dark-gray p-md-5 p-3']/button)[7]")).click();
			Sleep(4000);
			//span[@id='Remove-focus-to-close-sleep-tracker']/*[name()='svg']
			driver.findElement(By.xpath("//span[@id='Remove-focus-to-close-sleep-tracker']/*[name()='svg']")).click();
			Sleep(4000);
		}

}
