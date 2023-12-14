
package com.Base_Class;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static WebDriver driver;
	public static WebDriver get_Driver(String type) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("use-fake-ui-for-media-stream");
		if (type.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver(options);
		
		} 
		
		
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	
	public static void Inputvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
	 
	public static void clickOnElementselect(Select select) {
		((WebElement) select).click();  
	}
	
	public static void clear(WebElement element) {
		element.clear();  
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();  
	}
	public static void geturl(String url) {
		driver.get(url);
	}
	public static void waitForSeconds(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	public static void Sleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}
	
	public void dropdownSelectByVisibleText(WebElement element, String a) {
		Select s = new Select(element);
		s.selectByVisibleText(a);
	}
	//new WebDriverWait(getWebDriver(), 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@formcontrolname='reportingDealPermission' and @ng-reflect-name='reportingDealPermission']"))).click();

	public static void actionsMethod(WebElement move) {
		Actions act = new Actions(driver);
		act.moveToElement(move).perform();
	}
	public static void frame_Into(WebElement frame) {
		driver.switchTo().frame(frame);
	}
	public static void frame_Out() {
		driver.switchTo().defaultContent();
	}
	
	
	
	public static void scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0, 500)", " ");
	}
	public void actionsClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).perform();
	}
	public static void jsclick(WebElement webElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", webElement);
	}
	public static void jsScrollDownElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	/*public static void Takescreenshot(String file) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);
	}*/
	public static void screenshot(String file) throws Exception {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File sou = shot.getScreenshotAs(OutputType.FILE);
		File Des = new File(System.getProperty("user.dir") + "\\Screenshot\\" + file);
		FileUtils.copyFile(sou, Des);
	}
	
    
}
