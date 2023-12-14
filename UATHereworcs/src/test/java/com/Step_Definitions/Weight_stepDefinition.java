package com.Step_Definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Weight_stepDefinition extends Base_Class{

	
	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
	

	 
	 @Given("^User launch URL for Weight$")
	 public void user_launch_URL_for_Weight() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("^User click login button for Weight$")
	 public void user_click_login_button_for_Weight() throws Throwable {
			clickOnElement(pom.getlogin().getcookie());	
			}

	 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field for Weight$")
	 public void user_enters_valid_in_Emailaddres_field_for_Weight(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }

	 @Then("^User enters \"([^\"]*)\" in Passowrd for Weight$")
	 public void user_enters_in_Passowrd_for_Weight(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		 Sleep(3000);
	 }

	 @Then("^Click on Submit button for Weight$")
	 public void click_on_Submit_button_for_Weight() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
		 Sleep(36000);
	 }

	 @Then("^clicking over Bento menu for Weight$")
	 public void clicking_over_Bento_menu_for_Weight() throws Throwable {
			//clickOnElement(pom.getbentomenu().getbentoicon());
		 WebElement ele = driver.findElement(By.xpath("(//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div/div[3])[1]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
			
	 }

	 @Then("^clicking over Tracker module for Weight$")
	 public void clicking_over_Tracker_module_for_Weight() throws Throwable {
		 clickOnElement(pom.getbentomenu().getTrackermodule());
		 Sleep(3000);
	 }

	 @Then("^clicking over Tracker category for weight$")
	 public void clicking_over_Tracker_category_for_weight() throws Throwable {
			//clickOnElement(pom.getWeight().getWeighttracker());
		 WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tracker/weight']")));
			Actions action =new Actions(driver);
			action.moveToElement(scanEle).click().build().perform();
			 Sleep(3000);
	 }

	 @Then("^click on calendar for weight$")
	 public void click_on_calendar_for_weight() throws Throwable {
		 clickOnElement(pom.getWeight().getWeightcalendar());
		 Sleep(3000);
	 }

	 @Then("^selecting year for weight$")
	 public void selecting_year_for_weight() throws Throwable {
			//Select Yeardrp = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
			//Yeardrp.selectByVisibleText("2021");
		// clickOnElementSelect(pom.getWeight().yeardropdown);
		// Sleep(3000);
		 dropdownSelectByVisibleText(pom.getWeight().yeardropdown(),"2021");
			
	 }

	 @Then("^selecting month for weight$")
	 public void selecting_month_for_weight() throws Throwable {
			//Select Monthdrp = new Select (driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
			//Monthdrp.selectByVisibleText("Dec");
		 dropdownSelectByVisibleText(pom.getWeight().monthdropdown(),"Oct");
	 }

	 @Then("^selecting date for weight$")
	 public void selecting_date_for_weight() throws Throwable {
		 //clickOnElement(pom.getWeight().getweightdateselect());
		 Sleep(3000);
		List<WebElement>weightdates= pom.getWeight().getweightdateselect();
		Sleep(3000);
		int size = weightdates.size();
		//System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (i<=5) {
				Sleep(5000);
				//System.out.println(i);
				clickOnElement(weightdates.get(i));
				Sleep(3000);
				 Inputvalues(pom.getWeight().getweightadd(),"68");
				Sleep(3000);
				 clickOnElement(pom.getWeight().getweightsubmit());
				Sleep(2000);
				clickOnElement(pom.getWeight().getWeightcalendar());
				Sleep(5000);
				 dropdownSelectByVisibleText(pom.getWeight().yeardropdown(),"2021");
				 Sleep(5000);
				 dropdownSelectByVisibleText(pom.getWeight().monthdropdown(),"Oct");
				 Sleep(5000);
				
	 }
				
			else if(i<=10) {
				 Sleep(5000);
				clickOnElement(weightdates.get(i));
				Sleep(4000);
				 Inputvalues(pom.getWeight().getweightadd(),"75");
				Sleep(3000);
				 clickOnElement(pom.getWeight().getweightsubmit());
				Sleep(5000);
				clickOnElement(pom.getWeight().getWeightcalendar());
				Sleep(5000);
				 dropdownSelectByVisibleText(pom.getWeight().yeardropdown(),"2021");
				 Sleep(5000);
				 dropdownSelectByVisibleText(pom.getWeight().monthdropdown(),"Oct");
				 Sleep(5000);
			}
			 else if(i==11) {
				 break;
			 }
		
		}
	 }
	

	

	 @Then("^clicking previous day$")
	 public void clicking_previous_day() throws Throwable {
		 clickOnElement(pom.getWeight().getweightdayprevious());
		 Sleep(3000);
	 }

	 @Then("^clicking previous week$")
	 public void clicking_previous_week() throws Throwable {
		 clickOnElement(pom.getWeight().getweightweekprevious());
		 Sleep(3000);
	 }

	 @Then("^clicking next week$")
	 public void clicking_next_week() throws Throwable {
		 clickOnElement(pom.getWeight().getweightweeknext());
		 Sleep(3000);
	 }

	 @Then("^clicking previous month$")
	 public void clicking_previous_month() throws Throwable {
		 clickOnElement(pom.getWeight().getweightmonthprevious());
		 Sleep(3000);
	 }

	 @Then("^clicking next month$")
	 public void clicking_next_month() throws Throwable {
		 clickOnElement(pom.getWeight().getweightmonthnext());
		 Sleep(3000);
	 }

	

}
