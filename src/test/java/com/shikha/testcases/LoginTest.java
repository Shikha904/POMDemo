package com.shikha.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.shikha.pages.HomePage;
import com.shikha.pages.LoginPage;
import com.shikha.utilities.Utilities;


public class LoginTest extends BaseTest {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data) throws InterruptedException
	/*{
		
		if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}*/
	{
		HomePage home = new HomePage();
	    LoginPage lp= home.goToLogin();
	    lp.doLogin(data.get("Username"),data.get("Password"));
	}


}
