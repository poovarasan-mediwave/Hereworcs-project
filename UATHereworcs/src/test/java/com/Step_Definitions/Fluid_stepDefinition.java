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


public class Fluid_stepDefinition extends Base_Class{
	
	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);

	 
  @Given("^User launch URL for fluid$")
	 public void user_launch_URL_for_fluid() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("^User click login button for Fluid$")
	 public void user_click_login_button_for_Fluid() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
		 Sleep(3000);
	 }

	 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field for fluid$")
	 public void user_enters_valid_in_Emailaddres_field_for_fluid(String arg1) throws Throwable {
			Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
			 Sleep(3000);
	 }

	 @Then("^User enters \"([^\"]*)\" in Passowrd for fluid$")
	 public void user_enters_in_Passowrd_for_fluid(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		 Sleep(3000);
	 }

	 @Then("^Click on Submit button for fluid$")
	 public void click_on_Submit_button_for_fluid() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
		 Sleep(30000);
	 }

	 @Then("^clicking over Bento menu for fluid$")
	 public void clicking_over_Bento_menu_for_fluid() throws Throwable {
		 //clickOnElement(pom.getbentomenu().getbentoicon());
		 WebElement ele = driver.findElement(By.xpath("//div[@id='open-desktop-footer']/div[@class='footer-desktop-img position-relative']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
			
		
	 }

	 @Then("^clicking over Tracker module for fluid$")
	 public void clicking_over_Tracker_module_for_fluid() throws Throwable {
		 clickOnElement(pom.getbentomenu().getTrackermodule());
		 Sleep(6000);
	 }

	 @Then("^clicking over Fluid Tracker section for fluid$")
	 public void clicking_over_Fluid_Tracker_section_for_fluid() throws Throwable {
		 //new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='submenu-height']/div/ul/li/a[@href='/tracker/fluid']"))).click();
			WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tracker/fluid']")));
			Actions action =new Actions(driver);
			action.moveToElement(scanEle).click().build().perform();
		 Sleep(5000);
		 driver.findElement(By.xpath("//a[@href='/tracker/fluid']")).click();
		 Sleep(3000);
	 }

	 @Then("^clicking over Add Fluid information button$")
	 public void clicking_over_Add_Fluid_information_button() throws Throwable {
		 clickOnElement(pom.getFluid().getfluidInformation());
		 Sleep(3000);
	 }

	 @Then("^selecting calendar for fluid$")
	 public void selecting_calendar_for_fluid() throws Throwable {
		 clickOnElement(pom.getdiet().getdietdate());
			Sleep(3000);	 
	 }

	 @Then("^selecting calendartitle for fluid$")
	 public void selecting_calendartitle_for_fluid() throws Throwable {
		 clickOnElement(pom.getdiet().getcalendartitle());
			Sleep(3000);
	 }

	 @Then("^selecting calendaryearoption for fluid$")
	 public void selecting_calendaryearoption_for_fluid() throws Throwable {
		 clickOnElement(pom.getdiet().getcalendaryearoption());
		 Sleep(3000);
	 }

	 @Then("^selecting calendartitleyear for fluid$")
	 public void selecting_calendartitleyear_for_fluid() throws Throwable {
		 clickOnElement(pom.getdiet().getcalendartitleyear());
			Sleep(3000);
	 }

	 @Then("^selecting calendartitlemonth for fluid$")
	 public void selecting_calendartitlemonth_for_fluid() throws Throwable {
		 clickOnElement(pom.getdiet().getcalendartitlemonth());
			Sleep(3000);
	 }

	 @Then("^selecting selectdatess and Record fluid$")
	 public void selecting_selectdatess_and_Record_fluid() throws Throwable {
		 Sleep(3000);
		 System.out.println("enter");
		 List<WebElement> date = pom.getdiet().getdietselectdatess();
		 Sleep(3000);
			int size = date.size();
			//System.out.println(size);
			for (int i = 0; i < size; i++) {
				System.out.println(i);
				if (i == 1 || i == 5 ) {
					//System.out.println(i);
					clickOnElement(date.get(i));
					Sleep(2000);
					clickOnElement(pom.getFluid().getsmallcup());
					Sleep(2000);
					clickOnElement(pom.getFluid().getqualityadd());
					Sleep(2000);
					clickOnElement(pom.getFluid().getrecordfluid());
					Sleep(5000);
					 clickOnElement(pom.getFluid().getfluidInformation());
					 Sleep(2000);
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
				clickOnElement(pom.getFluid().getlargecup());
				Sleep(2000);
				clickOnElement(pom.getFluid().getqualityadd());
				Sleep(2000);
				clickOnElement(pom.getFluid().getrecordfluid());
				Sleep(5000);
				 clickOnElement(pom.getFluid().getfluidInformation());
				 Sleep(2000);
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
				Sleep(6000);
				clickOnElement(pom.getFluid().getsmallbottle());
				Sleep(2000);
				clickOnElement(pom.getFluid().getqualityadd());
				Sleep(2000);
				clickOnElement(pom.getFluid().getrecordfluid());
				Sleep(5000);
				 clickOnElement(pom.getFluid().getfluidInformation());
				 Sleep(2000);
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
				Sleep(6000);
				clickOnElement(pom.getFluid().getlargebottle());
				Sleep(2000);
				clickOnElement(pom.getFluid().getqualityadd());
				Sleep(2000);
				clickOnElement(pom.getFluid().getrecordfluid());
				Sleep(5000);
				 clickOnElement(pom.getFluid().getfluidInformation());
				 Sleep(2000);
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
				else if(i == 9 ) {
					Sleep(3000);
				clickOnElement(date.get(i));
				Sleep(6000);
				clickOnElement(pom.getFluid().getlargebottle());
				Sleep(2000);
				clickOnElement(pom.getFluid().getqualityadd());
				Sleep(2000);
				clickOnElement(pom.getFluid().getrecordfluid());
				Sleep(5000);
				}

	 
			}
			}
}
