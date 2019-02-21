package com.me.AutomationDevelop.Automation;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest {

	WebDriver driver;

	@Test

	public void f() throws InterruptedException {
		
		
		//ExtentHtmlReporter ehr = new ExtentHtmlReporter("./report/test.html");
		//ExtentReports er = new ExtentReports();
		//er.attachReporter(ehr);
		
		//ExtentTest logger = er.createTest("Testing first");
		
		//logger.log(Status.INFO,  "First Test");
		

		System.setProperty("webdriver.chrome.driver", "/media/kammy/Local Disk1/iMp/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		//logger.log(Status.INFO,  "Enter Keyword to search");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Alena");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("(//input[@aria-label='Google
		// Search'])[2]")).click();
		/*
		 * WebElement textbox = driver.findElement(By.id("idOfElement"));
		 * textbox.sendKeys(Keys.RETURN);
		 */
		Thread.sleep(5000);

		String s = driver.getTitle();
		System.out.println(s);
		//logger.log(Status.INFO,  "Clocing Browser");
		//er.flush();
		driver.close();
		driver.quit();

	}

	/*
	 * @Test
	 * 
	 * public void f1() throws InterruptedException {
	 * 
	 * System.setProperty(
	 * "webdriver.chrome.driver","/media/kammy/Local Disk1/iMp/chromedriver_linux64/chromedriver"
	 * ); WebDriver driver = new ChromeDriver();
	 * 
	 * driver.get("https://www.google.com/?gws_rd=ssl");
	 * driver.manage().window().maximize(); System.out.println("Opened");
	 * driver.close(); driver.quit();
	 * 
	 * }
	 */

}
