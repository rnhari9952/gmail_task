package com.gmail.stepdef;

import org.openqa.selenium.WebDriver;

import com.gmail.baseclass.BaseClass;
import com.gmail.helper.FileReadManager;
import com.gmail.helper.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailStep extends BaseClass {
	public WebDriver driver = Hooks.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("I am logged into my Gmail account")
	public void i_am_logged_into_my_gmail_account() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String url = FileReadManager.getInstance().getCr().getUrl();
		getUrl(url);
		;
		inputValuestoWebelement(pom.getgmail().getEmail_field(), "rnhari9952@gmail.com");
	}

	@When("I click on the Compose button")
	public void i_click_on_the_compose_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I fill in the recipient email, subject, and body")
	public void i_fill_in_the_recipient_email_subject_and_body() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("I click on the Send button")
	public void i_click_on_the_send_button() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("the email with subject {string} and body {string} is sent successfully")
	public void the_email_with_subject_and_body_is_sent_successfully(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions

	}

}
