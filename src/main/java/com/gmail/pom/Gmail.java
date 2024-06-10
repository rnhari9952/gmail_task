package com.gmail.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {
	public WebDriver driver;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email_field;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement next_btn;

	public WebElement getEmail_field() {
		return email_field;
	}

	public void setEmail_field(WebElement email_field) {
		this.email_field = email_field;
	}

	public Gmail(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}
}
