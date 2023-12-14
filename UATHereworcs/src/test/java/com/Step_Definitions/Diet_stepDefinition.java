package com.Step_Definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Diet_stepDefinition extends Base_Class  {

	//public WebDriver driver1;
 public static WebDriver driver= Runner_Class.driver;
 public static Class_Objects pom = new Class_Objects(driver);
 
 

@Given("User launch URL for diet")
public void user_launch_url_for_diet() throws InterruptedException{
	 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	 Sleep(2000);
}

@When("Click on login button for diet")
public void click_on_login_button_for_diet()throws InterruptedException {
	 clickOnElement(pom.getlogin().getcookie());
   }

@Then("User enters valid {string} in Emailaddres field for diet")
public void user_enters_valid_in_emailaddres_field_for_diet(String string) throws InterruptedException {
	Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
	Sleep(3000);
}
@Then("User enters {string} in Passowrd for diet")
public void user_enters_in_passowrd_for_diet(String string) throws InterruptedException {
	 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		Sleep(3000);
}
@Then("Click on Submit button for diet")
public void click_on_submit_button_for_diet()  throws InterruptedException{
	clickOnElement(pom.getlogin().getLoginbtn());
	Sleep(29000);
}
@Then("clicking over Bento menu for diet")
public void clicking_over_bento_menu_for_diet() throws InterruptedException {
	
	//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']
	WebElement ele = driver.findElement(By.xpath("(//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div/div[3])[1]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	Sleep(3000);
}
@Then("clicking over Tracker module for diet")
public void clicking_over_tracker_module_for_diet()  throws InterruptedException{
	 clickOnElement(pom.getbentomenu().getTrackermodule());
		Sleep(3000);
}
@Then("clicking over Tracker category for diet")
public void clicking_over_tracker_category_for_diet() throws InterruptedException {
	 clickOnElement(pom.getbentomenu().getTrackers());
		Sleep(3000);
}
@Then("clicking over Diet Tracker section for diet")
public void clicking_over_diet_tracker_section_for_diet() throws InterruptedException {
// clickOnElement(pom.getdiet().getdeitTracker());
	WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tracker/diet']")));
	Actions action =new Actions(driver);
	action.moveToElement(scanEle).click().build().perform();
Sleep(4000);
driver.findElement(By.xpath("(//a[@href='/tracker/diet'])[1]")).click();
Sleep(4000);
}
@Then("clicking over Add Diet information button for diet")
public void clicking_over_add_diet_information_button_for_diet() throws InterruptedException {
	 clickOnElement(pom.getdiet().getdietInformation());
		Sleep(3000);
}
@Then("click on calendar for diet")
public void click_on_calendar_for_diet()  throws InterruptedException{
	 clickOnElement(pom.getdiet().getdietdate());
		Sleep(3000);	 
}
@Then("selecting calendartitle for diet")
public void selecting_calendartitle_for_diet() throws InterruptedException {
	 clickOnElement(pom.getdiet().getcalendartitle());
		Sleep(3000);
}
@Then("selecting calendaryearoption for diet")
public void selecting_calendaryearoption_for_diet() throws InterruptedException {
	 clickOnElement(pom.getdiet().getcalendaryearoption());
	 Sleep(3000);
}
@Then("selecting calendartitleyear for diet")
public void selecting_calendartitleyear_for_diet() throws InterruptedException {
	 clickOnElement(pom.getdiet().getcalendartitleyear());
		Sleep(3000);
}
@Then("selecting calendartitlemonth for diet")
public void selecting_calendartitlemonth_for_diet()  throws InterruptedException{
	clickOnElement(pom.getdiet().getcalendartitlemonth());
	Sleep(3000);
}
@Then("selecting selectdatess for diet")
public void selecting_selectdatess_for_diet()  throws InterruptedException{
	 List<WebElement> date = pom.getdiet().getdietselectdatess();
		int size = date.size();
		//System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (i == 1 || i == 5 ) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getdiet().getBreakfast());
				Sleep(2000);
				clickOnElement(pom.getdiet().getsmall());
				Sleep(2000);
				clickOnElement(pom.getdiet().getrecordmeal());
				Sleep(5000);
				clickOnElement(pom.getdiet().getdietInformation());
				Sleep(3000);
				 clickOnElement(pom.getdiet().getdietdate());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(3000);
				 
				}
			
			else if(i == 2 || i == 6 ) {
				Sleep(3000);
			clickOnElement(date.get(i));
			Sleep(6000);
			clickOnElement(pom.getdiet().getLunch());
			Sleep(3000);
			clickOnElement(pom.getdiet().getmedium());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(7000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			
			}	
			else if(i == 3 || i == 7 ) {
				Sleep(3000);
			clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getDinner());
			Sleep(3000);
			clickOnElement(pom.getdiet().getLarge());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			}
			else if(i == 4 || i == 8 ) {
				Sleep(3000);
				clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getsnack());
			Sleep(3000);
			clickOnElement(pom.getdiet().getsmall());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			}
			else if(i == 9) {
				Sleep(3000);
				clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getsnack());
			Sleep(3000);
			clickOnElement(pom.getdiet().getsmall());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			}
			}
}
@Then("click weekly arrow for diet")
public void click_weekly_arrow_for_diet()  throws InterruptedException{
	//clickOnElement(pom.getdiet().getweekarrow());
	Sleep(3000);
}
@Then("click on diet week for diet")
public void click_on_diet_week_for_diet()  throws InterruptedException{
	// clickOnElement(pom.getdiet().getdietWeek());
		Sleep(3000);
}
@Then("click on diet month for diet")
public void click_on_diet_month_for_diet()  throws InterruptedException{
	//clickOnElement(pom.getdiet().getdietMonth());
	Sleep(3000);
}
@Then("click on diet year for diet")
public void click_on_diet_year_for_diet() throws InterruptedException {
	// clickOnElement(pom.getdiet().getdietYear());
		Sleep(3000);
}



/*
 @Given("^User launch URL$")
 public void user_launch_URL() throws Throwable {
	 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
 }

 @When("^Click on login button$")
 public void click_on_login_button() throws Throwable {
	 clickOnElement(pom.getlogin().getcookie());
 }

 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field$")
 public void user_enters_valid_in_Emailaddres_field(String arg1) throws Exception {
		Inputvalues(pom.getlogin().getEmail(),"dhanraj280990@gmail.com");
		Sleep(3000);
 }

 @Then("^User enters \"([^\"]*)\" in Passowrd$")
 public void user_enters_in_Passowrd(String arg1) throws Exception {
	 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		Sleep(3000);
 }

 @Then("^Click on Submit button$")
 public void click_on_Submit_button() throws Throwable {
	 clickOnElement(pom.getlogin().getLoginbtn());
		Sleep(3000);
 }

 @Then("^clicking over Bento menu$")
 public void clicking_over_Bento_menu() throws Throwable {
		clickOnElement(pom.getbentomenu().getbentoicon());
		Sleep(3000);
 }

 @Then("^clicking over Tracker module$")
 public void clicking_over_Tracker_module() throws Throwable {
	 clickOnElement(pom.getbentomenu().getTrackermodule());
		Sleep(3000);
 }

 @Then("^clicking over Tracker category$")
 public void clicking_over_Tracker_category() throws Throwable {
	 clickOnElement(pom.getbentomenu().getTrackers());
		Sleep(3000);
 }

 @Then("^clicking over Diet Tracker section$")
 public void clicking_over_Diet_Tracker_section() throws Throwable {
	 clickOnElement(pom.getdiet().getdeitTracker());
		Sleep(3000);
 }

 @Then("^clicking over Add Diet information button$")
 public void clicking_over_Add_Diet_information_button() throws Throwable {
	 clickOnElement(pom.getdiet().getdietInformation());
		Sleep(3000);
 }

 @Then("^click on calendar$")
 public void click_on_calendar() throws Throwable {
	 clickOnElement(pom.getdiet().getdietdate());
		Sleep(3000);	 
 }



 @Then("^selecting calendartitle$")
 public void selecting_calendartitle() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitle());
		Sleep(3000);
 }
 
 @Then("^selecting calendaryearoption$")
 public void selecting_calendaryearoption() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendaryearoption());
	 Sleep(3000);
 }

 @Then("^selecting calendartitleyear$")
 public void selecting_calendartitleyear() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitleyear());
		Sleep(3000);
 }

 @Then("^selecting calendartitlemonth$")
 public void selecting_calendartitlemonth() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitlemonth());
		Sleep(3000);
 }

 @Then("^selecting selectdatess$")
 public void selecting_selectdatess() throws Throwable {
	 List<WebElement> date = pom.getdiet().getdietselectdatess();
		int size = date.size();
		//System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (i == 1 || i == 5 ) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getdiet().getBreakfast());
				Sleep(2000);
				clickOnElement(pom.getdiet().getsmall());
				Sleep(2000);
				clickOnElement(pom.getdiet().getrecordmeal());
				Sleep(5000);
				clickOnElement(pom.getdiet().getdietInformation());
				Sleep(3000);
				 clickOnElement(pom.getdiet().getdietdate());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(3000);
				 
				}
			
			else if(i == 2 || i == 6 ) {
				Sleep(3000);
			clickOnElement(date.get(i));
			Sleep(6000);
			clickOnElement(pom.getdiet().getLunch());
			Sleep(3000);
			clickOnElement(pom.getdiet().getmedium());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(7000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			
			}	
			else if(i == 3 || i == 7 ) {
				Sleep(3000);
			clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getDinner());
			Sleep(3000);
			clickOnElement(pom.getdiet().getLarge());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			}
			else if(i == 4 || i == 8 ) {
				Sleep(3000);
				clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getsnack());
			Sleep(3000);
			clickOnElement(pom.getdiet().getsmall());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			clickOnElement(pom.getdiet().getdietInformation());
			Sleep(3000);
			 clickOnElement(pom.getdiet().getdietdate());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitle());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendaryearoption());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitleyear());
			 Sleep(3000);
			 clickOnElement(pom.getdiet().getcalendartitlemonth());
			 Sleep(3000);
			}
			else if(i == 9) {
				Sleep(3000);
				clickOnElement(date.get(i));
			Sleep(5000);
			clickOnElement(pom.getdiet().getsnack());
			Sleep(3000);
			clickOnElement(pom.getdiet().getsmall());
			Sleep(3000);
			clickOnElement(pom.getdiet().getrecordmeal());
			Sleep(5000);
			}
			}
 }
 



 @Then("^click weekly arrow$")
 public void click_weekly_arrow() throws Throwable {
	clickOnElement(pom.getdiet().getweekarrow());
		Sleep(3000);
 }

 @Then("^click on diet week$")
 public void click_on_diet_week() throws Throwable {
	 clickOnElement(pom.getdiet().getdietWeek());
		Sleep(3000);
 }

 @Then("^click on diet month$")
 public void click_on_diet_month() throws Throwable {
		clickOnElement(pom.getdiet().getdietMonth());
		Sleep(3000);
 }

 @Then("^click on diet year$")
 public void click_on_diet_year() throws Throwable {
	 clickOnElement(pom.getdiet().getdietYear());
		Sleep(3000);
 }
 
 */
///////////
/*
	
 @Given("User launch URL")
	public void user_launch_url() {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

@When("Click on login button")
public void click_on_login_button() {
	clickOnElement(pom.getlogin().getcookie());
}


@Then("User enters valid {string} in Emailaddres field")
public void user_enters_valid_in_emailaddres_field(String string) throws Exception {
  
	Inputvalues(pom.getlogin().getEmail(),"dhanraj280990@gmail.com");
	Sleep(3000);
}
@Then("User enters {string} in Passowrd")
public void user_enters_in_passowrd(String string) throws InterruptedException {
    
	Inputvalues(pom.getlogin().getPassword(),"Admin01@");
	Sleep(3000);
}
@Then("Click on Submit button")
public void click_on_submit_button() throws InterruptedException {
	clickOnElement(pom.getlogin().getLoginbtn());
	Sleep(3000);
}
@Then("clicking over Bento menu")
public void clicking_over_bento_menu() throws InterruptedException{
	clickOnElement(pom.getbentomenu().getbentoicon());
	Sleep(3000);
}
@Then("clicking over Tracker module")
public void clicking_over_tracker_module() throws InterruptedException{
	clickOnElement(pom.getbentomenu().getTrackermodule());
	Sleep(3000);
}
@Then("clicking over Tracker category")
public void clicking_over_tracker_category() throws InterruptedException {
	clickOnElement(pom.getbentomenu().getTrackers());
	Sleep(3000);
}
@Then("clicking over Diet Tracker section")
public void clicking_over_diet_tracker_section() throws InterruptedException {
	clickOnElement(pom.getdiet().getdeitTracker());
	Sleep(3000);
}
@Then("clicking over Add Diet information button")
public void clicking_over_add_diet_information_button()  throws InterruptedException{
	clickOnElement(pom.getdiet().getdietInformation());
	Sleep(3000);
}
@Then("click on calendar")
public void click_on_calendar()  throws InterruptedException{
	clickOnElement(pom.getdiet().getdietdate());
	Sleep(3000);
}
@Then("selecting months")
public void selecting_months() throws InterruptedException {
	for(int i=1;i<=2;i++) {
	clickOnElement(pom.getdiet().getleftarrowformonthselect());
	Sleep(3000);
	}
	
}
@Then("selecting date")
public void selecting_date() throws InterruptedException {
	clickOnElement(pom.getdiet().getselectdatess());
	Sleep(3000);
}
@Then("click on Breakfast")
public void click_on_breakfast() throws InterruptedException {
	clickOnElement(pom.getdiet().getBreakfast());
	Sleep(3000);
}
@Then("click on Medium")
public void click_on_medium()  throws InterruptedException{
	clickOnElement(pom.getdiet().getmedium());
	Sleep(3000);
   
}
@Then("click on Record meal")
public void click_on_record_meal() throws InterruptedException {
	clickOnElement(pom.getdiet().getrecordmeal());
	Sleep(3000);
}
@Then("click weekly arrow")
public void click_weekly_arrow() throws InterruptedException {
	clickOnElement(pom.getdiet().getweekarrow());
	Sleep(3000);
}
@Then("click on diet week")
public void click_on_diet_week()  throws InterruptedException{
	clickOnElement(pom.getdiet().getdietWeek());
	Sleep(3000);
}
@Then("click on diet month")
public void click_on_diet_month() throws InterruptedException {
	clickOnElement(pom.getdiet().getdietMonth());
	Sleep(3000);
}
@Then("click on diet year")
public void click_on_diet_year() throws InterruptedException {
	clickOnElement(pom.getdiet().getdietYear());
	Sleep(3000);
}
*/


}
