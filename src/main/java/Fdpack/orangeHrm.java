package Fdpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Resources.Base;

public class orangeHrm extends Base {
	
	WebDriver driver;
	@Test(dataProvider="getdata")
	public void orange(String user, String pass, String url) {
		driver.get(prop.getProperty(url));
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
	//driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	
	driver.findElement(By.name("txtUsername")).sendKeys(user);
	driver.findElement(By.name("txtPassword")).sendKeys(pass);
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	String expected="dashboard";
	String actual=driver.getCurrentUrl();
	if(expected.equalsIgnoreCase(actual)) {
		
	Reporter.log("Login Success::"+expected+"   "+actual, true);
	}
	else{
		Reporter.log("Login fail::"+expected+"   "+actual, true);
		
	}
	
	}

}
