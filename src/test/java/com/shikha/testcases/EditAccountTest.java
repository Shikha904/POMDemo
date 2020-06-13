package com.shikha.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.shikha.base.AccountsMenu;
import com.shikha.pages.shoppingPage;
import com.shikha.pages.accounts.MyPersonalInformation;
import com.shikha.utilities.Utilities;

public class EditAccountTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void editAccountTest(Hashtable<String,String> data) throws InterruptedException
	{
		shoppingPage sp= new shoppingPage();
		AccountsMenu menu= sp.goToCustomerAccounts();
	    Thread.sleep(10000);
	    MyPersonalInformation mp= menu.goToMyPersonalInformation();
	    Thread.sleep(10000);
	    mp.EditInformation(data.get("First name"));
	}
	

}
