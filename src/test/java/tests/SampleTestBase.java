package tests;

import actions.SampleActions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.AbstractTestBase;

public class SampleTestBase extends AbstractTestBase {

    @Test
    @Parameters({"websiteTitle"})
    public void sampleTest(String title) {
        driver.get(config.getProperty("baseUrl"));

        SampleActions sampleActions = new SampleActions(driver);
        sampleActions.clickMoreInfoLink();

        Assert.assertEquals(driver.getTitle(), title);
    }
}