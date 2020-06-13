package com.shikha.testcases;

import org.testng.annotations.AfterSuite;

import com.shikha.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown()
	{
		Page.quit();
	}

}
