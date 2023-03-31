package com.hrms.utility;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.page.BaseClass;

public class LogoutPage extends BaseClass{
	
	static By btn_logout=By.linkText("Logout");
	
	public static void logout()
	{
		driver.findElement(btn_logout).click();
		Reporter.log("logout");
	}
	

}
