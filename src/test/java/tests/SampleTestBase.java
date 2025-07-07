package tests;

import actions.SampleActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.AbstractTestBase;
import utils.TestPropertiesLoader;

public class SampleTestBase extends AbstractTestBase {

    @Test
    public void sampleTest() {
        driver.get(config.getProperty("baseUrl"));

        SampleActions sampleActions = new SampleActions(driver);
        sampleActions.clickMoreInfoLink();

        Assert.assertEquals(driver.getTitle(), TestPropertiesLoader.testProps.getProperty("expectedTitle"));
    }
}