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
//import com.Singleton.Singleton_Design_Pattern;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExerciseTracker_StepDefinitions extends Base_Class {


	public static WebDriver driver = Runner_Class.driver;

	///public static Singleton_Design_Pattern sdp = new Singleton_Design_Pattern(driver);
	 public static Class_Objects pom = new Class_Objects(driver);

@Given("User opens the url in Exercise")
public void user_opens_the_url_in_exercise() throws InterruptedException {
	geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
	clickOnElement(pom.getInstanceExercise_Tracker().getAcceptcookies());
	Sleep(4000);
}


@When("User inputs email address in {string} field for Exercise")
public void user_inputs_email_address_in_field_for_exercise(String string) throws InterruptedException {
	Inputvalues(pom.getInstanceExercise_Tracker().getEmailaddress(), "dhanraj280990+lesner@gmail.com");
	Sleep(3000);
}
@When("user inputs password in {string} field for Exercise")
public void user_inputs_password_in_field_for_exercise(String string) throws InterruptedException {
	Inputvalues(pom.getInstanceExercise_Tracker().getPassword(), "Admin01@");
	Sleep(3000);
}
@Then("user accepts cookies for Exercise")
public void user_accepts_cookies_for_exercise()  throws InterruptedException{
	
	Sleep(3000);
}
@Then("user clciks login button for Exercise")
public void user_clciks_login_button_for_exercise()  throws InterruptedException{
	clickOnElement(pom.getInstanceExercise_Tracker().getLoginbutton());
	Sleep(40000);
}
@Then("User then navigated to patients dashboard page for Exercise")
public void user_then_navigated_to_patients_dashboard_page_for_exercise() throws InterruptedException {
	System.out.println("User logged in successfully");
	Sleep(25000);
}


@Given("When user clicked mainmenu in dashboard page for Exercise")
public void when_user_clicked_mainmenu_in_dashboard_page_for_exercise() throws InterruptedException {
	//clickOnElement(pom.getInstanceExercise_Tracker().getClickMenus());
	WebElement ele = driver.findElement(By.xpath("//div[@class='footer-desktop-img position-relative']/following-sibling::p"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	Sleep(3000);
	
}


@When("User clicked tracker in Mainmenu for Exercise")
public void user_clicked_tracker_in_mainmenu_for_exercise()  throws InterruptedException{
	clickOnElement(pom.getInstanceExercise_Tracker().getClickTrackersinMenu());
	Sleep(3000);
}

@Then("User clicks Swipe arrow for Exercise")
public void user_clicks_swipe_arrow_for_exercise()  throws InterruptedException{
	//driver.findElement(By.xpath("(//div[contains(@class,'material-icons wh-40')])[2]")).click();
	Sleep(3000);
	//driver.findElement(By.xpath("(//div[contains(@class,'material-icons wh-40')])[2]")).click();
	WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/tracker/exercise']")));
	Actions action =new Actions(driver);
	action.moveToElement(scanEle).click().build().perform();
	Sleep(4000);
}
@Then("User clicks Exercise Tracker  for Exercise")
public void user_clicks_exercise_tracker_for_exercise() throws InterruptedException {
	clickOnElement(pom.getInstanceExercise_Tracker().getClickExerciseTracker());
	Sleep(3000);
}
@Then("user clicks Add Exercise Information button for Exercise")
public void user_clicks_add_exercise_information_button_for_exercise() throws InterruptedException {
	clickOnElement(pom.getInstanceExercise_Tracker().getAddExerciseInformation());
	Sleep(3000);
}
@Then("user user clicks date on Exercise calendar icon for Exercise")
public void user_user_clicks_date_on_exercise_calendar_icon_for_exercise()  throws InterruptedException{
   driver.findElement(By.xpath("//input[@pleaceholder='Select the date']")).click();

		//clickOnElement(pom.getInstanceExercise_Tracker().getClickcalendar());
	Sleep(2000);
	clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthandyear());
	Sleep(3000);
	clickOnElement(pom.getInstanceExercise_Tracker().getClickYear());
	Sleep(3000);
	clickOnElement(pom.getInstanceExercise_Tracker().getClickYeartoSelect());
	Sleep(3000);
	clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthtoselect());
	Sleep(3000);

	List<WebElement> choosedate = pom.getInstanceExercise_Tracker().getchoosedate();
	int size2 = choosedate.size();
	System.out.println(size2);

	for (int i = 0; i < size2 -1  ; i++) { 
		if (i<3) {
			Sleep(2000);
			clickOnElement(choosedate.get(i));
			Sleep(2000);
			clickOnElement(pom.getInstanceExercise_Tracker().getSelectcasual());
			Sleep(2000);
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("window.scrollBy(0,400)");
			clickOnElement(pom.getInstanceExercise_Tracker().getSelectcasualactivity());
			Sleep(2000);
			Inputvalues(pom.getInstanceExercise_Tracker().getEnterminutes(), "120");
			Sleep(2000);
			Inputvalues(pom.getInstanceExercise_Tracker().getEnterCalories(), "220");
			Sleep(2000);

			clickOnElement(pom.getInstanceExercise_Tracker().getRecordExercisebutton());
	        System.out.println("casual complete");
			Thread.sleep(4000);
			clickOnElement(pom.getInstanceExercise_Tracker().getAddExerciseInformation());
			
			Sleep(2000);
			  driver.findElement(By.xpath("//input[@pleaceholder='Select the date']")).click();
             //clickOnElement(pom.getInstanceExercise_Tracker().getClickcalendar());
			Sleep(2000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthandyear());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickYear());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickYeartoSelect());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthtoselect());
			Sleep(3000);

		
		}    

		else if(i<4) {
			Sleep(3000);
			clickOnElement(choosedate.get(i));
			Sleep(2000);
			clickOnElement(pom.getInstanceExercise_Tracker().getSelectactive());
			Sleep(2000);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			jse1.executeScript("window.scrollBy(0,400)");
			clickOnElement(pom.getInstanceExercise_Tracker().getSelectactiveactivity());
			Sleep(2000);
			Inputvalues(pom.getInstanceExercise_Tracker().getEnterminutes(), "100");
			Sleep(2000);
			Inputvalues(pom.getInstanceExercise_Tracker().getEnterCalories(), "120");
			Sleep(2000);

			clickOnElement(pom.getInstanceExercise_Tracker().getRecordExercisebutton());
			System.out.println("active complete");
			Thread.sleep(4000);
			clickOnElement(pom.getInstanceExercise_Tracker().getAddExerciseInformation());
			Sleep(2000);
			  driver.findElement(By.xpath("//input[@pleaceholder='Select the date']")).click();
             //clickOnElement(pom.getInstanceExercise_Tracker().getClickcalendar());
			Sleep(2000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthandyear());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickYear());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickYeartoSelect());
			Sleep(3000);
			clickOnElement(pom.getInstanceExercise_Tracker().getClickmonthtoselect());
			Sleep(3000);
		}
		else if(i<5) {
			System.out.println("loop out");
			break;
			
		}
}
}

}
