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
		Page.driver.findElement(By.xpath("//div[@id='center_column']/div/div/ul/li[4]/a/span")).click();
		return new MyPersonalInformation();
		
	}
	
	public void goToMyWhislist()
	{
		
	}
	
	
}
