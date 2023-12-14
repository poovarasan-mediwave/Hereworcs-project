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



public class clinicalcircle_stepDefinition  extends Base_Class {
	
	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
	 JavascriptExecutor js ;
	
	@Given("^User launch URL for clinicalcircle$")
	public void user_launch_URL_for_clinicalcircle() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	}

	@When("^User click login button for clinicalcircle$")
	public void user_click_login_button_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getlogin().getcookie());
	}

	@Then("^User enters valid \"([^\"]*)\" in Emailaddres field for clinicalcircle$")
	public void user_enters_valid_in_Emailaddres_field_for_clinicalcircle(String arg1) throws Throwable {
		Inputvalues(pom.getlogin().getEmail(),"dhanraj+break@mindwaveventures.com");
		Sleep(3000);
	}

	@Then("^User enters \"([^\"]*)\" in Passowrd for clinicalcircle$")
	public void user_enters_in_Passowrd_for_clinicalcircle(String arg1) throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
			Sleep(3000);
	}

	@Then("^Click on Submit button for clinicalcircle$")
	public void click_on_Submit_button_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getlogin().getLoginbtn());
		Sleep(25000);
	}

	@Then("^clicking over Bento menu for clinicalcircle$")
	public void clicking_over_Bento_menu_for_clinicalcircle() throws Throwable {
		//clickOnElement(pom.getbentomenu().getbentoicon());
		WebElement ele = driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]/div"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Sleep(3000);
	}

	@Then("^clicking on clinical circle option$")
	public void clicking_on_clinical_circle_option() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getclinicalcirclebento());
		Sleep(3000);
	}

	@Then("^clicking on myclinicalcircle section$")
	public void clicking_on_myclinicalcircle_section() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getmyclinicalcirclecategory());
		Sleep(3000);
	}

	@Then("^Add new person for clinicalcircle$")
	public void add_new_person_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getAddnewpersonclinical());
		Sleep(3000);
	}

	@Then("^add relationship for clinicalcircle$")
	public void add_relationship_for_clinicalcircle() throws Throwable {
		dropdownSelectByVisibleText(pom.getclinicalcircle().getrelationship(),"Patient");
		Sleep(3000);
		 //dropdownSelectByVisibleText(pom.getWeight().monthdropdown(),"Oct");
	}

	@Then("^add firstname for clinicalcircle$")
	public void add_firstname_for_clinicalcircle() throws Throwable {
		Inputvalues(pom.getclinicalcircle().getfirstname(),"here1");
		Sleep(3000);
	
	}

	@Then("^add lastname for clinicalcircle$")
	public void add_lastname_for_clinicalcircle() throws Throwable {
		Inputvalues(pom.getclinicalcircle().getlasttname(),"AA");
		Sleep(3000);
	}

	@Then("^add Emaid address for clinicalcircle$")
	public void add_Emaid_address_for_clinicalcircle() throws Throwable {
		Inputvalues(pom.getclinicalcircle().getemailid(),"dhanraj+brek@mindwaveventures.com");
		Sleep(3000);
	}

	@Then("^radio button enable to all Myhealthoverview$")
	public void radio_button_enable_to_all_Myhealthoverview() throws Throwable {
		
	List<WebElement> healthd=	driver.findElements(By.xpath("//div[@class='connect-access-blk'][1]/div[2]/div"));
	int size= healthd.size();
	System.out.println("healthcategory");
    for(int i=2;i<=size;i++) {
    	System.out.println("i "+i);
    	 
    	 js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	            driver.findElement(By.xpath("(//div[@class='connect-access-blk'][1]/div[2]/div["+i+"]/fieldset/div/label/span[2])[1]")).click();
	          Sleep(3000);
     }
	}

	@Then("^radio button enable to connect for clinicalcircle$")
	public void radio_button_enable_to_connect_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getconnectenable());
		Sleep(3000);
	}

	@Then("^radio button enable to Track for clinicalcircle$")
	public void radio_button_enable_to_Track_for_clinicalcircle() throws Throwable {
		List<WebElement> trackerenablesize=	pom.getclinicalcircle().gettrackerenable();
		int size= trackerenablesize.size();
		System.out.println("trackerenable ");
	    for(int i=2;i<=size;i++) {
	    	System.out.println("tracker i "+i);
	    	 
	    	 js = (JavascriptExecutor) driver;
	    	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		            driver.findElement(By.xpath("//div[@class='connect-access-blk track-list']/div[2]/div["+i+"]/div[1]/label/span[2]")).click();
		          
	     }
		
	}

	@Then("^resource for clinicalcircle$")
	public void resource_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getresourceenable());
		Sleep(3000);
	}

	@Then("^Saved Items for clinicalcircle$")
	public void saved_Items_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getsaveditemenable());
		Sleep(3000);
	}

	@Then("^click on invite for clinicalcircle$")
	public void click_on_invite_for_clinicalcircle() throws Throwable {
		clickOnElement(pom.getclinicalcircle().getinvitebtn());
		Sleep(3000);
	}


}
