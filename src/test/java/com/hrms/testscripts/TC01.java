package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.page.BaseClass;
import com.hrms.utility.Loginpage;
import com.hrms.utility.LogoutPage;
import com.hrms.utility.VerifyPage;

public class TC01 {
@Test
	
	public static void tc01()throws Exception
	{
		BaseClass.openApplication();
		VerifyPage.VerifyTitle("HRMS");
		Loginpage.login("nareshit", "nareshit");
		VerifyPage.VerifyTitle("OrangeHRM");
		LogoutPage.logout();
		BaseClass.closeApplication();
		
		
	}
}
