package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage_pf {

	@FindBy(xpath="//a[text()='Log out']")
	WebElement logout_btn ;
	WebDriver driver;
	public LogOutPage_pf(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,LogOutPage_pf.class);
	}
	public void clickOnlogout() {
		logout_btn.isDisplayed();
	}
}
