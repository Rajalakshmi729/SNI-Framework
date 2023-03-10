package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AllCredLoginPageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.SelectPriceOptionsPageObjects;
//import pageObjects.EnterInsurantDataPageObjects;
//import pageObjects.EnterProductDataPageObjects;
//import pageObjects.EnterVehicalDataPageObjects;
//import pageObjects.HomePageObjects;
//import pageObjects.SelectPriceOptionsPageObjects;
import reusableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo{
	
	public static WebDriver driver;
	
	public void LaunchBrowserAndNavigate() throws Exception {
		//read prop file and get browser and url
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		//String username = PropertiesOperations.getPropertyValueByKey("username");
		//String password = PropertiesOperations.getPropertyValueByKey("passowrd");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}

	@BeforeMethod   /// it will get execute before each test method within current class
	public void setupMethod() throws Exception {
		LaunchBrowserAndNavigate();
	homepage = new LoginPageObjects();
	allCredLogPage = new AllCredLoginPageObjects();
	}
	
	@AfterMethod
	public void cleanUp() {
		//driver.quit();
	}
}
