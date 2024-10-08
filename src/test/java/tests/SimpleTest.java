package tests;

import actions.SampleActions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    @Parameters({"website title"})
    public void sampleTest(String title) {

        driver.get("https://www.example.com");

        // Perform actions using the SampleActions class
        SampleActions sampleActions = new SampleActions(driver); // Initialize SampleActions object
        sampleActions.clickMoreInfoLink();

        // Perform assertions or additional actions
        // ...

        // Example assertion (you can replace it with your own)
        Assert.assertEquals(driver.getTitle(), title);
    }
}
