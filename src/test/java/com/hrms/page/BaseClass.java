package com.hrms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	
	public static WebDriver driver;
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		ChromeOptions n=new ChromeOptions ();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println("opened sucessfully");
		
		
	}
	public static void closeApplication()
	{
		driver.close();
	}
}
