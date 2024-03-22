//package StepsDefinations;
//
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Logindemosteps 
//
////	WebDriver driver = null;
////	@Given("browser is open")
////	public void browser_is_open() {
////		System.out.println("open the browser");
////
////		System.setProperty("WebDriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
////		driver = new  ChromeDriver();
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.manage().window().maximize();
////
////	}
////
////	@And("user is on login page")
////	public void user_is_on_login_page() {
////		System.out.println("inside the step -Browser is opened");
////		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
////	}
////
////	@When("user enters username and password")
////	public void user_enters_username_and_password() {
////		driver.findElement(By.id("username")).sendKeys("student");
////		driver.findElement(By.name("password")).sendKeys("Password123");
////	}
////	@And("user clicks on login button")
////	public void user_clicks_on_login_button() {
////		driver.findElement(By.id("submit")).click(); 
////	}
////	@Then("user click on logout button")
////	public void user_click_on_logout_button() {
////		driver.findElement(By.xpath("//a[text()='Log out']")).click();
////driver.getPageSource().contains("Test login");   
//	}
//
//
//
//}
