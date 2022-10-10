package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	WebElement usertext;
	@FindBy(xpath="//input[@type='password']")
	WebElement passtext;
	@FindBy(xpath="//button[@type='submit']//span[contains(text(),'Login')]")
	WebElement loginBtn;
	 public WebElement usertext() {
		 return usertext;
	 }
	 public WebElement passtext() {
	 return passtext;
	 }
	 public WebElement loginBtn() {
		 return loginBtn;
	 }
}
