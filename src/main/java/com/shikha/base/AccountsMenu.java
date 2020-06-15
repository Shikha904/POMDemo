package com.shikha.base;

import org.openqa.selenium.By;

import com.shikha.pages.accounts.MyPersonalInformation;

public class AccountsMenu extends Page {
	
	public void goToHome()
	{
		
	}
	
	public void goToOrderDetails()
	{
		
	}
	
	public void goToMyAddresses()
	{
		
	}
	
	public MyPersonalInformation goToMyPersonalInformation()
	{
		click("PersonalInformation_XPATH");
		return new MyPersonalInformation();
		
	}
	
	public void goToMyWhislist()
	{
		
	}
	
	
}
