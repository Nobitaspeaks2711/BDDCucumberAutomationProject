package StepsForBackground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundDemoSteps {

	public WebDriver driver;
	@Given("user is on logging page")
	public void user_is_on_logging_page() {
	System.out.println("open the browser");

	//System.setProperty("WebDriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver = new  ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		System.out.println("inside the step -Browser is opened");
           driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}
	@When("user enter username password")
	public void user_enter_username_password() {
		driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.name("password")).sendKeys("Password123");
	}
	@When("Clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}
	
	@When("user click on Practise button")
	public void user_click_on_practise_button() {
	    driver.findElement(By.xpath("//a[text()='Practice']")).click();
		
		
	}

	@When("Click on the Text Exceptions Link")
	public void click_on_the_text_exceptions_link() {
	 driver.findElement(By.xpath("//a[text()='Test Exceptions']")).click();
	 

	}

	@When("user click on the Add button")
	public void user_click_on_the_Add_button()
	{  driver.findElement(By.xpath("//a[text()='Practice']")).click();
	 driver.findElement(By.xpath("//a[text()='Test Exceptions']")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
	}
	

	@And ("Send text on text box")
	public void Send_text_on_text_box() {
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//input[@class='input-field'])[2]")).sendKeys("Vaibhav");
	}
}
