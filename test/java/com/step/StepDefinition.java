package com.step;

import com.base.BaseClass;
import com.page.FBCreateAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	FBCreateAccountPage fb;
	@Given("User launches FB webpage")
	public void user_launches_fb_webpage() {
		launchBrowser("https://www.facebook.com/");
		maxim();
		printTitle();
		
	}
	@When("User click create an account")
	public void user_click_create_an_account() {
		fb= new FBCreateAccountPage();
		fb.getCreateNewAcctButton().click();
	}
	@When("User enters {string}, {string}>, {string}, {string},{string}, {string} in signUp page")
	public void user_enters_in_sign_up_page(String firstName, String surName, String MobileNo, String password, String string5, String string6) {
		fb= new FBCreateAccountPage();
		fb.getFirstName().sendKeys(firstName);
		fb.getSurName().sendKeys(surName);
		fb.getMobileNumber().sendKeys(MobileNo);
		fb.getPassword().sendKeys(password);
		
	
	}
	@When("User enters signUp button")
	public void user_enters_sign_up_button() {
		
		
	}
	@Then("user verify the message")
	public void user_verify_the_message() {
		
		
	}
}
