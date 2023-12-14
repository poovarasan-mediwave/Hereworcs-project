package com.Step_Definitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base_Class.Base_Class;
import com.Runner.Runner_Class;
import com.Singleton_Design_Pattern.Class_Objects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Clinicialcaseload_stepDefinition extends Base_Class{
  
	public static WebDriver driver= Runner_Class.driver;
	 public static Class_Objects pom = new Class_Objects(driver);
	
	 @Given("User launch the Url for clinicalcaseload")
	 public void user_launch_the_url_for_clinicalcaseload() throws InterruptedException {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	 }

	 @When("User click the accept cookies Button for clinicalcaseload")
	 public void user_click_the_accept_cookies_button_for_clinicalcaseload()  throws InterruptedException{
		 clickOnElement(pom.getlogin().getcookie());
	 }
	 
	 
	 @Then("User enter the Email address in text box for clinicalcaseload")
	 public void user_enter_the_email_address_in_text_box_for_clinicalcaseload() throws InterruptedException {
		 Inputvalues(pom.getlogin().getEmail(),"dhanraj+break@mindwaveventures.com");
			Sleep(3000);
	 }
	 
	 @Then("User enter the Password in text box for clinicalcaseload")
	 public void user_enter_the_password_in_text_box_for_clinicalcaseload() throws InterruptedException {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
			Sleep(3000);
	 }
	 
	 @Then("User click the Login Button and it naviagtes to home page for clinicalcaseload")
	 public void user_click_the_login_button_and_it_naviagtes_to_home_page_for_clinicalcaseload() throws InterruptedException {
		 clickOnElement(pom.getlogin().getLoginbtn());
			Sleep(25000);
	 }

	 @Given("user Click the Main menu and Shows the submenu for clinicalcaseload")
	 public void user_click_the_main_menu_and_shows_the_submenu_for_clinicalcaseload() throws InterruptedException {
		// clickOnElement(pom.getbentomenu().getbentoicon());
		  WebElement ele = driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]/div"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			Sleep(3000);
	 }


	 @When("User Click cliniciandashboard menu for clinicalcaseload")
	 public void user_click_cliniciandashboard_menu_for_clinicalcaseload()  throws InterruptedException{
			clickOnElement(pom.getbentomenu().getcliniciancaseloadmenu());
			Sleep(3000);
	 }
	 
	 @Then("User click on clinical caseload for clinicalcaseload")
	 public void user_click_on_clinical_caseload_for_clinicalcaseload()  throws InterruptedException{
			clickOnElement(pom.getcliniciandash().getclinical_caseload());
			Sleep(3000);
	 }
	 
	 @Then("User select firstUser in the list for clinicalcaseload")
	 public void user_select_first_user_in_the_list_for_clinicalcaseload() throws InterruptedException {
		 clickOnElement(pom.getcliniciandash().getlistfirstname());
			Sleep(3000);
	 }
	 
	 @Then("User click on send message button for clinicalcaseload")
	 public void user_click_on_send_message_button_for_clinicalcaseload() throws InterruptedException {
			clickOnElement(pom.getcliniciandash().getsendmessagebutton());
			Sleep(3000);
	 }
	 
	 @Then("User Enter circle person name in searchfield for clinicalcaseload")
	 public void user_enter_circle_person_name_in_searchfield_for_clinicalcaseload()  throws InterruptedException{
		 Inputvalues(pom.getcliniciandash().getsearchname(),"we");
			Sleep(4000);
	 }
	 
	 @Then("User click on Search icon for clinicalcaseload")
	 public void user_click_on_search_icon_for_clinicalcaseload()  throws InterruptedException{
		 clickOnElement(pom.getcliniciandash().getsearchicon());
			Sleep(3000);
	 }
	 
	 @Then("User click on firstperson in circlelist for clinicalcaseload")
	 public void user_click_on_firstperson_in_circlelist_for_clinicalcaseload() throws InterruptedException {
		 clickOnElement(pom.getcliniciandash().getfirstpersononlist());
			Sleep(3000);
	 }
	 
	 @Then("User click on message this person button for clinicalcaseload")
	 public void user_click_on_message_this_person_button_for_clinicalcaseload() throws InterruptedException {
		 clickOnElement(pom.getcliniciandash().getmessagethisperson());
			Sleep(3000);
	 }
	 
	 @Then("user Enter the subject in Text box for clinicalcaseload")
	 public void user_enter_the_subject_in_text_box_for_clinicalcaseload() throws InterruptedException {
		 Inputvalues(pom.getcliniciandash().getsubjectfield(),"add attach");
			Sleep(3000);
	 }
	 
	 @Then("user Enter the message in Create Message Area for clinicalcaseload")
	 public void user_enter_the_message_in_create_message_area_for_clinicalcaseload() throws InterruptedException {
			Inputvalues(pom.getcliniciandash().getcreatemessage(),"add attach lorem ipsume simply dummy"
					+ " text of the printing and typesetting industry. Lorem Ipsum has been the industry's"
					+ " standard dummy text ever since the 1500s, when an unknown printer took a galley of type "
					+ "and scrambled it to make a type specimen book. It has survived not only five centuries, "
					+ "but also the leap into electronic typesetting, remaining essentially unchanged. "
					+ "It was popularised in the 1960s with the release of Letraset");
			Sleep(6000);

	 }
	 
	 @Then("user click camera icon in the page for clinicalcaseload")
	 public void user_click_camera_icon_in_the_page_for_clinicalcaseload() throws InterruptedException {
		 clickOnElement(pom.getcliniciandash().getcameraicon());
			Sleep(6000);
	 }
	 
	 @Then("click take photo button for clinicalcaseload")
	 public void click_take_photo_button_for_clinicalcaseload()  throws InterruptedException{
		 clickOnElement(pom.getcliniciandash().gettakephoto());
			Sleep(4000);
	 }
	 
	 @Then("click on upload photo button for clinicalcaseload")
	 public void click_on_upload_photo_button_for_clinicalcaseload()  throws InterruptedException{
		 clickOnElement(pom.getcliniciandash().getuploadphoto());
			Sleep(3000);
	 }
	 
	 @Then("user Click the Addfile Button for clinicalcaseload")
	 public void user_click_the_addfile_button_for_clinicalcaseload() throws InterruptedException, AWTException {
		 clickOnElement(pom.getcliniciandash().getAttachmentfile());
			Sleep(3000);
			Sleep(4000);
			StringSelection str = new StringSelection("C:\\Users\\mindwave\\Downloads\\blackpanther.PNG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			Robot rb = new Robot();
			rb.delay(1000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Sleep(3000);
	 }
	 
	 @Then("user Click the Send Button and The message send to the User for clinicalcaseload")
	 public void user_click_the_send_button_and_the_message_send_to_the_user_for_clinicalcaseload() throws InterruptedException {
			clickOnElement(pom.getcliniciandash().getSendmessagebtn());
			Sleep(3000);
	 }



	
	 /*
	@Given("^User launch the Url$")
	public void user_launch_the_Url() throws Throwable {
		 geturl("https://uat.myhealthandwellbeinghw.nhs.uk/users/login");
		 Sleep(3000);
	}

	@When("^User click the accept cookies Button$")
	public void user_click_the_accept_cookies_Button() throws Throwable {
		 clickOnElement(pom.getlogin().getcookie());
	}

	@Then("^User enter the Email address in text box$")
	public void user_enter_the_Email_address_in_text_box() throws Throwable {
		Inputvalues(pom.getlogin().getEmail(),"dhanraj+break@mindwaveventures.com");
		Sleep(3000);
	}

	@Then("^User enter the Password in text box$")
	public void user_enter_the_Password_in_text_box() throws Throwable {
		 Inputvalues(pom.getlogin().getPassword(),"Admin01@");
			Sleep(3000);
	}

	@Then("^User click the Login Button and it naviagtes to home page$")
	public void user_click_the_Login_Button_and_it_naviagtes_to_home_page() throws Throwable {
		 clickOnElement(pom.getlogin().getLoginbtn());
			Sleep(25000);
	}

	@Given("^user Click the Main menu and Shows the submenu$")
	public void user_Click_the_Main_menu_and_Shows_the_submenu() throws Throwable {
		clickOnElement(pom.getbentomenu().getbentoicon());
		/*WebElement ele = driver.findElement(By.xpath("//div[@class='auth-header-block pt-4 pt-xl-0']/div[4]/div/div[1]/div[3]/div"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Sleep(3000);
		
	}

	@When("^User Click cliniciandashboard menu$")
	public void user_Click_cliniciandashboard_menu() throws Throwable {
		clickOnElement(pom.getbentomenu().getcliniciancaseloadmenu());
		Sleep(3000);
	}

	@Then("^User click on clinical caseload$")
	public void user_click_on_clinical_caseload() throws Throwable {
		clickOnElement(pom.getcliniciandash().getclinical_caseload());
		Sleep(3000);
	}

	

	@Then("^User select firstUser in the list$")
	public void user_select_firstUser_in_the_list() throws Throwable {
		clickOnElement(pom.getcliniciandash().getlistfirstname());
		Sleep(3000);
	}

	@Then("^User click on send message button\\.$")
	public void user_click_on_send_message_button() throws Throwable {
		clickOnElement(pom.getcliniciandash().getsendmessagebutton());
		Sleep(3000);
	}


@Then("^User Enter circle person name in searchfield$")
public void user_Enter_circle_person_name_in_searchfield() throws Throwable {
	//clickOnElement(pom.getcliniciandash().getsearchname());
	Inputvalues(pom.getcliniciandash().getsearchname(),"fett");
	Sleep(3000);
}

@Then("^User click on Search icon$")
public void user_click_on_Search_icon() throws Throwable {
	clickOnElement(pom.getcliniciandash().getsearchicon());
	Sleep(3000);
}

@Then("^User click on firstperson in circlelist$")
public void user_click_on_firstperson_in_circlelist() throws Throwable {
	clickOnElement(pom.getcliniciandash().getfirstpersononlist());
	Sleep(3000);
}

@Then("^User click on message this person button$")
public void user_click_on_message_this_person_button() throws Throwable {
	clickOnElement(pom.getcliniciandash().getmessagethisperson());
	Sleep(3000);
}

@Then("^user Enter the subject in Text box$")
public void user_Enter_the_subject_in_Text_box() throws Throwable {
	
	Inputvalues(pom.getcliniciandash().getsubjectfield(),"add attach");
	Sleep(3000);
	
}


@Then("^user Enter the message in Create Message Area$")
public void user_Enter_the_message_in_Create_Message_Area() throws Throwable {
	//clickOnElement(pom.getcliniciandash().getcreatemessage());
	Inputvalues(pom.getcliniciandash().getcreatemessage(),"add attach lorem ipsume simply dummy"
			+ " text of the printing and typesetting industry. Lorem Ipsum has been the industry's"
			+ " standard dummy text ever since the 1500s, when an unknown printer took a galley of type "
			+ "and scrambled it to make a type specimen book. It has survived not only five centuries, "
			+ "but also the leap into electronic typesetting, remaining essentially unchanged. "
			+ "It was popularised in the 1960s with the release of Letraset");
	
	Sleep(6000);
}

@Then("^user click camera icon in the page$")
public void user_click_camera_icon_in_the_page() throws Throwable {
	
	clickOnElement(pom.getcliniciandash().getcameraicon());
	Sleep(6000);
}

@Then("^click take photo button$")
public void click_take_photo_button() throws Throwable {
	clickOnElement(pom.getcliniciandash().gettakephoto());
	Sleep(4000);
}

@Then("^click on upload photo button$")
public void click_on_upload_photo_button() throws Throwable {
	clickOnElement(pom.getcliniciandash().getuploadphoto());
	Sleep(3000);
}

@Then("^user Click the Addfile Button$")
public void user_Click_the_Addfile_Button() throws Throwable {
	clickOnElement(pom.getcliniciandash().getAttachmentfile());
	Sleep(3000);
	Sleep(4000);
	StringSelection str = new StringSelection("C:\\Users\\mindwave\\Downloads\\blackpanther.PNG");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	Robot rb = new Robot();
	rb.delay(1000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Sleep(3000);
}

@Then("^user Click the Send Button and The message send to the User$")
public void user_Click_the_Send_Button_and_The_message_send_to_the_User() throws Throwable {
	clickOnElement(pom.getcliniciandash().getSendmessagebtn());
	Sleep(3000);
   
}
 
 /**** Clinical Directory****************/
/*	 
	 @Given("^user Click on Clinical directory$")
	 public void user_Click_on_Clinical_directory() throws Throwable {
		//a[@href='/connect/circle/message/clinical']
	//  new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();
		 //clickOnElement(pom.getclinicaldirectory().getclinical_directory());
		 clickOnElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(pom.getclinicaldirectory().getclinical_directory())));
			Sleep(3000);
	 }

	 @When("^User select on clinical colleagues searchbox$")
	 public void user_select_on_clinical_colleagues_searchbox() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getclinicaldirectorybox(),"fett");
			Sleep(3000);
	 }

	

	 @Then("^User click on clinical colleagues searchicon$")
	 public void user_click_on_clinical_colleagues_searchicon() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinicaldirectorysearchicon());
			Sleep(3000);
	 }

	 @Then("^User select under clinical collegues$")
	 public void user_select_under_clinical_collegues() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getclinicalcolleaguename());
			Sleep(3000);
	 }

	 @Then("^User clicking message this person button for clinical directory$")
	 public void user_clicking_message_this_person_button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getclinicaldirectory().getmessagethispersonbtn());
			Sleep(3000);
	 }

	 @Then("^User Enter text on subject for clinical directory$")
	 public void user_Enter_text_on_subject_for_clinical_directory() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getsubjecthere(),"fett");
			Sleep(3000);
	 }
	 @Then("^User Enter message in create message field for clinical directory$")
	 public void user_Enter_message_in_create_message_field_for_clinical_directory() throws Throwable {
		 Inputvalues(pom.getclinicaldirectory().getcreatemessage()," text of the printing and typesetting industry. Lorem Ipsum has been the industry's\"\r\n" + 
		 		"			+ \" standard dummy text ever since the 1500s, when an unknown printer took a galley of type \"");
			Sleep(3000);
	 }

	 @Then("^user click camera icon in the page for clinical directory$")
	 public void user_click_camera_icon_in_the_page_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getcameraicon());
			Sleep(6000);
	 }

	 @Then("^click take photo button for clinical directory$")
	 public void click_take_photo_button_for_clinical_directory() throws Throwable {
			clickOnElement(pom.getcliniciandash().gettakephoto());
			Sleep(4000);
	 }

	 @Then("^click on upload photo button for clinical directory$")
	 public void click_on_upload_photo_button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getuploadphoto());
			Sleep(3000);
	 }

	 @Then("^user Click the Addfile Button for clinical directory$")
	 public void user_Click_the_Addfile_Button_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getAttachmentfile());
			Sleep(3000);
			Sleep(4000);
			StringSelection str = new StringSelection("C:\\Users\\mindwave\\Downloads\\blackpanther.PNG");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			Robot rb = new Robot();
			rb.delay(1000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Sleep(3000);
	 }

	 @Then("^user Click the Send Button and The message send to the User for clinical directory$")
	 public void user_Click_the_Send_Button_and_The_message_send_to_the_User_for_clinical_directory() throws Throwable {
		 clickOnElement(pom.getcliniciandash().getSendmessagebtn());
			Sleep(3000);
	 }

	
	*/

	
	
}
