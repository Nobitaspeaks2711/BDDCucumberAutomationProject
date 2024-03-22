package pagesClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {


	WebDriver driver;

	By userName = By.name("username");
	By userPassword = By.name("password");
	By login = By.id ("submit");

	public loginPage(WebDriver driver) {
		this.driver= driver;
		
	}

	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	public void enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public void ClickLogin() {
		driver.findElement(By.id("submit")).click(); 
	}
	public void CheckLogOutDisplayed() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.getPageSource().contains("Test login"); 
	}

	public void loginValidUser(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("submit")).click(); 
	}




}
