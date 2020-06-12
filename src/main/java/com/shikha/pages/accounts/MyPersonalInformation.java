package com.shikha.pages.accounts;

import org.openqa.selenium.By;

import com.shikha.base.Page;

public class MyPersonalInformation extends Page {
	
	public void EditInformation(String FirstName)
	{
		driver.findElement(By.xpath("//input[@id='firstname']")).clear();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(FirstName);
	}
	
	

}
