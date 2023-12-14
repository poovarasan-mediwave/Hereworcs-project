package com.Step_Definitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Dailystep extends Base_Class {
	
	//public static WebDriver driver= Runner_class.driver;
	 //public static Objectclasses pom = new Objectclasses(driver);
	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);
	
	@Given("User add Daily Steps")
	public void user_add_daily_steps()  throws InterruptedException{
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("Click on login button for daily steps")
	public void click_on_login_button_for_daily_steps()throws InterruptedException {
		clickOnElement(pom.getlogin().getcookie());
		Sleep(4000);
	}
	@When("User enters valid {string} in Emailaddres field for daily step")
	public void user_enters_valid_in_emailaddres_field_for_daily_step(String string)throws InterruptedException {
		Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		Sleep(3000);
	}
	@When("User enters {string} in Passowrd for daily steps")
	public void user_enters_in_passowrd_for_daily_steps(String string)throws InterruptedException {
		Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		Sleep(3000);
	}
	@When("Click on Submit button for daily steps")
	public void click_on_submit_button_for_daily_steps()throws InterruptedException {
		clickOnElement(pom.getlogin().getLoginbtn());
		Sleep(27000);
	}
	@When("clicking over Bento menu for daily steps")
	public void clicking_over_bento_menu_for_daily_steps() throws InterruptedException{
		//clickOnElement(pom.getbentomenu().getbentoicon());
		//WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
		WebElement ele = driver.findElement(By.xpath("//div[@class='footer-desktop-img position-relative']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Sleep(3000);
	}
	@When("clicking over Tracker module for daily steps")
	public void clicking_over_tracker_module_for_daily_steps()throws InterruptedException {
		clickOnElement(pom.getbentomenu().getTrackermodule());
		Sleep(2000);
	}
	@When("Click on the Daily steps section for daily steps")
	public void click_on_the_daily_steps_section_for_daily_steps() throws InterruptedException{
		clickOnElement(pom.getDailystep().getDailystepstracker());
		Sleep(3000);
	}
	@When("Click on Date calendar for daily steps")
	public void click_on_date_calendar_for_daily_steps()throws InterruptedException {
		clickOnElement(pom.getDailystep().getdailystepcalendar());
		Sleep(1000);
		System.out.println("enter");
		 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
		 Sleep(1000);
		 System.out.println("enter1");
		 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
		 Sleep(1000);
		 System.out.println("enter2");
	}
	@When("Click on the date for daily steps")
	public void click_on_the_date_for_daily_steps()throws InterruptedException {
		//clickOnElement(pom.getDailystep().getdailystepdate());
		 Sleep(2000);
		 List<WebElement>dates= pom.getDailystep().getdailystepdateselect();
			Sleep(3000);
			int size = dates.size();
			//System.out.println(size);
			for (int i = 0; i < size; i++) {
				System.out.println(i);
				if (i<=9) {
					Sleep(3000);
					//System.out.println(i);
					clickOnElement(dates.get(i));
					Sleep(3000);
					Inputvalues(pom.getDailystep().getaddsteps(),"1000");
					Sleep(3000);
					clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
					Sleep(3000);
					clickOnElement(pom.getDailystep().getdailystepcalendar());
					Sleep(3000);
					 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
					 Sleep(3000);
					 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
					 Sleep(2000);
					
				}else if(i<=19) {
					 Sleep(2000);
					
								clickOnElement(dates.get(i));
								Sleep(3000);
								Inputvalues(pom.getDailystep().getaddsteps(),"2000");
								Sleep(3000);
								clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
								Sleep(2000);
								clickOnElement(pom.getDailystep().getdailystepcalendar());
								Sleep(3000);
								 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
								 Sleep(2000);
								 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
								 Sleep(2000);
				}
				else if(i<=10) {
					Sleep(1000);
					clickOnElement(dates.get(i));
					break;
				}
				}
	}
	@When("Enter the steps on daily step")
	public void enter_the_steps_on_daily_step()throws InterruptedException {
		Inputvalues(pom.getDailystep().getaddsteps(),"3000");
		Sleep(3000);
	}
	@Then("Click on the Submit button for daily steps")
	public void click_on_the_submit_button_for_daily_steps()throws InterruptedException {
		clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
		Sleep(3000);
	}


}	 
	/* 
	@Given("^User add Daily Steps$")
	public void user_add_Daily_Steps() throws Throwable {
	System.out.println("lin3");
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	}

	@When("^Click on login button for daily steps$")
	public void click_on_login_button_for_daily_steps() throws Throwable{
		clickOnElement(pom.getlogin().getcookie());
	   
	}

	@Then("^User enters valid \"([^\"]*)\" in Emailaddres field$")
	public void user_enters_valid_in_Emailaddres_field(String arg1) throws Throwable {
		Inputvalues(pom.getlogin().getEmail(),"hereworc01@mailinator.com");
		Sleep(3000);
	  
	    
	}

	@Then("^User enters \"([^\"]*)\" in Passowrd$")
	public void user_enters_in_Passowrd(String arg1) throws Throwable {
	  
		Inputvalues(pom.getlogin().getPassword(),"Test@123");
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
		Sleep(1000);
	}

	@Then("^Click on the Daily steps$")
	public void click_on_the_Daily_steps() throws Throwable {
		clickOnElement(pom.getDailystep().getDailystepstracker());
		Sleep(3000);
	  
	}

	@Then("^Click on Date calendar$")
	public void click_on_Date_calendar() throws Exception {
		clickOnElement(pom.getDailystep().getdailystepcalendar());
		Sleep(1000);
		System.out.println("enter");
		 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
		 Sleep(1000);
		 System.out.println("enter1");
		 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
		 Sleep(1000);
		 System.out.println("enter2");
	}

	@Then("^Click on the date$")
	public void click_on_the_date() throws Throwable {
	 
		//clickOnElement(pom.getDailystep().getdailystepdate());
		 Sleep(2000);
		 List<WebElement>dates= pom.getDailystep().getdailystepdateselect();
			Sleep(3000);
			int size = dates.size();
			//System.out.println(size);
			for (int i = 0; i < size; i++) {
				System.out.println(i);
				if (i<=9) {
					Sleep(3000);
					//System.out.println(i);
					clickOnElement(dates.get(i));
					Sleep(3000);
					Inputvalues(pom.getDailystep().getaddsteps(),"1000");
					Sleep(3000);
					clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
					Sleep(3000);
					clickOnElement(pom.getDailystep().getdailystepcalendar());
					Sleep(3000);
					 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
					 Sleep(3000);
					 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
					 Sleep(2000);
					
				}else if(i<=19) {
					 Sleep(2000);
					
								clickOnElement(dates.get(i));
								Sleep(3000);
								Inputvalues(pom.getDailystep().getaddsteps(),"2000");
								Sleep(3000);
								clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
								Sleep(2000);
								clickOnElement(pom.getDailystep().getdailystepcalendar());
								Sleep(3000);
								 dropdownSelectByVisibleText(pom.getDailystep().yeardropdown(),"2012");
								 Sleep(2000);
								 dropdownSelectByVisibleText(pom.getDailystep().monthdropdown(),"Feb");
								 Sleep(2000);
				}
				else if(i<=10) {
					Sleep(1000);
					clickOnElement(dates.get(i));
					break;
				}
				}
		
	}

	@Then("^Enter the steps$")
	public void enter_the_steps() throws Throwable {
		Inputvalues(pom.getDailystep().getaddsteps(),"3000");
		Sleep(3000);
	}

	@Then("^Click on the Submit button$")
	public void click_on_the_Submit_button() throws Throwable {
	   
		clickOnElement(pom.getDailystep().getdailystepssubmitbtn());
		Sleep(3000);
	}
	
}
*/