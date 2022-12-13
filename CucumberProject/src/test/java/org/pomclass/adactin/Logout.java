package org.pomclass.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='check_all']")
	private WebElement box_Click;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;
	
	@FindBy(xpath="//a[.='Click here to login again']")
	private WebElement loginagain;

	public Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBox_Click() {
		return box_Click;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getLoginagain() {
		return loginagain;
	}
	
	

}
