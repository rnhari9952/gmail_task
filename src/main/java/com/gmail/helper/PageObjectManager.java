package com.gmail.helper;

import org.openqa.selenium.WebDriver;

import com.gmail.pom.Gmail;
import com.gmail.pom.LogIn;
import com.gmail.pom.TestCase102;
import com.gmail.pom.TestCase104;

public class PageObjectManager {

	public WebDriver driver;

	public PageObjectManager(WebDriver mdriver) {
		this.driver = mdriver;
	}

	public LogIn lp;

	public LogIn getLp() {
		if (lp == null) {
			lp = new LogIn(driver);
		}
		return lp;
	}

	public TestCase102 tc102;

	public TestCase102 getTc102() {
		if (tc102 == null) {
			tc102 = new TestCase102(driver);
		}
		return tc102;
	}

	public TestCase104 tc104;

	public TestCase104 getTc104() {
		if (tc104 == null) {
			tc104 = new TestCase104(driver);
		}
		return tc104;
	}

	public Gmail gm;

	public Gmail getgmail() {
		if (gm == null) {
			gm = new Gmail(driver);
		}
		return gm;
	}

}
