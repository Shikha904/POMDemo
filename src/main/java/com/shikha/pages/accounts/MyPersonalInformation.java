package com.shikha.pages.accounts;

import com.shikha.base.Page;

public class MyPersonalInformation extends Page {
	
	public void EditInformation(String FirstName) throws InterruptedException
	{
		type("FirstName_XPATH", FirstName);
		Thread.sleep(2000);
		click("Savebutton_XPATH");
	
		
	}
	
	

}
