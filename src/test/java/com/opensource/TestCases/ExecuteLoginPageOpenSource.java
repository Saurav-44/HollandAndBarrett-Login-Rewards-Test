package com.opensource.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.HollandAndBarrettBrowserFactory;
import com.Helper.OpenSourceBrowserFactory;
import com.hollandandbarrett.Pages.HollandAndBarrettLoginPage;
import com.opensource.Pages.OpenSourceLoginPage;

public class ExecuteLoginPageOpenSource {

	@Test
	public void validateUserExecution() {
		WebDriver driver = OpenSourceBrowserFactory.BrowserOptions("chrome", "https://store.webkul.com");
		OpenSourceLoginPage loginpage = PageFactory.initElements(driver, OpenSourceLoginPage.class);
		loginpage.login_opensource("saurav@776", "hfdgdjjm");
	}
	
	
	
}
	

