package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utility.ReportUtility;
import utility.ScreenshotUtility;

public class BaseTest {
    protected WebDriver driver;
    public ScreenshotUtility screenshotUtility;

    public ExtentReports extent = ReportUtility.getInstance();
    public ExtentTest test;

    @BeforeSuite
    public void beforeSuiteSetUp() {
        // Set up suite-level resources if needed
    }
    @BeforeClass
    public void setUpClass() {
        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) {
            extent.flush();
            driver.quit();
        }
    }

}
