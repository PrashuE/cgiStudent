package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FBCreateAccountPage extends BaseClass {

	public FBCreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Create New Account']")
	private WebElement createNewAcctButton;

	@FindBy(xpath="//[@id ='u_6_b_Rx']")
	private WebElement firstName;

	@FindBy(id = "u_6_d_xJ")
	private WebElement surName;

	@FindBy(id = "u_6_g_Qx")
	private WebElement mobileNumber;

	@FindBy(id = "password_step_input")
	private WebElement password;

	public WebElement getCreateNewAcctButton() {
		return createNewAcctButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSurName() {
		return surName;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPassword() {
		return password;
	}

}
