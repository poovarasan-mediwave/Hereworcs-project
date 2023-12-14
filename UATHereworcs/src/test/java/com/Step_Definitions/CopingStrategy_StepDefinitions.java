package com.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
//import com.Singleton.Singleton_Design_Pattern;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CopingStrategy_StepDefinitions extends Base_Class{
	
	public static WebDriver driver = Runner_Class.driver;
    public static Class_Objects pom = new Class_Objects(driver);
	 
	 
	 @Given("User Enter Url for coping strategies")
	 public void user_enter_url_for_coping_strategies() throws InterruptedException {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(5000);
		 clickOnElement(pom.getInstanceCopStar().getAcceptcookies());
		    Sleep(2000);
	 }

	 @When("User enter  {string} inputs the email address for coping")
	 public void user_enter_inputs_the_email_address_for_coping(String string)throws InterruptedException  {
		 Inputvalues(pom.getInstanceCopStar().getEmailaddress(), "dhanraj280990+lesner@gmail.com");
		  Sleep(4000);
	 }

	 @Then("user enter valid {string} in password field for coping")
	 public void user_enter_valid_in_password_field_for_coping(String string) throws InterruptedException {
		 Inputvalues(pom.getInstanceCopStar().getPassword(), "Admin01@");
		    Sleep(5000);
	 }


	 @Then("user then accepts cookies for coping")
	 public void user_then_accepts_cookies_for_coping() throws InterruptedException {
		// clickOnElement(pom.getInstanceCopStar().getAcceptcookies());
		   // Sleep(6000);
	 }
	 @Then("user then clicks the login button for coping")
	 public void user_then_clicks_the_login_button_for_coping()throws InterruptedException  {
		 clickOnElement(pom.getInstanceCopStar().getLoginbutton());
		 Sleep(6000);
	 }
	 @Then("User then has to navigate to home page of dashboard for coping")
	 public void user_then_has_to_navigate_to_home_page_of_dashboard_for_coping() throws InterruptedException  {
		   System.out.println("LOGIN SUCCESSSSS");
		    Sleep(20000);
	 }
	 
	 @When("Patients has clicked the main menu in dashboard page for coping")
	 public void patients_has_clicked_the_main_menu_in_dashboard_page_for_coping() throws InterruptedException  {
		// clickOnElement(pom.getInstanceCopStar().getClickMenus());
		  //WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
		 WebElement ele = driver.findElement(By.xpath("//div[@class='footer-desktop-img position-relative']/following-sibling::p"));	
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			 Sleep(3000);
	 }
	 
	 @Then("user click the tracker in main menu for coping")
	 public void user_click_the_tracker_in_main_menu_for_coping() throws InterruptedException  {
		  clickOnElement(pom.getInstanceCopStar().getClickTrackersinMenu());
		  Sleep(3000);
	 }
	 @Then("user clicks coping strategy menu")
	 public void user_clicks_coping_strategy_menu() throws InterruptedException  {
		  clickOnElement(pom.getInstanceCopStar().getCopingStrategymenu());
		   Sleep(3000);
	 }
	 @Then("User clicks add coping strategy button")
	 public void user_clicks_add_coping_strategy_button() throws InterruptedException  {
		  clickOnElement(pom.getInstanceCopStar().getAddCopyStartbutton());
		  Sleep(3000);
	 }
	 @Then("User enters input in title field")
	 public void user_enters_input_in_title_field() throws InterruptedException  {
		 Inputvalues(pom.getInstanceCopStar().getTitle(), "Thurday Entry");
		   Sleep(3000);
	 }
	 @Then("User enters input in description field")
	 public void user_enters_input_in_description_field() throws InterruptedException  {
		 Inputvalues(pom.getInstanceCopStar().getDescription(), "Not Sad:  Not Happy");
		   Sleep(3000);
	 }
	 @Then("User clicks save button")
	 public void user_clicks_save_button() throws InterruptedException {
		  clickOnElement(pom.getInstanceCopStar().getSaveButton());
		    System.out.println("Copying strategy entry addeddd");
		    Sleep(3000);
	 }



	


	/*
	@Given("User2 has to open the website in the chrome browser")
	public void user2_has_to_open_the_website_in_the_chrome_browser() throws InterruptedException {
	    geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	    Sleep(2000);
	}


	@When("User2 inputs the email address in {string} field")
	public void user2_inputs_the_email_address_in_field(String string) throws InterruptedException {
	  Inputvalues(pom.getInstanceCopStar().getEmailaddress(), "dhanraj280990+lesner@gmail.com");
	  Sleep(3000);
	}
	@When("user2 inputs and enters the valid password in {string} field")
	public void user2_inputs_and_enters_the_valid_password_in_field(String string)throws InterruptedException {
	    Inputvalues(pom.getInstanceCopStar().getPassword(), "Admin01@");
	    Sleep(3000);
	}
	@Then("user2 then accepts cookies")
	public void user2_then_accepts_cookies() throws InterruptedException{
	    clickOnElement(pom.getInstanceCopStar().getAcceptcookies());
	    Sleep(3000);
	}
	@Then("user2 then clicks the login button")
	public void user2_then_clicks_the_login_button() throws InterruptedException{
	 clickOnElement(pom.getInstanceCopStar().getLoginbutton());
	 Sleep(3000);
	}
	@Then("User2 then has to navigate to home page of dashboard")
	public void user2_then_has_to_navigate_to_home_page_of_dashboard()throws InterruptedException {
	    System.out.println("LOGIN SUCCESSSSS");
	    Sleep(20000);
	}


	
	@Then("When Patients user2 has clicked the main menu in dashboard page")
	public void when_patients_user2_has_clicked_the_main_menu_in_dashboard_page() throws InterruptedException{
	   // clickOnElement(pom.getInstanceCopStar().getClickMenus());
		  WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			 Sleep(3000);
	}

	@Then("user2 click the tracker in main menu")
	public void user2_click_the_tracker_in_main_menu() throws InterruptedException{
	  clickOnElement(pom.getInstanceCopStar().getClickTrackersinMenu());
	  Sleep(3000);
	}
	@Then("user2 clicks coping strategy menu")
	public void user2_clicks_coping_strategy_menu()throws InterruptedException {
	   clickOnElement(pom.getInstanceCopStar().getCopingStrategymenu());
	   Sleep(3000);
	}
	@Then("User2 clicks add coping strategy button")
	public void user2_clicks_add_coping_strategy_button() throws InterruptedException{
	  clickOnElement(pom.getInstanceCopStar().getAddCopyStartbutton());
	  Sleep(3000);
	}
	@Then("User2 enters input in title field")
	public void user2_enters_input_in_title_field() throws InterruptedException{
	   Inputvalues(pom.getInstanceCopStar().getTitle(), "Thurday Entry");
	   Sleep(3000);
	}
	@Then("User2 enters input in description field")
	public void user2_enters_input_in_description_field() throws InterruptedException{
	   Inputvalues(pom.getInstanceCopStar().getDescription(), "Not Sad:  Not Happy");
	   Sleep(3000);
	}
	@Then("User2 clicks save button")
	public void user2_clicks_save_button() throws InterruptedException{
	    clickOnElement(pom.getInstanceCopStar().getSaveButton());
	    System.out.println("Copying strategy entry addeddd");
	    Sleep(3000);
	}



	
	
	
	/*@Given("When Patient user2 has clicked the mainmenu in dashboard page")
	public void when_patient_user2_has_clicked_the_mainmenu_in_dashboard_page()throws InterruptedException {
	    clickOnElement(pom.getInstanceCopStar().getClickMenus());
	    Sleep(3000);
	}

	@Then("user2 click the trackers in main menu")
	public void user2_click_the_trackers_in_main_menu()throws InterruptedException {
	  clickOnElement(pom.getInstanceCopStar().getClickTrackersinMenu());
	  Sleep(3000);
	}
	@Then("user2 has to click dairymenu")
	public void user2_has_to_click_dairymenu()throws InterruptedException {
	  clickOnElement(pom.getInstanceCopStar().getDairymenu());
	  Sleep(3000);
	}
	@Then("user2 clicks date field")
	public void user2_clicks_date_field()throws InterruptedException {
	   clickOnElement(pom.getInstanceCopStar().getDatefield());
	   Sleep(3000);
	}
	@Then("user2 selects date")
	public void user2_selects_date() throws InterruptedException{
	   // clickOnElement(pom.getInstanceCopStar().getSelectdate());
		
	    Sleep(3000);
	}
	@Then("user2 has to enter input in description field")
	public void user2_has_to_enter_input_in_description_field() throws InterruptedException{
	   Inputvalues(pom.getInstanceCopStar().getDairydesc(), "Whatever happens life has to go on");
	   Sleep(3000);
	}
	@Then("User2 need to save dairy")
	public void user2_need_to_save_dairy()throws InterruptedException {
	    clickOnElement(pom.getInstanceCopStar().getDairysubmit());
	    System.out.println("Dairy entry addeddd");
	    Sleep(3000);
	}
*/

}
