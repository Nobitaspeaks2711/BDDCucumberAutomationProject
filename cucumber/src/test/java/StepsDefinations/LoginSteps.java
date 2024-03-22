//package StepsDefinations;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//	WebDriver driver = null;
//
//	@Given("open the browser")
//	public void open_the_browser() {
//
//		System.setProperty("WebDriver.chrome.driver", "C:/Users/DELL/eclipse-workspace/TestNG/cucumber/src/test/resources/Drivers/chromedriver.exe");
//		driver = new  ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		System.out.println("inside the step- user is on login page");
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//	}
//
//	@When("user enters student and password123")
//	public void user_enters_student_and_password123() throws InterruptedException {
//		driver.findElement(By.name("username")).sendKeys("student");
//		driver.findElement(By.name("password")).sendKeys("password123");
//		Thread.sleep(2000);
//	}
//	@And("user enters student1 and password321")
//	public void user_enters_student1_and_password321() throws InterruptedException {
//		driver.findElement(By.id("username")).sendKeys("student1");
//		driver.findElement(By.name("password")).sendKeys("password321");
//		Thread.sleep(2000);
//
//	}
//	@And ("click on  login button")
//	public void click_on_login_button() {
//		System.out.println("insode the steps-user click on login button ");
//		driver.findElement(By.id("submit")).click(); 
//	}
//
//
//	@Then("use gets logout")
//	public void use_gets_logout() {
//		driver.findElement(By.xpath("//a[text()='Log out']")).click();
//		driver.getPageSource().contains("Test login");  
//	}
//
//
//}
//
//
//
//
//
