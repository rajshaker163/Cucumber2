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
	
	public WebDriver driver;

	
	@Given("open an application and enter the username and password")
	public void open_an_application_and_enter_the_username_and_password() {
		
	System.setProperty("webdriver.chrome.driver","C:\\GD\\ch\\chromedriver.exe");
		
		ChromeOptions n=new ChromeOptions();
		n.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(n);
		driver.get("http://183.82.103.245/nareshit/login.php");
	
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		//driver.findElement(By.name("Submit")).click();
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@And("click on login button1 afte login sucesssfully")
	public void click_on_login_button1_afte_login_sucesssfully() {
		
		driver.findElement(By.name("Submit")).click();
	
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	//@And("Add into frames")
	//public void add_into_frames() {
		
		//driver.switchTo().frame("rightMenu");
	//}



	@And("click on add button1")
	public void click_on_add_button1() {
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		  
		
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	

	@And("enter code Firstname Lastname Middlename and Nickname")
	public void enter_code_Firstname_Lastname_Middlename_and_Nickname() {
		
		driver.findElement(By.name("txtEmployeeId")).sendKeys("000002");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Selenium");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("is");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("very");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("easy");
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("upload a pic")
	public void upload_a_pic()throws Exception {
		
		WebElement fileInput=driver.findElement(By.id("photofile"));
		//Actions action=findElement(By.xpath("//input[@type='file'][@id='photofile']")).
		fileInput.sendKeys("‪D:\\New folder\\god.jpg.jpg");
		Thread.sleep(2000);
		
	    // Write code  here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@And("click on save button1")
	public void click_on_save_button1() {
		
		driver.findElement(By.id("btnEdit")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

//@And("exit from frames")
//public void exit_from_frames() {
	//.switchTo().defaultContent();
//}

	@And("Logout")
	public void logout() {
		
		driver.findElement(By.linkText("Logout")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("close Application")
	public void close_Application() {
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

}
