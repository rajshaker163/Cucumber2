package com.hrms.utility;

import org.testng.Reporter;

import com.hrms.page.BaseClass;

public class VerifyPage extends BaseClass {
	
	public static void VerifyTitle( String tiltle)
	{
		if(driver.getTitle().equals(tiltle))
		{
			Reporter.log("title Matched");
		}
		else
		{
			Reporter.log("Title not matched"+driver.getTitle());
		}
	}

}
