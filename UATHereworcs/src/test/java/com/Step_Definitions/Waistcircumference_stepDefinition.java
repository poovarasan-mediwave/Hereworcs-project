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


public class Waistcircumference_stepDefinition extends Base_Class {
	 
	 public static WebDriver driver = Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);


	 @Given("^User add waistcircumference$")
	 public void user_add_waistcircumference() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	 }

	@When("^Click on login button for for waistcircumference$")
	public void click_on_login_button_for_for_waistcircumference() throws Throwable {
		clickOnElement(pom.getlogin().getcookie());
	}

	@When("^User enters valid \"([^\"]*)\" in Emailaddres field for for waistcircumference$")
	public void user_enters_valid_in_Emailaddres_field_for_for_waistcircumference(String arg1) throws Throwable {
		Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		Sleep(3000);
	}

	@When("^User enters \"([^\"]*)\" in Passowrd  for for waistcircumference$")
	public void user_enters_in_Passowrd_for_for_waistcircumference(String arg1) throws Throwable {
		Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		Sleep(3000);
	}

	@When("^Click on Submit button for waistcircumference$")
	public void click_on_Submit_button_for_waistcircumference() throws Throwable {
		clickOnElement(pom.getlogin().getLoginbtn());
		Sleep(40000);
	}

	@When("^clicking over Bento menu for waistcircumference$")
	public void clicking_over_Bento_menu_for_waistcircumference() throws Throwable {
		//clickOnElement(pom.getbentomenu().getbentoicon());
		 WebElement ele = driver.findElement(By.xpath("//div[@class='text-right text-md-center position-relative mobile-close top--10']/div/div/div[3]/button/div"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
		Sleep(3000);
	}
	

	@When("^clicking over Tracker module for waistcircumference$")
	public void clicking_over_Tracker_module_for_waistcircumference() throws Throwable {
		clickOnElement(pom.getbentomenu().getTrackermodule());
		Sleep(4000);
	}

	
	 @When("^clicking over Waistcircumference section$")
     public void clicking_over_Waistcircumference_section() throws Throwable {
		// clickOnElement(pom.getwaistcircumference().waistcircumferencesec());
		 WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tracker/waistcircumference']")));
			Actions action =new Actions(driver);
			action.moveToElement(scanEle).click().build().perform();
			Sleep(3000);
    }
	
	
	@When("^Click on Date calendar for waistcircumference$")
	public void click_on_Date_calendar_for_waistcircumference() throws Throwable {
	/*	clickOnElement(pom.getwaistcircumference().waistcircumferencecalendar());
		Sleep(3000);
		System.out.println("enter");
		 //dropdownSelectByVisibleText(pom.getwaistcircumference().yeardropdown(),"2012");
		 Sleep(3000);
		 System.out.println("enter1");
		 //dropdownSelectByVisibleText(pom.getwaistcircumference().monthdropdown(),"Jan");
		 Sleep(3000);
		 System.out.println("enter2");
	  */ 
	}

	@When("^Click on the date for waistcircumference$")
	public void click_on_the_date_for_waistcircumference() throws Throwable {
		Sleep(3000);
	/*	 List<WebElement>dates= pom.getwaistcircumference().getwaistcircumferencedateselect();
			Sleep(3000);
			int size = dates.size();
			//System.out.println(size);
			for (int i = 0; i < size; i++) {
				System.out.println(i);
				if (i<=6) {
					Sleep(3000);
					//System.out.println(i);
					clickOnElement(dates.get(i));
					Sleep(3000);
					Inputvalues(pom.getwaistcircumference().getwaistcircumferencestepscount(),"28");
					Sleep(3000);
					clickOnElement(pom.getwaistcircumference().getwaistcircumferencesubmit());
					Sleep(3000);
					clickOnElement(pom.getwaistcircumference().waistcircumferencecalendar());
					Sleep(3000);
					 dropdownSelectByVisibleText(pom.getwaistcircumference().yeardropdown(),"2012");
					 Sleep(3000);
					 dropdownSelectByVisibleText(pom.getwaistcircumference().monthdropdown(),"Jan");
					 Sleep(2000);
					
				}else if(i<=7) {
					 Sleep(2000);
					
								clickOnElement(dates.get(i));
								Sleep(3000);
								Inputvalues(pom.getwaistcircumference().getwaistcircumferencestepscount(),"30");
								Sleep(3000);
								clickOnElement(pom.getwaistcircumference().getwaistcircumferencesubmit());
								Sleep(3000);
								clickOnElement(pom.getwaistcircumference().waistcircumferencecalendar());
								Sleep(3000);
								 dropdownSelectByVisibleText(pom.getwaistcircumference().yeardropdown(),"2012");
								 Sleep(3000);
								 dropdownSelectByVisibleText(pom.getwaistcircumference().monthdropdown(),"Jan");
								 Sleep(2000);
				}
				else if(i<=8) {
					Sleep(3000);
					clickOnElement(dates.get(i));
					break;
				}
				}*/
	}

	@When("^Enter the steps for waistcircumference$")
	public void enter_the_steps_for_waistcircumference() throws Throwable {
		Inputvalues(pom.getwaistcircumference().getwaistcircumferencestepscount(),"32");
		Sleep(3000);
	}

	@Then("^Click on the Submit button for waistcircumference$")
	public void click_on_the_Submit_button_for_waistcircumference() throws Throwable {
		clickOnElement(pom.getwaistcircumference().getwaistcircumferencesubmit());
	}
	


}
