package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class Hrms {
	
	WebDriver driver;

@Given("open url")
public void openApplication() {
		//System.setProperty("webdriver.gecko.driver","C:\\GD\\geckodriver.exe" );
	
		System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get("url");
	}

	@And("enter username and Password")
	public void login()
	{
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("enter login details");
		
	}

@Then("Click on logout")
public void logoutbutton() {
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout Sucessfully");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}


}
