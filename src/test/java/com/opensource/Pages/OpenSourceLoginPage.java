package com.opensource.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenSourceLoginPage {

WebDriver driver;
	
	public OpenSourceLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name = "username")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	public void login_opensource(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
