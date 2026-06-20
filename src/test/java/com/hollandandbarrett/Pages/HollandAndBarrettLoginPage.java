package com.hollandandbarrett.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HollandAndBarrettLoginPage {

WebDriver driver;
	
	public HollandAndBarrettLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "username")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement loginbtn;
	
	public void login_handb(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
