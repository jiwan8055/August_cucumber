package stepDefination;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginKeyword;
@Test
public class StepDef {

	WebDriver driver;
	
	LoginKeyword loginKeyword = new LoginKeyword(driver);
		@Given("open the url")
		public void open_the_url() {
			
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://demo.cyclos.org/ui/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		@When("Enter the username and password")
		public void enter_the_username_and_password() {
			loginKeyword.entercred("demo", "1234");
//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		    
		}

		@And("click on login button")
		public void click_on_login_button() {
//			driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			loginKeyword.sumbit();
		}

		@Then("Logout link should be displayed")
		public void logout_link_should_be_displayed() {
			
//			assertTrue(driver.findElement(By.id("logout-trigger")).isDisplayed());
			Assert.assertTrue(loginKeyword.logout_lnk_isdisplay());
		    
		}
	}


