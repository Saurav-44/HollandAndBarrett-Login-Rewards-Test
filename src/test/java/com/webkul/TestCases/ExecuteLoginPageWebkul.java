package com.webkul.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.OpenSourceBrowserFactory;
import com.Helper.WebkulBrowserFactory;
import com.opensource.Pages.OpenSourceLoginPage;
import com.webkul.Pages.WebkulLoginPage;

public class ExecuteLoginPageWebkul {
	
	@Test
	public void validateUserExecution() {
		WebDriver driver = WebkulBrowserFactory.BrowserOptions("chrome", "https://store.webkul.com");
		WebkulLoginPage loginpage = PageFactory.initElements(driver, WebkulLoginPage.class);
		loginpage.login_webkul("saurav@123", "saurav123");
	}
	
}
