package com.qait.acs.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.SampleDataProvider;

public class QainfotechHomePage extends GetPage {
	WebDriver driver;
	SampleDataProvider fileData;

	public QainfotechHomePage(WebDriver driver) {
		super(driver, "QainfotechHomePage");
		this.driver = driver;

	}

	public void printSpecificRowData(String String) {
		System.out.println("+++++++++");
		logMessage("Demo String: '" + String + "'");
		System.out.println("+++++++++");
	}

	public String clicksearchbutton() {

		element("search_box").sendKeys("{}{{}{}{}");
		element("click_search_button").click();
		String verification = element("verify_page_of_content").getText();

		System.out.println(verification);

		return verification;

	}

	public WebElement checkservicesmenu() {
		element("services").click();
		hardWait(3);
		return element("our_services");

	}

	public WebElement checkverticalmenu() {
		element("vertical").click();
		hardWait(3);
		return element("verticals_text"); 

	}

	public WebElement checkinnovationmenu() {
		element("innovation").click();
		hardWait(3);
		return element("innovation");

	}

	public WebElement checkteammenu() {
		element("team").click();
		hardWait(3);
		return element("team_text");

	}

	public WebElement check_news_menu() {
		element("news").click();
		hardWait(3);
		return element("news_text");

	}

	public void check_contact_menu() {
		element("contact").click();
		hardWait(3);
	}

	public void clickonhealthcares() {
		element("vertical").click();
		Actions action = new Actions(driver);
		hardWait(7);
		action.moveToElement(element("Healthcare")).click().perform();
		System.out.println("from clickonlhealthcares method run sucessfully");
		hardWait(7);
	}

	public void gotobackpage() {
		driver.navigate().back();
	}

	public void clickdownloadsection() {
		element("knowledgecenter").click();
		hardWait(7);
		element("download").click();
		hardWait(10);
	}

}
