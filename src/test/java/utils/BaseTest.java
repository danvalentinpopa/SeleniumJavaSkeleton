package utils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;

public class BaseTest {
    protected WebDriver driver;
    private ScreenshotUtils screenshotUtils;
    public ExtentTest extentTest;

    @BeforeSuite
    public void setUp() {

        ReportManager.getInstance(); // Initialize ExtentReports
    }

    @BeforeClass
    public void setUpClass() {
        // Use WebDriverManager to set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        screenshotUtils = new ScreenshotUtils(driver);
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    protected WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            captureAndSaveFailureScreenshot(result.getMethod().getMethodName());
        }

        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(Status.FAIL, MarkupHelper.createLabel("Test Case Failed: " + result.getName(), ExtentColor.RED));
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed: " + result.getName(), ExtentColor.GREEN));
        } else {
            extentTest.log(Status.SKIP, MarkupHelper.createLabel("Test Case Skipped: " + result.getName(), ExtentColor.ORANGE));
        }
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void tearDown() {
        // Tear down suite-level resources if needed
        ReportManager.getInstance().flush(); // Flush ExtentReports to generate the report
    }

    public void initTest(String testName) {
        extentTest = ReportManager.createTest(testName);
    }

    void captureAndSaveFailureScreenshot(String testName) {
        // Create the screenshots directory if it doesn't exist
        File screenshotDirectory = new File("screenshots");
        if (!screenshotDirectory.exists()) {
            screenshotDirectory.mkdirs();
        }

        // Capture and save the screenshot
        screenshotUtils.captureAndSaveScreenshot(testName);
    }
}
