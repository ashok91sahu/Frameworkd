package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVerify {
	WebDriver driver;

	public LoginVerify(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy( xpath="//*[text()='Ashok']")
	WebElement name;
	
	
	@FindBy(xpath="//div[normalize-space()='My Profile']")
	WebElement profilename;
	
	@FindBy(xpath="//div[@class='_1ruvv2']")
	WebElement profile;
	
	public WebElement name() {
		return name;
	}
	
	public WebElement profilename() {
		return profilename;
	}
	public WebElement profile() {
		return profile;
	}
}
