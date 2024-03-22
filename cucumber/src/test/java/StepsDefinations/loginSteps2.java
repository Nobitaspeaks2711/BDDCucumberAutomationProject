//package StepsDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pagesClass.loginPage;
//
//public class loginSteps2 {
//	WebDriver driver = null;
//	loginPage login;
//	@Given("open the browser")
//	public void open_the_browser() {
//	
//		
//	    System.out.println("i am inside the login step2");
//
//		System.setProperty("WebDriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
//		driver = new  ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@When("^user enters(.*) and (.*)")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//
//		loginPage login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//		
//		Thread.sleep(2000);
//	}
//	
//	@And ("click on  login button")
//	public void click_on_login_button() {
//		System.out.println("inside the steps-user click on login button ");
//		login.ClickLogin();
//	}
//
//
//	@Then("use gets logout")
//	public void use_gets_logout() {
//		login.CheckLogOutDisplayed();
//		 
//	}
//
//
//}
//
//
//
//
//
