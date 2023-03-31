package Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc001 {
	
WebDriver driver;
	
@Before(order=1)
public void open()
{
	System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
	
	ChromeOptions n=new ChromeOptions();
	n.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(n);
}

@Before(order=2)
public void open1()
{
	System.out.println("inside");
}
	@Given("an url")
	public void an_url() {
System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get("http://183.82.103.245/nareshit/login.php");
	}

	@And("enter username and password")
	public void enter_username_and_password() {

		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	}

	@When("click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.name("Submit")).click();
	}
	@Then("navigate to login home page")
	public void navigate_to_login_home_page() {
		
	System.out.println("sucessfully opened");
	}
	@After
	public void close()
	{
		System.out.println("close");
	}
	@After
	public void close1()
	{
		System.out.println("close1");

}
}
