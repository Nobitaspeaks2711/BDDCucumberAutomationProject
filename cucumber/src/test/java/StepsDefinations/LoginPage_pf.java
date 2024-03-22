//package StepsDefinations;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import PageFactory.LogOutPage_pf;
//import PageFactory.LoginPage_PF;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginPage_pf {
//	WebDriver driver = null;
//	LoginPage_PF login;
//	LogOutPage_pf home;
//
//	@Given("open the browser")
//	public void open_the_browser() {
//		System.out.println("==== I am inside the LoginPage_pf == ");
//
//		try {
//			System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
//			driver = new ChromeDriver();
//
//
//			// Initialize LoginPage_PF and LogOutPage_pf objects
//			login = new LoginPage_PF(driver);
//			home = new LogOutPage_pf(driver);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		try {
//			driver.get("https://practicetestautomation.com/practice-test-login/");
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@When("^user enters (.*) and (.*)")
//	public void user_enters_username_and_password(String username, String password) {
//		login = new LoginPage_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//
//	}
//
//
//
//	@When("click on  login button")
//	public void click_on_login_button() {
//		try {
//			System.out.println("inside the steps-user click on login button ");
//			login.submitButton();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Then("use gets logout")
//	public void use_gets_logout() throws InterruptedException {
//		try {
//			home.clickOnlogout();
//			Thread.sleep(2000);
//			driver.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
