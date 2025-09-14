package Base_components;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.ConfigReader;

public class BaseClass {

	public static WebDriver driver;
	    public static ExtentReports extent;
		

	    


	    @BeforeMethod
	    public void setupDriver() {
	        ConfigReader.loadConfig();
	        String browser = ConfigReader.getProperty("browser");

	        if (browser.equalsIgnoreCase("chrome")) {
	            
	        	driver = new ChromeDriver();
	            System.out.println(driver);
	        }
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get(ConfigReader.getProperty("url"));
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	        if (extent != null) {
	            extent.flush();
	        }
	    	
	    }

		
	}


