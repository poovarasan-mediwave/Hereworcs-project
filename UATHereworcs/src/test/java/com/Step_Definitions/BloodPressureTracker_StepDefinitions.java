package com.Step_Definitions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
//import com.Singleton.Singleton_Design_Pattern;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BloodPressureTracker_StepDefinitions extends Base_Class {


	public static WebDriver driver = Runner_Class.driver;
	public static Class_Objects pom = new Class_Objects(driver);

	@Given("User opens the url in browser for blood pressure")
	public void user_opens_the_url_in_browser_for_blood_pressure() throws InterruptedException  {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		Sleep(2000);
	}


	@When("User need to enter email address in {string} field for blood pressure")
	public void user_need_to_enter_email_address_in_field_for_blood_pressure(String string) throws InterruptedException{
		clickOnElement(pom.getpageLogin().getAcceptcookies());
		Sleep(3000);
		Inputvalues(pom.getpageLogin().getEmail(), "dhanraj280990+lesner@gmail.com");
		Sleep(2000);
	}
	@When("user need to enter password in {string} field for blood pressure")
	public void user_need_to_enter_password_in_field_for_blood_pressure(String string) throws InterruptedException{
		Inputvalues(pom.getpageLogin().getPassword(), "Admin01@");
		Sleep(3000);
	}
	@Then("user has to clicks to acceptbutton to accept the cookies for blood pressure")
	public void user_has_to_clicks_to_acceptbutton_to_accept_the_cookies_for_blood_pressure()throws InterruptedException {
		//clickOnElement(pom.getpageLogin().getAcceptcookies());
		Sleep(3000);
	}
	@Then("user then click Loginbutton to login to application for blood pressure")
	public void user_then_click_loginbutton_to_login_to_application_for_blood_pressure()throws InterruptedException {
		
		
		clickOnElement(pom.getpageLogin().getLoginbutton());
		Sleep(5000);
	}
	@Then("User then navigated to home page for blood pressure")
	public void user_then_navigated_to_home_page_for_blood_pressure() throws InterruptedException{
		//System.out.println("User Logged in Successfully!");
		//driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]"))d
		
		Sleep(25000);
	}
	
	
	@Given("When user Clicks mainmenu in dashboard page for blood pressure")
	public void when_user_clicks_mainmenu_in_dashboard_page_for_blood_pressure() throws InterruptedException{
		System.out.println("ener");
		//clickOnElement(pom.getInstanceBlood_Pressure().getClickMenus());
		WebElement ele = driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]/div"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Sleep(3000);
	}


	@When("User click tracker in Mainmenu for blood pressure")
	public void user_click_tracker_in_mainmenu_for_blood_pressure() throws InterruptedException{
		clickOnElement(pom.getInstanceBlood_Pressure().getClickTrackersinMenu());
		Sleep(3000);
	}
	@Then("User clicks Blood pressure tracker for blood pressure")
	public void user_clicks_blood_pressure_tracker_for_blood_pressure() throws InterruptedException{
		clickOnElement(pom.getInstanceBlood_Pressure().getClickBloodPressure());
		Sleep(3000);
	}
	@Then("User clicks calendar icon for blood pressure")
	public void user_clicks_calendar_icon_for_blood_pressure() throws InterruptedException{
		clickOnElement(pom.getInstanceBlood_Pressure().getSelectCalendar());
		Sleep(3000);
	}
	
	@Then("user clicks to select date on calendar for blood pressure")
	public void user_clicks_to_select_date_on_calendar_for_blood_pressure()throws InterruptedException {
		Sleep(5000);
		WebElement findElement1 = driver.findElement(By.className("ui-datepicker-year"));
		Select Y = new Select(findElement1);
		Y.selectByVisibleText("2015");
		Thread.sleep(1000);
		

		WebElement findElement = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select S = new Select(findElement);
		S.selectByVisibleText("Dec");
		Thread.sleep(1000);
		

		List<WebElement> choosedate = pom.getInstanceBlood_Pressure().getChoosedate();
		int size2 = choosedate.size();
		System.out.println(size2);		
		
		for (int i = 0; i < size2 -1 ; i++) {
			if (i != 0) {
				clickOnElement(pom.getInstanceBlood_Pressure().getSelectCalendar());
				WebElement findElement2 = driver.findElement(By.className("ui-datepicker-year"));
				Select Y1 = new Select(findElement2);
				Y1.selectByVisibleText("2017");
				Thread.sleep(1000);
				WebElement findElement3 = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
				Select S1 = new Select(findElement3);
				S1.selectByVisibleText("Dec");
				Thread.sleep(1000);
				
			}
			
			
		
			clickOnElement(choosedate.get(i));
			System.out.println(choosedate.get(i).getText());
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterHeartRate(), "100");
			Thread.sleep(1000);
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterSystolic(), "120");
			Thread.sleep(1000);
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterDiastolic(), "80");
			Thread.sleep(1000);
			clickOnElement(pom.getInstanceBlood_Pressure().getSubmitButton());
			Thread.sleep(4000);
		}
	}
	@Then("User prints success message for blood pressure")
	public void user_prints_success_message_for_blood_pressure() throws InterruptedException{
		Sleep(3000);
		  System.out.println("Blood Pressure Tracker data for 1 whole month added successfully");
	}






	
	
	
	// old one
	//public static Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);

	/*@Given("User opens the url in browser")
	public void user_opens_the_url_in_browser() throws InterruptedException {
		geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		
	}

	@When("User need to enter email address in {string} field")
	public void user_need_to_enter_email_address_in_field(String string) throws InterruptedException {
		Inputvalues(pom.getpageLogin().getEmail(), "sathyasuba27@gmail.com");
		
	}

	@When("user need to enter password in {string} field")
	public void user_need_to_enter_password_in_field(String string) throws InterruptedException {
		Inputvalues(pom.getpageLogin().getPassword(), "Admin@1234");
		
	}

	@Then("user has to clicks to acceptbutton to accept the cookies")
	public void user_has_to_clicks_to_acceptbutton_to_accept_the_cookies() throws InterruptedException {
		clickOnElement(pom.getpageLogin().getAcceptcookies());
		
	}

	@Then("user then click Loginbutton to login to application")
	public void user_then_click_loginbutton_to_login_to_application() throws InterruptedException {
		clickOnElement(pom.getpageLogin().getLoginbutton());
		
	}

	@Then("User then navigated to home page")
	public void user_then_navigated_to_home_page() throws InterruptedException {
		System.out.println("User Logged in Successfully!");
		
	}

	@Given("When user clicks mainmenu in dashboard page")
	public void when_user_clicks_mainmenu_in_dashboard_page() throws InterruptedException {
		clickOnElement(pom.getInstanceBlood_Pressure().getClickMenus());
		
	}

	@When("User click tracker in Mainmenu")
	public void user_click_tracker_in_mainmenu() throws InterruptedException {
		clickOnElement(pom.getInstanceBlood_Pressure().getClickTrackersinMenu());
		
	}

	@Then("User clicks Blood pressure tracker")
	public void user_clicks_blood_pressure_tracker() throws InterruptedException {
		clickOnElement(pom.getInstanceBlood_Pressure().getClickBloodPressure());
		
	}

	@Then("User clicks calendar icon")
	public void user_clicks_calendar_icon() throws InterruptedException {
		clickOnElement(pom.getInstanceBlood_Pressure().getSelectCalendar());
		
	}

	@Then("user clicks to select date on calendar")
	public void user_clicks_to_select_date_on_calendar() throws InterruptedException {

		WebElement findElement1 = driver.findElement(By.className("ui-datepicker-year"));
		Select Y = new Select(findElement1);
		Y.selectByVisibleText("2018");
		Thread.sleep(1000);
		

		WebElement findElement = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select S = new Select(findElement);
		S.selectByVisibleText("Dec");
		Thread.sleep(1000);
		

		List<WebElement> choosedate = pom.getInstanceBlood_Pressure().getChoosedate();
		int size2 = choosedate.size();
		System.out.println(size2);		
		
		for (int i = 0; i < size2 -1 ; i++) {
			if (i != 0) {
				clickOnElement(pom.getInstanceBlood_Pressure().getSelectCalendar());
				WebElement findElement2 = driver.findElement(By.className("ui-datepicker-year"));
				Select Y1 = new Select(findElement2);
				Y1.selectByVisibleText("2018");
				Thread.sleep(1000);
				WebElement findElement3 = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
				Select S1 = new Select(findElement3);
				S1.selectByVisibleText("Dec");
				Thread.sleep(1000);
				
			}
			
			
		
			clickOnElement(choosedate.get(i));
			System.out.println(choosedate.get(i).getText());
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterHeartRate(), "100");
			Thread.sleep(1000);
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterSystolic(), "120");
			Thread.sleep(1000);
			Inputvalues(pom.getInstanceBlood_Pressure().getEnterDiastolic(), "80");
			Thread.sleep(1000);
			clickOnElement(pom.getInstanceBlood_Pressure().getSubmitButton());
			Thread.sleep(4000);
			
	
		}
	}


	@Then("User prints success message")
	public void user_prints_success_message() {
	    System.out.println("Blood Pressure Tracker data for 1 whole month added successfully");
	}
	*/
}
