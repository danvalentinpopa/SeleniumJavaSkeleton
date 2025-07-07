package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.util.Properties;

public class AbstractTestBase {
    protected WebDriver driver;
    protected Properties config;

    @BeforeClass
    public void setUpClass() throws Exception {
        config = new Properties();
        config.load(new FileInputStream("src/test/resources/config.properties"));
        String browser = System.getProperty("browser", config.getProperty("browser", "chrome")).toLowerCase();
        boolean headless = Boolean.parseBoolean(config.getProperty("headless", "false"));

        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions ffOptions = new FirefoxOptions();
                if (headless) ffOptions.addArguments("--headless");
                driver = new FirefoxDriver(ffOptions);
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (headless) chromeOptions.addArguments("--headless=new");
                driver = new ChromeDriver(chromeOptions);
                break;
        }
        driver.get(config.getProperty("baseUrl"));
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}