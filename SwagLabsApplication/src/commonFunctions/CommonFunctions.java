package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties=null;
	public static WebDriver driver = null;
	
	public static Properties loadpropertyfile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
		
	}
    @BeforeSuite
	public void launchBrowser() throws IOException {
    	loadpropertyfile();
    	String browser =properties.getProperty("browser");
    	String url = properties.getProperty("url");
    	String driverlocation=properties.getProperty("DriverLocation");
    	
    	if (browser.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver", driverlocation);
    		driver = new ChromeDriver();
		}else 
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", driverlocation);
				 driver = new FirefoxDriver();
			}
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
}
