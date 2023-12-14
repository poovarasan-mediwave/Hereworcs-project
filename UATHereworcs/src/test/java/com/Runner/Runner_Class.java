package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_Files", glue = "com.Step_Definitions", tags ="@medication",
				
					plugin = {
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
					monochrome = true
					//, dryRun= false
					)
		
	
public class Runner_Class {

	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.get_Driver("Chrome");
	}
	@AfterClass
	public static void tear_Down() {
		//driver.close();
}}
