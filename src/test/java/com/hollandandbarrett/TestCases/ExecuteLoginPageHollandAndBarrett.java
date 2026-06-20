package com.hollandandbarrett.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.HollandAndBarrettBrowserFactory;
import com.hollandandbarrett.Pages.HollandAndBarrettLoginPage;


public class ExecuteLoginPageHollandAndBarrett {
	
	@Test
	public void validateUserExecution() {
		WebDriver driver = HollandAndBarrettBrowserFactory.BrowserOptions("chrome", "https://auth.hollandandbarrett.com/u/login");
		HollandAndBarrettLoginPage loginpage = PageFactory.initElements(driver, HollandAndBarrettLoginPage.class);
		loginpage.login_handb("saurav@432", "sfsvdffdb");
		
		
	}
	
}
