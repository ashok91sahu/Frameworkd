package Resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Base {
	WebDriver driver;
	 public Properties prop;
	 @BeforeTest
	public WebDriver webdriver() throws IOException {
		prop= new Properties();
		prop.load(new FileInputStream("C:\\Users\\Ak\\eclipse-workspace\\FrameworkProj\\src\\main\\java\\Resources\\Data.properties"));
		//String propath= System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties"; 
		//FileInputStream fis = new FileInputStream(propath);
		//prop.load(fis);
		String broweser= prop.getProperty("broweser");
	if(broweser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	else if(broweser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
	else if(broweser.equalsIgnoreCase("IE")) {
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	@DataProvider
	 public Object[][] getdata(){
		 String data[][]=new String[3][1];
		 data[0][0]= "Admin";
		 data[1][0]= "Qedgee123!@#";
		 
		 data[1][0]= "Admin";
		 data[1][1]= "dsdfdsf";
		 
		 data[2][0]= "Admin";
		 data[2][1]= "Qedeg";
		 
		 return data;
		 
	 }
@AfterTest
public void tearDown() {
	driver.close();
	
}
}