package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TC001 {

	WebDriver driver;

	@Given("open an application wih the given url {string}")
	public void open_an_application_wih_the_given_url(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\GD\\ch\\chromedriver.exe");

		ChromeOptions n = new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(n);
		driver.get(string);
	}

	@When("enter username and password with valid credentials {string},{string}")
	public void enter_username_and_password_with_valid_credentials(String string, String string2) {
		driver.findElement(By.name("txtUserName")).sendKeys(string);
		driver.findElement(By.name("txtPassword")).sendKeys(string2);
	}

	@When("press on login button to login an application")
	public void press_on_login_button_to_login_an_application() {
		driver.findElement(By.name("Submit")).click();
	}
	

@When("Enter into Frames {string}")
public void enter_into_frames(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver.switchTo().frame(string);
}
@When("press the add button")
public void press_the_add_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By.xpath("//input[@value='Add']")).click();
}
@When("Clear the entered code data")
public void clear_the_entered_code_data() 
{
	driver.findElement(By.name("txtEmployeeId")).clear();
}

@When("Enter the code Firstname Lastname Nickname Middlename {string},{string},{string},{string},{string};")
public void enter_the_code_firstname_lastname_nickname_middlename(String string, String string2, String string3, String string4, String string5) {
    driver.findElement(By.name("txtEmployeeId")).sendKeys(string);
    driver.findElement(By.name("txtEmpLastName")).sendKeys(string2);
    driver.findElement(By.name("txtEmpFirstName")).sendKeys(string3);
    driver.findElement(By.name("txtEmpMiddleName")).sendKeys(string4);
    driver.findElement(By.name("txtEmpNickName")).sendKeys(string5);
    
}

@When("choose the file to upload {string};")
public void choose_the_file_to_upload(String string) {
WebElement file=driver.findElement(By.xpath("//input[@name='photofile'][@id='photofile']"));
file.sendKeys(string);
}


@When("press the save button")
public void press_the_save_button() 
{
	driver.findElement(By.xpath("//input[@value='Save']")).click();
}


@When("exit into Frames")
public void exit_into_frames()
{
	driver.switchTo().defaultContent();
}

@When("Logout an application")
public void logout_an_application() {
	
    driver.findElement(By.linkText("Logout")).click();
}


}
