package com.shikha.pages;

import org.openqa.selenium.By;

import com.shikha.base.AccountsMenu;
import com.shikha.base.Page;

public class shoppingPage extends Page {
	
	public void goToHome()
	{
		driver.findElement(By.xpath("//div[@id='center_column']/ul/li/a/span/i")).click();
	}
	
	
	public void goToContactUs()
	{
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
	}

	public void goToWomenTab()
	{
		
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/a")).click();
		
	}
	
	public void goToDressesTab()
	{
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[2]/a")).click();
	}
	
	public void goToTshirtsTab()
	{
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
	}
	
	public AccountsMenu goToCustomerAccounts()
	{
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).click();
		return new AccountsMenu();
		
	}
	
	public void goToSignout()
	{
		driver.findElement(By.xpath("//a[@class='logout']")).click();
	}
	
}


