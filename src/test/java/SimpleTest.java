import actions.SampleActions;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import utility.ScreenshotUtility;
import utils.BaseTest;

public class SimpleTest extends BaseTest {

    private ITestResult result;
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        test = extent.createTest("Sample Test");
        screenshotUtility = new ScreenshotUtility(driver, test);
        result = Reporter.getCurrentTestResult();
    }

    @Test(alwaysRun = true)
    @Parameters({"website title"})
    public void sampleTest(String title) {

        // Add TestNG Reporter for logging test actions
        test.log(Status.INFO, "Navigate to Example Domain");
        driver.get("https://www.example.com");

        // Perform actions using the SampleActions class
        SampleActions sampleActions = new SampleActions(driver); // Initialize SampleActions object
        sampleActions.clickMoreInfoLink();

        // Perform assertions or additional actions
        // ...


        try {
            // Example assertion (you can replace it with your own)
            Assert.assertEquals(driver.getTitle(), title);
            // Log test result
            test.log(Status.PASS, "Test finish with success!");

        } catch (AssertionError error){
            result.setStatus(ITestResult.FAILURE);
            System.out.println("Test Result Status: " + result.getStatus());
            screenshotUtility.captureScreenshotOnFailure(result);
            test.log(Status.FAIL, "Test case failed: expected title " + title + " but got " + driver.getTitle());

            result.setThrowable(error);
        }

    }
    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        // we use this teardown only if we need to reverse something, cleanup space after our test
    }
}
