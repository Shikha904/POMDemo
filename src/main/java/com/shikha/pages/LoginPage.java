package com.shikha.pages;

import org.openqa.selenium.By;
import com.shikha.base.Page;

public class LoginPage extends Page {
	
	public shoppingPage doLogin (String Username, String password) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		return new shoppingPage();
	}
}
