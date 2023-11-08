package old;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class SimpleTest extends BaseTest {


    //    @Parameters({"website title"})
    @Test
    public void sampleTest() {
        initTest("Sample Test"); // Initialize the ExtentTest instance for this test

        driver.get("https://www.example.com");

        // Perform pages.elements.actions using the SampleActions class
        SampleActions sampleActions = new SampleActions(driver); // Initialize SampleActions object
        sampleActions.clickMoreInfoLink();

        // Perform assertions or additional pages.elements.actions
        // ...

        // Example assertion (you can replace it with your own)
        Assert.assertEquals(driver.getTitle(), "Example Domains");
    }
}