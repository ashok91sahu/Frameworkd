package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement exit;
		@FindBy(xpath="//a[@class='_1_3w1N']")
		WebElement myaccount;
		
	
	public WebElement myaccount() {
		return myaccount;
	}
	
	public WebElement exit() {
		return exit;
	}
	 
}