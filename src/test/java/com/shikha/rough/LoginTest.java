package com.shikha.rough;

import com.shikha.base.AccountsMenu;
import com.shikha.pages.HomePage;
import com.shikha.pages.LoginPage;
import com.shikha.pages.shoppingPage;
import com.shikha.pages.accounts.MyPersonalInformation;

	public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
	    HomePage home = new HomePage();
	    LoginPage lp= home.goToLogin();
	    shoppingPage sp= lp.doLogin("shikhakumari904@gmail.com", "shikha@4190");
	    Thread.sleep(10000);
	    /*sp.goToHome();
	    Thread.sleep(5000);
	    sp.goToDressesTab();*/
	    AccountsMenu menu= sp.goToCustomerAccounts();
	    Thread.sleep(10000);
	    MyPersonalInformation mp= menu.goToMyPersonalInformation();
	    mp.EditInformation("Chetan");
	   
	}

}
