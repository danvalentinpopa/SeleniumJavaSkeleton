package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;

    @BeforeSuite
    public void setUp() {
        // Set up suite-level resources if needed
    }

    @AfterSuite
    public void tearDown() {
        // Tear down suite-level resources if needed
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
            driver.quit();
        }
    }
}
