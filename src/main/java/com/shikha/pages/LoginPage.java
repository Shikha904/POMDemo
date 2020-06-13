package com.shikha.pages;

import com.shikha.base.Page;

public class LoginPage extends Page {
	
	public shoppingPage doLogin (String Username, String password) throws InterruptedException
	{
		
		type("Email_XPATH",Username);
		Thread.sleep(2000);
		type("Pswd_XPATH",password);
		click("SubmitLoginbtn_XPATH");
		return new shoppingPage();
	}
}
