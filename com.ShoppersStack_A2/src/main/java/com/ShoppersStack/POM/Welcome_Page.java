package com.ShoppersStack.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	@FindAll({@FindBy(id = "loginBtn"),@FindBy(name = "loginBtn")})
//	private WebElement loginBtn;
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}
