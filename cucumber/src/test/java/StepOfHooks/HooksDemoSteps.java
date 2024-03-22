package StepOfHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {

	WebDriver driver = null;

	@Before(order=1)
	public void browserSetUp() {
		System.out.println("== I am inside the browser setup ==");


		System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before(order =0)
	public void browserStep() {
		System.out.println("I am inside the browser set up 2");
	}
	@After
	public void teardown() {

		driver.quit();
	}
	@BeforeStep
	public static void beforeStep() {
		System.out.println("Inside the Beforestep");

	}

	public static void afterStep() {
		System.out.println("Inside the afterstep");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside the step - Browser is opened");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("click on  login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}


	@Then("use gets logout")
	public void use_gets_logout()  {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();

		assert driver.getPageSource().contains("Test login");
	}
}
