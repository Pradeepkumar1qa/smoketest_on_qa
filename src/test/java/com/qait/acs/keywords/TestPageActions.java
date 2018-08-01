package com.qait.acs.keywords;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.SampleDataProvider;

public class TestPageActions extends GetPage {

	WebDriver driver;
	SampleDataProvider fileData;

	public TestPageActions(WebDriver driver) {
		super(driver, "testPage");
		this.driver = driver;
	} 

	public void printSpecificRowData(String String) {
		System.out.println("+++++++++");
		logMessage("Demo String: '" + String + "'");
		System.out.println("+++++++++");
	}

	public void clicksearchbutton() {

		element("search_box").sendKeys("{}{{}{}{}");
		element("click_search_button").click();
		String verification = element("verify_page_of_content").getText();
		System.out.println(verification);
		String verificaton;
		Assert.assertEquals(verification,
				"Sorry, but nothing matched your search criteria. Please try again with some different keywords.");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.navigate().back();
	}

	public void linktest() {
		element("linkmenu").click();
		// hardWait(5000);

	}

	public void enquiryformemailvalidation() {
		element("contactmenu").click();
		element("Email").sendKeys("@256548");
		Actions actions = new Actions(driver);
		actions.moveToElement(element("submit")).click().perform();
       // hardWait(5);
		String verification = element("emailerror").getText();
		System.out.println("message from page" + verification);
		hardWait(10);
	}

}
