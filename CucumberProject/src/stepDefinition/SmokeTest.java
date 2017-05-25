package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {


WebDriver driver;

@Given("^Launch the Firefox and open the Salesforce Application$")
public void Launch_the_Firefox_and_open_the_Salesforce_Application() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.get("https://ctl--itv1.cs71.my.salesforce.com/ ");
    
}

@When("^Enter the valid user name and password$")
public void Enter_the_valid_user_name_and_password() throws Throwable {
	//Click on CenturyLink SSO
		driver.findElement(By.xpath("//*[contains(text(),'SSO')]")).click();
	//Enter user name and password
	driver.findElement(By.xpath("//input[@name='user']")).sendKeys("slstst1");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Link1234");
	    
}

@Then("^User should be able to login sucessfully$")
public void User_should_be_able_to_login_sucessfully() throws Throwable {
   //Click on Login Button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	   
}



}
