package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

	@FindBy(id ="username")
	WebElement txt_name ;

	@FindBy(id="password")
	WebElement txt_password;

	@FindBy(id="submit")
	WebElement submit;

	WebDriver driver;
	public LoginPage_PF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String username) {
		txt_name.sendKeys("student");

	}
	public void enterPassword(String Password) {
		txt_password.sendKeys("Password123");
	}
	public void submitButton() {
		submit.click();
	}
}