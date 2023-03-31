package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Details {
	
	WebDriver driver;
	
	@Given("open an application")
	public void open_an_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get("http://183.82.103.245/nareshit/login.php");
	}

	@And("enter username and  password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	}

	@And("press the Submit button to login")
	public void press_the_Submit_button_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.name("Submit")).click();
	}
	@And("Entered in to Frames")
	public void entered_in_to_Frames() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.switchTo().frame("rightMenu");
	}

	@And("click on add button")
	public void click_on_add_button()throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
	}
	@And("enter all the data into a given feilds")
	public void enter_all_the_data_into_a_given_feilds()throws Exception {
		driver.findElement(By.name("txtEmployeeId")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmployeeId")).sendKeys("098765478");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Raj");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("shaker");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Selenium");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Selenium");
	WebElement file=driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	file.sendKeys("D:\\New folder\\god.jpg.jpg");
		
        
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("click on save button")
	public void click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}

	@And("Exit from frames")
	public void exit_from_frames() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.switchTo().defaultContent();
	}

	@Then("Logout appication")
	public void logout_appication() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.linkText("Logout")).click();
	}
	


	@Then("Close the application")
	public void close_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.close();
	}


	

}
