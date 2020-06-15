package com.shikha.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shikha.base.AccountsMenu;
import com.shikha.pages.shoppingPage;
import com.shikha.pages.accounts.MyPersonalInformation;

public class EditAccountTest {
	private static final byte[] String = null;

	@Test
	public void editAccountTest()throws InterruptedException
	{
	shoppingPage sp= new shoppingPage();
	AccountsMenu menu= sp.goToCustomerAccounts();
    Thread.sleep(1000);
    MyPersonalInformation mp= menu.goToMyPersonalInformation();
    Thread.sleep(1000);
    mp.EditInformation("Chetan");

  

	}
}

	
	 