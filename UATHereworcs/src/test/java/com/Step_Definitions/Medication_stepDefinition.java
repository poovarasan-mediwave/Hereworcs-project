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


public class Medication_stepDefinition extends Base_Class {

	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
 	
	 
	 @Given("^User launch URL for medication$")
	 public void user_launch_URL_for_medication() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("^User click login button for medication$")
	 public void user_click_login_button_for_medication() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	 }

	 @Then("^User enters valid \"([^\"]*)\" in Emailaddres field for medication$")
	 public void user_enters_valid_in_Emailaddres_field_for_medication(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj280990+lesner@gmail.com");
		 Sleep(3000);
	 }

	 @Then("^User enters \"([^\"]*)\" in Passowrd for medication$")
	 public void user_enters_in_Passowrd_for_medication(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
		 Sleep(3000);
	 }

	 @Then("^Click on Submit button for medication$")
	 public void click_on_Submit_button_for_medication() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
		 Sleep(20000);
	 }

	 @Then("^clicking over Bento menu for medication$")
	 public void clicking_over_Bento_menu_for_medication() throws Throwable {
		 //clickOnElement(pom.getbentomenu().getbentoicon());
		 Sleep(4000);
		 driver.findElement(By.xpath("//div[@class='footer-desktop-img position-relative']/following-sibling::p")).click();
			Sleep(3000);
			}

	 @Then("^clicking over Tracker module for medication$")
	 public void clicking_over_Tracker_module_for_medication() throws Throwable {
		 clickOnElement(pom.getbentomenu().getTrackermodule());
		 Sleep(3000);
	 }

	 @Then("^clicking over Tracker category for medication$")
	 public void clicking_over_Tracker_category_for_medication() throws Throwable {
		 Sleep(3000);
		 clickOnElement(pom.getmedication().getmedicationtracker());
		 Sleep(3000);
	 }

	 @Then("^clicking over record medication$")
	 public void clicking_over_record_medication() throws Throwable {
		 clickOnElement(pom.getmedication().getrecordmedicationbtn());
		 Sleep(3000);
	 }

	 @Then("^clicking over add new medication$")
	 public void clicking_over_add_new_medication() throws Throwable {
		 clickOnElement(pom.getmedication().getaddnewmedicationpage());
		 Sleep(3000);
	 }

	 @Then("^clicking over medication calendar$")
	 public void clicking_over_medication_calendar() throws Throwable {
		 clickOnElement(pom.getmedication().getmedicationcreatecalendar());
		 Sleep(3000);
	 }
	 

@Then("^selecting calendartitle for medication$")
public void selecting_calendartitle_for_medication() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitle());
		Sleep(3000);
}

@Then("^selecting calendaryearoption for medication$")
public void selecting_calendaryearoption_for_medication() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendaryearoption());
	 Sleep(3000);
}

@Then("^selecting calendartitleyear for medication$")
public void selecting_calendartitleyear_for_medication() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitleyear());
		Sleep(3000);
}

@Then("^selecting calendartitlemonth for medication$")
public void selecting_calendartitlemonth_for_medication() throws Throwable {
	 clickOnElement(pom.getdiet().getcalendartitlemonth());
		Sleep(3000);
}

@Then("^selecting selectdatess and add medication entries$")
public void selecting_selectdatess_and_add_medication_entries() throws Throwable {
	 List<WebElement> date = pom.getdiet().getdietselectdatess();
		int size = date.size();
		//System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println("i "+i);
			//System.out.println(i);
			if (i == 1) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("javascript:window.scrollBy(250,350)");
		        Sleep(2000);
				clickOnElement(pom.getmedication().gettablet());
				//WebElement element = driver.findElement(By.xpath("//div[@class='grid grid-cols-4 gap-10 button-group-input']/span/input[@id='tablet']"));
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(5000); 
				
				Sleep(2000);
				Inputvalues(pom.getmedication().getaddmedicationname(),"medic-A");
				Sleep(2000);
				 Inputvalues(pom.getmedication().getaddmedicationdosage(),"30");
				Sleep(5000);
				 clickOnElement(pom.getmedication().getonceaday());
				Sleep(3000);
				//
				driver.findElement(By.xpath("//div[@class='toggle-dashboard connect-toggle position-relative']/label[@id='targetClick']")).click();
				Sleep(3000);
				
				//driver.findElement(By.xpath("(//div[@class='d-flex bt-border-wllbeing position-relative']/div/div/label[@for='no_of_day_reminder'])[1]']")).click();
				Sleep(3000);
				////
				 clickOnElement(pom.getmedication().getaddmedicationbtn());
				 Sleep(6000);
				
				 clickOnElement(pom.getmedication().getrecordmedicationbtn());
				 Sleep(6000);
				 clickOnElement(pom.getmedication().getaddnewmedicationpage());
				 Sleep(5000);
				 clickOnElement(pom.getmedication().getmedicationcreatecalendar());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(5000);
				 
			}
			else if (i == 2 ) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getcapsule());
				Sleep(2000);
				Inputvalues(pom.getmedication().getaddmedicationname(),"medic-2");
				Sleep(2000);
				 Inputvalues(pom.getmedication().getaddmedicationdosage(),"40");
				Sleep(5000);
				 clickOnElement(pom.getmedication().gettwiceaday());
				Sleep(3000);
				driver.findElement(By.xpath("(//input[@id='1'])[2]")).click();
				Sleep(3000);
				 clickOnElement(pom.getmedication().getaddmedicationbtn());
				 Sleep(6000);
				 clickOnElement(pom.getmedication().getrecordmedicationbtn());
				 Sleep(6000);
				 clickOnElement(pom.getmedication().getaddnewmedicationpage());
				 Sleep(5000);
				 clickOnElement(pom.getmedication().getmedicationcreatecalendar());
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
			else if (i == 3 ) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getliquid());
				Sleep(2000);
				Inputvalues(pom.getmedication().getaddmedicationname(),"medic-3");
				Sleep(2000);
				 Inputvalues(pom.getmedication().getaddmedicationdosage(),"45");
				Sleep(5000);
				 clickOnElement(pom.getmedication().getthriceaday());
				Sleep(3000);
				 clickOnElement(pom.getmedication().getaddmedicationbtn());
				 Sleep(6000);
				
				 clickOnElement(pom.getmedication().getrecordmedicationbtn());
				 Sleep(6000);
				 clickOnElement(pom.getmedication().getaddnewmedicationpage());
				 Sleep(5000);
				 clickOnElement(pom.getmedication().getmedicationcreatecalendar());
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
			else if (i == 4) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().gettablet());
				Sleep(2000);
				Inputvalues(pom.getmedication().getaddmedicationname(),"medic-4");
				Sleep(2000);
				 Inputvalues(pom.getmedication().getaddmedicationdosage(),"50");
				Sleep(5000);
				 clickOnElement(pom.getmedication().getonceaday());
				Sleep(3000);
				 clickOnElement(pom.getmedication().getaddmedicationbtn());
				 Sleep(6000);
				break;
				
			}
			
}}

@Then("^clicking over viewmedicationlist$")
public void clicking_over_viewmedicationlist() throws Throwable {
	Sleep(6000);
	System.out.println("enter");
	clickOnElement(pom.getmedication().getrecordmedicationunderlist());
	Sleep(2000);
}



@Then("^clicking over addrecordmedication$")
public void clicking_over_addrecordmedication() throws Throwable {
	
	Sleep(2000);
	clickOnElement(pom.getmedication().getmedicationcreatecalendar());
	 Sleep(3000);
	 clickOnElement(pom.getdiet().getcalendartitle());
	 Sleep(3000);
	 clickOnElement(pom.getdiet().getcalendaryearoption());
	 Sleep(3000);
	 clickOnElement(pom.getdiet().getcalendartitleyear());
	 Sleep(3000);
	 clickOnElement(pom.getdiet().getcalendartitlemonth());
	 Sleep(5000);
	 List<WebElement> date = pom.getdiet().getdietselectdatess();
	 int size = date.size();
	 for (int i = 0; i < size; i++) {
			System.out.println(i);
			if (i == 1 || i == 5) {
				//System.out.println(i);
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedic1btn());
				Sleep(2000);
				clickOnElement(pom.getmedication().getaddrecordmedication());
				Sleep(6000);
				clickOnElement(pom.getmedication().getrecordmedicationunderlist());
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedicationcreatecalendar());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(2000);
       }
			else if(i==2 || i==6) {
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedic2btn());
				Sleep(2000);
				clickOnElement(pom.getmedication().getaddrecordmedication());
				Sleep(6000);
				clickOnElement(pom.getmedication().getrecordmedicationunderlist());
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedicationcreatecalendar());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(2000);
			}
			else if(i==3 || i==7) {
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedic3btn());
				Sleep(2000);
				clickOnElement(pom.getmedication().getaddrecordmedication());
				Sleep(6000);
				clickOnElement(pom.getmedication().getrecordmedicationunderlist());
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedicationcreatecalendar());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(2000);
			}
			else if(i==4 ||i==8) {
				
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getamedic4btn());
				Sleep(2000);
				clickOnElement(pom.getmedication().getaddrecordmedication());
				Sleep(6000);
				
				clickOnElement(pom.getmedication().getrecordmedicationunderlist());
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedicationcreatecalendar());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitle());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendaryearoption());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitleyear());
				 Sleep(3000);
				 clickOnElement(pom.getdiet().getcalendartitlemonth());
				 Sleep(2000);
			}
			else if(i==9) {
				clickOnElement(date.get(i));
				Sleep(2000);
				clickOnElement(pom.getmedication().getmedic1btn());
				Sleep(2000);
				clickOnElement(pom.getmedication().getaddrecordmedication());
				Sleep(6000);

			}
	 }
	 }
	}
