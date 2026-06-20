package com.webkul.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebkulLoginPage {
	
WebDriver driver;
	
	public WebkulLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name = "login[username]")
	WebElement email;
	
	@FindBy(name = "login[password]")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='send2']//span//span[contains(text(),'Login')]")
	WebElement loginbtn;
	
	public void login_webkul(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
