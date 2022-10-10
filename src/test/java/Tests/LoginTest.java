package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginVerify;
import Resources.Base;

public class LoginTest extends Base {
	
	@Test(dataProvider = "getdata")
public void login(String user, String pass) throws Throwable {
		WebDriver driver =webdriver();
		driver.get(prop.getProperty("url"));
		

		LandingPage page = new LandingPage(driver);
		page.exit().click();
		Thread.sleep(2000);
		page.myaccount().click();
		Thread.sleep(2000);
		
		
		
		/*Loginpage log= new Loginpage(driver);
		log.usertext().sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		log.passtext().sendKeys(prop.getProperty("password"));
		log.loginBtn().click();
		Thread.sleep(2000);*/
		
		
		
		LoginVerify verify= new LoginVerify(driver);	
		Actions ac=new Actions(driver);
		ac.moveToElement(verify.name()).build().perform();
		Thread.sleep(3000);
		verify.profilename().click();
		Thread.sleep(2000);
	Assert.assertTrue(verify.profile().isDisplayed());	
	}
	
		
		
	
	
	}
		
		
		
	
	
