package com.hrms.utility;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.page.BaseClass;

public class Loginpage extends BaseClass {
	
	static By txt_loginname=By.name("txtUserName");
	static By txt_Passsword=By.name("txtPassword");
	static By btn_login=By.name("Submit");
	
	
	
	public static void login(String un,String pw)throws Exception
	{
		driver.findElement( txt_loginname).sendKeys(un);
		driver.findElement(txt_Passsword).sendKeys(pw);
		driver.findElement(btn_login).click();
		Thread.sleep(2000);
        Reporter.log("loginSucessfully");
	}
	
	}


