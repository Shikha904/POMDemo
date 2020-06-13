package com.shikha.pages;

import org.openqa.selenium.By;
import com.shikha.base.Page;

public class HomePage extends Page{
	
	
	public void goToSignUp()
	{
		click("login_XPATH");
	}
	public LoginPage goToLogin()
	{
		click("login_XPATH");
		return new LoginPage();
	}

	public void goToViewCart()
	{
		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
	}
	
	public void Search()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		
			}
	public void goToShopNow()
	{
		driver.findElement(By.xpath("//*[@id=\"homeslider\"]/li[1]/div/p[2]/button")).click();
				
	}
	
	public void validateFooterLinks()
	{
		
		driver.findElement(By.partialLinkText("Terms and conditions of use")).click();
		driver.findElement(By.partialLinkText("Our Stores")).click();
		driver.findElement(By.xpath("//a[@title='About us']")).click();
	}
	
}
